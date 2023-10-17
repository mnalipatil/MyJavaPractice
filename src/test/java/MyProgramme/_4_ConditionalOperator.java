package MyProgramme;

public class _4_ConditionalOperator {
	
	public static void main(String[] args) {
		
		// == comparison operator
		// < less than
		// > greater than
		// >= less than equals
		// <= grater than equals
		// != not operator
		// && and operator
		// || or operator
		
		// 	&& operator 
			
			// T T = T		// F F = F
			// T F = F		// F T = F
		
		String username = "Manali";
		String browser = "opera";
		
		if(username ==" Manali" && browser == "opera") // == or .equals used
		{
			System.out.println("THe username name is -> " + username + " she is used browser " + browser );
		}
		else if (username ==" Manali" && browser == "firefox")
		{
			System.out.println("THe username name is -> " + username + " she is used browser " + browser );
		}
		else
		{
			System.out.println("Brouser is not found" );
		}
		
		// || operator
		
			// T T = T		// T F = T
			// F T = T		// F F = F
		
		String AT = "Manali";
		
		if(AT=="Sonali" || AT=="Manali")
		{
			System.out.println("The AT name is ->" + AT);
		}
		else
		{
			System.out.println("The result is not getting any AT name");
		}
		
		// > operator
		
		int a = 10;
		int b = 20;
		
		if (a > b)
		{
			System.out.println("a is grater than b ");
		}
		else
		{
			System.out.println("b is grater than a ");

		}
		
		// == comparison operator
		
		String z = "Manali";
				
		if( z.equals("Sony"))
		{
			System.out.println("The result is matched");
		}
		else
		{
			System.out.println("The result is mismatched");
		}
		
		// >= greater than equals to operator
		
		int p = 300;
		
		if(p == 200)
		{
			System.out.println("p is greater than or equals to");
		}
		else
		{
			System.out.println("p is less than");
		}
		
	}

}
