import java.util.TreeMap;

public class Mapusecase {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		TreeMap<Integer,String> tm=new TreeMap<>();
		tm.put(1, "Abi");
		tm.put(2, "Abar");
		tm.put(3, "Abisu");
		tm.put(4, "Abinaya");
		tm.put(10, "Ais");
		tm.put(21, "Anu");
		tm.put(11, "Ashu");
		//tm.put(null, null);
		
		String a=tm.get(1);
	     System.out.println("First Patinet: "+a);
		if(tm.containsKey(10))
		{
			tm.put(12,"Aathi");
		}
		System.out.println("List of patients: "+tm);
		
		System.out.println("The following Patinet's id 101: "+tm.containsKey(101));
		System.out.println("The following Patinet's name Ais: "+tm.containsValue("Abar"));
		System.out.println("Total no.of patients: "+tm.size());
		tm.remove(21);
		
	    System.out.println("After updating: "+tm);
		tm.clear();
		System.out.println("After clearing the system: "+tm);

	}

}

