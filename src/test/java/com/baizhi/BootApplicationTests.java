package com.baizhi;

import com.baizhi.entity.Category;
import com.baizhi.mapper.CategoryMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootApplicationTests {
    @Resource(name = "categoryMapper")
    private CategoryMapper cd;

    @Test
    public void test1() {
        Category category1 = cd.selectByPrimaryKey(1);
        System.out.println(category1);
    }

}
