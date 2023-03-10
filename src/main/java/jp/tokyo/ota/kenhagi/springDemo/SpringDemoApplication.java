package jp.tokyo.ota.kenhagi.springDemo;

import jp.tokyo.ota.kenhagi.springDemo.Job.DemoJob;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AllArgsConstructor
public class SpringDemoApplication implements CommandLineRunner {

    @Autowired
    private final DemoJob demoJob;

    public static void main(String[] args) {
        SpringApplication.run(SpringDemoApplication.class, args).close();
    }

    @Override
    public void run(String... args) {
        demoJob.doJob();
    }
}
