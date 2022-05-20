package com.zzg.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan({"com.zzg.service","com.zzg.dao"})
@PropertySource("classpath:db.properties")
@Import({JdbcConfig.class,MyBatisConfig.class})
public class SpringConfig {
}
