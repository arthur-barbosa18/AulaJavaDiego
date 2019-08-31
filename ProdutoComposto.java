import java.text.*;
import java.util.*;

public abstract class ProdutoComposto extends Produto{
    public ProdutoComposto(int stock, String name){
        this.name = name;
        this.uuid = UUID.randomUUID();
        this.stock = stock;
    }
}