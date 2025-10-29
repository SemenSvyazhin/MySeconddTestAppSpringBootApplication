package ru.svyazhin.MySeconddTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import ru.svyazhin.MySeconddTestAppSpringBoot.exception.ValidationFailedException;

@Service
public class ValidationService {
    public void isValid(BindingResult bindingResult) throws ValidationFailedException {

    }
}
