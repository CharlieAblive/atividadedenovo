import java.util.Scanner;
import funcionario.*;
public class App {
    public static void main(String[] args) {
        Horista horista1 = new Horista(null, 0, 0, 0);
        Comissionado comissionado1 = new Comissionado(null, 0, 0, 0);
        Assalariado assalariado1 = new Assalariado(null, 0, 0, 0);
        Scanner input = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);
        int opcao = input.nextInt();
        System.out.println("teste");
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
                            horista1 = new Horista(horista1.getNome(), horista1.getId(), horista1.getSalario(), horista1.getHorasTrabalhadas());  
                            break;
                        case 2:
                            System.out.println("Digite as informações do novo funcionario comissionado: ");
                            System.out.println("Nome: ");
                            comissionado1.setNome(inputString.nextLine());
                            System.out.println("ID: ");
                            comissionado1.setId(input.nextInt());
                            System.out.println("Salário Bruto: ");
                            comissionado1.setSalario(inputString.nextDouble());
                            System.out.println("Total de vendas no mês ");
                            comissionado1.setVendas(input.nextInt());  
                            comissionado1 = new Comissionado(comissionado1.getNome(), comissionado1.getId(), comissionado1.getSalario(), comissionado1.getVendas());  
                            break;
                        case 3:
                            System.out.println("Digite as informações do novo funcionario assalariado: ");
                            System.out.println("Nome: ");
                            assalariado1.setNome(inputString.nextLine());
                            System.out.println("ID: ");
                            assalariado1.setId(input.nextInt());
                            System.out.println("Salário Bruto: ");
                            assalariado1.setSalario(inputString.nextDouble());
                            System.out.println("Total de vendas no mês ");
                            assalariado1.setBonus(input.nextInt());  
                            assalariado1 = new Assalariado(assalariado1.getNome(), assalariado1.getId(), assalariado1.getSalario(), assalariado1.getBonus());  
                            break;
                        default:
                            System.out.println("Opção Inválida");
                            break;
                    }
                    break;
                case 2:
                    System.out.println(horista1.getNome() + " " + horista1.getId() + " " + horista1.getSalario() + ".");
                    System.out.println(comissionado1.getNome() + " " + comissionado1.getId() + " " + comissionado1.getSalario() + ".");
                    System.out.println(assalariado1.getNome() + " " + assalariado1.getId() + " " + assalariado1.getSalario() + ".");
                    break;
                case 3:
                    double gastoTotal = horista1.getSalario() + comissionado1.getSalario() + assalariado1.getSalario();
                    System.out.println("O total de gastos da empresa para este mês é de R$" + gastoTotal + ".");
                    break;
                case 4:
                    if (horista1.getSalario() > comissionado1.getSalario() && horista1.getSalario() > assalariado1.getSalario()) {
                        System.out.println("O funcionario " + horista1.getNome() + " terá o maior salario este mês." );
                    } else if (comissionado1.getSalario() > horista1.getSalario() && comissionado1.getSalario() > assalariado1.getSalario()) {
                        System.out.println("O funcionario " + comissionado1.getNome() + " terá o maior salario este mês." );
                    } else if (assalariado1.getSalario() > comissionado1.getSalario() && assalariado1.getSalario() > horista1.getSalario()) {
                        System.out.println("O funcionario " + assalariado1.getNome() + " terá o maior salario este mês." );
                    }
                    break;
                default:

            }
        } while (opcao != 5);   

    input.close();
    inputString.close();
    } 
}
