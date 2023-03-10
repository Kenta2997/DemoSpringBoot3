package jp.tokyo.ota.kenhagi.springDemo.Tasklet;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(value = "settings.bulbulTasklet", havingValue = "Func1")
public class Func1 implements Func {
    @Override
    public void tasklet() {
        System.out.println("this is func1 class");
    }
}
