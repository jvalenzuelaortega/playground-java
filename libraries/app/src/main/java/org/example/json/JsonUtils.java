package org.example.json;

import org.example.general.dtos.Product;
import org.example.general.dtos.Rating;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JsonUtils {

    //TODO: generate JSON Object
    public static JSONObject buildBasicJsonObject() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "John Doe");
        jsonObject.put("age", 23);
        jsonObject.put("gender", "male");
        jsonObject.put("birthday", "1990-01-01");
        return jsonObject;
    }

    //TODO: generate JSON Object with Map
    public static JSONObject buildMapJsonObject() {
        Map<String, String> map = new HashMap<>();
        map.put("name", "John Doe");
        map.put("age", "23");
        map.put("gender", "male");
        map.put("birthday", "1990-01-01");
        return new JSONObject(map);
    }

    //TODO: generate JSON Array
    public static JSONArray buildJsonArray() {
        JSONArray jsonArray = new JSONArray();
        jsonArray.put(Boolean.TRUE);
        jsonArray.put("details");

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "John Doe");
        jsonObject.put("age", 23);
        jsonObject.put("gender", "male");
        jsonObject.put("birthday", "1990-01-01");

        jsonArray.put(jsonObject);
        return jsonArray;
    }

    //TODO: generate JSON Array with Collection
    public static JSONArray buildJsonArrayWithCollection() {
        List<String> list = new ArrayList<>();
        list.add("California");
        list.add("Texas");
        list.add("Hawaii");
        list.add("Alaska");
        return new JSONArray(list);
    }

    //TODO: transform JSONArray to Object
    public static List<Product> transformJSONArrayToObject(String source) {
        JSONArray jsonArray = new JSONArray(source);
        List<Product> list = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            String name = jsonObject.getString("name");
            String price = jsonObject.getString("price");
            long discountPercentage = jsonObject.getLong("discount_percentage");
            String image = jsonObject.getString("image");
            JSONArray ratings = jsonObject.getJSONArray("ratings");

            List<Rating> ratingList = new ArrayList<>();
            for (int j = 0; j < ratings.length(); j++) {
                JSONObject jsonRating = ratings.getJSONObject(j);
                long rating = jsonRating.getLong("rating");
                String ratedBy = jsonRating.getString("rated_by");
                Rating ratingObject = getRating(rating, ratedBy);
                ratingList.add(ratingObject);
            }
            Product product = getProduct(name, price, discountPercentage, image, ratingList);
            list.add(product);
        }
        return list;
    }

    private static Product getProduct(String name, String price, long discountPercentage, String image, List<Rating> ratingList) {
        Product product = new Product();
        product.setName(name);
        product.setPrice(price);
        product.setDiscountPercentage(discountPercentage);
        product.setImage(image);
        product.setRatings(ratingList);
        return product;
    }

    private static Rating getRating(long rating, String ratedBy) {
        Rating ratingObject = new Rating();
        ratingObject.setRating(rating);
        ratingObject.setRatedBy(ratedBy);
        return ratingObject;
    }
}
