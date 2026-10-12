package uk.ac.westminster.products_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController //This tells the spring:This class handles web requests and returns data like JSON

//@RequestMapping sets the base URL to this class
//Every web endpoint inside this class will automatically start with "/producuts"
@RequestMapping("/producuts")

public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping ("/products")
    public List getAllProducts(){
        return productService.getAllProducts();
    }



    // @GetMapping tells spring: "Listen for HTTP requests at the URL /products/{id}."
    // The {id} part is a placeholder. It means it expects a variable value at the end of the URL (like /products/1 or /products/5).
    @GetMapping("/{id}")

    // This method runs when the URL above is visited. It returns a Product object.
    // @PathVariable tells Spring to take the actual number from the {id} placeholder in the URL and put it into the 'id' variable here.
    public Product getById(@PathVariable Long id){

        // Creates a new Product object using the 'id' from the URL,
        // and hardcodes the name "Laptop" and price 999.99.
        // Spring will automatically convert this Java object into JSON text and send it back to the user's browser.
        return new Product(id,"Laptop",999.99);
    }



}
