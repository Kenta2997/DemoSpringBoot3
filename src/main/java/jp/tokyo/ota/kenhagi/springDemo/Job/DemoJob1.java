package jp.tokyo.ota.kenhagi.springDemo.Job;

import jp.tokyo.ota.kenhagi.springDemo.Service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@ConditionalOnProperty(value = "settings.bulbulTasklet", havingValue = "Job1")
public class DemoJob1 implements DemoJob {

    private final ClientService clientService;

    @Override
    public void doJob() {
        System.out.println("this is job1 class");
        clientService.findAllCompany().forEach(System.out::println);
    }
}
