package ru.svyazhin.MySeconddTestAppSpringBoot.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.svyazhin.MySeconddTestAppSpringBoot.model.Response;
import ru.svyazhin.MySeconddTestAppSpringBoot.util.DateTimeUtil;

import java.util.Date;

@Slf4j
@Service
@Qualifier("ModifySystemTimeResponseService")
public class ModifySystemTimeResponseService implements ModifyResponseService{
    @Override
    public Response modify(Response response) {
        log.info("Response перед изменением: {}", response);
        response.setSystemTime(DateTimeUtil.getCustomFormat().format(new Date()));
        log.info("Response после изменения: {}", response);
        return response;
    }
}
