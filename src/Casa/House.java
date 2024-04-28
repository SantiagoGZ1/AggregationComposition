package Casa;

public class House {
  private Room[] rooms;
  private int counterRooms;
  private int maxCapacity;

  public House(Room[] rooms, int counterRooms, int maxCapacity) {
    this.rooms = new Room[maxCapacity];
    this.counterRooms = 0;
    this.maxCapacity = 100;
  }

  //Metodos
  public void AddRoom(Room room){
    if (counterRooms < rooms.length){
      System.out.println("There are spare rooms");
      rooms[counterRooms] = room;
      counterRooms++;
    }else{
      System.out.println("There are not spare rooms");
      System.exit(0);
    }
  }

  public void destroyHouse(){ //Delete all rooms
    for (int i = 0; i < counterRooms; i++){
      rooms[i] = null;
    }
    counterRooms = 0;
  }

//TODO finish to print all of house information
  public String showHouseInfo(){
    return "Number max of rums: " + maxCapacity + "\n" +
        "Occupied rooms: " + counterRooms;
  }

}
