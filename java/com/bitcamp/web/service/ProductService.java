package com.bitcamp.web.service;

import java.util.List;

import org.springframework.stereotype.Component;

/**
 * ProductService
 * 
 * @param <ProductDTO>
 */
@Component
public interface ProductService<ProductDTO> {
    public void addProduct(ProductDTO product);
    public List<ProductDTO> findProducts();
    public List<ProductDTO> findProductsByOption(ProductDTO option);
    public ProductDTO findProductById(String productId);
    public void updateProduct(ProductDTO product);
    public void deleteProduct(ProductDTO product);
    
}