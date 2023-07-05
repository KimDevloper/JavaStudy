import java.util.Scanner;  //20213232 검퓨터공학과 김대원

public class CompareNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int one = 0;
		int s = 0;
		int c = 0;
		System.out.println("2자리 정수 입력(10~99)>> ");
		one = scanner.nextInt();
		// one%11 == 0;으로도 사용가능 
		c = one / 10;
		s = one % 10;
		if (one < 10 || one > 99) {
			System.out.println("범위 안에 있는 정수를 입력하시오.");
		}
		else {
		if (s == c) {
			System.out.println("Yes! 10의 자리의 1의 자리가 같습니다.");
		} 
		else if (s != c) {
			System.out.println("Nope! 10의 자리의 1의 자리가 같습니다.");
		}
		else {
			System.out.println("잘못입력하셨습니다.");
		}
		}
	}

}
