package Casa;

import java.math.RoundingMode;

public class MainHouse {
  public static void main(String[] args) {
    Room[] rooms = new Room[5];
    House house = new House(rooms, 5);

    Room room1 = new Room(3, 44.0);
    Room room2 = new Room(2, 82.0);
    Room room3 = new Room(1, 22.1);


    house.addRoom(room1);
    house.addRoom(room2);
    house.addRoom(room3);
    // Agregar las habitaciones al arreglo
//    rooms[0] = room1;
    System.out.println(house.showHouseInfo());
    System.out.println("**************");
    house.destoryHouse();

    System.out.println(house.showHouseInfo());
  }
}
