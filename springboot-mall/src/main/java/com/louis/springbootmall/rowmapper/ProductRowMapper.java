package com.louis.springbootmall.rowmapper;

import com.louis.springbootmall.constant.ProductCategory;
import com.louis.springbootmall.model.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRowMapper implements RowMapper<Product> {

    @Override
    public Product mapRow (ResultSet resultSet , int i) throws SQLException {
        Product product = new Product();

        product.setProductId (resultSet.getInt ("product_id"));
        product.setProductName (resultSet.getString ("product_name"));
        product.setCategory (ProductCategory.valueOf (resultSet.getString ("category")));
        product.setImageUrl (resultSet.getString ("image_url"));
        product.setPrice (resultSet.getInt ("price"));
        product.setStock (resultSet.getInt ("stock"));
        product.setDescription (resultSet.getString ("category"));
        product.setCreatedDate (resultSet.getTimestamp ("created_date"));
        product.setLastModifieDate (resultSet.getTimestamp ("last_modified_date"));

        return product;
    }
}
