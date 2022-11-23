package org.sda.java19.models;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Vehicle base class
 *
 * @author Vinod John
 */
@Data
public class Vehicle {
    private String brand;
    private String model;
    private BigDecimal price;
}
