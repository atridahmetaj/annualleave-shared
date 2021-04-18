package com.annual.jeeshared.constants;

public final class Constants {
    public static final String SAVE_USER="User with name %s is saved correctly";
    public static final int TOKEN_EXPIRES_IN_MINUTES=60;
    public static final String APPLICATION_URL = "http://localhost:4200";
    public static final String WELCOME_EMAIL_SUBJECT = "WELCOME!";
    public static final String WELCOME_EMAIL_MESSAGE = "Thank you for joining us! Click the link below to verify your account:\n\n%s/verifyAccount?token=%s";
    public static final String RESET_PASSWORD_EMAIL_SUBJECT = "RESET PASSWORD";
    public static final String RESET_PASSWORD_EMAIL_MESSAGE = "To reset your password click on the link below:\n\n%s/resetPassword?token=%s";
}
