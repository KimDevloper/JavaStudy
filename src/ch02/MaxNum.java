import java.util.Scanner;  //20213232 검퓨터공학과 김대원

public class MaxNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int one = 0;
		int two = 0;
		System.out.println("첫 번째 정수를 입력하시오 : ");
		one = scanner.nextInt();
		
		System.out.println("두 번째 정수를 입력하시오 : ");
		two = scanner.nextInt();
		
		if (one < two) {
			System.out.println(two);
		} 
		else if (one > two) {
			System.out.println(one);
		}
		else {
			System.out.println("동일한 값을 입력하셨습니다. 재입력해주십시오.");
		}
	}

}
