import java.util.ArrayList;
import java.util.Scanner;

public class Booking {

    Scanner input = new Scanner(System.in);
    DBClassRooms dbClassRooms;
    String roomID;
    String roomName;
    Room room;


    public void bookARoom(){
        dbClassRooms.getClassRoomsFromDatabase();
        while(true){
            System.out.println("Please choose the room number you want to book: \n press x to quite");
            roomID = input.nextLine();
            if(roomID.equals("x")){
                System.out.println("Booking cancelled");
                break;
            }
            if(getRoom(roomID) == null){
                System.out.println("The ID is incorrect. Please try again");

            } else{
                room = getRoom(roomID);
            }
        }

    }

    public String getBooking(DBClassRooms dbClassRooms){
        String roomList = "";
        for(Room r: dbClassRooms.getClassRooms()){
            if(!r.isBooked()){
                roomList = roomList + r.getRoomID() + " is free ";
                System.out.println("Booking succesfull");

                break;
            } else{
                roomList = roomList + r.getRoomID() + " has been booked";
            }
        }
        return roomList;
    }


    public Room getRoom(String roomID) {
        for (Room r : dbClassRooms.getClassRooms()) {
            if (r.getRoomID() == Integer.parseInt(roomID)) {
                return r; //return the room
            }

        }
        return null;
    }


    public void run() {
        dbClassRooms = new DBClassRooms();
        bookARoom();
        getBooking(dbClassRooms);

    }
}






