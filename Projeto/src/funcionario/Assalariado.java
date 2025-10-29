package funcionario;

public class Assalariado extends Funcionario{
    double bonusFixo;
    double salarioTotal;

    public Assalariado(String nome, int id, double salario, double bonusFixo){
        super(nome, id, salario);
        this.bonusFixo = bonusFixo;
    }
    public double getSalarioTotal(){
        salarioTotal = getSalarioLiquido() + bonusFixo;
        return salarioTotal;
    }

    public double getBonus(){
        return bonusFixo;
    }
    public void setBonus(double bonusFixo){
        this.bonusFixo = bonusFixo;

}
}
