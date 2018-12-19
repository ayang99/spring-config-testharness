package com.example.testharness;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Just reads a bunch of configuration values and stuffs them into a DTO
 */
@Service
public class ValuesServiceImpl implements ValuesService {

    @Value("${spring.flyway.enabled}")
    private String flywayEnabled;

    @Value("${spring.jpa.show-sql}")
    private String jpaShowSql;

    @Value("${mkweb.db.configuration.baseurl}")
    private String dbBaseUrl;

    @Value("${mkweb.db.configuration.username}")
    private String username;

    @Value("${mkweb.db.configuration.password}")
    private String password;

    @Value("${mkweb.db.configuration.driverClassName}")
    private String driverClassName;

    @Value("${mkweb.db.webapi.jdbc-url}")
    private String jdbcUrl;

    @Value("${mkweb.db.webapi.username}")
    private String webapiUsername;

    @Value("${mkweb.db.webapi.password}")
    private String webapiPassword;

    @Value("${mkweb.db.webapi.driverClassName}")
    private String webapiDriverClassName;

    @Value("${mkweb.db.webapi.maximum-pool-size}")
    private String webapiMaxPoolSize;

    public ValuesDTO fetchValues() {
        ValuesDTO result = new ValuesDTO();
        result.setFlywayEnabled(flywayEnabled);
        result.setJpaShowSql(jpaShowSql);
        result.setDbBaseUrl(dbBaseUrl);
        result.setUsername(username);
        result.setPassword(password);
        result.setDriverClassName(driverClassName);
        result.setJdbcUrl(jdbcUrl);
        result.setWebapiUsername(webapiUsername);
        result.setWebapiPassword(webapiPassword);
        result.setWebapiDriverClassName(webapiDriverClassName);
        result.setWebapiMaxPoolSize(webapiMaxPoolSize);
        return result;
    }
}
