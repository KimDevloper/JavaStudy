package ch08;

import java.io.*;
import java.util.*;

public class FileIO_test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("입력하시오");
        try (FileWriter fout = new FileWriter("c:\\Temp\\fileIO_test.txt", true)) {
            while (true) {
                String line = scanner.nextLine();
                if (line.length() == 0)
                    break;
                fout.write(line, 0, line.length());
                fout.write("\r\n", 0, 2);
            }
            System.out.print("입력완료");
        } catch (IOException e) {
            System.out.println("입출력 오류");
        }

        System.out.println("파일 내용 출력");
        try (FileInputStream fin = new FileInputStream("c:\\Temp\\fileIO_test.txt");
             InputStreamReader in = new InputStreamReader(fin, "UTF-8")) {

            System.out.println("인코딩 집합은" + in.getEncoding());
            int c;
            while ((c = in.read()) != -1) { // 한 문자씩 파일 끝까지 읽는다.
                System.out.print((char) c);
            }
        } catch (IOException e) {
            System.out.println("입출력 오류");
        }
    }
}
