
package BUS;

import DAO.TypeDAO;
import DTO.TypeDTO;
import java.util.ArrayList;

public class TypeBUS {
    private ArrayList<TypeDTO> listType = null;
    private TypeDAO typeDAO = new TypeDAO();
    public void readList(){
        this.listType =  typeDAO.getListType();
    }
    public ArrayList<TypeDTO> getListType(){
        return listType;
    }
      public void insert(TypeDTO type){
        TypeDAO typeDAO = new TypeDAO();
        listType.add(type);
        typeDAO.InsertType(type);
    }
    public void delete(String MaLoai){
       for(TypeDTO Type : listType){
            if(Type.getMaLoai().equals(MaLoai)){
                listType.remove(Type);
                TypeDAO typDAO = new TypeDAO();
                typDAO.DeleteType(MaLoai);
                return;
            }
       }
    }
    public void update(TypeDTO type){
        for(int i = 0;i < listType.size();i++){
            if(listType.get(i).getMaLoai().equals(type.getMaLoai())){
                TypeDAO TypDAO = new TypeDAO();
                TypDAO.UpdateType(type);
            }
        }
    }
}
