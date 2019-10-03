import java.util.Scanner;

public class ClassRoom extends Room {
    private int NumberOfSeat;
    private int NumberOfCom;
    private boolean dataProjector=false;

    public String toString(){
        if(!dataProjector)
            return super.toString() +" "+ this.NumberOfSeat+" seats,"+this.NumberOfCom+" computers";
        else
            return super.toString() +" "+this.NumberOfSeat+" seats,"+this.NumberOfCom+" computers, data projector";
    }

    public void AskData() {
        super.AskData();
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of seats: ");
        this.NumberOfSeat = sc.nextInt();
        System.out.print("Number of computer: ");
        this.NumberOfCom = sc.nextInt();
        String isProjector;
        System.out.println("Is there a data projector (Y/N) ?");
        isProjector = sc.next();
        dataProjector= isProjector.equals("Y");
    }
}
