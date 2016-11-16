import java.util.*;

public class ProcessList {
	
	private int PID;
	private String Task[] = {"Adding","Removing","Retrieve","Sort","Calculate"};
	private int Priority;
	private long CreateTime;
	private long StartTime;
	private long EndTime;
	
	private static Date Create_time;
	private static Date Start_time;
	private static Date End_time;
	
	private int Attempts;
	private int SleepTime;
	
	Random ran = new Random();
	
	public ProcessList(){

		CreateTime = System.currentTimeMillis();
		StartTime = System.currentTimeMillis();
		EndTime = System.currentTimeMillis();
		Attempts = 0;
		
		
	}
	
	public void SetPID(){
		Random ran = new Random();
		PID = ran.nextInt(40) + 1;
	}
	
	public int GetPID(){
		return PID;
	}
	
	/*public void SetTask(){
	 
	}*/
	
	public String GetTask(){
		int x;
		x = ran.nextInt(5);
		return Task[x];
	}
	
	public void SetPriority(){
		Priority = ran.nextInt(5) + 1;
	}
	
	public int GetPriority(){
		return Priority;
	}
	
	public void SetCreateTime(){
		
	}
		
	public long GetCreateTime(){
		return CreateTime % 1000;
	}
	
	public void SetStartTime(){
		
	}
	
	public long GetStartTime(){
		return StartTime;
	}
	
	public void SetEndtiume(){
		
	}
	
	public long GetEndTime(){
		return EndTime;
	}
	

public Date getCreate_time() {
	return Create_time;
}



public void setCreate_time(Date create_time) {
	Create_time = create_time;
}



public Date getStart_time() {
	return Start_time;
}



public void setStart_time(Date start_time) {
	Start_time = start_time;
}



public Date getEnd_time() {
	return End_time;
}



public void setEnd_time(Date end_time) {
	End_time = end_time;
}
	public void SetAttempts(int x){
		Attempts = x;
	}
	
	public int GetAttempts(){
		return Attempts;
	}
	
	public void SetSleepTime(){
		SleepTime = ran.nextInt(5);
	}
	
	public int GetSleepTime(){
		return SleepTime;
	}	
	
	

}
