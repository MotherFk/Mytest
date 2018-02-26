package cn.wolfcode._01hello;

import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by liuzhenwei on 2017/12/10.
 */
@Controller
public class HelloController {
    @Autowired
    private MyDruidDataSource myDruidDataSource;
    @Autowired
    MyDataSource dataSource;
    @Autowired
    private ApplicationArguments arguments;//启动springboot时，从AppConfig的main方法在控制台传入的参数
    @Autowired
    private final static Logger logger = (Logger) LoggerFactory.getLogger(HelloController.class);
    @RequestMapping("hello")
    @ResponseBody
    public String helloword() {
        logger.error("错误信息");
        logger.debug("DEBUG信息");
        logger.warn("WARN警告信息");
        System.out.println(myDruidDataSource);
        System.out.println(dataSource);
        System.out.println(arguments.getNonOptionArgs());
        return "Hello Spring-Boot" + arguments.getNonOptionArgs();
    }
}
