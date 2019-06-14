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
    public List<ProductDTO> findProductsByWord(ProductDTO product);
    public ProductDTO findProductById(ProductDTO product);
    public void updateProduct(ProductDTO product);
    public void deleteProduct(ProductDTO product);
    
}