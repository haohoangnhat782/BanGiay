
package BUS;

import DAO.EmployeeDAO;
import DTO.EmployeeDTO;
import java.util.ArrayList;

public class EmployeeBUS{
    private ArrayList<EmployeeDTO> listEmployee = new ArrayList<>();
    private ArrayList<String> listMaNV = null;
    private EmployeeDAO EmployeeDAO = new EmployeeDAO();
    
    public void readList(){
        this.listEmployee = EmployeeDAO.getListEmployee();       
    }
    public ArrayList<EmployeeDTO> getListEmployee(){
        return listEmployee;
    }
     public void readMaNV(){
        this.listMaNV = EmployeeDAO.getListMaNV();
    }
    public ArrayList<String> getListMaKH(){
        return listMaNV;
    }
    public void insert(EmployeeDTO employee){
        EmployeeDAO EmpDAO = new EmployeeDAO();
        listEmployee.add(employee);
        EmpDAO.InsertEmployee(employee);
    }
    public void delete(String MaNV){
       for(EmployeeDTO Emp : listEmployee){
            if(Emp.getMaNV().equals(MaNV)){
                listEmployee.remove(Emp);
                EmployeeDAO EmpDAO = new EmployeeDAO();
                EmpDAO.DeleteEmployee(MaNV);
                return;
            }
       }
    }
    public void update(EmployeeDTO employee){
        for(int i = 0;i < listEmployee.size();i++){
            if(listEmployee.get(i).getMaNV().equals(employee.getMaNV())){
                listEmployee.set(i, employee);
                EmployeeDAO EmpDAO = new EmployeeDAO();
                EmpDAO.UpdateCustomer(employee);
            }
        }
    }
    public void ExportExcel(){
        EmployeeDAO.ExportExcel();
    }
}
