package guru.springframework.test.externalprops;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * @author raed abu Sa'da
 * on 29/12/2022
 */

@Configuration
@PropertySource("classpath:testing.properties")
public class ExternalPropsPropertySourceTestConfig {

    @Value("${jms.server}")
    public String jmsServer;

    @Value("${jms.port}")
    public String jmsPort;

    @Value("${jms.user}")
    public String username;

    @Value("${jms.password}")
    public String password;

    public String getJmsServer() {
        return jmsServer;
    }

   @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        return new PropertySourcesPlaceholderConfigurer();
   }

    @Bean
    public FakeJmsBroker fakeJmsBroker(){

        FakeJmsBroker broker = new FakeJmsBroker();
        broker.setUrl(jmsServer);
        broker.setPassword(jmsPort);
        broker.setUser(username);
        broker.setPassword(password);

        return broker;
    }
}
