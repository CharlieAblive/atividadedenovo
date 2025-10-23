package funcionario;

public class Horista extends Funcionario{
    private double horasTrabalhadas;
    private double valorHora;

    public Horista(String nome, int id, double salario, double horasTrabalhadas){
        super(nome, id, salario);
        this.horasTrabalhadas = horasTrabalhadas;
    }
    public double calcularPagamento(){
        setSalario(horasTrabalhadas * valorHora);
        if (horasTrabalhadas >= 160){
            setSalario(getSalario()/100 * 10);
        }
        return getSalario();
    }
    public double getHorasTrabalhadas(){
        return horasTrabalhadas;
    }
    public void setHorasTrabalhadas(double horasTrabalhadas){
        this.horasTrabalhadas = horasTrabalhadas;
    }
}
