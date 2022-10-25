import java.util.*;
public class SolidRhombus{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER M:");
		int m =sc.nextInt();
//	System.out.println("ENTER N:");
	//	int n =sc.nextInt();
		for(int i = 1;i<=m;i++)
		{
			
			
				for(int k = m;k>i;k--)
		{
		System.out.print(" ");
		}
		for(int j = 1;j<=m;j++)
	{
		System.out.print("#");
			}	
			System.out.println();	
			}
	}
}