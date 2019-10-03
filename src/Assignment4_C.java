import java.util.Scanner;

public class Assignment4_C {
    public static void main(String[] args) {
        Dice dice = new Dice();
        String s;
        Scanner sc = new Scanner(System.in);
        Distribution distribution = new Distribution(1, 6);
        do{
            System.out.println("Press 1 to roll dice ");
            s = sc.nextLine();
            dice.RollIt();
            distribution.insertValue(dice.value);
        }while (s.equals("1"));
        PrintDis printDis = new PrintDis(distribution);
        for (int i=1;i<=6;i++) {
            System.out.println("Value: "+i);
            printDis.displayDistribution(i);
        }
        }
}
