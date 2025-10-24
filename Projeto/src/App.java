import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import funcionario.*;
public class App {
    public static void main(String[] args) {
        Horista horista;
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
           // System.out.println("2- Exibir informações dos funcionarios");
           // System.out.println("3- Exibir total de gastos");
           // System.out.println("4- Exibir funcionario com maior pagamento");
            System.out.println("5- Sair");
            opcao = input.nextInt();
            //switch case pras opcoes
            switch (opcao) {
                case 1:
                    System.out.println("Selecione o tipo de funcionário:");
                    System.out.println("1- Horista");
                   // System.out.println("2- Comissionado");
                   // System.out.println("3- Assalariado");
                    int opcaoCase1 = input.nextInt();
                    //switch case especifico dos funcionarios
                    switch (opcaoCase1) {
                        //funcionario horista
                        case 1:
                            horista.addFuncionarioHorista();
                            break;
                        //funcionario comissionado
                        case 2:
                           // System.out.println("Digite as informações do novo funcionario comissionado: ");
                           // System.out.println("Nome: ");
                           // comissionado1.setNome(inputString.nextLine());
                           // System.out.println("ID: ");
                           // comissionado1.setId(input.nextInt());
                           // System.out.println("Salário Bruto: ");
                           // comissionado1.setSalario(input.nextDouble());
                           // System.out.println("Total de vendas no mês ");
                          //  comissionado1.setVendas(input.nextInt());  
                           // comissionado1 = new Comissionado(comissionado1.getNome(), comissionado1.getId(), comissionado1.getSalario(), comissionado1.getVendas());  
                           // System.out.println("Funcionario adicionado.");
                            break;
                        //funcionario assalariado
                        case 3:
                          //  System.out.println("Digite as informações do novo funcionario assalariado: ");
                          //  System.out.println("Nome: ");
                          //  assalariado1.setNome(inputString.nextLine());
                          //  System.out.println("ID: ");
                          //  assalariado1.setId(input.nextInt());
                          //  System.out.println("Salário Bruto: ");
                          //  assalariado1.setSalario(input.nextDouble());
                          //  System.out.println("Bônus fixo");
                          //  assalariado1.setBonus(input.nextDouble());  
                          //  assalariado1 = new Assalariado(assalariado1.getNome(), assalariado1.getId(), assalariado1.getSalario(), assalariado1.getBonus());  
                          //  System.out.println("Funcionario adicionado.");
                            break;
                        default:
                            System.out.println("Opção Inválida");
                            break;
                    }
                    break;
                //informacoes do funcionario
                case 2:
                    //System.out.println(novoHorista[i].getNome() + " " + novoHorista.getId() + " " + novoHorista.getSalario() + ".");
                   // System.out.println(comissionado1.getNome() + " " + comissionado1.getId() + " " + comissionado1.getSalario() + ".");
                  //  System.out.println(assalariado1.getNome() + " " + assalariado1.getId() + " " + assalariado1.getSalario() + ".");
                    break;
                //gasto total
                case 3:
                    //double gastoTotal = novoHorista.getSalario() + comissionado1.getSalario() + assalariado1.getSalario();
                    //System.out.println("O total de gastos da empresa para este mês é de R$" + gastoTotal + ".");
                    break;
                //funcionario com maior salario
                case 4:
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
