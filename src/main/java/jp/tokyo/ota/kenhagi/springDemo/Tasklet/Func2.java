package jp.tokyo.ota.kenhagi.springDemo.Tasklet;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(value = "settings.bulbulTasklet", havingValue = "Func2")
public class Func2 implements Func {
    @Override
    public void tasklet() {
        System.out.println("this is func2 class");
    }
}
