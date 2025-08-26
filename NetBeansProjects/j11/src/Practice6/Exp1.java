/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practice6;

/**
 *
 * @author swapnil
 */

import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;

public class Exp1 {
    public static void main(String[] args) {
        ArrayList<Book> al =new ArrayList<Book>();
        al.add(new Book("StoryBook",7,"Champak"));
        al.add(new Book("InfoBook",2,"StoryTime"));
        al.add(new Book("InfoBook",3,"Chemisty"));
        al.add(new Book("TextBook",1,"Physics"));
        
        Collections.sort(al, new IDComparator());
        
        for(Book b: al){
            System.out.println(b);
        }
    }
}


class Book{

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" + "name=" + name + ", id=" + id + ", title=" + title + '}';
    }
private String name;
private int id;
private String title;

    public Book(String name, int id, String title) {
        this.name = name;
        this.id = id;
        this.title = title;
    }


}

class IDComparator implements Comparator<Book>{

    @Override
    public int compare(Book b1,Book b2){
        return Integer.compare(b1.getId(),b2.getId());
    }
}


