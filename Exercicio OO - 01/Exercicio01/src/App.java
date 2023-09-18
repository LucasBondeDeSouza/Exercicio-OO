import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Usuario usuario = new Usuario();
        Produto produto = new Produto();

        int resp;
        String menu = "\nEscolha o que você quer cadastrar: \n" +
                      "| 1 - Pessoa | 2 - Produto | 3 - Sair |";

        do {
            System.out.println(menu);
            resp = (sc.nextInt());

            if (resp == 1) {
                usuario.formatoSystemOut();
                System.out.println(usuario.formatoString());

                if (usuario.validar()) {
                    System.out.println("Usuário e Senha corretos!");
                } else {
                    System.out.println("Fata Usuário ou Senha!");
                }

            } else if (resp == 2) {
                produto.formatoSystemOut();
                System.out.println(produto.formatoString());

            } else if (resp == 3) {
                System.out.println("FIM!");

            } else {
                System.out.println("Opção Inválida. Tente Novamente!");
            }

        } while (resp != 3);
    }
}