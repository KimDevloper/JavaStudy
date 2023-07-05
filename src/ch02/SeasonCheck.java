import java.util.Scanner;  //20213232 검퓨터공학과 김대원

public class SeasonCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int one = 0;
		System.out.println("숫자를 입력하시오(1~12) : ");
		one = scanner.nextInt();
		
		switch(one) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
            break;
        case 6:
        case 7:
        case 8:
            System.out.println("여름");
            break;
        case 9:
        case 10:
        case 11:
            System.out.println("가을");
            break;
        case 12:
        case 1:
        case 2:
            System.out.println("겨울");
            break;
        default:
            System.out.println("잘못 입력");
            break;
		}
		scanner.close();
 	}

}
