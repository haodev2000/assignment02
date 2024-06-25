package InterFace;

import model.Employee;
import model.Room;

import java.util.List;

public interface RoomInterFace {
   void listPhongBan(List<Room> listRoom);
   void createRoom(List<Room> listRoom);
   void createRoomEmployee(List<Room> listRoom, List<Employee> listEmployee , int soLuongRoom);
   void deleteRoom(List<Room> listRoom, int id);

}
