import java.util.Scanner;

public class Produto implements Imprimivel, Seguranca {

    private String descricao;
    private int quantidade;

    public Produto() {
    }

    public Produto(String d, int q) {
        this.descricao = d;
        this.quantidade = q;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if (descricao.length() >= 2) {
            this.descricao = descricao;
        } else {
            System.out.println("Descrição deve possuir 2 ou mais caracteres.");
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade >= 0) {
            this.quantidade = quantidade;
        } else {
            System.out.println("Quantidade nao pode ser negativa!");
        }
    }

    @Override
    public String formatoString() {
        
        return nlin + "*******************************************" + nlin
             + "************* Produto *********************" + nlin
             + "Descrição: " + getDescricao() + nlin
             + "Quantidade: " + getQuantidade();
    }

    @Override
    public void formatoSystemOut() {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("******** CADASTRAR PRODUTO ********" + nlin);

        System.out.println("Descrição: ");
        setDescricao(sc.nextLine());

        System.out.println("Quantidade: ");
        setQuantidade(sc.nextInt());
        sc.nextLine();
    }

    @Override
    public boolean validar() {
        if (this.quantidade < 10) {
            System.out.println("Estoque abaixo do minimo");
            return false;
        } else {
            System.out.println("Estoque dentro do padrão");
            return true;
        }
    }
}
