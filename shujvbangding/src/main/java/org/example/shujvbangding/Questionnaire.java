package org.example.shujvbangding;

import java.util.Arrays;

public class Questionnaire {
    public String username;
    private String gender;
    private int age;
    private String address;
    private Boolean work;
    private String[] hobbies;

    public String getUsername() {
        return username;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public Boolean getWork() {
        return work;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setWork(Boolean work) {
        this.work = work;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "Questionnaire{" +
                "username='" + username + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", work=" + work +
                ", hobbies=" + Arrays.toString(hobbies) +
                '}';
    }

    // getter和setter自己生成
    // toString方法自己生成

}
