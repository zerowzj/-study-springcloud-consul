package study.springcloud.consul;

import org.springframework.boot.SpringApplication;
import study.springcloud.consul.support.SpringBootCfg;

public class Startup {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCfg.class, args);
    }
}
