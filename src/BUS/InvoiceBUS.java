
package BUS;

import DAO.InvoiceDAO;
import DTO.InvoiceDTO;
import java.util.ArrayList;

public class InvoiceBUS {
    private ArrayList<InvoiceDTO> listInvoice = null;
    private InvoiceDAO  invoiceDAO = new InvoiceDAO();
    public void readList(){
        this.listInvoice = invoiceDAO.getListInvoice();
    }
    public ArrayList<InvoiceDTO> getListInvoice(){
        return listInvoice;
    }
    public void insert(InvoiceDTO in){
        listInvoice.add(in);
        InvoiceDAO invoiceDAO = new InvoiceDAO();
        invoiceDAO.InsertInvoice(in);
    }
    public ArrayList<InvoiceDTO> getSearch(String sql){
        this.listInvoice = invoiceDAO.Search(sql);
        return listInvoice;
    }
    
}
