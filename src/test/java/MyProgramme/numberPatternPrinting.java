package MyProgramme;

public class numberPatternPrinting {
	
	public static void main(String[] args) {
		
		// 1
		// 2 2
		// 3 3 3
		// 4 4 4 4
		// 5 5 5 5 5
		
		int n = 5;
		for(int i = 1, p=1 ;i<=n; i++,p++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(p+"");
			}
			System.out.println();
		}
		
		System.out.println("----------");
		
		// 5 5 5 5 5
		// 4 4 4 4
		// 3 3 3
		// 2 2
		// 1
		
		int k = 5;
		for(int i = 1,p=5 ;i<=k; i++,p--)
		{
			for(int j=k; j>=i; j--)
			{
				System.out.print(p+"");
			}
			System.out.println();
		}
		
		System.out.println("----------");
		
		// 1
		// 2 2
		// 3 3 3
		// 4 4 4 4
		// 5 5 5 5 5
		// 5 5 5 5 5
		// 4 4 4 4
		// 3 3 3
		// 2 2
		// 1
		
		int a = 5;
		for(int i = 1, p=1 ;i<=a; i++,p++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(p+"");
			}
			System.out.println();
		}
		int b = 5;
		for(int i = 1,p=5 ;i<=b; i++,p--)
		{
			for(int j=b; j>=i; j--)
			{
				System.out.print(p+"");
			}
			System.out.println();
		}
		
		System.out.println("----------");
		
		
//		int m = 5;
//		for(int i = 1, p=1 ;i<=m; i++,p++)
//		{
//			for(int j=1; j<=i; j++)
//			{
//				System.out.print( p+"");
//			}
////			for(int f=1; f<=i; f++)
////			{
////				System.out.print("_ ");
////			}
//			System.out.println();
//		}
//		int v = 5;
//		for(int i = 1,p=5 ;i<=v; i++,p--)
//		{
//			for(int j=b; j>=i; j--)
//			{
//				System.out.print( p+"");
//			}
////			for(int f=1; f<=i; f++)
////			{
////				System.out.print(" ");
////			}
//			System.out.println();
//		}
		
		System.out.println("----------");
		
		int v = 5;
		for(int i = 1;i<=5; i++)
		{
			for(int j=4; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int f=1,p=1; f<=v; f++,p++)
			{
				for(int i1 = 1;i1<=f; i1++)
			{
				System.out.print(p+"");
			}
		System.out.println();
		}
		}
	}

}
