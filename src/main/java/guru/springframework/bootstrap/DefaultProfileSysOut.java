package guru.springframework.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * @author raed abu Sa'da
 * on 30/12/2022
 */
@Component
@Profile("default")
public class DefaultProfileSysOut {

    @Autowired
    public DefaultProfileSysOut(@Value("${spring.profile.message}") String message) {

        System.out.println("===================================");
        System.out.println("===================================");
        System.out.println("===           DEFAULT           ===");
        System.out.println(message);
        System.out.println("===================================");
        System.out.println("===================================");
    }
}
