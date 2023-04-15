import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String nome = "Riquinho";
        String tipoDeConta = "corrente";
        double saldo = 2500;
        Boolean contaAberta = true;

    while(contaAberta){
        System.out.println("Bem vindo ao Banco Mil Maravilhas!");
        System.out.println("*********************************");
        System.out.println("Dados iniciais do Cliente:");
        System.out.println("Nome: " + nome + "\nTipo de Conta:" + tipoDeConta + "\nSaldo Inicial: " + saldo);
        System.out.println("*********************************");

        System.out.println("""
                Operações
                
                1 - Consultar saldos
                2 - Receber Valor
                3 - Transferir valor 
                4 - Sair
                
               
                Digite a operação desejada:   """);

        int opcaoEscolhida = leitura.nextInt();

        if (opcaoEscolhida == 1){
            System.out.println("Seu saldo é de: " + saldo);
        }
        else if(opcaoEscolhida == 2){
            double valorRecebido = leitura.nextDouble();
            saldo += valorRecebido;
        }
        else if(opcaoEscolhida == 3){
            System.out.println("Informe quando deseja transferir: ");
            double valorParaTranferir = leitura.nextDouble();
            if (valorParaTranferir > saldo){
                System.out.println("""
                        Valor maior que o encontrado na conta!
                        Não foi possível realizar a transação""");
            } else{
                saldo -= valorParaTranferir;
                System.out.println("""
                        
                        
                        
                        Transferência realizada com sucesso.
                        
                        
                        
                        
                            """);
            }

        }
        else if (opcaoEscolhida == 4){
            contaAberta = false;
            System.out.println("Banco Mil Maravilhas, sempre com você.");
        }
        else{
            System.out.println("Operação Desconhecida");
        }

        }

    }
}