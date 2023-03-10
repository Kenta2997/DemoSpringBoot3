package jp.tokyo.ota.kenhagi.springDemo.Job;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(value = "settings.bulbulTasklet", havingValue = "Job2")
public class DemoJob2 implements DemoJob {
    @Override
    public void doJob() {
        System.out.println("this is job1 class");
    }
}
