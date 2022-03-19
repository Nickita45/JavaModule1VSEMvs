package com.module2.Inheritance;

import java.time.LocalDate;
import java.util.Objects;

public class Student extends Person{
    private byte numberOfCourse;
    private int numberOfStudentCard;
    private String nameGroup;
    private boolean isCaptainOfGroup;
    private String universityName, instituteName;
    private int numberOfSpecialization;
    private String nameOfSpecialization;
    private int grand;
    private short averageMark;
    private boolean isBudget;

    public Student(byte numberOfCourse, String universityName, int numberOfSpecialization, String nameOfSpecialization) {
        this.numberOfCourse = numberOfCourse;
        this.universityName = universityName;
        this.numberOfSpecialization = numberOfSpecialization;
        this.nameOfSpecialization = nameOfSpecialization;
    }

    public Student(LocalDate dayOfBirth, String firstName, String secondName, Gender genderPerson, String city, byte numberOfCourse, String universityName, int numberOfSpecialization, String nameOfSpecialization) {
        super(dayOfBirth, firstName, secondName, genderPerson, city);
        this.numberOfCourse = numberOfCourse;
        this.universityName = universityName;
        this.numberOfSpecialization = numberOfSpecialization;
        this.nameOfSpecialization = nameOfSpecialization;
    }

    public Student() {
    }

    public byte getNumberOfCourse() {
        return numberOfCourse;
    }

    public void setNumberOfCourse(byte numberOfCourse) {
        this.numberOfCourse = numberOfCourse;
    }

    public int getNumberOfStudentCard() {
        return numberOfStudentCard;
    }

    public void setNumberOfStudentCard(int numberOfStudentCard) {
        this.numberOfStudentCard = numberOfStudentCard;
    }

    public String getNameGroup() {
        return nameGroup;
    }

    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    public boolean isCaptainOfGroup() {
        return isCaptainOfGroup;
    }

    public void setCaptainOfGroup(boolean captainOfGroup) {
        isCaptainOfGroup = captainOfGroup;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getInstituteName() {
        return instituteName;
    }

    public void setInstituteName(String instituteName) {
        this.instituteName = instituteName;
    }

    public int getNumberOfSpecialization() {
        return numberOfSpecialization;
    }

    public void setNumberOfSpecialization(int numberOfSpecialization) {
        this.numberOfSpecialization = numberOfSpecialization;
    }

    public String getNameOfSpecialization() {
        return nameOfSpecialization;
    }

    public void setNameOfSpecialization(String nameOfSpecialization) {
        this.nameOfSpecialization = nameOfSpecialization;
    }

    public int getGrand() {
        return grand;
    }

    public void setGrand(int grand) {
        this.grand = grand;
    }

    public short getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(short averageMark) {
        this.averageMark = averageMark;
    }

    public boolean isBudget() {
        return isBudget;
    }

    public void setBudget(boolean budget) {
        isBudget = budget;
    }

    @Override
    public String toString() {
        return "Student{" +
                "numberOfCourse=" + numberOfCourse +
                ", numberOfStudentCard=" + numberOfStudentCard +
                ", nameGroup='" + nameGroup + '\'' +
                ", isCaptainOfGroup=" + isCaptainOfGroup +
                ", universityName='" + universityName + '\'' +
                ", instituteName='" + instituteName + '\'' +
                ", numberOfSpecialization=" + numberOfSpecialization +
                ", nameOfSpecialization='" + nameOfSpecialization + '\'' +
                ", grand=" + grand +
                ", averageMark=" + averageMark +
                ", isBudget=" + isBudget +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return numberOfCourse == student.numberOfCourse && numberOfStudentCard == student.numberOfStudentCard && isCaptainOfGroup == student.isCaptainOfGroup && numberOfSpecialization == student.numberOfSpecialization && grand == student.grand && averageMark == student.averageMark && isBudget == student.isBudget && Objects.equals(nameGroup, student.nameGroup) && Objects.equals(universityName, student.universityName) && Objects.equals(instituteName, student.instituteName) && Objects.equals(nameOfSpecialization, student.nameOfSpecialization);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfCourse, numberOfStudentCard, nameGroup, isCaptainOfGroup, universityName, instituteName, numberOfSpecialization, nameOfSpecialization, grand, averageMark, isBudget);
    }

    public char getStudentLevel()
    {
        char symb = 'D';
        if(averageMark >= 90)
            symb = 'A';
        else if(averageMark >= 75)
            symb = 'B';
        else if(averageMark >= 60)
            symb = 'C';
        return symb;
    }

}
