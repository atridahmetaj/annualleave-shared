package com.annual.jeeshared.utils;

import org.slf4j.Logger;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LogUtil {

    public static void debug(Logger logger, String format, Object... args) {
        logger.debug(String.format(format, args));
    }

    public static void error(Logger logger, String format, Object... args) {
        logger.error(String.format(format, args));
    }

    public static void warn(Logger logger, String format, Object... args) {
        logger.warn(String.format(format, args));
    }
}
