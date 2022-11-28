package org.sda.java19.exceptions;

/**
 * Exception to handle threshold of the students in the group
 *
 * @author Vinod John
 */
public class MaximumNumberOfStudentsReachedException extends Exception {
    public MaximumNumberOfStudentsReachedException(String groupName) {
        super(String.format("Group(name=%s) has reached maximum number of students", groupName));
    }
}
