package org.example;

import org.example.general.dtos.Product;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.List;

import static org.example.json.JsonUtils.*;
import static org.example.general.utils.JsonStringUtils.buildJsonString;

public class MainJson {

    public static void main(String[] args) {
        JSONObject jsonObject = buildBasicJsonObject();
        JSONObject jsonObject2 = buildMapJsonObject();

        JSONArray jsonArray = buildJsonArray();
        JSONArray jsonArray2 = buildJsonArrayWithCollection();

        String json = buildJsonString();
        List<Product> personList = transformJSONArrayToObject(json);

        //TODO: print jsonObject
        System.out.println(jsonObject);

        //TODO: print jsonObject with Map
        System.out.println(jsonObject2);

        //TODO: print jsonArray
        System.out.println(jsonArray);

        //TODO: print jsonArray with Collection
        System.out.println(jsonArray2);

        //TODO: print jsonArray to List
        System.out.println(personList);

    }
}
