package guru.springframework.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jms.Queue;

/**
 * Created by jt on 5/6/16.
 */
@Configuration
public class JMSConfig {

    public static final String textMsgQueue = "text.messagequeue";

    // white space
    // white space 2
    // white space 3
    @Bean
    public Queue textMessageQueue(){
        return new ActiveMQQueue(textMsgQueue);
    }
}
