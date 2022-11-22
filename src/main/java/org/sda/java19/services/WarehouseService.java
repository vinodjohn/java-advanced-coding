package org.sda.java19.services;

import org.sda.java19.exceptions.WarehouseNotFoundException;
import org.sda.java19.models.Warehouse;

/**
 * Service to handle warehouse related operations
 *
 * @author Vinod John
 */
public interface WarehouseService {

    /**
     * To add a new warehouse
     * @param warehouse Warehouse
     */
    void addWarehouse(Warehouse warehouse);

    /**
     * To update an existing warehouse
     * @param warehouse Warehouse
     */
    void updateWarehouse(Warehouse warehouse);

    /**
     * To delete a warehouse
     */
    void deleteWarehouse();

    /**
     * To get a warehouse
     * @return Warehouse
     */
    Warehouse getWarehouse() throws WarehouseNotFoundException;
}
