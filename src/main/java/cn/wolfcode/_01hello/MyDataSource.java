package cn.wolfcode._01hello;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by liuzhenwei on 2017/12/10.
 */
@Setter
@Getter
@ToString
public class MyDataSource {
    private String username;
    private String password;
    private String url;
    private String driverClassName;
}
