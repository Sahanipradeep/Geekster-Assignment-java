import java.util.*;

public class perfectSquare {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=1;i<=a/2;i++)
		{
			if(a==i*i)
			{
				System.out.println("Number is perfect square");
				return;
			}
		}
		System.out.println("Number is not perfect square");
	}
}
