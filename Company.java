import java.text.*;
import java.util.*;

public class Company {
    public ProdutoSimples pincel; 
    public ProdutoSimples tinta;
    public Kit1 kit1;

    public String address;
    public String neighborhood;
    public String city;
    public String state;
    public String name;

    public ArrayList<String> shopping_cart_name;
    public ArrayList<Float> shopping_cart_price;
    public ArrayList<ProdutoSimples> arr_prod_simples;

    public Company(ArrayList<ProdutoSimples> arr_prod_simples){
        this.pincel = new ProdutoSimples(30, 100, "pincel simples");
        this.tinta = new ProdutoSimples(20, 200, "tinta azul");
        this.kit1 = new Kit1(10, "Kit Simples");
        this.shopping_cart_price = new ArrayList<Float>();
        this.shopping_cart_name = new ArrayList<String>();
        this.arr_prod_simples = arr_prod_simples;
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

    public ProdutoSimples getPincel(){
        return this.pincel;
    }

    public ProdutoSimples getTinta(){
        return this.tinta;
    }

    public ProdutoComposto getKit1(){
        return this.kit1;
    }

    public void getArray(){
        for(int i=0; i<arr_prod_simples.size(); i++){
            System.out.println(arr_prod_simples.get(i).getName());
        }
    }


    //Efetuar compra
    //Consequencia é subtrair o estoque dos produtos da company

    //Setar no construtor nome, state, city, e outros dados particulares do company
    // função que retorna ficha da company

}