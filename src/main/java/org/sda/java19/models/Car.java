package org.sda.java19.models;

import lombok.Data;
import lombok.ToString;

/**
 * Car model that derives from Vehicle
 *
 * @author Vinod John
 */
@Data
@ToString(callSuper = true)
public class Car extends Motorcycle {
    private VehicleTransmission vehicleTransmission;
}
