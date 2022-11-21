package org.sda.java19.models;

import lombok.*;

import java.math.BigDecimal;

/**
 * Developer model inherited
 *
 * @author Vinod John
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Developer extends Person {
    private boolean isOnsite;
    private BigDecimal salaryExpected;
}
