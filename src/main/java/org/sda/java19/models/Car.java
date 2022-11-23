package org.sda.java19.models;

import lombok.Data;

/**
 * Car model that derives from Vehicle
 *
 * @author Vinod John
 */
@Data
public class Car extends Motorcycle {
    private VehicleTransmission vehicleTransmission;
}
