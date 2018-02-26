package cn.wolfcode._01hello;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by liuzhenwei on 2017/12/10.
 */
@Setter
@Getter
@ToString
@Component
@ConfigurationProperties("jdbc")
public class MyDruidDataSource {
    private String username;
    private String password;
    private String url;
    private String driverClassName;
}
