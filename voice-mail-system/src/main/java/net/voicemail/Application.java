package net.voicemail;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication
@PropertySources({ @PropertySource(value = { "classpath:internal.properties" }), @PropertySource(value = {
        "file:/usr/local/cos/cos-webapp/conf/application.properties" }, ignoreResourceNotFound = true) })
public class Application extends SpringBootServletInitializer {

    Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {

        new Application().configure(new SpringApplicationBuilder(Application.class)).run(args);
    }
}