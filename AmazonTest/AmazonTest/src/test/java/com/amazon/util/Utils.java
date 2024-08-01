package com.amazon.util;

public class Utils {
    public static void waitForSeconds(int seconds) throws InterruptedException {
        Thread.sleep(seconds * 1000);
    }
}
