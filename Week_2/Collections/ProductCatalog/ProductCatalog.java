package Week_2.Collections.ProductCatalog;


import java.util.HashSet;

public class ProductCatalog {
public static void main(String[] args) {
    Methods m=new Methods();
    m.addProduct("Happy");
    m.addProduct("Sad");
    m.removeProduct("Sad");
    m.searchProduct("Sad");
    m.searchProduct("Happy");
    m.displayProducts();

}   

}
class Methods {
    HashSet<String> hs=new HashSet<>();
    public void addProduct(String productName) {
        hs.add(productName);
    }
    public void removeProduct(String productName){
        hs.remove(productName);
    }
    public void searchProduct(String productName)
    {
        boolean b=hs.contains(productName);
        System.out.println(b);
    }
    public void displayProducts()
    {
        for (String s : hs) {
            System.out.println(s);
        }
    }
}