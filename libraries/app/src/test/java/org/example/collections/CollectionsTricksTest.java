package org.example.collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.example.general.dtos.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CollectionsTricksTest {

    private CollectionsTricks collectionsTricks;

    @BeforeEach
    void setUp() {
        List<Product> listProducts = CollectionsMocks.buildListOfProducts();
        collectionsTricks = new CollectionsTricks(listProducts);
    }
    
    @Test
    void filterList_whenListStarted_thenReturnFilteredList() {
        List<Product> resulList = collectionsTricks.filterProductsList();

        assertNotNull(resulList);
        assertEquals(1, resulList.size());
    }
}
