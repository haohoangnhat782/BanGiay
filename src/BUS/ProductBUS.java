
package BUS;

import DAO.ProductDAO;
import DTO.ProductDTO;
import java.util.ArrayList;

public class ProductBUS {
    private ArrayList<ProductDTO> listProduct = null;
    private ProductDAO productDAO = new ProductDAO();
    public void readList(){
        this.listProduct = productDAO.getListProduct();
    }
    public ArrayList<ProductDTO> getListProduct(){
        return listProduct;
    }
    public ArrayList<ProductDTO> getListTheoMaNCC(String MaNCC){
        listProduct.clear();
        this.listProduct = productDAO.getListProductTheoMaNCC(MaNCC);
       
        return listProduct;
    }
    public void insert(ProductDTO product){
        ProductDAO ProDAO = new ProductDAO();
        listProduct.add(product);
        ProDAO.InsertProduct(product);
    }
    public void delete(String MaSP){
       for(ProductDTO Pro : listProduct){
            if(Pro.getMaSP().equals(MaSP)){
                listProduct.remove(Pro);
                ProductDAO ProDAO = new ProductDAO();
                ProDAO.DeleteProduct(MaSP);
                return;
            }
       }
    }
    public void update(ProductDTO product){
        for(int i = 0;i < listProduct.size();i++){
            if(listProduct.get(i).getMaSP().equals(product.getMaSP())){
                listProduct.set(i, product);
                ProductDAO ProDAO = new ProductDAO();
                ProDAO.UpdateProduct(product);
            }
        }
    }
    public void updateSoLuong(ProductDTO product){
        for(int i = 0;i < listProduct.size();i++){
            if(listProduct.get(i).getMaSP().equals(product.getMaSP())){
                listProduct.set(i, product);
                ProductDAO ProDAO = new ProductDAO();
                ProDAO.UpdateSoLuong(product);
            }
        }
    }
    
     public ArrayList<ProductDTO> getSearch(String sql){
        this.listProduct = productDAO.Search(sql);
        return listProduct;
    }
    public void ExportExcel(){
        ProductDAO productDAO = new ProductDAO();
        productDAO.ExportExcel();
    }
}
