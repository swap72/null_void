/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice5;

/**
 *
 * @author swapn
 */
public class Main {
    public static void main(String[] args) {
        Student s=new Student();
        s.setAge(3);
        s.setAlive(false);
        s.setName("James Gunn");
        System.out.println(s);
    }
    
}

class Student{
    private String name;
    private int age;
    private boolean alive;
    
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setAlive(boolean alive){
        this.alive=alive;
    }
    
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public boolean getAlive(){
        return alive;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", age=" + age + ", alive=" + alive + "}";
    }
    
    
}