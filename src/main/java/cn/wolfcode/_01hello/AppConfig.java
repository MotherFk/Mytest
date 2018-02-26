package cn.wolfcode._01hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

/**
 * Created by liuzhenwei on 2017/12/10.
 */
@SpringBootApplication
public class AppConfig {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(AppConfig.class);
        app.run();
        System.out.println(Arrays.toString(args));
        //设置banner是否启用
        // app.setBannerMode(Banner.Mode.OFF);
        //等同于上面的
        //new SpringApplicationBuilder(AppConfig.class).bannerMode(Banner.Mode.OFF).build().run();

    }

    @Bean
    @ConfigurationProperties("jdbc")
    public MyDataSource dataSource() {
        return new MyDataSource();
    }
}

