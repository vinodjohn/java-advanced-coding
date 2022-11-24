package org.sda.java19.models;

import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * Vehicle base class
 *
 * @author Vinod John
 */
@Data
@ToString
public class Vehicle {
    private String brand;
    private String model;
    private BigDecimal price;
}
