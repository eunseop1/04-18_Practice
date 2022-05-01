/*
구글 입사문제 중에서
1부터 10,000까지 8이라는 숫자가 총 몇번 나오는가?
 */
public class Ex01 {
	public static void main(String[] args) {
		int count=0, temp;
		for(int i=0;i<10000;i++) { // 반복 
			temp = i; // 반복변수가 변경되면 반복문이 엉킨다. 피신 
			while(temp>0) { // 어떤 숫자를 10으로 나누다 보면 언젠가는 0이다.
				if(temp%10==8) count++; // 1의자리 잘라내서 8인면 증가
				temp/=10; // 1의자리 버림
			}
		}
		System.out.println("8의 개수 : " + count);
	}
}
