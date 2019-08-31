import java.text.*;
import java.util.*;

public class Company {
    public Pincel pincel; 
    public Tinta tinta;
    public Kit1 kit1;
    public String address;
    public String neighborhood;
    public String city;
    public String state;
    public String name;
    public ArrayList<String> shopping_cart_name;
    public ArrayList<Float> shopping_cart_price;


    public Company(){
        this.pincel = new Pincel(30, 5, "pincel simples");
        this.tinta = new Tinta(20, 8, "tinta azul");
        this.kit1 = new Kit1(10, "Kit Simples");
        this.shopping_cart_price = new ArrayList<Float>();
        this.shopping_cart_name = new ArrayList<String>();
    }

    public void setShoppingCartName(Produto produto){
        shopping_cart_name.add(produto.getName());
        shopping_cart_price.add(produto.getPrice());
    }



    public float getBudget(){
        float total_price = 0;

        System.out.println("\n-----Orçamento--------\nProduto:\tPreço\n");

        for(int index=0; index<shopping_cart_price.size(); index++){
            System.out.println(shopping_cart_name.get(index) +"\t" + shopping_cart_price.get(index));
            total_price += shopping_cart_price.get(index);
        }
        System.out.println("\n----------------------\n");

        return total_price;
    }

    //Efetuar compra
    //Consequencia é subtrair o estoque dos produtos da company

    //Setar no construtor nome, state, city, e outros dados particulares do company
    // função que retorna ficha da company

}