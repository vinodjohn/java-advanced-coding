package org.sda.java19.models;

import lombok.Data;

/**
 * Student model extends the base class
 *
 * @author Vinod John
 */
@Data
public class Student extends Person {
    private boolean hasPreviousJavaKnowledge;
}
