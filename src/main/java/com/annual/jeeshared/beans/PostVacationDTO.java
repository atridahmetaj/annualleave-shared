package com.annual.jeeshared.beans;

import com.annual.jeeshared.enums.ApplicationStatus;
import com.annual.jeeshared.enums.ApplicationType;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class PostVacationDTO {
    private Date startDate;
    private Date endDate;
    private ApplicationStatus status;
    private ApplicationType applicationType;
}
