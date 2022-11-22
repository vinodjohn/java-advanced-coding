package org.sda.java19.models;

import lombok.Data;

import java.util.List;

/**
 * Warehouse model
 *
 * @author Vinod John
 */
@Data
public class Warehouse {
    private String name;
    private String address;
    private List<Product> products;
    private boolean isActive;
}
