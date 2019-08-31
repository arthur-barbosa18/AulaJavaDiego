import java.text.*;
import java.util.*;     

public class Main {
    public static void main(String[] argv) throws Exception{

        Company company = new Company();
        company.setShoppingCartName(company.pincel);
        company.setShoppingCartName(company.kit1);
        System.out.println("Total do orçamento é " + company.getBudget());

        System.out.println("Imprimindo os uuids dos produtos da company\n");
        System.out.println("id unico do pincel: \t" + company.pincel.getUUID());
        System.out.println("id unico do tinta: \t" + company.tinta.getUUID());
        System.out.println("id unico do kit1: \t" + company.kit1.getUUID());

    }

}
