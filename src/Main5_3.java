import java.util.ArrayList;
import java.util.Scanner;

public class Main5_3 {
    public static void main(String[] args) {
        ArrayList<Room> rooms = new ArrayList<>();
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        while (choice!=-1) {
            System.out.println("Choose one option below (10 to stop)\n" +
                    "1. Insert an office\n" +
                    "2. Insert a classroom\n" +
                    "3. Insert another room (not office, not classroom)\n" +
                    "4. Print out all rooms\n" +
                    "5. Print out offices\n" +
                    "6. Print out classrooms\n" +
                    "7. Print out other rooms (not office, not classroom)\n" +
                    "8. Search a room\n" +
                    "9. Search a staff member");
            choice = sc.nextInt();
            if(choice==1){
                OfficeRoom officeRoom = new OfficeRoom();
                officeRoom.AskData();
                rooms.add(officeRoom);
            }
            if (choice == 2) {
                ClassRoom classRoom1 = new ClassRoom();
                classRoom1.AskData();
                rooms.add(classRoom1);
            }
            if (choice == 3) {
                Room room1 = new Room();
                room1.AskData();
                rooms.add(room1);
            }
            if (choice == 4) {
                for (Room room : rooms) {
                    System.out.println(room.toString());
                }
            }
            if (choice == 5) {
                for (Room room : rooms) {
                    if (room instanceof OfficeRoom) {
                        System.out.println(room.toString());
                    }
                }
            }
            if (choice == 6) {
                for (Room room : rooms) {
                    if (room instanceof ClassRoom) {
                        System.out.println(room.toString());
                    }
                }
            }
            if (choice == 7) {
                for (Room room : rooms) {
                    if (!(room instanceof ClassRoom)&&!(room instanceof OfficeRoom)) {
                        System.out.println(room.toString());
                    }
                }
            }
            if (choice == 8) {
                String id;
                System.out.print("Give the RoomID: ");
                id=sc.next();
                for (Room room : rooms) {
                    if (id.equals(room.getRoomID())) {
                        System.out.println(room.toString());
                    } else {
                        System.out.println("Cant find that name!!1");
                    }
                }
            }
            if (choice == 9) {
                String name;
                System.out.print("Give name: ");
                name = sc.next();
                for (Room room : rooms) {
                    if (room instanceof OfficeRoom) {
                        if(((OfficeRoom) room).isWork(name)){
                            System.out.println(room.toString());
                        }
                    }
                }
            }
        }
    }
}
