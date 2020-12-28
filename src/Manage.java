import java.util.Map;
import java.util.TreeMap;

public class Manage {
    Map<Integer, Bill> listBill = new TreeMap<>();
    public void addBill(Bill bill){
        int key = bill.getClientID();
        listBill.put(key,bill);
    }
    public int getTotalMoneyById(int clientId){
        Bill bill=listBill.get(clientId);
       return bill.getTotalMoney();
    }
    public void displayAll(){
        System.out.println(listBill);
    }
}
