package main;

import model.Employee;
import model.Room;
import service.EmployeeService;
import service.RoomService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        EmployeeService employeeService = new EmployeeService();
        RoomService roomService = new RoomService();

//      System.out.println("---------------Danh Sách New Room Employee-------------");
        ArrayList<Room> listRoom = new ArrayList<>();
        ArrayList<Employee> listEmployee = new ArrayList<>();

        System.out.println("Nhập số lượng phòng ban: ");
        int soLuongRoom = sc.nextInt();


        // Thêm room and employee
        roomService.createRoomEmployee(listRoom,listEmployee,soLuongRoom);

        // Danh sách phòng ban và nhân viên của phòng
        System.out.println("---------------Danh sách phòng ban----------------");
        roomService.listPhongBan(listRoom);

//      Thêm Employee
        System.out.println("--------------Thêm Employee-----------------");
        employeeService.addEmployee(listRoom, listEmployee);
        System.out.println("Danh sách nhân viên sau khi thêm ");
        employeeService.getListEmp(listEmployee);

        // Xóa nhân viên
        System.out.println("-----------------------------------");
        System.out.println("Nhập id nhân viên cần xóa : ");
        int removeID = sc.nextInt();
        sc.nextLine();
        employeeService.deleteEmployee(listEmployee, removeID);
        System.out.println("Danh sách nhân viên sau khi xóa ");
        employeeService.getListEmp(listEmployee);


        // Update thông tin nhân viên
        System.out.println();
        System.out.println("-----------------Update-------------");
        System.out.print("Nhập ID của phần tử cần cập nhật: ");
        String idToUpdate = sc.nextLine();
        employeeService.updateEmployee(listEmployee,idToUpdate);
        System.out.println("Danh sách sau khi update Employee có ID = " + idToUpdate);
        employeeService.getListEmp(listEmployee);


//      roomService.createRoom(listRoom);
        System.out.println();
        System.out.print("Nhập ID room cần xóa: ");
        int idDelete = sc.nextInt();
        roomService.deleteRoom(listRoom,idDelete);

        System.out.println("Danh sách sau khi xóa Room có ID = " + idDelete);
        roomService.listPhongBan(listRoom);




    }


}
