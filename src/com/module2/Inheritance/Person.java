package com.module2.Inheritance;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Person {
    private LocalDate dayOfBirth;
    private String firstName;
    private String secondName;
    private String patronymic;
    private Gender genderPerson;
    private String city, state, zipCode, mailingAddress;
    private boolean isMarried;
    public byte bloodType;
    public List<String> hobby;
    public long identificationCode;
    public String symbolOfPassport;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Gender getGenderPerson() {
        return genderPerson;
    }

    public void setGenderPerson(Gender genderPerson) {
        this.genderPerson = genderPerson;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getMailingAddress() {
        return mailingAddress;
    }

    public void setMailingAddress(String mailingAddress) {
        this.mailingAddress = mailingAddress;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public byte getBloodType() {
        return bloodType;
    }

    public void setBloodType(byte bloodType) {
        this.bloodType = bloodType;
    }

    public List<String> getHobby() {
        return hobby;
    }

    public void setHobby(List<String> hobby) {
        this.hobby = hobby;
    }

    public long getIdentificationCode() {
        return identificationCode;
    }

    public void setIdentificationCode(long identificationCode) {
        this.identificationCode = identificationCode;
    }

    public String getSymbolOfPassport() {
        return symbolOfPassport;
    }

    public void setSymbolOfPassport(String symbolOfPassport) {
        this.symbolOfPassport = symbolOfPassport;
    }

    public LocalDate getDayOfBirth() {

        return dayOfBirth;
    }

    public void setDayOfBirth(LocalDate dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return isMarried == person.isMarried && bloodType == person.bloodType && identificationCode == person.identificationCode && Objects.equals(dayOfBirth, person.dayOfBirth) && Objects.equals(firstName, person.firstName) && Objects.equals(secondName, person.secondName) && Objects.equals(patronymic, person.patronymic) && genderPerson == person.genderPerson && Objects.equals(city, person.city) && Objects.equals(state, person.state) && Objects.equals(zipCode, person.zipCode) && Objects.equals(mailingAddress, person.mailingAddress) && Objects.equals(hobby, person.hobby) && Objects.equals(symbolOfPassport, person.symbolOfPassport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dayOfBirth, firstName, secondName, patronymic, genderPerson, city, state, zipCode, mailingAddress, isMarried, bloodType, hobby, identificationCode, symbolOfPassport);
    }

    @Override
    public String toString() {
        return "Person{" +
                "dayOfBirth=" + dayOfBirth +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", genderPerson=" + genderPerson +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", mailingAddress='" + mailingAddress + '\'' +
                ", isMarried=" + isMarried +
                ", bloodType=" + bloodType +
                ", hobby=" + hobby +
                ", identificationCode=" + identificationCode +
                ", symbolOfPassport='" + symbolOfPassport + '\'' +
                '}';
    }

    public Person() {
    }

    public Person(LocalDate dayOfBirth, String firstName, String secondName, Gender genderPerson, String city) {
        this.dayOfBirth = dayOfBirth;
        this.firstName = firstName;
        this.secondName = secondName;
        this.genderPerson = genderPerson;
        this.city = city;
    }

    public boolean isAdult()
    {
        int age = (int) ChronoUnit.YEARS.between(LocalDate.now(),this.getDayOfBirth());

        return age >= 18;
    }
    public void setFIO(String firstSecondPatronymic)
    {
        String str[] = firstSecondPatronymic.split(",");
        setFirstName(str[0]);
        if(str.length>1)
        setSecondName(str[1]);
        if(str.length>2) setPatronymic(str[2]);

    }
}
enum Gender {
    Male,
    Female
};