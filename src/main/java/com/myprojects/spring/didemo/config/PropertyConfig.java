package com.myprojects.spring.didemo.config;

import com.myprojects.spring.didemo.examplebeans.SomeDataSource;
import com.myprojects.spring.didemo.examplebeans.SomeJMSBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
public class PropertyConfig {

    @Value("${app.database.userName}")
    String user;

    @Value("${app.database.password")
    String password;

    @Value("${app.database.url}")
    String url;

    @Value("${jms.username}")
    String jmsUserName;

    @Value("${jms.password}")
    String jmsPassword;

    @Value("${jms.url}")
    String jmsUrl;

    @Bean
    public SomeDataSource getDataSource(){
        SomeDataSource dataSource = new SomeDataSource();
        dataSource.setUser(user);
        dataSource.setPassword(password);
        dataSource.setUrl(url);

        return dataSource;
    }

    @Bean
    public SomeJMSBroker getJMSBroker(){
        SomeJMSBroker jmsBroker = new SomeJMSBroker();
        jmsBroker.setUsername(jmsUserName);
        jmsBroker.setPassword(jmsPassword);
        jmsBroker.setUrl(jmsUrl);

        return jmsBroker;
    }

}
