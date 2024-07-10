package dev.dubsky.advancedlog.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import dev.dubsky.advancedlog.AdvLogger;
import dev.dubsky.advancedlog.Color;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GenTest {
private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outContent));
        AdvLogger.config.enable = true;
    }

    @Test
    public void testOutWithIntColorCode() {
        AdvLogger.output(0, "Green message");
        // assertEquals("\033[92mGreen message\033[0m\n", outContent.toString());
    }

    @Test
    public void testOutWithColorEnum() {
        AdvLogger.output(Color.YELLOW, "Yellow message");
        // assertEquals("\033[93mYellow message\033[0m\n", outContent.toString());
    }

    @Test
    public void testOutWithoutDebug() {
        AdvLogger.config.enable = false;
        AdvLogger.output(Color.RED, "Red message");
        assertEquals("", outContent.toString());
    }
}
