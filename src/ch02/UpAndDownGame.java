import java.util.Scanner; //20213232 검퓨터공학과 김대원

public class UpAndDownGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int random = (int) (Math.random() * 100) + 1;
		while(true) {
			System.out.println("1~100사이의 난수 입력하시오 :");
			int s = scanner.nextInt();
			
			if (s < random) {
                System.out.println("UP");
            } 
			else if (s > random) {
                System.out.println("DOWN");
            } 
            else {
                System.out.println("정답입니다!");
                break;
            }
			
		}
		scanner.close();
	}

}
