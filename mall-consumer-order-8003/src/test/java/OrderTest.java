import com.halley.ConsumerOrder8003Main;
import com.halley.Service.OrdersService;
import com.halley.mapper.OrdersMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author LuBaby
 * @date 2021/3/12 10:49
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ConsumerOrder8003Main.class)
public class OrderTest {

    @Resource
    OrdersService ordersService;

    @Resource
    OrdersMapper mapper;

    @Test
    public void test1(){
//        OrderShow orderShow = mapper.getOrderShow("oxpxR6pnbA_hFHj2krEc1Rh5ewzg");

//        System.out.println(orderShow);
    }
}
