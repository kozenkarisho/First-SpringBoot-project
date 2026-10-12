package uk.ac.westminster.products_api;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service

public class ProductService {

    private List<Product> products = new ArrayList<>();
    private Long nextId = 1L;  //his remembers which id to hand out next.


    private List <Product> getAllProducts(){
        return products;
    }

    public Product addpProduct(Product product){
        product.setId(nextId++); //use the value and add one
        products.add(product);
        return  product;
    }



}
