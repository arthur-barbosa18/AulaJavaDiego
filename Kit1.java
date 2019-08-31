import java.text.*;
import java.util.*;

public class Kit1 extends ProdutoComposto{
    protected Pincel pincel; 
    protected Tinta tinta;

    public Kit1(int stock, String name){
        super(stock, name);
        this.uuid = UUID.randomUUID();
        this.pincel = new Pincel(30, 5, "pincel do kit1");
        this.tinta = new Tinta(20, 8, "tinta do kit1");
    }

    public float getPrice(){
        return (this.pincel.getPrice() + this.tinta.getPrice());
    }

    public void modifyStock(int modifier){
        this.stock = this.stock + modifier;
    }

}