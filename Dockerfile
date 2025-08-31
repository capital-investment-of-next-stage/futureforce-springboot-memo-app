# 1. Java 21 の軽量イメージを使用
FROM --platform=linux/amd64 openjdk:17-jdk-slim

# 2. 作業ディレクトリを設定
WORKDIR /app

# 3. ソースコードをコピー
COPY . /app

# 4. Maven Wrapper (`mvnw`) に実行権限を付与
# 必要なツールインストール + mvnw整備
RUN apt-get update && apt-get install -y dos2unix \
 && chmod +x mvnw \
 && dos2unix mvnw

# 5. 依存関係をインストール（キャッシュを利用）
RUN ./mvnw dependency:resolve

# 6. `mvn clean package` で JAR をビルド
RUN ./mvnw clean package

# 7. Spring Boot のポートを開放
EXPOSE 8081

# 8. `mvn spring-boot:run` を実行
CMD ["./mvnw", "spring-boot:run", "-Dspring-boot.run.jvmArguments=-Dspring.main.allow-bean-definition-overriding=true"]