package net.csdcodes;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan({"net.csdcodes.model"})
public class SpringbootmybatiscrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootmybatiscrudApplication.class, args);
    }

}