package jp.tokyo.ota.kenhagi.springDemo.Job;

import jp.tokyo.ota.kenhagi.springDemo.Domain.UserSelector;
import jp.tokyo.ota.kenhagi.springDemo.Service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@ConditionalOnProperty(value = "settings.bulbulTasklet", havingValue = "Job2")
public class DemoJob2 implements DemoJob {

    private final ClientService clientService;
    @Override
    public void doJob() {
        System.out.println("this is job2 class");
        UserSelector userSelector = new UserSelector();
        clientService.find(userSelector).forEach(System.out::println);

        System.out.println("Use Selector");
        userSelector.setCid("com003");
        clientService.find(userSelector).forEach(System.out::println);
    }
}
