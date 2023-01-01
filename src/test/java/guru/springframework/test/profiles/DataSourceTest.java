package guru.springframework.test.profiles;

import guru.springframework.test.config.DataSourceConfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author raed abu Sa'da
 * on 30/12/2022
 */

@ActiveProfiles("prod")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(DataSourceConfig.class)
public class DataSourceTest {

    private FakeDataSource fakeDataSource;

    @Autowired
    public void setFakeDataSource(FakeDataSource fakeDataSource){
        this.fakeDataSource = fakeDataSource;
    }

    @Test
    public void testDataSource() {
        System.out.println(fakeDataSource.getConnectionInfo());
    }
}
