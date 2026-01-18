package ru.svyazhin.MySeconddTestAppSpringBoot.model;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Request {

    @NotBlank(message = "uid не должен быть пустым")
    @Size(max = 32, message = "uid должен быть длиной не более 32 символов")
    private String uid;

    @NotBlank(message = "operationUid не должен быть пустым")
    @Size(max = 32, message = "operationUid должен быть длиной не более 32 символов")
    private String operationUid;

    private Systems systemName;

    @NotBlank(message = "systemTime обязателен")
    private String systemTime;

    @Size(max = 255, message = "source слишком длинный")
    private String source;

    @NotNull(message = "communicationId обязателен")
    @Min(value = 1, message = "communicationId должен быть >= 1")
    @Max(value = 100000, message = "communicationId должен быть <= 100000")
    private Integer communicationId;

    @Override
    public String toString() {
        return "{" +
                "uid='" + uid + '\'' +
                ", operationUid='" + operationUid + '\'' +
                ", systemName='" + systemName + '\'' +
                ", systemTime='" + systemTime + '\'' +
                ", source='" + source + '\'' +
                ", communicationId='" + communicationId + '\'' +
                ", templateId='" + templateId + '\'' +
                ", productCode='" + productCode + '\'' +
                ", smsCode='" + smsCode + '\'' +
                '}';
    }

    private Integer templateId;
    private Integer productCode;
    private Integer smsCode;
}

