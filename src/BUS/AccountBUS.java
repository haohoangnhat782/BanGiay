
package BUS;

import DAO.AccountDAO;
import DTO.AccountDTO;
import java.util.ArrayList;

public class AccountBUS {
    private ArrayList<AccountDTO> listAccount = null;
    private AccountDAO accountDAO = new AccountDAO();
    public void readList(){
        this.listAccount = accountDAO.getListAccount();
    }
    public ArrayList<AccountDTO> getListAccount(){
        return listAccount;
    }
     public void insert(AccountDTO account){
        AccountDAO AccDAO = new AccountDAO();
        listAccount.add(account);
        AccDAO.InsertAccount(account);
    }
    public void delete(String MaNV){
       for(AccountDTO Acc : listAccount){
            if(Acc.getMaNV().equals(MaNV)){
                listAccount.remove(Acc);
                AccountDAO AccDAO = new AccountDAO();
                AccDAO.DeleteAccount(MaNV);
                return;
            }
       }
    }
    public void update(AccountDTO account){
        for(int i = 0;i < listAccount.size();i++){
            if(listAccount.get(i).getMaNV().equals(account.getMaNV())){
                listAccount.set(i, account);
                AccountDAO AccDAO = new AccountDAO();
                AccDAO.UpdateAccount(account);
            }
        }
    }
    
}
