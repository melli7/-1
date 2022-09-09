import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		System.out.println("Довжина першого катета:");
		System.out.println("Довжина другого катета:");
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a*a+b*b; 
		
		System.out.println(c);
	}
	
}
