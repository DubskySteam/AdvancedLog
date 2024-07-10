# AdvancedLog

## Status

![GitHub](https://img.shields.io/github/license/dubskysteam/RapidRequest?style=for-the-badge)

[![Gradle Package](https://github.com/DubskySteam/AdvancedLog/actions/workflows/gradle-publish.yml/badge.svg)](https://github.com/DubskySteam/AdvancedLog/actions/workflows/gradle-publish.yml)

## 🌟 Features
- [X] Basic output
- [X] Color coding (Strings, Exceptions)

## 🚀 Upcoming Features
- [ ] Object parsing
- [ ] Custom formatting
- [ ] Exception handler
- [ ] File logging

## 🛠️ Quick Start Guide

### Step 1: Add the GitHub Package repo
```xml
maven {
        name = "GitHubPackages"
        url = uri("https://maven.pkg.github.com/DubskySteam/AdvancedLog")
        credentials {
            username = System.getenv("USERNAME")
            password = System.getenv("TOKEN")
        }
    }
```
you need to create a environtment variables according to this. They need to contain your GitHub Username and a GitHub token that has permissions to read github packages. 

### Step 2: Add the dependency

Gradle:
```gradle
implementation 'dev.dubsky:advancedlog:0.1.2'
```

Maven:
```xml
<dependency>
    <groupId>dev.dubsky</groupId>
    <artifactId>advancedlog</artifactId>
    <version>0.1.2</version>
</dependency>
```

### Test class to test outputs

```java
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        LogWriter logWriter = new LogWriter();

        System.out.println("Testing LogWriter with int mode:");
        logWriter.write(0, "Green message");
        logWriter.write(1, "Yellow message");
        logWriter.write(2, "Red message");
        logWriter.write(3, "Reset message");

        System.out.println("\nTesting LogWriter with Color enum:");
        logWriter.write(Color.GREEN, "Green message");
        logWriter.write(Color.YELLOW, "Yellow message");
        logWriter.write(Color.RED, "Red message");
        logWriter.write(Color.RESET, "Reset message");

        System.out.println("\nTesting LogWriter without color:");
        logWriter.write("Plain message");

        System.out.println("\nTesting AdvLog with int color code:");
        AdvLogger.config.enable = true;
        AdvLogger.output(0, "Green message");
        AdvLogger.output(1, "Yellow message");
        AdvLogger.output(2, "Red message");
        AdvLogger.output(3, "Reset message");

        System.out.println("\nTesting AdvLog with Color enum:");
        AdvLogger.output(Color.GREEN, "Green message");
        AdvLogger.output(Color.YELLOW, "Yellow message");
        AdvLogger.output(Color.RED, "Red message");
        AdvLogger.output(Color.RESET, "Reset message");

        System.out.println("\nTesting AdvLog with DEBUG off:");
        AdvLogger.config.enable = false;
        AdvLogger.output(Color.RED, "This message should not appear");
        AdvLogger.config.enable = true;

        System.out.println("\nTesting Exception handling");
        AdvLogger.output(Color.RED, new FileNotFoundException("File not found"));
    }
}
```


## 📌 Version History

- **v0.1.2 - 08-07-2024**
- **v0.1.0 - 08-07-2024**
