package Casa;

public class House {
  private Room[] rooms;
  private int counterRooms;
  private int maxCapacity;

  public House(Room[] rooms, int maxCapacity) {
    this.rooms = rooms;
    this.counterRooms = 0;
    this.maxCapacity = maxCapacity;
  }

  //Metodos
  public void addRoom(Room room){
    if (counterRooms < rooms.length){
      System.out.println("There are spare rooms");
      rooms[counterRooms] = room;
      counterRooms++;
    }else{
      System.out.println("There are not spare rooms");
    }
  }


public void destoryHouse(){
    for (int i = 0; i < counterRooms; i++){
      rooms[i]= rooms[0];
    }
    counterRooms= 0;
    maxCapacity = 0;
  System.out.println("Rooms were destroyed");
}

//TODO finish to print all of house information
  public String showHouseInfo(){
    int emptyRooms = maxCapacity - counterRooms;
    return "Number max of rums: " + maxCapacity + "\n" +
        "Occupied rooms: " + counterRooms + "\n" +
        "Empty Rooms: " + emptyRooms ;
  }

}
