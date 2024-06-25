package InterFace;

import model.Employee;
import model.Room;

import java.util.ArrayList;
import java.util.List;

public interface EmployeeInterface {
    void getListEmp(List<Employee> list);
    void addEmployee(ArrayList<Room> listRoom, ArrayList<Employee> listEmployee);
    void deleteEmployee(List<Employee> listEmployee , String id);
    void updateEmployee( ArrayList<Employee> listEmployee, String idToUpdate);

}
