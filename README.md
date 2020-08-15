# BuildAPI

[![](https://jitpack.io/v/de.eintosti/buildapi.svg?style=flat-square&logo=appveyor)](https://jitpack.io/#de.eintosti/buildapi)
[![Discord](https://img.shields.io/discord/419460301403193344.svg?style=flat-square&colorB=7289da&label=Discord&logo=discord&logoColor=white)](https://discord.gg/Nt467Rf)

## How to use

### Add BuildAPI in your plugin
#### Maven
```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```
```xml
<dependencies>
    <dependency>
        <groupId>de.eintosti</groupId>
        <artifactId>buildapi</artifactId>
        <version>2.15</version>
        <scope>compile</scope>
    </dependency>
</dependencies>
```

#### Gradle
```groovy
repositories {
    maven { url 'https://jitpack.io' }
}
```
```groovy
dependencies {
    compile 'de.eintosti:buildapi:2.15'
}
```