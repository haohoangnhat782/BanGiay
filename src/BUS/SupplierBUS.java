
package BUS;

import DAO.SupplierDAO;
import DTO.SupplierDTO;
import java.util.ArrayList;


public class SupplierBUS {
    private ArrayList<SupplierDTO> listSupplier = null;
    private SupplierDAO supplierDAO = new SupplierDAO();
    public void readList(){
        this.listSupplier = supplierDAO.getListSupplier();
    }
    public ArrayList<SupplierDTO> getListSupplier(){
        return listSupplier;
    }
     public void insert(SupplierDTO supplier){
        SupplierDAO SupDAO = new SupplierDAO();
        listSupplier.add(supplier);
        SupDAO.InsertSupplier(supplier);
    }
    public void delete(String MaNCC){
       for(SupplierDTO Sup : listSupplier){
            if(Sup.getMaNCC().equals(MaNCC)){
                listSupplier.remove(Sup);
                SupplierDAO SupDAO = new SupplierDAO();
                SupDAO.DeleteSupplier(MaNCC);
                return;
            }
       }
    }
    public void update(SupplierDTO supplier){
        for(int i = 0;i < listSupplier.size();i++){
            if(listSupplier.get(i).getMaNCC().equals(supplier.getMaNCC())){
                listSupplier.set(i, supplier);
                SupplierDAO SupDAO = new SupplierDAO();
                SupDAO.UpdateSupplier(supplier);
            }
        }
    }
    public ArrayList<SupplierDTO> getSearch(String sql){
        this.listSupplier = supplierDAO.Search(sql);
          for(SupplierDTO x: listSupplier){
                System.out.println(x.getMaNCC());
            }
        return listSupplier;
    }
    public void ExportExcel(){
        SupplierDAO supplierDAO = new SupplierDAO();
        supplierDAO.ExportExcel();
    }
}
