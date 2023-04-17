package bookapplication;
import java.util.Scanner;
public class BookMain {

	public static void main(String[] args) {
		BookService bservice = new BookService();
		Scanner sc = new Scanner(System.in);
		
		do {
		System.out.println("Welcome to Book Management System ");
		System.out.println("Press \n"+"0) To Exit \n"+"1) to create Book\n" 
		                +"2) to get Book Details\n"
		                +"3) To get Book Details using Book Id\n"
		                +"4)To get Book Details using Book name");
		System.out.println("=========================================");
		System.out.println("Enter your choice : ");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 0:
			System.out.println("Thank You\n"+"Visit Again");
			System.exit(0);
			break;
		case 1:
			bservice.createBook();
			System.out.println();
			break;
		case 2:
			bservice.getAllBookDetails();
			System.out.println();
			break;
		case 3:
			bservice.getbookdetailsById();
			System.out.println();
			break;
		case 4:
			bservice.getbookdetailBName();
			System.out.println();
			break;
		}

	}while(true);
   }

}
