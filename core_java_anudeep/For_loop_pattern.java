package core_java_anudeep;

public class For_loop_pattern {

	public static void main(String[] args) {
//		reverse pattern
//		int i,j,k;
//		for(i=5;i>=1;i--) //this is for row part
//		{
//			for(k=5;k>i;k--) //for spacing in starting part
//			{
//				System.out.print(" ");
//			}
//			for(j=1;j<=2*i-1;j++) //for col define
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//2 nd pattern
		int i,j;
		for(i=1;i<=3;i++)
		{
			for(j=1;j<=6;j++)
			{
				if(i==2)
				{
					if(j==1||j==6)
					{
						System.out.print("*");
					}
					else 
					{
						System.out.print(" ");
					}
				}
				else 
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
