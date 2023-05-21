
package BUS;

import DAO.ProducerDAO;
import DTO.ProducerDTO;
import java.util.ArrayList;

public class ProducerBUS {
    private ArrayList<ProducerDTO> listProducer = null;
    private ProducerDAO producerDAO = new ProducerDAO();
    public void readList(){
        this.listProducer =  producerDAO.getListProducer();
    }
    public ArrayList<ProducerDTO> getListProducer(){
        return listProducer;
    }
     public void insert(ProducerDTO producer){
        ProducerDAO ProDAO = new ProducerDAO();
        listProducer.add(producer);
        ProDAO.InsertProducer(producer);
    }
    public void delete(String MaNSX){
       for(ProducerDTO Pro : listProducer){
            if(Pro.getMaNSX().equals(MaNSX)){
                listProducer.remove(Pro);
                ProducerDAO ProDAO = new ProducerDAO();
                ProDAO.DeleteProducer(MaNSX);
                return;
            }
       }
    }
    public void update(ProducerDTO producer){
        for(int i = 0;i < listProducer.size();i++){
            if(listProducer.get(i).getMaNSX().equals(producer.getMaNSX())){
                listProducer.set(i, producer);
                ProducerDAO ProDAO = new ProducerDAO();
                ProDAO.UpdateProducer(producer);
            }
        }
    }
}
