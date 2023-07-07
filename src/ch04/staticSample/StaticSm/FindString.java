package ch04.staticSample.StaticSm;

public class FindString {
    public static int index;
    public static boolean flag;
    public static void findstring(String find, String[] arrString) {
        index = -1; // 초기 인덱스 값 -1로 설정하는 이유는 0으로 설정이 되어있으면 배열의 인덱스는 0으로 시작하기 때문에
                        // 문자열 찾기가 힘들다. 그래서 -1로 설정하여 일치하는 문자열 찾기 못할경우 -1로 떠서 찾지 못했다는 것
        flag = false; // 일치하는 문자열이 있는지 여부를 저장하는 플래그이다. flag 기능은 참과 거짓을 구분하는 것이다.

        for (int i = 0; i < arrString.length; i++) {
            if (arrString[i].equals(find)) { //equals는 입력받은 문자와 배열에 있는 문자를 비교하여 있다면 ture를 반환한다.
                index = i;                  // 그러면
                flag = true;
                break;
            }
        }
        // flag 값이 true면 if문을 사용하여 구분한다.
        if (flag) {
            System.out.println("일치하는 문자열을 찾았습니다.");
            System.out.println("찾는 문자열 " + find + "은 배열의 " + (index + 1) + "번째 위치에 있습니다.");
        } else {
            System.out.println("일치하는 문자열을 찾을 수 없습니다.");
        }
    }
}
