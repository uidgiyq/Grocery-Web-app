package apppack;
import java.util.*;
public class Todolist {

	public static void main(String[] args) {
         ArrayList<String> todo=new ArrayList<>();
         Scanner scan =new Scanner(System.in);
         int choice;
         System.out.println("TODO LIST");
         todo.add("wake up");
         todo.add("clean up");
         String task;
         do {
         System.out.println("choose the number to perform operation");
         System.out.println(" 1 for add Task");
         System.out.println(" 2 for viw the Task");
         System.out.println(" 3 for remove the Task");
         System.out.println(" 4 for Exit");
         System.out.println("enter the number to perform operation");
         choice =scan.nextInt();
         scan.nextLine();  
        
         
         switch(choice) {
         case 1:
        	 System.out.println("Enter the task");
     		   task=scan.nextLine();
     		   todo.add(task);
        	 System.out.println("Task is added");
        	 break;
         case 2:
        	 if(todo.isEmpty()) {
        		 System.out.println("TOdo List is already empty");
        	 }
        	 else {
        		 for(int i=0;i<todo.size();i++) {
        			 System.out.println(todo.get(i));
        		 }
        	 }
        	 break;
         case 3:
        	 System.out.println("Enter the index which task want to remove");
        	 int index=scan.nextInt();
        	 if(index>=0 && index<todo.size()) {
        		 todo.remove(index-1);
        	 }
        	 else {
        		 System.out.println("your index not in that list");
        	 }break;
         case 4:
        	 System.out.println("Successfully exited");
        	 break;
         }
	}while(choice !=4);

}
}
