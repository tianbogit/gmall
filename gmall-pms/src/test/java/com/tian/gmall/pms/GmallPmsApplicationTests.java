package com.tian.gmall.pms;

import com.tian.gmall.pms.entity.ProductInfo;
import com.tian.gmall.pms.service.ProductInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GmallPmsApplicationTests {

    @Autowired
    ProductInfoService productInfoService;


    @Test
    public void contextLoads() {

        ProductInfo productInfo = productInfoService.getById(24);
        System.out.println(productInfo.getProductName());


    }

}
