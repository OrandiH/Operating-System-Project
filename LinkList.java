import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class LinkList {
	private Node Head;	
	
	
	public LinkList(){
		Head = null;
	}
	
	
	
	public void InsertAtFront(ProcessList d){
		Node Temp = new Node();
		
		
			
		if (Temp != null){
			
			Temp.SetData(d);
			Temp.SetNextNode(null);
			}
			if (Head == null){
				Head = Temp;
			}
			else
			{
				Temp.SetNextNode(Head);
				Head = Temp;
			}
			
			
			}
	
	public void WriteToFile()
	{
		Node Temp = new Node();
		Temp = Head;
		try{
			BufferedWriter x = new BufferedWriter(new FileWriter("Process List.txt"));
			while(Temp != null)
			{
				x.write(Temp.GetData().GetPID() +"\t"+ Temp.GetData().GetPriority() +"\t"+ Temp.GetData().GetTask());
				x.newLine();
				Temp = Temp.GetNextNode();
			}
			x.close();
			}
		catch (IOException e){
			e.getStackTrace();
			
		}
	}
	
	public void DisplayList(){
		Node Temp = new Node();
		Temp = Head;
		System.out.println("PID \t Priority \t Task \t Create Time");
		while (Temp != null){
			//PRINTING THREE COLUMS WITH INFO
			System.out.println(Temp.GetData().GetPID() +"\t"+ Temp.GetData().GetPriority() +"\t\t"+ Temp.GetData().GetTask() +"\t\t"+ Temp.GetData().getCreate_time());
			Temp = Temp.GetNextNode();
		}
	}
	
	public void SaveToFile(){
		
	}
	
	
}
	


