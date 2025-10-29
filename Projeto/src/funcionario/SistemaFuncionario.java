package funcionario;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SistemaFuncionario {
    private List<Horista> listHorista;
    private List<Comissionado> listComissionado;
    private List<Assalariado> listAssalariado;
    Scanner input = new Scanner(System.in);
    Scanner inputString = new Scanner(System.in);
    int i = 0;

    public SistemaFuncionario() {
        listHorista = new ArrayList<Horista>();
        listComissionado = new ArrayList<Comissionado>();
        listAssalariado = new ArrayList<Assalariado>();
    }

    public double calcularTotalSalarios(){
        double totalSalarioAssalariado = 0;
        double totalSalarioComissionado = 0;
        double totalSalarioHorista = 0;

        for(Horista h : listHorista){
            totalSalarioHorista = h.getSalarioTotal(); 
        }

        for(Comissionado c : listComissionado){
            totalSalarioComissionado = c.getSalarioTotal(); 
        }

        for(Assalariado a : listAssalariado){
            totalSalarioAssalariado = a.getSalarioTotal(); 
        }
        double totalSalarios = totalSalarioHorista + totalSalarioComissionado + totalSalarioAssalariado;
        return totalSalarios;
    }

    public double funcionarioMaisSalario(){
        
        for(Horista h : listHorista){
            double maior = Collections.max(h.getSalarioTotal());
        }
    }
    

    public void listarHoristas() {
    for (int i = 0; i < listHorista.size(); i++) {
    System.out.println(listHorista.get(i));
        }
    }

    public void listarComissionados() {
    for (int i = 0; i < listComissionado.size(); i++) {
    System.out.println(listComissionado.get(i));
        }
    }

    public void listarAssalariado() {
    for (int i = 0; i < listAssalariado.size(); i++) {
    System.out.println(listAssalariado.get(i));
        }
    }


    public void addFuncionarioHorista(String nome, int id, double salario, double horasTrabalhadas){
        listHorista.add(new Horista(nome, id, salario, horasTrabalhadas));
        for (i = 0; i < listHorista.size(); i++) {
        }
        System.out.println("Funcionario adicionado.");
    }
    public void addFuncionarioComissionado(String nome, int id, double salario, int vendas){
        for (i = 0; i < listComissionado.size(); i++) {
        }
        listComissionado.add(new Comissionado(nome, id, salario, vendas));
        System.out.println("Funcionario adicionado.");
    }
    public void addFuncionarioAssalariado(String nome, int id, double salario, double bonusFixo){
        for (i = 0; i < listAssalariado.size(); i++) {
        }
        listAssalariado.add(new Assalariado(nome, id, salario, bonusFixo));
        System.out.println("Funcionario adicionado.");
    }
    
}
