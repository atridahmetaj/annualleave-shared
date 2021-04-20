package com.annual.jeeshared.constants;

public final class Constants {

    public static final String AUTHENTICATION_HEADER_PREFIX = "Bearer ";
    public static final String SAVE_USER="User with name %s is saved correctly";
    public static final int TOKEN_EXPIRES_IN_MINUTES=60;
    public static final String APPLICATION_URL = "http://localhost:4200";
    public static final String WELCOME_EMAIL_SUBJECT = "WELCOME!";
    public static final String WELCOME_EMAIL_MESSAGE = "Thank you for joining us! Click the link below to verify your account:\n\n%s/verifyAccount?token=%s";
    public static final String RESET_PASSWORD_EMAIL_SUBJECT = "RESET PASSWORD";
    public static final String RESET_PASSWORD_EMAIL_MESSAGE = "To reset your password click on the link below:\n\n%s/resetPassword?token=%s";
    public static final String SENDING_VERIFICATION_EMAIL = "Sending verification e-mail to user: %s";
    public static final String VERIFICATION_EMAIL_SENT = "Verification e-mail sent to user: %s";
    public static final String SENDING_RESET_PASSWORD_EMAIL = "Sending verification e-email to user: %s";
    public static final String RESET_PASSWORD_EMAIL_SENT = "Reset password e-mail sent to user: %s";
    public static final String CREATING_LEAVING_APPLICATION = "Creating leaving application";
    public static final String UPDATING_LEAVING_APPLICATION = "Updating leaving application";
    public static final String SENDING_EMAIL = "Sending email to user: %s";
    public static final String EMAIL_SENT = "Email sent";
    public static final String NOT_ALLOWED = "Operation not allowed";
    public static final int PROBATION_PERIOD = 90;
    public static final String APPLICATION_UPDATED = "Application updated";
    public static final String APPLICATION_CREATED = "New application created";
}
