package javapractice.astrologyapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "iZodiacGetter")
    public ZodiacGetter createZodiacGetter() { return new ZodiacGetter(); }

    @Bean(name = "iZodiacValidator")
    public ZodiacValidator createZodiacValidator() { return new ZodiacValidator(); }

    @Bean(name = "iZodiacHandler")
    public ZodiacHandler createZodiacHandler(){
        return new ZodiacHandler(createZodiacGetter(), createZodiacValidator())
    }
    // add flow control bean
}
