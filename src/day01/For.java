package day01;

public class For {

	public static void main(String[] args) {
	/*for(int i=1;i<8;i++) {
		for(int j =i;j<=i;j++) {
			System.out.print("*");
			
		}
		System.out.println();
	}*/
	/*for(int i=1;i<7;i++) {
		for(int j=6;j>=i;j--) {
			System.out.print("*");
		}
		System.out.println();
	}*/
		for(int i =1;i<=9;i++) {
			for(int j =1;j<=i;j++) {
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
			System.out.println();
		}
	}

}
