import java.util.Scanner;

public class Assignment4_B {
    public static void main(String[] args) {
        Distribution distribution = new Distribution(0,5);
        Scanner sc = new Scanner(System.in);
        int grade;
        do {
            System.out.println("Give the grade (0-5)(give -1 to stop): ");
            grade = sc.nextInt();
            distribution.insertValue(grade);
        }while (grade!=-1);
        PrintDis printDis = new PrintDis(distribution);
        for(int i=0;i<=5;i++) {
            System.out.println("Grade "+i+": ");
            printDis.displayDistribution(i);
        }
    }
}
