package guru.springframework.test.env;

import guru.springframework.test.externalprops.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * @author raed abu Sa'da
 * on 29/12/2022
 */

@Configuration
@PropertySource("classpath:testing.properties")
public class ExternalPropsEnv {

    @Autowired
    Environment environment;

    @Bean
    FakeJmsBroker fakeJmsBrokerEnv(){

        FakeJmsBroker broker = new FakeJmsBroker();
        broker.setUrl(environment.getProperty("jms.server"));
//        broker.setPort(environment.getRequiredProperty("jms.port", Integer.class));
        broker.setUser(environment.getProperty("jms.user"));
        broker.setPassword(environment.getProperty("jms.password"));

        return broker;
    }
}
