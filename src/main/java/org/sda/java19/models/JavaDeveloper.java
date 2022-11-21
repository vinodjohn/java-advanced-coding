package org.sda.java19.models;

import lombok.*;

/**
 * JavaDeveloper model inherited
 *
 * @author Vinod John
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class JavaDeveloper extends Developer {
    private float yearsOfExperience;
    private boolean isOfficiallyCertified;

    //Method overloading: Same method name but different number of parameters
    public void setName(String firstName, String lastName) {
        super.setName(firstName.concat(lastName));
    }
}
