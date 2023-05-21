
package BUS;

import DAO.InvoiceDAO;
import DAO.SupplyDAO;
import DTO.SupplyDTO;
import java.util.ArrayList;

public class SupplyBUS {
    private ArrayList<SupplyDTO> listSupply = null;
    private SupplyDAO  invoiceDAO = new SupplyDAO();
    public void readList(){
        this.listSupply = invoiceDAO.getListSupply();
    }
    public ArrayList<SupplyDTO> getListSupply(){
        return listSupply;
    }
    public void insert(SupplyDTO su){
        listSupply.add(su);
        SupplyDAO supplyDAO = new SupplyDAO();
        supplyDAO.InsertSupply(su);
    }
     public ArrayList<SupplyDTO> getSearch(String sql){
        this.listSupply = invoiceDAO.Search(sql);
        return listSupply;
    }
}
