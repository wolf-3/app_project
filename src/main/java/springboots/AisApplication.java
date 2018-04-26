package springboots;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
@MapperScan("springboots.mapper")
public class AisApplication {
    public static void main(String[] args) {
        SpringApplication.run(AisApplication.class, args);
    }
}
