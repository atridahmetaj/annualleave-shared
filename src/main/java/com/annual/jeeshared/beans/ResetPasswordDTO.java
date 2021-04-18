package com.annual.jeeshared.beans;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResetPasswordDTO {
    private String password;
    private String resetToken;
}
