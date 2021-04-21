package com.annual.jeeshared.beans;

import com.annual.jeeshared.enums.ApplicationType;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.Date;

@Getter
@Setter
public class ApplicationEmailDTO {
    Date from;
    Date to;
    String user;
    ApplicationType applicationType;

    @Override
    public String toString(){
        return user+" requested "+this.applicationType+" from: "+this.from+
                " to: "+this.to;
    }
}
