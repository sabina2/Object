package com.Loading;
class Person {
    int age;
    String name;
    public Person(int age,String name){
        this.age=age;
        this.name=name;
    }

}


public class Student extends Person {
     int StuId;




     Student(int age,String name,int Id) {
         super(age,name);
        this.age = age;
        this.name = name;
        this.StuId = Id;
    }

        void display(){
            System.out.println(name+" is "+age+" years old "+"Id is "+StuId);
        }

    public String toString(){
        return name+" is "+age+" years old "+" with Id of "+StuId;
    }

    public static void main(String[] args) {
        Student s1=new Student(20,"Monica",210);
        Student s2=new Student(23,"Ross",211);
        //s1.display();
       // s2.display();

        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
