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



        boolean exit = false;

        while (!exit) {

            System.out.println("----- MENU -----");
            System.out.println("1. Nhập số lượng phòng ban");
            System.out.println("2. Danh sách phòng ban");
            System.out.println("3. Thêm Employee");
            System.out.println("4. Cập nhật Employee");
            System.out.println("5. Xóa Room");
            System.out.println("6. Thoát");
            System.out.print("Chọn chức năng: ");

            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    System.out.print("Nhập số lượng phòng ban: ");
                    int soLuongRoom = sc.nextInt();
                    sc.nextLine(); // Consume newline left-over
                    roomService.createRoomEmployee(listRoom, listEmployee, soLuongRoom);
                    break;

                case 2:
                    System.out.println("---------------Danh sách phòng ban----------------");
                    roomService.listPhongBan(listRoom);
                    break;
                case 3:
                    System.out.println("--------------Thêm Employee-----------------");
                    employeeService.addEmployee(listRoom, listEmployee);

                    break;

//                case 4:
//                    System.out.println("Nhập id nhân viên cần xóa: ");
//                    String removeID =
//                    sc.next();
//                    System.out.println(removeID+"----------");
//                    employeeService.deleteEmployee(listEmployee, removeID);
//                    break;

                case 4:
                    System.out.print("Nhập ID của nhân viên cần cập nhật: ");
                    String idToUpdate = sc.nextLine();
                    employeeService.updateEmployee(listEmployee, idToUpdate);
                    break;

                case 5:
                    System.out.print("Nhập ID room cần xóa: ");
                    int idDelete = sc.nextInt();
                    roomService.deleteRoom(listRoom, idDelete);
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
        sc.close();

//        // Thêm room and employee
//        roomService.createRoomEmployee(listRoom,listEmployee,soLuongRoom);
//
//        // Danh sách phòng ban và nhân viên của phòng
//        System.out.println("---------------Danh sách phòng ban----------------");
//        roomService.listPhongBan(listRoom);
//
////      Thêm Employee
//        System.out.println("--------------Thêm Employee-----------------");
//        employeeService.addEmployee(listRoom, listEmployee);
//        System.out.println("Danh sách nhân viên sau khi thêm ");
//        employeeService.getListEmp(listEmployee);
//
//        // Xóa nhân viên
//        System.out.println("-----------------------------------");
//        System.out.println("Nhập id nhân viên cần xóa : ");
//        int removeID = sc.nextInt();
//        sc.nextLine();
//        employeeService.deleteEmployee(listEmployee, removeID);
//        System.out.println("Danh sách nhân viên sau khi xóa ");
//        employeeService.getListEmp(listEmployee);
//
//
////         Update thông tin nhân viên
//        System.out.println();
//        System.out.println("-----------------Update-------------");
//        System.out.print("Nhập ID của phần tử cần cập nhật: ");
//        String idToUpdate = sc.nextLine();
//        employeeService.updateEmployee(listEmployee,idToUpdate);
//        System.out.println("Danh sách sau khi update Employee có ID = " + idToUpdate);
//        employeeService.getListEmp(listEmployee);
//
//
////      roomService.createRoom(listRoom);
//        System.out.println();
//        System.out.print("Nhập ID room cần xóa: ");
//        int idDelete = sc.nextInt();
//        roomService.deleteRoom(listRoom,idDelete);
//
//        System.out.println("Danh sách sau khi xóa Room có ID = " + idDelete);
//        roomService.listPhongBan(listRoom);




    }


}
