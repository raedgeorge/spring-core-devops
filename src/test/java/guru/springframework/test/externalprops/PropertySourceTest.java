package guru.springframework.test.externalprops;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.junit.Assert.assertEquals;

/**
 * @author raed abu Sa'da
 * on 29/12/2022
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ExternalPropsPropertySourceTestConfig.class})
public class PropertySourceTest {

    @Autowired
    FakeJmsBroker fakeJmsBroker;

    @Test
    public void name() {

        assertEquals("172.32.32.90", fakeJmsBroker.getUrl());
//        assertEquals("23", fakeJmsBroker.getPort());
        assertEquals("user", fakeJmsBroker.getUser());
        assertEquals("password", fakeJmsBroker.getPassword());
    }
}
