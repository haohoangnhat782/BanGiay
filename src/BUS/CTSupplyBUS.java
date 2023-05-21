
package BUS;

import DAO.CTSupplyDAO;
import DTO.CTSupplyDTO;
import java.util.ArrayList;

public class CTSupplyBUS {
     private ArrayList<CTSupplyDTO> listSupply = null;
    private CTSupplyDAO ctinvoiceDAO = new CTSupplyDAO();
    public void readList(){
        this.listSupply = ctinvoiceDAO.getListCTSupply();
    }
    public ArrayList<CTSupplyDTO> getListCTInvoiceTheoMaHD(String MaNH){
        ArrayList<CTSupplyDTO> list = new ArrayList();
        for(CTSupplyDTO x : listSupply){
            if(x.getMaNH().equals(MaNH)){
                list.add(x);
            }
        }
        return list;
    }
    public void insert(CTSupplyDTO su){
        listSupply.add(su);
        CTSupplyDAO ctsupplyDAO = new CTSupplyDAO();
        ctsupplyDAO.InsertCTSupply(su);
    }
}
