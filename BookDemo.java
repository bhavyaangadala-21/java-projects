package Mypackage;
class Book
{
	
  private String title;
  private String author;
  private String ISBN;
  private boolean issue;
  public void setBookdetails(String t,String a,String i,boolean ise)
  {
    title = t;
    author = a;
    ISBN = i;
    issue = ise;
  }
  public void issueBook()
  {
    if(!issue) {
      issue = true;
      System.out.println(title+" book issued successfully");
    }
    else
      System.out.println(title+" book already issued");
  }
  public void returnBook()
  {
    if(issue) {
      issue = false;
      System.out.println(title+" book returned successfully");
    }
    else
      System.out.println(title+" book not already issued");
  }
  public void display()
  {
    System.out.println("Book Title : "+title);
    System.out.println("Book Author: "+author);
    System.out.println("Book ISBN  : "+ISBN);
    System.out.println("Book issue status : "+issue);
  }
  
}
public class BookDemo {

  public static void main(String[] args) {
    // Book object1
    Book b1 = new Book();
    b1.setBookdetails("Java Programming", "James", "ISB-1001-678", false);
    System.out.println("=== Book1 Details ===");
    b1.display();
    b1.issueBook();
    // Book object2
    Book b2 = new Book();
    b2.setBookdetails("Python Programming", "Williams", "ISB-1002-468", false);
    System.out.println("=== Book2 Details ===");
    b2.display();
    b2.returnBook();
    // Book object3
    Book b3 = new Book();
    b3.setBookdetails("C Programming", "Dennis", "ISB-1003-698", false);
    System.out.println("=== Book3 Details ===");
    b3.display();
    b3.issueBook();
    b3.returnBook();
    
  }
}