FROM openjdk:17
WORKDIR /app

# external-api JAR 파일 복사
COPY build/libs/external-api.jar external-api.jar

# 컨테이너 실행 시 Spring Boot 애플리케이션 실행
ENTRYPOINT ["java", "-jar", "external-api.jar"]
