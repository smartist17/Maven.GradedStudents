package io.zipcoder;
import java.util.ArrayList;
import java.util.Arrays;

public class Student {

    String firstName;
    String lastName;
    ArrayList<Double> testScores;

    public Student(String firstName, String lastName, Double[] testScores){}


    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public ArrayList<Double> getTestScores(){}

    public int getNumberOfExamsTaken(){}


    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void addExamScores(double examScore){}

    public void setExamScore(int examNumber, double newScore){}

    public Double getAverageExamScore(){}

    public String toString(){}





}