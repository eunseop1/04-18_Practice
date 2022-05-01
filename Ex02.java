/*
 * 생년월일을 920822 형태로 입력하는것과 "920822"로 입력하는것의 차이는?
 */
public class Ex02 {
	public static void main(String[] args) {
		int birth = 920822;
		// 92년 8월 22일 로 출력하시오
		System.out.print(birth/10000 + "년 "); // 뒷자리 4자리 버리기
		System.out.print(birth/100%100 + "월 "); //앞자리 자르고 뒷자리 자르고
		System.out.println(birth%100 + "일 "); // 앞의 4자리 버리기
	}
}
