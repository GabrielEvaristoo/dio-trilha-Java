import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);

        int conta = 0;
        String nome = "";
        String agencia = "";
        double saldoDisponivel = 320.0;

        while (true) {
            System.out.println("Informe sua conta (deve ser um número inteiro):");
            String contaCliente = usuario.nextLine();

            if (contaCliente.matches("\\d+")) {
                conta = Integer.parseInt(contaCliente);
                break;
            } else {
                System.out.println("Por favor, informe um número de conta válido.");
            }
        }

        while (true) {
            System.out.println("Informe sua agência (exemplo: 874-1):");
            agencia = usuario.nextLine();

            if (agencia.matches("\\d{3}-\\d{1}")) {
                break;
            } else {
                System.out.println("Por favor, digite a agência no formato correto (exemplo: 874-1).");
            }
        }

        while (nome.isEmpty()) {
            System.out.println("Digite seu nome:");
            nome = usuario.nextLine();
            if (nome.isEmpty()) {
                System.out.println("Por favor, digite um nome válido.");
            }
        }

        while (true) {
            System.out.println("Quanto você deseja sacar?");
            String saqueStr = usuario.nextLine();

            if (saqueStr.matches("^\\d+(\\.\\d+)?$")) {
                double saque = Double.parseDouble(saqueStr);

                if (saque > saldoDisponivel) {
                    System.out.println("O valor excede seu saldo disponível de " + saldoDisponivel);
                } else {
                    System.out.println("Deseja confirmar o saque de: " + saque + " da sua conta? (sim/nao)");
                    String confirmacao = usuario.nextLine();

                    if (confirmacao.equalsIgnoreCase("sim")) {
                        System.out.println("Olá, " + nome + "! Obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + conta + " e seu saldo é de " + saldoDisponivel + ". O saque de " + saque + " foi realizado com sucesso.");
                        saldoDisponivel -= saque;
                        break;
                    } else {
                        System.out.println("Saque cancelado.");
                    }
                }
            } else {
                System.out.println("Por favor, informe um valor de saque válido.");
            }
        }
    }
}