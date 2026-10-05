package uk.ac.westminster.products_api;

public class Product {
    private Long id;
    private String name;
    private double price;


    public Product () {
        // creates a Product with id=null, name=null, price=0.0
        // in the future jackson creates the product with the incoming json
    }

    public Product (Long id, String name, double price){
        this.id = id ;
        this.name = name;
        this.price = price;
    }

    /*public Product() {}
    Who uses it: Spring/Jackson.
    When: When receiving a POST request from the outside world. It creates the empty shell, and Jackson fills it using reflection.

    public Product(Long id, String name, double price)
    Who uses it: You (the programmer).
    When: When you are writing code inside your Controller and need to quickly build a complete object to send back to the user in a GET request.*/


    public Long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }




}
