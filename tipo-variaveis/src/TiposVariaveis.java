import java.util.Scanner;

public class TiposVariaveis {
    private String nome;
    private int idade;
    private long cpf;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Informe a idade: ");
        int idade = scanner.nextInt();

        System.out.print("Informe o CPF: ");
        long cpf = scanner.nextLong();

        TiposVariaveis programa = new TiposVariaveis();
        programa.Informacoes(nome, idade, cpf);

        scanner.close();
    }

    void Informacoes(String nome, int idade, long cpf) {
        System.out.println("O usuário " + nome + " com idade " + idade + " e CPF " + cpf + " encontra-se elegível.");
    }
}
