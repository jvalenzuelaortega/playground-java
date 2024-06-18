package org.example;

import org.example.collections.CollectionsMocks;
import org.example.general.dtos.Product;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MainCollections {

    public static void main(String[] args) {

        //TODO: base list
        List<Product> productList = CollectionsMocks.buildListOfProducts();

        //TODO: filter for 2 values
        List<Product> productsFilterListRangeAndDiscount = productList.stream()
                .filter(p -> Integer.parseInt(p.getPrice()) < 900 && (p.getDiscountPercentage() > 5 && p.getDiscountPercentage() <= 10))
                .collect(Collectors.toList());

        System.out.println("[Filter list with range and discount :]" + productsFilterListRangeAndDiscount);

        //TODO: counting
        long productCounting = productList.stream()
                .count();

        System.out.println("[Counting list :]" + productCounting);

        //TODO: reduce elements, get last element
        Product reduceResult = productList.stream()
                .reduce((first, second) -> second).orElse(null);

        System.out.println("[Reduce list, get last element :]" + reduceResult);

        //TODO: find first element
        Optional<Product> findFirstElement = productList.stream().findFirst();
        if (findFirstElement.isPresent()) {
            System.out.println("[Find first element :]" + findFirstElement.get());
        } else {
            System.out.println("[No product found]");
        }

        //TODO: find any
        Optional<Product> findAnyElement = productList.stream()
                .filter(p -> p.getDiscountPercentage() > 5)
                .findAny();

        if (findAnyElement.isPresent()) {
            Product product = findAnyElement.get();
            System.out.println("[Find any element with filter :]" + product);
        }

    }
}
