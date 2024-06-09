package com.louis.springbootmall;

import com.louis.springbootmall.constant.ProductCategory;
import com.louis.springbootmall.dao.impl.ProductDaoImpl;
import com.louis.springbootmall.dto.ProductRequest;
import com.louis.springbootmall.model.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
class SpringbootMallApplicationTests {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Autowired
    private ProductDaoImpl productDao;

    @Transactional
    @Test
    void contextLoads(){
        ProductRequest productRequest = new ProductRequest();
        productRequest.setProductName("test food product");
        productRequest.setCategory(ProductCategory.FOOD);
        productRequest.setImageUrl("http://test.com");
        productRequest.setPrice(100);
        productRequest.setStock(2);

        Integer productID = productDao.createProduct(productRequest);

        Product product = productDao.getProductById(productID);

        System.out.println("--------------------------------------------------------");
        System.out.println(product);
        System.out.println("--------------------------------------------------------");
    }

}
