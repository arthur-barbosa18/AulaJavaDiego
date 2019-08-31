import java.text.*;
import java.util.*;

public class Kit1 extends ProdutoComposto{
    protected ProdutoSimples pincel; 
    protected ProdutoSimples tinta;

    public Kit1(int stock, String name){
        super(stock, name);
        this.uuid = UUID.randomUUID();
        this.pincel = new ProdutoSimples(30, 5, "pincel do kit1");
        this.tinta = new ProdutoSimples(20, 8, "tinta do kit1");
    }

    public float getPrice(){
        return (this.pincel.getPrice() + this.tinta.getPrice());
    }

}