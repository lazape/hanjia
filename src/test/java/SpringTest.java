import com.hanjia.MySpringBootApplication;
import com.hanjia.mapper.EquipmentMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = MySpringBootApplication.class)
@RunWith(SpringRunner.class)
public class SpringTest {

    @Autowired
    private EquipmentMapper equipmentMapper;

    @Test
    public void test(){
    }
}
