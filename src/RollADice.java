import java.util.Scanner;

public class RollADice {
    public static void main(String[] args) {
        Dice dice_1 = new Dice();
        Dice dice_2 = new Dice();
        int command = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("To roll it, you need to type 1 ");
        command = sc.nextInt();
        do {
            if (command == 1) {
                dice_1.RollIt();
                System.out.print(dice_1.value + " ");
                dice_2.RollIt();
                System.out.println(dice_2.value);
            }
        }while (dice_1.value != dice_2.value);
    }
}