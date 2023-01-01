package guru.springframework.test.env;

import guru.springframework.test.externalprops.FakeJmsBroker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

/**
 * @author raed abu Sa'da
 * on 30/12/2022
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ExternalPropsEnv.class)
public class ExternalEnvTest {

    @Autowired
    FakeJmsBroker broker;

    @Test
    public void name() {
        assertEquals("172.32.32.90", broker.getUrl());
    }
}
