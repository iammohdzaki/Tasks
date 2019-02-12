import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap; 
import java.util.Map; 

class Class{
    public void class_name(final String mName){
        System.out.println("Class : "+ mName);
    }
}

abstract class Subject extends Class{
    abstract void subject_name(final String sub_name);
    abstract void student_details(Map<String, Integer> map);
}

class Maths extends Subject{
    
    @Override
    void subject_name(final String sub_name){
        if (sub_name.equals("Maths")){
            System.out.println("Subject : "+sub_name);
        }
    }
    
    @Override
    void student_details(Map<String, Integer> map){
        System.out.println("Name & Marks:"+map);
    }
    
}
class Marks{
	public static void main(String[] args) throws IOException {

	    final int limit;
	    String name;
	    int marks;

	    //Store the student marks and name in HashMap
	    HashMap<String, Integer> map = new HashMap<>(); 
		map.put("Tom",9);
		map.put("Steve",7);
		map.put("Mary",10);

		// Call methods to show data
		Maths maths = new Maths();
		maths.class_name("10th");
		maths.subject_name("Maths");
		maths.student_details(map);
		
		//Experimental -> Get name and marks from user
		//Enter data using BufferReader
        BufferedReader get = 
                   new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nWant to enter data for other students!(Y->1 or N-> 0)");
		int option=Integer.parseInt(get.readLine());

		if (option==1){
		    System.out.println("\nPlease Enter Limit->");
		    limit=Integer.parseInt(get.readLine());

		    //Get input from user for multiple students
		    for(int i=0; i<limit; i++ ){

		        System.out.println("\nPlease Enter Name of Student ID:0"+(i+1)+"->");
		        name=get.readLine();
		        System.out.println("\nPlease Enter Marks of Student "+name+"(Out of 50) ->");
		        marks=Integer.parseInt(get.readLine());

		        //Enter the data to hash map
		        map.put(name,marks);
	    	}
	    	System.out.println("New Data Added : \n"+map);
	    	System.out.println("\nThank You"); 
		}
		else{
		   	System.out.println("\nThank You"); 
		}
		//Mark object null for GC
		maths=null;
	
	}
}
