package demo;
import java.util.*;
public class EmailPrblm {
	public static void main(String[]args) {
			   Scanner sc=new Scanner(System.in);   
	
		 	   String[] EmailId=new String[3];
	
		 	   for(int i=0;i<EmailId.length;i++) {
		 		   System.out.println("Enter a EmailId: ");
		 		   EmailId[i]=sc.next();
		 	   }
		 	   
		 	   for(String id: EmailId) {
		 		   System.out.println("EmailId's Present in the array: "+id);
		 	   }
	
		 	   System.out.println("Enter the EmailId that you want to search:");
		 	   String searchId=sc.next();
		 	   
		 	   for(int i=0;i<EmailId.length;i++) {
		 		    if(searchId.equals(EmailId[i])) {
		 		    	System.out.println("The EMail id is found at index: "+i);
	 		    }
	 	   }   
	   }	
}