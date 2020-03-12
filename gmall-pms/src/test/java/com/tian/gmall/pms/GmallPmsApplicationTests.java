package com.tian.gmall.pms;


import com.tian.gmall.pms.entity.Product;
import com.tian.gmall.pms.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GmallPmsApplicationTests {

    @Autowired
    ProductService productService;


    @Test
    public void contextLoads() {

        Product productInfo = productService.getById(1);
        System.out.println(productInfo.getName());


    }

}
