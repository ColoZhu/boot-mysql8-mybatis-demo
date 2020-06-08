package demo;

import com.example.demo.DemoApplication;
import com.example.demo.entity.Demo;
import com.example.demo.mapper.DemoMapper;
import com.example.demo.service.DemoService;
import com.example.demo.service.impl.DemoServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
@Transactional
public class DemoServiceTest {
    private final Logger logger = LoggerFactory.getLogger(DemoServiceTest.class);

    @Autowired
    private DemoService demoService;


    @Before
    public void setUp() {
        logger.info("--------setup--------");
        MockitoAnnotations.initMocks(this);

    }

    @Test
    @Rollback(value = true)
    public void insertOne() {
        Date createTime = new Date();
        Demo demo = new Demo();
        demo.setName("王尼玛");
        demo.setCreateDate(createTime);
        demo.setCreateTimestamp(createTime);
        demo.setCreateDatetime(createTime);
        int res = demoService.insert(demo);
        Assert.assertTrue(res > 0);
        Integer id = demo.getId();

        //查询
        Demo demoRecord = demoService.queryOne(id);
        Assert.assertNotNull(demoRecord);
        Assert.assertEquals(demo.getName(), demoRecord.getName());
        //存到mysal精确到天,  不相等
        //Assert.assertEquals(demo.getCreateDate(), demoRecord.getCreateDate());
        //不一定相等,可能会四舍五入
        //Assert.assertEquals(demo.getCreateTimestamp(), demoRecord.getCreateTimestamp());
        //不一定相等,可能会四舍五入
       // Assert.assertEquals(demo.getCreateDatetime(), demoRecord.getCreateDatetime());

    }


}
