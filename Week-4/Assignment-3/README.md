# Assignment3

## 環境要求

確保你的系统上安装了以下軟體：

- Java 17
- Maven
- MySQL

### 配置數據庫

在 `application.properties` 文件中，配置數據庫連接訊息：

```properties
spring.datasource.url=jdbc:mysql://your-database-host:your-database-port/your-database-name
spring.datasource.username=your-database-username
spring.datasource.password=your-database-password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
