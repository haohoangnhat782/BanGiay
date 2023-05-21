
package BUS;

import DAO.CustomerDAO;
import DTO.CustomerDTO;
import java.util.ArrayList;

public class CustomerBUS {
    private ArrayList<CustomerDTO> listCustomer = null;
    private CustomerDAO customerDAO = new CustomerDAO();
    private ArrayList<String> listMaKH = null;
    
    public void readList(){
        this.listCustomer = customerDAO.getListCustomer(); 
    }
     public ArrayList<CustomerDTO> getListCustomer() {
        return listCustomer;
    }
     
    public void readMaKH(){
        this.listMaKH = customerDAO.getListMaKH();
    }
    public ArrayList<String> getListMaKH(){
        return listMaKH;
    }
    public void insert(CustomerDTO customer){
        CustomerDAO CusDAO = new CustomerDAO();
        listCustomer.add(customer);
        CusDAO.InsertCustomer(customer);
    }
    public void delete(String MaKH){
       for(CustomerDTO Cus : listCustomer){
            if(Cus.getMaKH().equals(MaKH)){
                listCustomer.remove(Cus);
                CustomerDAO CusDAO = new CustomerDAO();
                CusDAO.DeleteCustomer(MaKH);
                return;
            }
       }
    }
    public void update(CustomerDTO customer){
        for(int i = 0;i < listCustomer.size();i++){
            if(listCustomer.get(i).getMaKH().equals(customer.getMaKH())){
                listCustomer.set(i, customer);
                CustomerDAO CusDAO = new CustomerDAO();
                CusDAO.UpdateCustomer(customer);
            }
        }
    }
    public ArrayList<CustomerDTO> getSearch(String sql){
        this.listCustomer = customerDAO.Search(sql);
        return listCustomer;
    }
    public void ExportExcel(){
        CustomerDAO customerDAO = new CustomerDAO();
        customerDAO.ExportExcel();
    }
}
