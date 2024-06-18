package org.example.collections;

import java.util.List;
import java.util.stream.Collectors;

import org.example.general.dtos.Product;

public class CollectionsTricks {

    private final List<Product> productsList = CollectionsMocks.buildListOfProducts();;

    public CollectionsTricks(List<Product> productsList) {
        productsList = CollectionsMocks.buildListOfProducts();
    }

    public List<Product> filterProductsList() {
        List<Product> productsFilterList = productsList.stream()
                .filter(p -> p.getName().equals("Trial Product"))
                .collect(Collectors.toList());
        return productsFilterList;
    }

    public List<Product> filterProductListForRange() {
        List<Product> productsFilterListRange = productsList.stream()
                .filter(p -> Integer.parseInt(p.getPrice()) < 900)
                .collect(Collectors.toList());

        return productsFilterListRange;

    }

}
