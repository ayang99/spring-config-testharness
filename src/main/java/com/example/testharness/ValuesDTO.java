package com.example.testharness;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.beans.factory.annotation.Value;

public class ValuesDTO {

    @JsonProperty("flywayEnabled")
    private String flywayEnabled;

    @JsonProperty("jpaShowSQL")
    private String jpaShowSql;

    @JsonProperty("dbBaseUrl")
    private String dbBaseUrl;

    @JsonProperty("username")
    private String username;

    @JsonProperty("password")
    private String password;

    @JsonProperty("driverClassName")
    private String driverClassName;

    @JsonProperty("webapiJdbcUrl")
    private String jdbcUrl;

    @JsonProperty("webapiUsername")
    private String webapiUsername;

    @JsonProperty("webapiPassword")
    private String webapiPassword;

    @JsonProperty("webapiDriverClassName")
    private String webapiDriverClassName;

    @JsonProperty("webapiMaxPoolSize")
    private String webapiMaxPoolSize;

    public String getFlywayEnabled() {
        return flywayEnabled;
    }

    public void setFlywayEnabled(String flywayEnabled) {
        this.flywayEnabled = flywayEnabled;
    }

    public String getJpaShowSql() {
        return jpaShowSql;
    }

    public void setJpaShowSql(String jpaShowSql) {
        this.jpaShowSql = jpaShowSql;
    }

    public String getDbBaseUrl() {
        return dbBaseUrl;
    }

    public void setDbBaseUrl(String dbBaseUrl) {
        this.dbBaseUrl = dbBaseUrl;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getJdbcUrl() {
        return jdbcUrl;
    }

    public void setJdbcUrl(String jdbcUrl) {
        this.jdbcUrl = jdbcUrl;
    }

    public String getWebapiUsername() {
        return webapiUsername;
    }

    public void setWebapiUsername(String webapiUsername) {
        this.webapiUsername = webapiUsername;
    }

    public String getWebapiPassword() {
        return webapiPassword;
    }

    public void setWebapiPassword(String webapiPassword) {
        this.webapiPassword = webapiPassword;
    }

    public String getWebapiDriverClassName() {
        return webapiDriverClassName;
    }

    public void setWebapiDriverClassName(String webapiDriverClassName) {
        this.webapiDriverClassName = webapiDriverClassName;
    }

    public String getWebapiMaxPoolSize() {
        return webapiMaxPoolSize;
    }

    public void setWebapiMaxPoolSize(String webapiMaxPoolSize) {
        this.webapiMaxPoolSize = webapiMaxPoolSize;
    }
}
