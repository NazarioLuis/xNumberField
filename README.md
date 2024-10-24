# Instalación de xNumberField

Para usar `xNumberField` en tu proyecto de Java Swing con Maven, sigue estos pasos:

## 1. Agregar repositorio de JitPack

En tu archivo `pom.xml`, añade el siguiente repositorio en la sección `<repositories>`:

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```
## 2. Agregar dependencia

Agrega la siguiente dependencia dentro de la sección `<dependencies>` para usar la versión `v1.0.0` de la librería:

```xml
<dependency>
    <groupId>com.github.NazarioLuis</groupId>
    <artifactId>xNumberField</artifactId>
    <version>v1.0.0</version>
</dependency>
```

## 3. Ejemplo de uso

Aquí tienes un ejemplo de cómo usar `NumberTextField` en una aplicación Swing:

```java
NumberTextField numberTextField = new NumberTextField();

numberTextField.setValue(1000000d);	

Double number = numberTextField.getValue();
```
