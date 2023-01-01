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
@Profile("dev")
public class DevProfileSysOut {

    @Autowired
    public DevProfileSysOut(@Value("${spring.profile.app.name}") String message) {
        System.out.println("===================================");
        System.out.println("===================================");
        System.out.println("===           DEV               ===");
        System.out.println(message);
        System.out.println("===================================");
        System.out.println("===================================");
    }
}
