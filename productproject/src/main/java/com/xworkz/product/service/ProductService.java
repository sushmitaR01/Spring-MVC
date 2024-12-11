package com.xworkz.product.service;

import com.xworkz.product.dto.ProductDto;
import org.springframework.stereotype.Service;

@Service
public interface ProductService {

    boolean validSave(ProductDto productDto);
}
