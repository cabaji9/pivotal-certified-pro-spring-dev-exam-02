/**
 * @author Iuliana Cosmina
 * @since 1.0
 */
module com.apress.cems.config.practice {
    requires com.apress.cems.dao;
    requires org.apache.commons.lang3;
    requires java.sql;
    requires org.slf4j;
    requires spring.context;
    requires spring.beans;
    requires spring.core;
    requires spring.jdbc;
    requires ojdbc7;
    requires java.naming;
    requires java.annotation;
    requires lombok;

    requires com.apress.cems.pojos;
}