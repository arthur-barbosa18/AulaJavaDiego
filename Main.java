import java.text.*;
import java.util.*;     

public class Main {
    public static void main(String[] argv) throws Exception{

        ArrayList<ProdutoSimples> arr_prod_simples = new ArrayList<ProdutoSimples>();
        int optional;
        Scanner scanner = new Scanner(System.in);
        String name;
        float price;
        int stock;
        while(true){
            System.out.println("Digite o nome do Produto que você quer adicionar a company");
            name = scanner.next();
            System.out.println("Digite o preço do Produto que você quer adicionar a company");
            stock = scanner.nextInt();
            System.out.println("Agora digite o estoque do Produto que você quer adicionar a company");
             price= scanner.nextFloat();
            arr_prod_simples.add(new ProdutoSimples(price, stock, name));
            System.out.println("Deseja continuar inserindo produtos simples nessa comapny?\nDigite 1 para continuar");
            optional = scanner.nextInt();
            if(optional != 1){
                break;
            }
        }

        Company company = new Company(arr_prod_simples);
        company.setShoppingCartName(company.getPincel());
        company.setShoppingCartName(company.getKit1());
        System.out.println("Total do orçamento é " + company.getBudget());

        System.out.println("Imprimindo os uuids dos produtos da company\n");
        System.out.println("id unico do pincel: \t" + company.pincel.getUUID());
        System.out.println("id unico do tinta: \t" + company.tinta.getUUID());
        System.out.println("id unico do kit1: \t" + company.kit1.getUUID());

        //Aqui apenas imprime os nomes da lista de produtos simples que o usuario adicionou a company
        company.getArray();
    }

}
