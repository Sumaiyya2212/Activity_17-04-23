package bookapplication;
import java.util.Scanner;
public class BookService {
	
            static Book book[] = new Book[10];
            static Scanner sc=new Scanner(System.in);
            static int index =0;
            
            //create book method
            public static void createBook()
            {
            	boolean flag=false;
            	System.out.println("Enter Book Id : ");
            	int id = sc.nextInt();
            	for(int i=0;i<index;i++)
            	{
            		if(book[i].getBookId()==id)
            		{
            			System.out.println("Id already Exists!!!!");
            			flag=true;
            			break;
            		}
            	}
            	if(flag==false)
            	{
            		sc.nextLine();
                	System.out.println("Enter Book Name : ");
                	String bname = sc.nextLine();
                	
                	System.out.println("Enter book price : ");
                	double price = sc.nextDouble();
            	
            	book[index] = new Book(id,bname,price);
            	index++;
            	System.out.println("Your Book details created Successfully!!!");
            	}
            }
            //get all book details method
            public static void getAllBookDetails() {
            	for(int i=0;i<index;i++)
            	{
            		System.out.println("Book Id : "+book[i].getBookId());
            		System.out.println("Book Name : "+book[i].getBookName());
            		System.out.println("Book Price : "+book[i].getBookprice());
            		System.out.println("===========================");
            	}
            }
            //get all book details method by Id
            public static void getbookdetailsById()
            {
            	System.out.println("Enter id to search : ");
            	boolean flag = false;
            	int id = sc.nextInt();
            	for(int i=0;i<index;i++)
            	{
            		if(book[i].getBookId()==id)
            		{
                    		System.out.println("Book Id : "+book[i].getBookId());
                    		System.out.println("Book Name : "+book[i].getBookName());
                    		System.out.println("Book Price : "+book[i].getBookprice());
                    		System.out.println("===========================");
                    		flag=true;
                    	    break;	
                    }
            			            			
            		}
            	if(flag==false)
    				System.out.println("Book not found");

            	}
          //get all book details method by Name
            public static void getbookdetailBName()
            {
            	boolean flag=false;
            	System.out.println("Enter Book Name : ");
            	sc.nextLine();
            	String bookname = sc.nextLine();
            	for(int i=0;i<index;i++)
            	{
            		if(book[i].getBookName().equalsIgnoreCase(bookname))
            		{
                    		System.out.println("Book Id : "+book[i].getBookId());
                    		System.out.println("Book Name : "+book[i].getBookName());
                    		System.out.println("Book Price : "+book[i].getBookprice());
                    		System.out.println("===========================");
                    		flag=true;
                    	    break;	
                    }
            			
            		}
            	   if(flag==false)
    				     System.out.println("Book not found");
    			
            	}
            	
 }

