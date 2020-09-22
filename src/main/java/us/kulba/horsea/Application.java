package us.kulba.horsea;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import us.kulba.horsea.config.DbConnectionConfig;

import javax.sql.DataSource;
import java.io.IOException;

/**
 * Application is the initial app driver.
 *
 * Special Note: In order to allow the ComponentScan to find all of the classes with the
 * ComponentScan annotation, make sure this class is in the root classpath.
 *
 * @author James Kulba, jkulba@gmail.com
 */
@SpringBootApplication
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    @Autowired
    private DbConnectionConfig dbConnectionConfig;


    @Bean(name = "starterDataSource")
    public DataSource horseaDatasource() throws IOException {
        DataSource ds = new DataSource();
        ds.setDriverClassName(dbConnectionConfig.getDriverClassName());
        ds.setUrl(dbConnectionConfig.getUrl());
        ds.setUsername(dbConnectionConfig.getUsername());
        ds.setPassword(dbConnectionConfig.getPassword());

        return ds;
    }

    public static void main(final String[] args) {
        log.info("Starting Horsea Service");
        SpringApplication.run(Application.class, args);
    }
}