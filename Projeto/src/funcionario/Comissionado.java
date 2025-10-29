package funcionario;

public class Comissionado extends Funcionario{
    int vendas;
    double taxaComissao;
    double salarioTotal;
    public Comissionado(String nome, int id, double salario, int vendas){
        super(nome, id, salario);
        this.vendas = vendas;
    }

    public double getSalarioTotal(){
        taxaComissao = 60.0;
        salarioTotal = getSalarioLiquido() + (taxaComissao * vendas);
        return salarioTotal;
    }
    public int getVendas(){
        return vendas;
    }
    public void setVendas(int vendas){
        this.vendas = vendas;
    }
}
