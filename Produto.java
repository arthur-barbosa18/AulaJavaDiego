import java.text.*;
import java.util.*;

public abstract class Produto
{
    public String name;
    protected UUID uuid;
    protected float price;
    protected int stock;

    public abstract float getPrice();
    //public abstract void modifyStock(int modifier);

    public int getStock(){
        return this.stock;
    }
    
    public String getName(){
        return this.name;
    }
    public void setStock(int stock){
        this.stock=stock;
    }

    public void setPrice(float price){
        this.price = price;
    }

    public UUID getUUID(){
        return this.uuid;
    }

    
    public void modifyStock(int modifier){
        this.stock = this.stock + modifier;
    }

}

 
