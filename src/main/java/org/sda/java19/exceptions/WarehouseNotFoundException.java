package org.sda.java19.exceptions;

/**
 * Exception to handle if warehouse not found
 *
 * @author Vinod John
 */
public class WarehouseNotFoundException extends Exception {
    public WarehouseNotFoundException(String name) {
        super(String.format("Warehouse(%s) not found!", name));
    }
}
