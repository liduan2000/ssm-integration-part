package com.duanli.config;

import com.github.pagehelper.PageInterceptor;
import org.apache.ibatis.session.AutoMappingBehavior;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
public class MapperConfig {
    @Bean
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource) {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();

        //使用纯代码方式配置
        configuration.setMapUnderscoreToCamelCase(true);
        configuration.setAutoMappingBehavior(AutoMappingBehavior.FULL);

        sqlSessionFactoryBean.setConfiguration(configuration);
        sqlSessionFactoryBean.setTypeAliasesPackage("com.duanli.pojo");
        PageInterceptor pageInterceptor = new PageInterceptor();
        Properties properties = new Properties();
        properties.setProperty("helperDialect", "mysql");
        pageInterceptor.setProperties(properties);
        sqlSessionFactoryBean.addPlugins(pageInterceptor);

        // 使用xml配置的方式设置
//        Resource resource = new ClassPathResource("mybatis-config.xml");
//        sqlSessionFactoryBean.setConfigLocation(resource);

        return sqlSessionFactoryBean;
    }

    @Bean
    // mapper代理对象加入IOC容器
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        // mapper接口和mapper xml共同的包
        mapperScannerConfigurer.setBasePackage("com.duanli.mapper");
        return mapperScannerConfigurer;
    }
}
