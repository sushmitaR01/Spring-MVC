package com.xworkz.product.service;

import com.xworkz.product.dto.ProductDto;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Override
    public boolean validSave(ProductDto productDto) {
        return true;
    }
}
