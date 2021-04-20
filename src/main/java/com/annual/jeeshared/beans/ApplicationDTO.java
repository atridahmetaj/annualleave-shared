package com.annual.jeeshared.beans;

import com.annual.jeeshared.enums.ApplicationType;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ApplicationDTO {
    Date from;
    Date to;
    Long userId;
    ApplicationType applicationType;
}
