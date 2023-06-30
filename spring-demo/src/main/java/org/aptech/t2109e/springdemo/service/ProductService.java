package org.aptech.t2109e.springdemo.service;

import org.aptech.t2109e.springdemo.dto.ProductDto;
import org.aptech.t2109e.springdemo.entity.Product;

import java.util.List;


public interface ProductService {
    List<ProductDto> getAll(ProductDto criteria);  // hiếm khi lấy getall() -> phân trang -> dùng offset để phân trang trong sql

    ProductDto findByName(String productName);

    Product createProduct(ProductDto productDto);
    Product updateProduct(Long id, ProductDto productDto);
    void deleteProduct(Long id);
    Product getProductById(Long id);
}