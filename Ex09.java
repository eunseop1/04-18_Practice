import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 1;
		while(n!=0) {
			System.out.print("0~255사이의 정수입력(0은 종료)");
			n = sc.nextInt();
			if(n==0) continue;
			
			int mask = 0x80;
			for(int i=0;i<8;i++) {
				System.out.print((mask & n) == mask ? "1" : "0");
				mask <<= 1;
			}
			System.out.println();
			System.out.println(Integer.toBinaryString(n));
		}
		sc.close();
	}
}
