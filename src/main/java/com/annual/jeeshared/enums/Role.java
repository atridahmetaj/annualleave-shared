package com.annual.jeeshared.enums;

import lombok.Getter;

@Getter
public enum Role {
    Student(0), Lecturer(1), Secretary(2);

    int code;

    Role(int code) {
        this.code = code;
    }

    public Role getRole(int code) {
        for (Role role : Role.values()) {
            if (role.getCode() == code)
                return role;
        }
        return null;
    }

}