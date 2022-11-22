package org.sda.java19.util;

import org.sda.java19.models.Currency;
import org.sda.java19.models.Product;
import org.sda.java19.models.ProductCategory;
import org.sda.java19.models.Warehouse;

import java.math.BigDecimal;
import java.util.List;

/**
 * An acting database to store the values
 *
 * @author Vinod John
 */
public class Data {
    public static Warehouse WAREHOUSE = null;

    public static List<Product> getInitialProducts() {
        Product product = new Product();
        product.setName("Apple");
        product.setProductCategory(ProductCategory.FOOD);
        product.setPrice(BigDecimal.ONE);
        product.setQuantity(100);
        product.setAvailable(true);
        product.setCurrency(Currency.EUR);

        Product product1 = new Product();
        product1.setName("Black dotted Shirt");
        product1.setProductCategory(ProductCategory.CLOTHING);
        product1.setPrice(BigDecimal.valueOf(22.34));
        product1.setQuantity(25);
        product1.setAvailable(true);
        product1.setCurrency(Currency.EUR);

        return List.of(product, product1);
    }
}
