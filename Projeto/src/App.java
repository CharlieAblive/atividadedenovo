import java.util.Scanner;
import funcionario.*;
public class App {
    public static void main(String[] args) {
        SistemaFuncionario sistema = new SistemaFuncionario();
       // Comissionado comissionado1 = new Comissionado(null, 0, 0, 0);
      //  Assalariado assalariado1 = new Assalariado(null, 0, 0, 0);
        Scanner input = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);
        int opcao;
        //menu 
        do {
            System.out.println("~~~Menu de Funcionários~~~");
            System.out.println("Escolha uma opção:");
            System.out.println("1- Cadastrar novo funcionario");
            System.out.println("2- Exibir informações dos funcionarios");
            System.out.println("3- Exibir total de gastos");
            System.out.println("4- Exibir funcionario com maior pagamento");
            System.out.println("5- Sair");
            opcao = input.nextInt();
            //switch case pras opcoes
            switch (opcao) {
                case 1:
                    System.out.println("Selecione o tipo de funcionário:");
                    System.out.println("1- Horista");
                    System.out.println("2- Comissionado");
                    System.out.println("3- Assalariado");
                    int opcaoCase1 = input.nextInt();
                    //switch case especifico dos funcionarios
                    switch (opcaoCase1) {
                        //funcionario horista
                        case 1:
                            System.out.println("Digite as informações do novo funcionario horista: ");
                            System.out.println("Nome: ");
                            String novoNomeH = inputString.nextLine();
                            System.out.println("ID: ");
                            int novoIdH = input.nextInt();
                            System.out.println("Salário Bruto: ");
                            double novoSalarioH = input.nextDouble();
                            System.out.println("Horas trabalhadas no Mês: ");
                            double novoHorasTrabalhadas = input.nextInt();  
                            sistema.addFuncionarioHorista(novoNomeH, novoIdH, novoSalarioH, novoHorasTrabalhadas);
                            break;
                        //funcionario comissionado
                        case 2:
                            System.out.println("Digite as informações do novo funcionario comissionado: ");
                            System.out.println("Nome: ");
                            String novoNomeC = inputString.nextLine();
                            System.out.println("ID: ");
                            int novoIdC = input.nextInt();
                            System.out.println("Salário Bruto: ");
                            double novoSalarioC = input.nextDouble();
                            System.out.println("Horas trabalhadas no Mês: ");
                            double novoVendas = input.nextInt();  
                            sistema.addFuncionarioHorista(novoNomeC, novoIdC, novoSalarioC, novoVendas);
                            break;
                        //funcionario assalariado
                        case 3:
                            System.out.println("Digite as informações do novo funcionario assalariado: ");
                            System.out.println("Nome: ");
                            String novoNomeA = inputString.nextLine();
                            System.out.println("ID: ");
                            int novoIdA = input.nextInt();
                            System.out.println("Salário Bruto: ");
                            double novoSalarioA = input.nextDouble();
                            System.out.println("Horas trabalhadas no Mês: ");
                            double novoBonusFixo = input.nextInt();  
                            sistema.addFuncionarioHorista(novoNomeA, novoIdA, novoSalarioA, novoBonusFixo);
                            break;
                        default:
                            System.out.println("Opção Inválida");
                            break;
                    }
                    break;

                //informacoes do funcionario
                case 2:
                System.out.println("Funcionarios Horistas:");
                sistema.listarHoristas();
                System.out.println(" ");
                System.out.println("Funcionarios Assalariados:");
                sistema.listarAssalariado();
                System.out.println(" ");
                System.out.println("Funcionarios Comissionados:");
                sistema.listarComissionados();
                System.out.println(" ");

                //gasto total
                case 3:
                    System.out.println("O total de gastos da empresa para este mês é de R$" + sistema.calcularTotalSalarios() +".");
                    break;

                //funcionario com maior salario
                case 4:
                    
                    System.out.println(sistema.funcionarioMaisSalario()1);
                    //if (novoHorista.getSalario() > comissionado1.getSalario() && novoHorista.getSalario() > assalariado1.getSalario()) {
                        //System.out.println("O funcionario " + novoHorista.getNome() + " terá o maior salario este mês." );
                    //} else if (comissionado1.getSalario() > novoHorista.getSalario() && comissionado1.getSalario() > assalariado1.getSalario()) {
                        //System.out.println("O funcionario " + comissionado1.getNome() + " terá o maior salario este mês." );
                    //} else if (assalariado1.getSalario() > comissionado1.getSalario() && assalariado1.getSalario() > novoHorista.getSalario()) {
                        //System.out.println("O funcionario " + assalariado1.getNome() + " terá o maior salario este mês." );
                    //}
                    break;
                default:
                System.out.println("Opção Inválida");
                break;
            }
        } while (opcao != 5);   

    input.close();
    inputString.close();
    } 
}
