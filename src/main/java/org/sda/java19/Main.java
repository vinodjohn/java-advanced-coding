package org.sda.java19;

import org.sda.java19.exceptions.MaximumNumberOfStudentsReachedException;
import org.sda.java19.models.Group;
import org.sda.java19.models.Person;
import org.sda.java19.models.Student;
import org.sda.java19.models.Trainer;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

/**
 * SDA Scheduler
 * <p>
 * Create a class hierarchy:
 * Person.java - firstname
 * - lastname
 * - dateOfBirth
 * Trainer.java (extends Person) - isAuthorized (boolean)
 * Student.java (extends Person) - hasPreviousJavaKnowledge (boolean)
 * <p>
 * <p>
 * Create a Group class which has
 * <p>
 * name (Java19Remote, Java20Remote, etc)
 * one trainer
 * a list of students
 * <p>
 * <p>
 * <p>
 * Manually initialize 15 students; 4 groups and 3 trainers;
 * Store all students in a list; all groups in a list; all trainers in a list;
 * Assign a trainer to each group
 * Assign 2-3 students to each group
 * Ensure the fact that a group will only have distinct students (How would you do that?)
 * Ensure the fact that a group will only have a maximum of 5 students; When you try to add a 6th one throw an MaximumNumberOfStudentsReached exception
 * Display all students in a group sorted alphabetically by lastName
 * Display the group with the maximum number of students
 * Display all students younger than 25, from all groups
 * Display all students grouped by trainer that teaches to them (eg. Trainer1 - stud1, stud3, stud4; Trainer2 - stud2, stud 10) - regardless of the group they're part of (If you were to store this information in a data structure what would you use?)
 * Display all students with previous java knowledge
 * Display the group with the highest number of students with no previous java knowledge
 * Remove all the students younger than 20 from all groups. Display the groups before and after removal.
 *
 * @author Vinod John
 */
public class Main {
    private static final int MAXIMUM_ALLOWED_STUDENTS = 5;

    public static void main(String[] args) throws MaximumNumberOfStudentsReachedException {
        List<Student> studentList = getInitialStudents();
        List<Trainer> trainerList = getInitialTrainers();
        List<Group> groupList = getInitialGroups();

        assignStudentsToGroup(groupList, studentList);
        assignTrainerToGroup(groupList, trainerList);

        Tasks tasks = new Tasks();
        tasks.sortByLastName(groupList);
        tasks.displayGroupWithMaxStudents(groupList);
        tasks.sortByLastName(groupList);







    }

    private static List<Student> getInitialStudents() {
        Student student = new Student();
        student.setFirstName("Vinod");
        student.setLastName("John");
        student.setDateOfBirth(LocalDate.of(2000, 12, 18));
        student.setHasPreviousJavaKnowledge(true);

        //To create 14 other students with different data, make sure there is no duplicates

        return List.of(student);
    }

    private static List<Trainer> getInitialTrainers() {
        Trainer trainer = new Trainer();
        trainer.setLastName("Tony");
        trainer.setFirstName("Stark");
        trainer.setDateOfBirth(LocalDate.of(1938, 2, 12));
        trainer.setAuthorized(true);

        // TO DO: create 2 other trainers with different data, make sure there is no duplicates
        return List.of(trainer);
    }

    private static List<Group> getInitialGroups() {
        Group group = new Group();
        group.setName("Java19");

        Group group2 = new Group();
        group2.setName("Java14");

        Group group3 = new Group();
        group3.setName("Java15");

        Group group4 = new Group();
        group4.setName("Java10");

        return List.of(group, group2, group3, group4);
    }

    private static void assignStudentsToGroup(List<Group> groupList, List<Student> studentList) throws MaximumNumberOfStudentsReachedException {
        LinkedList<Student> studentLinkedList = new LinkedList<>(studentList); // ArrayList to LinkedList conversion

        for (Group group : groupList) {
            List<Student> students = new ArrayList<>();

            for (int i = 0; i <= 4; i++) {
                if (students.size() >= MAXIMUM_ALLOWED_STUDENTS) {
                    throw new MaximumNumberOfStudentsReachedException(group.getName());
                }

                if (!studentLinkedList.isEmpty()) {
                    Random random = new Random();
                    int nextStudentIndex = random.nextInt(studentLinkedList.size()); // Get the Random index
                    students.add(studentLinkedList.get(nextStudentIndex));
                    studentLinkedList.remove(nextStudentIndex);
                }
            }

            group.setStudents(students);
        }
    }

    private static void assignTrainerToGroup(List<Group> groupList, List<Trainer> trainerList) {
        for (Group group : groupList) {
            Random random = new Random();
            int nextTrainerIndex = random.nextInt(trainerList.size()); // Get the Random index
            group.setTrainer(trainerList.get(nextTrainerIndex));
        }
    }
}