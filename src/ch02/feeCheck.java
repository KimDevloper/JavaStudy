import java.util.Scanner;  //20213232 검퓨터공학과 김대원

public class feeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
		
		int one = 0;
		System.out.println("해당하는 번호를 입력하시오(1-성인, 2-청소년, 3-어린이) :");
		one = scanner.nextInt();
		
		if (one == 1) {
			System.out.println("당신은 성인이며 요금은 1400원입니다.");
		} 
		else if (one == 2) {
			System.out.println("당신은 청소년이며 요금은 1000원입니다.");
		}
		else if (one == 3) {
			System.out.println("당신은 어린이이며 요금은 500원입니다.");
		} 
		
		}

}
