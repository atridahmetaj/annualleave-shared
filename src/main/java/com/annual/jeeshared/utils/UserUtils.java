package com.annual.jeeshared.utils;

import com.annual.jeeshared.entity.User;
import com.annual.jeeshared.enums.Role;
import org.springframework.security.core.context.SecurityContextHolder;

public class UserUtils {

    public static User getLoggedInUser() {
        return ((User) SecurityContextHolder.getContext().getAuthentication().getPrincipal());
    }

    public static boolean isAdmin(User user) {
        return user.getRole() == Role.Admin;
    }

    public static boolean isTeamMember(User user) {
        return user.getRole() == Role.User;
    }
}
