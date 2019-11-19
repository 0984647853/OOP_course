import java.io.*;
import java.util.Scanner;

public class Assignment8_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give the word: ");
        String word = sc.next();
        System.out.print("Give the path of text file: ");
        String path = sc.next();
        String[] words = null;
        try {
            BufferedReader input = new BufferedReader(new FileReader(path));
            String line;
            while ((line = input.readLine()) != null) {
                words = line.split(" ");
                for (String looking : words) {
                    if (looking.equals(word)) {
                        System.out.println(line);
                        break;
                    }
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

}
