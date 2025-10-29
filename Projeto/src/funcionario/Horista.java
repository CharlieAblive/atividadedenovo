package funcionario;
import java.util.Scanner;

public class Horista extends Funcionario{
    private double horasTrabalhadas;
    private double valorHora;
    private double salarioTotal;
    Scanner input = new Scanner(System.in);
    Scanner inputString = new Scanner(System.in);
    int i;

    public Horista(String nome, int id, double salarioLiquido, double horasTrabalhadas){
        super(nome, id, salarioLiquido);
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getSalarioTotal(){
        valorHora = (10/getSalarioLiquido()) * 100;
        double bonusHora = horasTrabalhadas * valorHora;
        
        if (horasTrabalhadas >= 160){
            salarioTotal = bonusHora + getSalarioLiquido();
        }
        return salarioTotal;
    }
    
    public double getHorasTrabalhadas(){
        return horasTrabalhadas;
    }
    public void setHorasTrabalhadas(double horasTrabalhadas){
        this.horasTrabalhadas = horasTrabalhadas;
    }

}