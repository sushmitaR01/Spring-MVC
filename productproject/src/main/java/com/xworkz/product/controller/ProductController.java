package com.xworkz.product.controller;

import com.xworkz.product.dto.ProductDto;
import com.xworkz.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/")
@Controller
public class ProductController {

    ProductController(){
        System.out.println("const of product controller");
    }
    @Autowired
    ProductService productService;
    @RequestMapping(value="/order",method = {RequestMethod.GET,RequestMethod.POST})
    public String productController(ProductDto productDto, Model model){
        System.out.println("product controller method");
        if(productService.validSave(productDto)){
            System.out.println("product order successful");
            model.addAttribute("Successmessage","Your Order is Success!!");
        }
        else {
            System.err.println("order cancel");
            model.addAttribute("msg","Order Cancel");
            model.addAttribute("message",productDto);
        }
        return "Product.jsp";
    }


}
