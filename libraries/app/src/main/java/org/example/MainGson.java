package org.example;

import com.google.gson.Gson;
import org.example.general.dtos.Person;
import org.example.general.dtos.Product;
import org.example.general.dtos.Rating;

import java.util.ArrayList;
import java.util.List;

public class MainGson {

    public static void main(String[] args) {
        Gson gson = new Gson();

        //TODO: convert to JSON from object
        Person person = new Person("John", 30);
        String jsonResult = gson.toJson(person);
        System.out.println("JSON Object : " +jsonResult);

        //TODO: deserialize JSON to object
        String json = "{\"name\":\"John\",\"age\":30}";
        Person person1 = gson.fromJson(json, Person.class);
        System.out.println("Person Object : " +person1.getName() + " " + person1.getAge());
        
        //TODO: convert Collection to JSON
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("John", 30));
        personList.add(new Person("Jane", 25));

        String jsonResultList = gson.toJson(personList);
        System.out.println("JSON Object : " +jsonResultList);

        //TODO: deserialize JSON to Collection
        String jsonList = "[{\"name\":\"John\",\"age\":30},{\"name\":\"Jane\",\"age\":25}]";
        Person[] personArray = gson.fromJson(jsonList, Person[].class);
        for (Person p : personArray) {
            System.out.println("Person Object : " +p.getName() + " " + p.getAge());
        }

        //TODO: convert Object with Collection to JSON
        Product product = new Product();
        product.setName("Product 1");
        product.setPrice("100");
        product.setDiscountPercentage(10);
        product.setImage("image1.jpg");
        product.setDetail("Detail 1");

        Rating rating = new Rating();
        rating.setRating(5);
        rating.setRatedBy("User 1234");
        List<Rating> ratings = new ArrayList<>();
        ratings.add(rating);

        product.setRatings(ratings);

        String jsonResultProduct = gson.toJson(product);
        System.out.println("JSON Object with Array: " +jsonResultProduct);
    }
}
