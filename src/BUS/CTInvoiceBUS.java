
package BUS;

import DAO.CTInvoiceDAO;
import DTO.CTInvoiceDTO;
import java.util.ArrayList;

public class CTInvoiceBUS {
    private ArrayList<CTInvoiceDTO> listInvoice = null;
    private CTInvoiceDAO ctinvoiceDAO = new CTInvoiceDAO();
    public void readList(){
        this.listInvoice = ctinvoiceDAO.getListCTInvoice();
    }
    public ArrayList<CTInvoiceDTO> getListCTInvoiceTheoMaHD(String MaHD){
        ArrayList<CTInvoiceDTO> list = new ArrayList();
        for(CTInvoiceDTO x : listInvoice){
            if(x.getMaHD().equals(MaHD)){
                list.add(x);
            }
        }
        return list;
    }
    public void insert(CTInvoiceDTO in){
        listInvoice.add(in);
        CTInvoiceDAO ctinvoiceDAO = new CTInvoiceDAO();
        ctinvoiceDAO.InsertCTInvoice(in);
    }
}
