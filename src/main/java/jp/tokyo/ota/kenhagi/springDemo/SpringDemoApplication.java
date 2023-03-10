package jp.tokyo.ota.kenhagi.springDemo;

import jp.tokyo.ota.kenhagi.springDemo.Tasklet.Func;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AllArgsConstructor
public class SpringDemoApplication implements CommandLineRunner {

    @Autowired
    private final Func func;

    public static void main(String[] args) {
        SpringApplication.run(SpringDemoApplication.class, args).close();
    }

    @Override
    public void run(String... args) {
        func.tasklet();
    }
}
