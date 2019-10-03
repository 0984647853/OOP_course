import java.util.Scanner;

public class Room {
    public String getRoomID() {
        return roomID;
    }

    private String roomID;
    private String description;

    public String toString(){
        return this.roomID+": "+this.description;
    }

    public void AskData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Room ID is: ");
        this.roomID = sc.nextLine();
        System.out.print("Name of room is: ");
        this.description = sc.nextLine();
    }
}
