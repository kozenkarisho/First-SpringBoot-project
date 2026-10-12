package uk.ac.westminster.products_api;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service

public class ProductService {

    private List<Product> products = new ArrayList<>();
    private Long nextId = 1L;  //his remembers which id to hand out next.


    List <Product> getAllProducts(){       //optional means we are returning null with knowing
        return products;
    }

    public Optional<Product> getProductById(Long id){
//        //option1
//
//        for (Product product : products) {
//            if (product.getId().equals(id)) {
//                return product;
//            }
//        }
//        return null;

        //option 2
        return products.stream()
                .filter(product -> product.getId().equals(id))
                .findFirst();
    }





    public Product addProduct(Product product){
        product.setId(nextId++); //use the value and add one
        products.add(product);
        return  product;
    }



}
