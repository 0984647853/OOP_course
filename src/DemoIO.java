import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class DemoIO {
    public static void main(String []args){
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("demo.txt",true);
            System.out.println("Moi nhap du lieu can ghi");
            int n = new Scanner(System.in).nextInt();
            fos.write(n);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
        try {
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        }
    }

}
