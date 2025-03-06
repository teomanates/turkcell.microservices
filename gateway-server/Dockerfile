# Multi-stage build için Maven ve JDK imajı
FROM maven:3.9.6-eclipse-temurin-21 AS build

# Çalışma dizini belirleme
WORKDIR /app

# Proje dosyalarını kopyalama
COPY . /app/

# Maven ile build işlemi
RUN mvn clean package -DskipTests

# Runtime imajı
FROM eclipse-temurin:21-jdk
COPY --from=build /app/target/gateway-server-0.0.1-SNAPSHOT.jar /app/gateway-server.jar

# Uygulamayı çalıştırma
ENTRYPOINT ["java", "-jar", "/app/gateway-server.jar"]