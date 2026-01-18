package ru.svyazhin.MySeconddTestAppSpringBoot.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import ru.svyazhin.MySeconddTestAppSpringBoot.exception.ValidationFailedException;

@Slf4j
@Service
@Primary
public class RequestValidationService extends ValidationService {
    @Override
    public  void isValid(BindingResult bindingResult) throws ValidationFailedException {
        if (bindingResult.hasErrors()) {
            log.info("Ошибка валидации: {}", bindingResult.getFieldErrors());
            throw new ValidationFailedException(bindingResult.getFieldError().toString());
        }
    }
}
