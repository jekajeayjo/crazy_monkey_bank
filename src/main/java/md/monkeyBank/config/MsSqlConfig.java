package md.monkeyBank.config;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
public class MsSqlConfig {
    @Value("${spring.datasource.url}")
    private String url;
    @Value("${spring.datasource.username}")
    private String username;
    @Value("${spring.datasource.password}")
    private String password;

    @Bean(name = "msqlDataSource")
    public SQLServerDataSource getConnection() throws SQLException {
        SQLServerDataSource ods = new SQLServerDataSource();
        ods.setURL(url);
        ods.setUser(username);
        ods.setPassword(password);

//        ods.setConnectionCachingEnabled(true);
//        DriverManagerDataSource ods=new DriverManagerDataSource();
//        ods.setUrl(url);
//        ods.setUsername(username);
//        ods.setPassword(password);
//        ods.setDriverClassName(oracle.jdbc.driver.OracleDriver.class.getName());
//        Class.forName(driver);
//        Connection conn = DriverManager.getConnection(url, username, password);
        return ods;

    }

}
