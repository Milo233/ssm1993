package SpringTest;


import com.milo.utils.ConfigUtils;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-mvc.xml","classpath:spring/spring-mybatis.xml"})
@WebAppConfiguration("src/main/resources")
public class BeanTest extends TestCase {


    @Autowired
    private ConfigUtils configUtils;

    @Test
    public void hello(){
        String configByKey2 = configUtils.getConfigByKey("TestOrder");
        System.out.println(configByKey2);
    }

}
