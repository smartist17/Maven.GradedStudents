package io.zipcoder;

import org.junit.Test;

import java.util.ArrayList;

public class StudentTest {
    @Test
    public void defaultConstructorTest() {
        String firstName = "Ashley";
        String lastName = "Smart";
        Double[] testScores = {100.0, 90.0, 80.0, 70.0};


    }

    @Test
    public void getFirstName() {
        Double[] testScores = {100.0, 90.0, 80.0, 70.0};
        Student testStudent = new Student("Ashley","Smart",testScores);
        testStudent.getFirstName();
        String actualFirstName = testStudent.getFirstName();
    }

    @Test
    public void getLastName() {
    }

    @Test
    public void getTestScores() {
    }

    @Test
    public void getNumberOfExamsTaken() {
    }

    @Test
    public void setFirstName() {
    }

    @Test
    public void setLastName() {
    }

    @Test
    public void addExamScores() {
    }

    @Test
    public void setExamScore() {
    }

    @Test
    public void getAverageExamScore() {
    }

    @Test
    public void testToString() {
    }
}
