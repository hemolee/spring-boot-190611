package com.bitcamp.web.serviceimpl;

import java.util.List;

import com.bitcamp.web.service.ProductService;

import org.springframework.stereotype.Service;

/**
 * ProductServiceImpl
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Override
    public void addProduct(Object product) {

    }

    @Override
    public List findProducts() {
        return null;
    }

    @Override
    public List findProductsByOption(Object option) {
        return null;
    }

    @Override
    public Object findProductById(String productId) {
        return null;
    }

    @Override
    public void updateProduct(Object product) {

    }

    @Override
    public void deleteProduct(Object product) {

    }

    
}