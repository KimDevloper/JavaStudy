import java.util.Scanner;  //20213232 검퓨터공학과 김대원

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" 두 정수와 사칙연산을 빈칸으로 구분하여 입력하시오 ex)2 + 4 :");
		Scanner scanner = new Scanner(System.in);
		
		double one = scanner.nextDouble();
		
		char s = scanner.next().charAt(0);;
		
		double two = scanner.nextDouble();
		
		switch(s) {
		case '+' :
			System.out.println(one + " + " + two + "의 계산결과는 " + (one + two));
			break;
		case '-' :
			System.out.println(one + " - " + two + "의 계산결과는 " + (one - two));
			break;
		case '/' :
			if(one != 0 && two != 0 ) {
			System.out.println(one + " / " + two + "의 계산결과는 " + (one / two));
			}
			else {
				System.out.println("0으로 나눌 수 없습니다.");
			}
		case '*' :
			System.out.println(one + " * " + two + "의 계산결과는 " + (one * two));
			break;
		}
		
		scanner.close();
	}

}
