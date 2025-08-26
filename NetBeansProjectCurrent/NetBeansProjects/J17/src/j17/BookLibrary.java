package j17;

/**
 * this class is developed to represent the library of Books
 * @author swapnil
 */

public class BookLibrary {
     
    private Book[] books;
    public static void main(String[] args) {
        BookLibrary lib=new BookLibrary();
    }
    
    public BookLibrary(){
        books =new Book[10];
    }
    
    public BookLibrary(int n){
        books =new Book[n];
    }
    /**
     * This method store the given book b in the library
     * 
     *
     */
    public void addBook(Book b){
        // code to store book
    }
    public int totalBoooks(){
        return 0;
    }
    
    
   public Book searchByTitle(String title){
       return null;
   }
   
   public Book searchByAuthor(String author){
       return null;
   }
   public Book searchById(int id){
       return null;
   }
}
