package dev.dubsky.advancedlog;

public enum Color {
    RESET("\033[0m"),
    GREEN("\033[92m"),
    YELLOW("\033[93m"),
    RED("\033[91m");

    private final String code;

    Color(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public static Color fromInt(int mode) {
        switch (mode) {
            case 0: return GREEN;
            case 1: return YELLOW;
            case 2: return RED;
            default: return RESET;
        }
    }
}
