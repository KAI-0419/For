import java.util.Scanner;

public class ForTest02 {
	
	public static void main(String[] args) {
		ForTest02.testFor1();
		ForTest02.testFor2();
		ForTest02.testFor3();
		ForTest02.testFor4();
	}
	public static void testFor1() {
	
	for(int i=0; i<10; i++) {
		for(int j=0; j<10; j++) {
			System.out.println("j = "+j);
		}
		System.out.println("i ="+i);
	}
	}
	
	public static void testFor2() {
		int i,j;
		for(i=1; i<=9; i++) {
			for(j=1; j<=9; j++) {
				System.out.println(i + "*" + j + "=" + (i*j));
			}
			System.out.println();
		}
		
	}
	
	public static void testFor3() {
		for(int i=1; i<6; i++) {
			for(int j=1; j<6; j++) {
			System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void testFor4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("줄 수: ");
		int row = sc.nextInt();
		System.out.print("칸 수: ");
		int col = sc.nextInt();
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				if(i == j) {
					System.out.print(i+1);
				}else {
				System.out.print("☆");
			}
			}
			System.out.println();
		}
		
		
	}
	
	
}
