package acceptance.client;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseClient {
    protected static Properties properties = new Properties();
//    String user = "arnaud";
//    String password = "password";
//    String url = "jdbc:mysql://localhost:3306/ivoschool";
    private Connection connection;

    protected DSLContext create;

    public DatabaseClient() {

        try {
            properties.load(getClass().getClassLoader().getResourceAsStream("profile.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public DatabaseClient configureWith() {
        try {
            connection = DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("user"), properties.getProperty("password"));
            create = DSL.using(connection, SQLDialect.MYSQL);
            return this;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    protected Connection getConnection() {
        return connection;
    }

    public void reset() {
        try {
            getConnection().close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
