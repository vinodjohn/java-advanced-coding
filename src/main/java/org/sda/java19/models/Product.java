package org.sda.java19.models;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Product model
 *
 * @author Vinod John
 */
@Data
public class Product {
    private String name;
    private BigDecimal price;
    private float quantity;
    private ProductCategory productCategory;
    private Currency currency;
    private boolean isAvailable;
}
