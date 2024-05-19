import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {

        ArrayList<Produto> list = new ArrayList<Produto>();

        Produto pro1 = new Produto ("X-salada", 12.00, 10);
        Produto pro2 = new Produto ("Kikao", 10.00, 5);
        Produto pro3 = new Produto ("Refrigerante em lata", 6.00, 9);

        list.add(pro1);
        list.add(pro2);
        list.add(pro3);

        System.out.println("O produto 1 eh: " + pro1.getDescricao()+ " " + "R$"+ pro1.getValor()  + "\n " + pro1.getQuantidade() + " disponível");

        System.out.println("\nO produto 2 eh: " + pro2.getDescricao()+ " " + "R$" + pro2.getValor() + "\n " + pro2.getQuantidade() + " disponível");

        System.out.println("\nO produto 3 eh: " + pro3.getDescricao()+ " " + "R$" + pro3.getValor() + "\n " + pro3.getQuantidade() + " disponível");
    }
}
