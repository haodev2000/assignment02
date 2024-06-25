package service;

import model.Employee;
import model.Room;
import InterFace.EmployeeInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements EmployeeInterface {


    RoomService roomService = new RoomService();

    //List Employee
    @Override
    public void getListEmp(List<Employee> list){
        for (Employee e : list){
            System.out.println("STT:" + e.getStt() + " ID: " + e.getId()
                    + " NAME:"  + e.getName() + " ROOM:"
                    + e.getRoomF() != null ? e.getRoomF().getName() : "None");
        }
    }

    // Add Employee
    @Override
    public void addEmployee(ArrayList<Room> listRoom, ArrayList<Employee> listEmployee){
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.println("Nhập stt: ");
        int stt = sc.nextInt();
        employee.setStt(stt);

        sc.nextLine();

        System.out.println("Nhập id: ");
        String idE = sc.nextLine();
        employee.setId(idE);


        System.out.println("Nhập name: ");
        String nameE = sc.nextLine();
        employee.setName(nameE);

        System.out.println("Nhập age: ");
        int ageE = sc.nextInt();
        employee.setAge(ageE);
        sc.nextLine();

        //
        for (Room r : listRoom) {
            System.out.println("ID: " + r.getId() + "   Name:" + r.getName());
        }
        System.out.println("Nhập id room: ");
        String roomID = sc.nextLine();


        Room room = new Room();
        for (Room r : listRoom) {
           if(r.getId().equals(roomID)){
               room = r;
               roomService.addEmployeetoRoom(room, employee);

           }
        }
        employee.setRoomF(room);

        listEmployee.add(employee);

//        for (Room r : listRoom){
//            if(employee.getRoomName().contains(r.getName())){
//                listEmployee.add(employee);
//            }else {
//                System.out.println("Thêm thất bại !");
//
//            }
//        }

    }

    @Override
    public void deleteEmployee(List<Employee> listEmployee, String id) {
        Employee e = null;

        for (int i  = 0; i < listEmployee.size();i++){
            if((listEmployee.get(i).getId()).equals(id)){
                e = listEmployee.get(i);
                Room r = e.getRoomF();
                roomService.deleteEmployeeinRoom(r, e);
                listEmployee.remove(e);
                System.out.println("Xóa thành công !");
                break;
            }

        }

        if (e==null){
            System.out.println("Xóa không thành công !");
        }
    }

    // Delete Employee

//    public void deleteEmployee(List<Employee> listEmployee , String id){
//        System.out.println("Danh sách sau khi xóa phần tử có ID = " + id);
//        Employee e;
//        for (int i  = 0; i < listEmployee.size();i++){
//            if(listEmployee.get(i).getId().equals(id)){
//                e = listEmployee.get(i);
//                Room r = e.getRoomF();
//                roomService.deleteEmployeeinRoom(r, e);
//                break;
//            }
//
//        }
////        roomService.deleteEmployeeinRoom();
////        listEmployee.removeIf(item ->item.getId().equals(id));
//    }

    // Update Employee
    @Override
    public void updateEmployee( ArrayList<Employee> listEmployee, String idToUpdate){
        Scanner sc = new Scanner(System.in);
        boolean found = false;

        for (Employee e : listEmployee){
            if(e.getId().equals(idToUpdate)){

                System.out.print("Nhập tên mới cho phần tử: ");
                String newName = sc.next();
                e.setName(newName);
                found = true;
                break;
            }
        }
        if (found){
            System.out.println("Update thành công !");
        }else {
            System.out.println("Update thất bại !");
        }
    }

}
