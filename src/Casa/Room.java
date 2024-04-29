package Casa;

public class Room {
  private int nRoom;
  private double roomSize; //metros cuadrados

  public Room(int nRoom, double roomSize) {
    this.nRoom = nRoom;
    this.roomSize = roomSize;
  }

  public double getRoomSize() {
    return roomSize;
  }

  public int getnRoom() {
    return nRoom;
  }
}
