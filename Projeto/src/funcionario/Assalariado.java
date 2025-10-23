package funcionario;

public class Assalariado extends Funcionario{
    double bonusFixo;

    public Assalariado(String nome, int id, double salario, double bonusFixo){
        super(nome, id, salario);
        this.bonusFixo = bonusFixo;
    }
    public double calcularPagamento(){
        setSalario(getSalario() + bonusFixo);
        return getSalario();
    }
    public double getBonus(){
        return bonusFixo;
    }
    public void setBonus(double bonusFixo){
        this.bonusFixo = bonusFixo;
}
}
