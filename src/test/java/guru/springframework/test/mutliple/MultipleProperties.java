package guru.springframework.test.mutliple;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

/**
 * @author raed abu Sa'da
 * on 30/12/2022
 */

@Configuration
@PropertySources({
        @PropertySource("classpath:testing.properties"),
        @PropertySource("classpath:testing-encrypt.properties")
    })
public class MultipleProperties {
}
