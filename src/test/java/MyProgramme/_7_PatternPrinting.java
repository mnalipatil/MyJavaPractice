package MyProgramme;

public class _7_PatternPrinting {
	
	public static void main(String[] args) {
		
		// *
		// * *
	    // * * *
		// * * * *
		// * * * * *
		
//		for (int i= 0; i<=4; i++)
//		{
//			for(int j=0; j<=i; j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//________________________________________________
		
		// * * * * *
		// * * * *
		// * * *
		// * *
		// *
		
//		for (int i= 0; i<=4; i++)
//		{
//			for(int j=4; j>=i; j--)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		______________________________________________
		
		// *
		// * *
	    // * * *
		// * * * *
		// * * * * *
		// * * * * *
		// * * * *
		// * * *
		// * *
		// *
		
//		for (int i= 0; i<=4; i++)
//		{
//			for(int j=0; j<=i; j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		for (int i= 0; i<=4; i++)
//		{
//			for(int j=4; j>=i; j--)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		________________________________________
		
//		//      *
//		//    * *
//		//  * * *
//		//* * * *
//		
//		for(int i=1; i<=4; i++)
//		{
//			for(int j=3 ; j>=i; j--)
//			{
//				System.out.print(" ");
//			}
//			for(int k=1; k<=i; k++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//      ________________________________________	
		
		//     *
		//    * *
		//   * * *
		//  * * * *
		// * * * * *
		
		for(int i=1; i<=5; i++)
		{
			for(int j=4 ; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	
	}

}
