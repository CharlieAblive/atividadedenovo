import java.util.Scanner;
import funcionario.*;
public class App {
    public static void main(String[] args) throws Exception {
        Horista horista1 = new Horista(null, 0, 0, 0);
        Comissionado comissionado1 = new Comissionado(null, 0, 0, 0);
        Assalariado assalariado1 = new Assalariado(null, 0, 0, 0);
        Scanner input = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);
        int opcao = input.nextInt();
        do {
            System.out.println("Menu de Funcionários");
            System.out.println("Escolha uma opção:");
            System.out.println("1- Cadastrar novo funcionario");
            System.out.println("2- Exibir informações dos funcionarios");
            System.out.println("3- Exibir total de gastos");
            System.out.println("4- Exibir funcionario com maior pagamento");
            System.out.println("5- Sair");
            
            switch (opcao) {
                case 1:
                    System.out.println("Selecione o tipo de funcionário:");
                    System.out.println("1- Horista");
                    System.out.println("2- Comissionado");
                    System.out.println("3- Assalariado");
                    int opcaoCase1 = input.nextInt();
                    switch (opcaoCase1) {
                        case 1:
                            System.out.println("Digite as informações do novo funcionario horista: ");
                            System.out.println("Nome: ");
                            horista1.setNome(inputString.nextLine());
                            System.out.println("ID: ");
                            horista1.setId(input.nextInt());
                            System.out.println("Salário Bruto: ");
                            horista1.setSalario(inputString.nextDouble());
                            System.out.println("Horas trabalhadas no Mês: ");
                            horista1.setHorasTrabalhadas(input.nextInt());
                            Horista novoHorista = new Horista();
                            break;
                    
                        default:
                            break;
                    }
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                default:

            }
        } while (opcao != 5);   
    } 
}
