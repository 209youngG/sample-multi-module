FROM openjdk:17
WORKDIR /app

# sample-admin JAR 파일 복사
COPY build/libs/sample-admin.jar admin.jar

# 컨테이너 실행 시 Spring Boot 애플리케이션 실행
ENTRYPOINT ["java", "-jar", "admin.jar"]
