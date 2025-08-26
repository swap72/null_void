package Practice6;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;

class Book{
	private String name;
	private String author;
	private int id;
	
	public void setId(int id){
		this.id=id;
	}

	public void setName(String name){
		this.name=name;
	}
	
	public void setAuthor(String author){
		this.author=author;
	}
	
	public String getName(){
		return name;
	}

	public String getAuthor(){
		return author;
	}

	public int getId(){
		return id;
	}

	Book(String name, String author, int id){

		this.name=name;
		this.author=author;
		this.id=id;
	}

	@Override
	public String toString(){
		return "Book{"+"name="+name+"id="+id+"author="+author+"}";
	}	

}

class IDComparator implements  Comparator<Book>{
	@Override
	public int compare(Book b1, Book b2){
		return Integer.compare(b1.getId(),b2.getId());
	}
}

class Exp{
	public static void main(String[] args){
		ArrayList<Book> al=new ArrayList<Book>();

		al.add(new Book("revolution","kishor",8));
		al.add(new Book("analogy","swamy",59));
		al.add(new Book("chemisty","tagore",89));
		al.add(new Book("biology","ravi",53));
		al.add(new Book("math","kishan",39));
	
		Collections.sort(al, new IDComparator());

		for(Book b: al){
			System.out.println(b);
		}

	}
}