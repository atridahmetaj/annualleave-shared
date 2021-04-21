package com.annual.jeeshared.beans;

import com.annual.jeeshared.enums.ApplicationType;
import com.annual.jeeshared.service.UserService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

@Getter
@Setter
public class ApplicationDTO {
    Date from;
    Date to;
    Long userId;
    ApplicationType applicationType;

}
