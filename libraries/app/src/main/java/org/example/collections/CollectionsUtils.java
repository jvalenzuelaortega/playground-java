package org.example.collections;

import org.example.general.dtos.Product;
import org.example.general.dtos.Rating;

import java.util.ArrayList;
import java.util.List;

public class CollectionsUtils {

    public static List<Product> buildListOfProducts() {
        List<Product> products = new ArrayList<>();
        Product product1 = new Product();
        product1.setName("Trial Product");
        product1.setDetail("Lorem ipsum dolor sit amet");
        product1.setPrice("909");
        product1.setDiscountPercentage(10);
        product1.setImage("http:localhost:8080/image.png");
        Rating rating1 = new Rating();
        rating1.setRating(3);
        rating1.setRatedBy("User123");
        List<Rating> ratings1 = new ArrayList<>();
        ratings1.add(rating1);

        product1.setRatings(ratings1);
        products.add(product1);

        Product product2 = new Product();
        product2.setName("Trial Product 2");
        product2.setDetail("Lorem ipsum dolor sit amet");
        product2.setPrice("850");
        product2.setDiscountPercentage(5);
        product2.setImage("http:localhost:8080/image.png");
        Rating rating2 = new Rating();
        rating2.setRating(4);
        rating2.setRatedBy("User123");
        Rating rating3 = new Rating();
        rating3.setRating(5);
        rating3.setRatedBy("User345");

        List<Rating> ratings2 = new ArrayList<>();
        ratings2.add(rating2);
        ratings2.add(rating3);
        product2.setRatings(ratings2);

        products.add(product2);

        Product product3 = new Product();
        product3.setName("Trial Product 3");
        product3.setDetail("Lorem ipsum dolor sit amet");
        product3.setPrice("780");
        product3.setDiscountPercentage(5);
        product3.setImage("http:localhost:8080/image.png");
        Rating rating4 = new Rating();
        rating4.setRating(6);
        rating4.setRatedBy("User123");
        Rating rating5 = new Rating();
        rating5.setRating(2);
        rating5.setRatedBy("User345");

        List<Rating> ratings3 = new ArrayList<>();
        ratings3.add(rating4);
        ratings3.add(rating5);
        product3.setRatings(ratings3);

        products.add(product3);

        return products;
    }
}
