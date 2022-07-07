//package com.dorr.spring.neo4j.common.config;
//
//import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
//import org.springframework.web.filter.CorsFilter;
//
//@Configuration
//public class CorsConfiguration {
//
//    @Bean
//    public FilterRegistrationBean corsConfigurer() {
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        org.springframework.web.cors.CorsConfiguration config = new org.springframework.web.cors.CorsConfiguration();
//        config.setAllowCredentials(true);
//        // 设置你要允许的网站域名，如果全允许则设为 *
//        config.addAllowedOrigin("*");
//        // 如果要限制 HEADER 或 METHOD
//        config.addAllowedHeader("*");
//        config.addAllowedMethod("*");
//        source.registerCorsConfiguration("/**", config);
//        FilterRegistrationBean bean = new FilterRegistrationBean(new CorsFilter(source));
//        // 这个顺序很重要哦，为避免麻烦请设置在最前
//        bean.setOrder(0);
//        return bean;
//    }
//}