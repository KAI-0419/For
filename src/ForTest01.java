
public class ForTest01 {

	public static void main(String[] args) {
		testFor();
		testFor2();
		testFor3();
	}
	
	public static void testFor() {
		int i = 0;
		while(i<=10) {
			System.out.println("i= "+i);
			i++;
		}
		for(i=0;i<=10;i++) {
			System.out.println("i= "+i);
		}
		for(i=100; i>0; i--) {
			System.out.println("i= "+i);
		}
//		for(int j=1;;j++) {
//			System.out.println(j);
//		}
	}

	public static void testFor2() {
		for(int i=1; i<=10; i+=2) {
			System.out.println(i);
		}
		for(int i=0,j=10; i<10; i++,j--) {
			System.out.println("i= "+i);
			System.out.println("j= "+j);
		}
		for(char ch='A'; ch<='Z'; ch++) {
			System.out.println(ch);
		}
	}
	
	public static void testFor3() {
		int random = (int)(Math.random()*100)+1;
		
		int sum = 0;
		
		for(int i=1; i<=random; i++) {
			sum += i;
		}
		System.out.println("1부터" + random + "까지의 합:" + sum);
	}
}
