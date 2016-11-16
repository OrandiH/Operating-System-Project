import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
public class Driver {

	public static void main(String[] args) {
		
		Scanner Input = new Scanner("System.in");
		
		
		
		Calendar cal = Calendar.getInstance();
		  cal.getTime();
		 SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		  //System.out.println(sdf.format(cal.getTime())); 
		
		  
		  
		  
		System.out.println("Enter the number total number of processes");		
		//int a = Input.nextInt();
		
		/*if  (a > 20){
			
			System.out.println("It is greater than 20!\nPlease renter: ");
			a = Input.nextInt();
		}*/
		
		
	//USE TO POPULATE LINKED LIST WITH VALUES	
		LinkList LL = new LinkList();
		
		for (int x = 0; x < 20; x++){
			ProcessList d = new ProcessList(); //KEEPS THE RANDOM VALUES FROM STORING 20 OF THE SAME VALUES
			d.setCreate_time(cal.getTime());
			
			d.SetPID();
			d.SetPriority();
			d.GetTask();
			
			LL.InsertAtFront(d);
		}
		
		LL.DisplayList();
		LL.WriteToFile();
		
		

	}

}
