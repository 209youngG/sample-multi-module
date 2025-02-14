FROM openjdk:17
WORKDIR /app

# internal-api JAR 파일 복사
COPY build/libs/internal-api.jar internal-api.jar

# 컨테이너 실행 시 Spring Boot 애플리케이션 실행
ENTRYPOINT ["java", "-jar", "internal-api.jar"]
