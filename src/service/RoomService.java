package service;

import model.Employee;
import model.Room;
import InterFace.RoomInterFace;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RoomService implements RoomInterFace {

    // Get list room
    @Override
    public void listPhongBan(List<Room> listRoom) {
        for (Room room : listRoom) {
            System.out.println("Số thứ tự:" + room.getStt() +
                    " ID:" + room.getId() + " Name:" + room.getName());

            System.out.println("Danh sách nhân viên của phòng " + room.getName());
            for (Employee emp : room.getEmployees()) {
                System.out.println("     Số thứ tự:" + emp.getStt() +
                        " ID:" + emp.getId() + " Name:" + emp.getName());
            }

            System.out.println();
        }
    }

    // Create Room
    @Override
    public void createRoom(List<Room> listRoom){
        System.out.println("--------------Thêm Room-----------------");
        Scanner sc = new Scanner(System.in);
        // Nhập danh sách room
        System.out.println("Nhập tên phòng ban:  ");
        String nameRoom = sc.nextLine();
        Room room = new Room();
        room.setName(nameRoom);

        listRoom.add(room);

        // Danh sách phòng ban mới
        System.out.println("Danh sách phòng ban hiện tại: ");
        for (Room r : listRoom){
            System.out.print(r.getName()+" ");
        }
    }

    // Create Room and Add employee
    @Override
    public void createRoomEmployee(List<Room> listRoom, List<Employee> listEmployee ,int soLuongRoom){

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < soLuongRoom; i++){
            System.out.println("Nhập phòng ban số " + (i+1));

            Room room = new Room();

            System.out.println("Nhập stt: ");
            int stt = sc.nextInt();
            room.setStt(stt);

            sc.nextLine();

            System.out.println("Nhập id: ");
            String id = sc.nextLine();
            room.setId(id);

            System.out.println("Nhập name: ");
            String name = sc.nextLine();
            room.setName(name);



            System.out.println("---------------" + "Danh Sách Employee phòng: " + room.getName() + "-------------");


            System.out.println("Nhập số lượng nhân viên: ");
            int soLuongEmployee = sc.nextInt();
            sc.nextLine();

            ArrayList<Employee> listEmp = new ArrayList<>();

            for (int j = 0; j < soLuongEmployee; j++){
                System.out.println("Nhập Employee thứ " + (j+1));

                Employee emp = new Employee();

                System.out.println("Nhập stt: ");
                int sttE = sc.nextInt();
                emp.setStt(sttE);

                sc.nextLine();

                System.out.println("Nhập id: ");
                String idE = sc.nextLine();
                emp.setId(idE);


                System.out.println("Nhập name: ");
                String nameE = sc.nextLine();
                emp.setName(nameE);

                System.out.println("Nhập age: ");
                int ageE = sc.nextInt();
                emp.setAge(ageE);



                listEmp.add(emp);
                listEmployee.add(emp);

            }
            room.setEmployees(listEmp);

            listRoom.add(room);

        }
    }

    // Delete room
    @Override
    public void deleteRoom(List<Room> listRoom, int id){
        listRoom.removeIf(item ->Integer.parseInt(item.getId()) == id);
    }


    @Override
    public void deleteEmployeeinRoom(Room room, Employee e){
       room.getEmployees().remove(e);
    }

    @Override
    public void addEmployeetoRoom(Room r , Employee e){

        r.getEmployees().add(e);
    }

}
