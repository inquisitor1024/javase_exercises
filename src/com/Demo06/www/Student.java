package com.Demo06.www;

/**
 * @projectName:
 * @fileName:
 * @packageName: Student
 * @author: Mr.乐
 * @date: 2020/8/10 18:00
 * @copyright(c): 无
 * @versions: 1.0版本
 * @instructions:
 */

public class Student {
    private String name;
    private int age;
    private String sex;

    public Student() {
    }

    public Student(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName(String 小米) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "学生姓名:"  + name + '\t' +
                "年龄:" + age +"\t"+
                "性别:" + sex + '\t' ;
    }
}
