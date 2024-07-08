package dev.dubsky.advancedlog;

public class LogWriter {
    public void write(int mode, String msg) {
        System.out.print(Color.fromInt(mode) + msg + Color.RESET.getCode());
    }
    
    public void write(Color color, String msg) {
        System.out.print(color.getCode() + msg + color.RESET.getCode());
    }

    public void write(String msg) {
        System.out.print(msg);
    }
}
