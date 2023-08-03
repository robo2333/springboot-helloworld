package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @ClassName : com.BlogApplication  //类名
 * @Description :   //描述
 * @Author : Rui //作者
 * @Date: 2023/8/3  16:24
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class BlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class);
    }
}
