package ch08;
import java.io.File;

public class FileOperations {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\eolzz\\IdeaProjects\\JavaStudy\\src\\ch08\\FileClassTest.txt");
        if (file.exists()) {
            System.out.println("exist");
        } else {
            System.out.println("no");
        }
            long fileSize = file.length();
            System.out.println("파일 크기: " + fileSize + "바이트");

        File newFile = new File("C:\\Users\\eolzz\\IdeaProjects\\JavaStudy\\src\\ch08\\res.txt");
        if (file.exists()) {
            boolean rename = file.renameTo(newFile);
        }
    }
}