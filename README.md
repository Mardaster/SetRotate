# SetRotate

Minecraft Forge мод для версии 1.8.9, предоставляющий функциональность управления ротацией.

## Требования

- Java 8 (JDK 1.8)
- Gradle 4.9 (через Gradle Wrapper)
- Minecraft Forge 1.8.9-11.15.1.2318-1.8.9

## Сборка

```bash
./gradlew build
```

## Настройка среды разработки

```bash
# Для Eclipse
./gradlew setupDecompWorkspace eclipse

# Для IntelliJ IDEA
./gradlew setupDecompWorkspace idea
```

## Структура проекта

```
SetRotate/
├── src/main/java/com/mardaster/setrotate/
│   └── SetRotate.java          # Главный класс мода
├── src/main/resources/
│   └── mcmod.info              # Метаданные мода
├── build.gradle                # Скрипт сборки Gradle
├── gradle.properties           # Свойства проекта
├── settings.gradle             # Настройки Gradle проекта
├── gradlew                     # Gradle Wrapper (Unix)
├── gradlew.bat                 # Gradle Wrapper (Windows)
└── gradle/wrapper/
    ├── gradle-wrapper.jar      # Gradle Wrapper JAR (Gradle 4.9)
    └── gradle-wrapper.properties
```
