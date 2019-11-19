import java.util.ArrayList;

public class homework3 {
    public static void main(String[] args) {

        LocalMachine localMachine_1 = new LocalMachine("A",10,20,5);
        LocalMachine localMachine_2 = new LocalMachine("B",2,10,3);

        Purchased_machine purchased_machine_1 = new Purchased_machine("C",1,2,"ABB");
        Purchased_machine purchased_machine_2 = new Purchased_machine("D",5,6,"MOM");


        ArrayList<MachinePart> machineParts = new ArrayList<>();
        machineParts.add(localMachine_1);
        machineParts.add(localMachine_2);
        machineParts.add(purchased_machine_1);
        machineParts.add(purchased_machine_2);
        System.out.println("ToString");
        for (MachinePart machine:machineParts) {
            System.out.println(machine.toString());
            System.out.println("\n");
        }
        System.out.println("\n\n");
        for (MachinePart machine : machineParts
        ) {
            System.out.println("Name: "+machine.getName());
            System.out.println("Value: "+machine.totalValue());
        }

    }
}
