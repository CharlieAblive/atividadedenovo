package funcionario;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaFuncionario {
    private ArrayList listFuncionarios;
    Scanner input = new Scanner(System.in);
    Scanner inputString = new Scanner(System.in);
    int i;
    public void SistemaFuncionarios() {
        listFuncionarios = new ArrayList<>();
    }

    public void addFuncionarioHorista(){
        for (i = 0; i < listFuncionarios.size(); i++) {
        }
        Horista novoHorista = new Horista(null, 0, 0, 0);
        System.out.println("Digite as informações do novo funcionario horista: ");
        System.out.println("Nome: ");
        novoHorista.setNome(inputString.nextLine());
        System.out.println("ID: ");
        novoHorista.setId(input.nextInt());
        System.out.println("Salário Bruto: ");
        novoHorista.setSalario(input.nextDouble());
        System.out.println("Horas trabalhadas no Mês: ");
        novoHorista.setHorasTrabalhadas(input.nextInt());  
        System.out.println("Funcionario adicionado.");
        listFuncionarios.add(i, novoHorista);

    }
    public void addFuncionarioComissionado(){
        listFuncionarios.add(new Comissionado(null, 0, 0, 0));
    }
    public void addFuncionarioAssalariado(){
        listFuncionarios.add(new Assalariado(null, 0, 0, 0));
    }
    
}
