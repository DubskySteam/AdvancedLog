# AdvancedLog

## Status

![GitHub](https://img.shields.io/github/license/dubskysteam/RapidRequest?style=for-the-badge)

[![Gradle Package](https://github.com/DubskySteam/AdvancedLog/actions/workflows/gradle-publish.yml/badge.svg?branch=master)](https://github.com/DubskySteam/AdvancedLog/actions/workflows/gradle-publish.yml)

## 🌟 Features
- [X] Basic output
- [X] Color coding

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

## 📌 Version History

- **v0.1.2 - 08-07-2024**
- **v0.1.0 - 08-07-2024**