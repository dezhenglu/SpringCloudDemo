package com.ludzh.ctrl.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by ludz on 2017/5/10/010.
 */
@Component()
public class MyComponent {
    @Value("${project.name}")
    private String projectName;
    @Value("${project.author}")
    private String projectAuthor;

    @Value("${com.ludzh.value}")
    private String value;
    @Value("${com.ludzh.number}")
    private int number;
    @Value("${com.ludzh.bignumber}")
    private long bignumber;
    @Value("${com.ludzh.test1}")
    private int test1;
    @Value("${com.ludzh.test2}")
    private int test2;

    @Override
    public String toString() {
        return "MyComponent{" +
                "projectName='" + projectName + '\'' +
                ", projectAuthor='" + projectAuthor + '\'' +
                ", value='" + value + '\'' +
                ", number=" + number +
                ", bignumber=" + bignumber +
                ", test1=" + test1 +
                ", test2=" + test2 +
                '}';
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public long getBignumber() {
        return bignumber;
    }

    public void setBignumber(long bignumber) {
        this.bignumber = bignumber;
    }

    public int getTest1() {
        return test1;
    }

    public void setTest1(int test1) {
        this.test1 = test1;
    }

    public int getTest2() {
        return test2;
    }

    public void setTest2(int test2) {
        this.test2 = test2;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectAuthor() {
        return projectAuthor;
    }

    public void setProjectAuthor(String projectAuthor) {
        this.projectAuthor = projectAuthor;
    }
}
