package ru.svyazhin.MySeconddTestAppSpringBoot.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import ru.svyazhin.MySeconddTestAppSpringBoot.exception.ValidationFailedException;

import java.util.stream.Collectors;

@Service
@Primary
public class RequestValidationService extends ValidationService {

    @Override
    public void isValid(BindingResult bindingResult) throws ValidationFailedException {
        if (bindingResult.hasErrors()) {

            String allErrors = bindingResult.getFieldErrors()
                    .stream()
                    .map(this::formatFieldError)
                    .collect(Collectors.joining("; "));

            throw new ValidationFailedException(allErrors);
        }
    }

    private String formatFieldError(FieldError fe) {
        return fe.getField() + ": " + fe.getDefaultMessage();
    }
}
