package dev.dubsky.advancedlog;

import java.io.PrintWriter;
import java.io.StringWriter;

import dev.dubsky.advancedlog.config.LogSettings;

public class AdvLogger {

    // Access the config
    public static LogSettings config = new LogSettings();
    private static LogWriter writer = new LogWriter();

    public static void output(int mode, String msg) {
        if(config.enable)
            writer.write(mode, msg);
    }

    public static void output(Color color, String msg) {
        if(config.enable)
            writer.write(color, msg);
    }

    public static void output(String msg) {
        if(config.enable)
            writer.write(msg);
    }

    public static void output(Color color, Exception e) {
        if (!config.enable) return;
        StringWriter sw = new StringWriter();
        e.printStackTrace(new PrintWriter(sw));
        String exceptionAsString = sw.toString();
        System.out.println(color.getCode() + exceptionAsString + Color.RESET.getCode());
    }
}
