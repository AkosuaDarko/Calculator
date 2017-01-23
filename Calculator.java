public class Calculator{
	
	public static void main(String param[]) {
		
		
		System.out.println("Enter The name of an Operator followed by two number delimited by a space");
		
		// add method
		
		if(param[0].equals("add")){
			System.out.println(Integer.parseInt(param[1]) + Integer.parseInt(param[2]) );
			
		}
		
		// subtract method
		if(param[0].equals("sub")){
			System.out.println(Integer.parseInt(param[1]) - Integer.parseInt(param[2]) );
			
		}
		
		
	}
	
	
	
}