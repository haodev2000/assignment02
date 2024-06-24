package service;

import model.Employee;
import model.Room;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService {



    //List Employee
    public static void getListEmp(List<Employee> list){
        for (Employee e : list){
            System.out.println("STT:" + e.getName() + " ID: " + e.getId()
                    + " NAME:"  + e.getName() + " ROOM:" + e.getRoomName());
        }
    }

    // Add Employee
    public static void addEmployee(ArrayList<Room> listRoom, ArrayList<Employee> listEmployee){
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

        System.out.println("Nhập room: ");
        String roomE = sc.nextLine();
        employee.setRoomName(roomE);

        for (Room r : listRoom){
            if(employee.getRoomName().contains(r.getName())){
                listEmployee.add(employee);
            }else {
                System.out.println("Thêm thất bại !");
            }
        }

    }

    // Delete Employee
    public static void deleteEmployee(List<Employee> listEmployee , int id){
        System.out.println("Danh sách sau khi xóa phần tử có ID = " + id);
        listEmployee.removeIf(item ->Integer.parseInt(item.getId()) == id);
    }

    // Update Employee
    public static void updateEmployee( ArrayList<Employee> listEmployee, String idToUpdate){
        Scanner sc = new Scanner(System.in);
        boolean found = false;

        for (Employee e : listEmployee){
            if(e.getId().equals(idToUpdate)){

                System.out.print("Nhập tên mới cho phần tử: ");
                String newName = sc.nextLine();
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
