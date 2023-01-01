package guru.springframework.test.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author raed abu Sa'da
 * on 30/12/2022
 */

@Service
@Profile("prod")
public class ProductionDataSource implements FakeDataSource {

    @Override
    public String getConnectionInfo() {
        return "Production Data Source...";
    }
}
