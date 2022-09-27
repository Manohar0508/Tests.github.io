import java.util.Scanner;
public class Series {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int a=sc.nextInt();
		for(int i=1; i<=((a+a)-1); i++){
			if((i%2)==1)
				System.out.print(i+" ");		
		}
	}
}
