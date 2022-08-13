
class Library{
    String[] books;
    int no_of_books;
    Library(){ // this is a constructor
        this.books = new String[100]; // this could have 100 books 
        this.no_of_books=0;
    }
    void addBooks(String books){
        this.books[no_of_books] = books;
        no_of_books++;
        System.out.println(books + " has been added");
    }
    void showAvailableBooks(){
        System.out.println("the available books are : ");
        for (String book : this.books) {
            if (book == null){
                continue;
            }
            System.out.println("*" + book); 
        }
    }
    void issueBook(String book){
         for(int i =0 ;i<this.books.length;i++){
            if(this.books[i].equals(book)){
                System.out.println("this book has been Issued");
                this.books[i] = null;
                return;
            }
        }
            System.out.println("this book does not exist");

    }
    void returnBook(String book){
        addBooks(book);
    }
}
public class CHP_60_Books_library {
    public static void main(String[] args) {
        Library centralLibrary =new Library();
        centralLibrary.addBooks("think and grow rich");
        centralLibrary.addBooks("MAths");
        centralLibrary.addBooks("java enterprise");
        centralLibrary.addBooks("rich dad poor dad");
        centralLibrary.addBooks("c++");
        centralLibrary.showAvailableBooks();
        centralLibrary.issueBook("c++");
        centralLibrary.showAvailableBooks();
        centralLibrary.returnBook("c++");
        centralLibrary.showAvailableBooks();

    }
}
