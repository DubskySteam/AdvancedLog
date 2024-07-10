package dev.dubsky.advancedlog;

import java.io.PrintWriter;
import java.io.StringWriter;

public class LogWriter {
    public void write(int mode, String msg) {
        write(Color.fromInt(mode), msg);
    }

    public void write(Color color, String msg) {
        System.out.println(color.getCode() + msg + Color.RESET.getCode());
    }

    public void write(String msg) {
        System.out.println(msg);
    }

    public void write(Color color, Exception e) {
        StringWriter sw = new StringWriter();
        e.printStackTrace(new PrintWriter(sw));
        String exceptionAsString = sw.toString();
        System.out.println(color.getCode() + exceptionAsString + Color.RESET.getCode());
    }
}
