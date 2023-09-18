import java.util.Scanner;

public class Usuario  extends Pessoa implements Imprimivel, Seguranca {

    private String nomeUsuario;
    private String senha;

    public Usuario() {
    }

    public Usuario(String nu, String s) {
        this.setNomeUsuario(nu);
        this.setSenha(s);
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String formatoString() {
        
        return nlin + "*******************************************" + nlin
             + "************* Usuário *********************" + nlin
             + "Nome Completo: " + this.getNomeCompleto() + nlin
             + "Idade: " + this.getIdade() + nlin
             + "Nome Usuário: " + this.getNomeUsuario() + nlin
             + "Senha: " + this.getSenha();
    }

    @Override
    public void formatoSystemOut() {
        Scanner sc = new Scanner(System.in);

        System.out.println("******** CADASTRAR PESSOA ********" + nlin);

        System.out.println("Digite o Nome Completo: ");
        setNomeCompleto(sc.nextLine());

        System.out.println("Digite a Idade: ");
        setIdade(sc.nextInt());
        sc.nextLine();

        System.out.println("Digite o Nome de Usuário: ");
        setNomeUsuario(sc.nextLine());

        System.out.println("Digite a Senha: ");
        setSenha(sc.nextLine());
    }

    @Override
    public boolean validar() {
        if (this.nomeUsuario.equals("") || this.senha.equals("")) {
            System.out.println("Senha e/ou Usuário em branco");
            return false;
        }
        return true;
    }
}