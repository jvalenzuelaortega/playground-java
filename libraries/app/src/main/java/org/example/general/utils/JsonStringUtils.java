package org.example.general.utils;

public class JsonStringUtils {

    public static String buildJsonString() {
        return "[\n" +
                "  {\n" +
                "    \"name\": \"Trial Product\",\n" +
                "    \"price\": \"909\",\n" +
                "    \"discount_percentage\": 10,\n" +
                "    \"image\": \"http://placehold.it/940x300/999/CCC\",\n" +
                "    \"ratings\": [\n" +
                "      {\n" +
                "        \"rating\": 3,\n" +
                "        \"rated_by\": \"User123\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"rating\": 4,\n" +
                "        \"rated_by\": \"User1233\"\n" +
                "      }\n" +
                "    ]\n" +
                "  },\n" +
                "  {\n" +
                "    \"name\": \"Trial Product 2\",\n" +
                "    \"detail\": \"Lorem ipsum dolor sit amet\",\n" +
                "    \"price\": \"850\",\n" +
                "    \"discount_percentage\": 5,\n" +
                "    \"image\": \"http://placehold.it/300x300/999/CCC\",\n" +
                "    \"ratings\": [\n" +
                "      {\n" +
                "        \"rating\": 5,\n" +
                "        \"rated_by\": \"User123\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"rating\": 4,\n" +
                "        \"rated_by\": \"User1233\"\n" +
                "      }\n" +
                "    ]\n" +
                "  }\n" +
                "]";
    }
}
