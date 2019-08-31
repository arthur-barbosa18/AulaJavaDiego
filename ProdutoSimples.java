import java.text.*;
import java.util.*;

public class ProdutoSimples extends Produto{
    public ProdutoSimples(float price, int stock, String name){
        this.name = name;
        this.price = price;
        this.uuid = UUID.randomUUID();
        this.stock = stock;
    }  

    public float getPrice(){
        return this.price;
    }

}