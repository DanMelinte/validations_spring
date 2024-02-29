package com.spring.mvc;

import com.spring.mvc.validation.CheckEmail;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {

    @NotEmpty(message = "required field")
    @Size(min = 2, message = "name must be min 2 symbols")
    private String name;
//    @NotEmpty(message = "required field")
    @NotBlank(message = "required field")
    private String surname;

    @Min(value = 1500, message = "min 1500")
    @Max(value = 4000, message = "min 4000")
    private int salary;
    private String department;

    private String sex;

    private String[] languages;

    private Map<String, String> departments;
    private Map<String, String> sexs;
    private Map<String, String> languageList;

    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "incorect format XXX-XX-XX")
    private String phoneNumber;


    @CheckEmail()
    private String email;

    public Employee() {
        departments = new HashMap<>();
        departments.put("Information Tehnology", "IT" );
        departments.put("Human Resources", "HR");
        departments.put("Sales", "Sales");

        sexs = new HashMap<>();
        sexs.put("Male", "male" );
        sexs.put("Female", "female");

        languageList = new HashMap<>();
        languageList.put("English", "EN" );
        languageList.put("Russian", "RU");
        languageList.put("Romanian", "RO");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Map<String, String> getLanguageList() {
        return languageList;
    }

    public void setLanguageList(Map<String, String> languageList) {
        this.languageList = languageList;
    }

    public String getSex() {
        return sex;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getSexs() {
        return sexs;
    }

    public void setSexs(Map<String, String> sexs) {
        this.sexs = sexs;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }



    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
