package dev.dubsky.advancedlog;

import dev.dubsky.advancedlog.config.LogSettings;

public class AdvLogger {

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
}
