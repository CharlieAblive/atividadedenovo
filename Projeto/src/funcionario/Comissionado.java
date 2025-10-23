package funcionario;

public class Comissionado extends Funcionario{
    int vendas;
    double taxaComissao;
    public Comissionado(String nome, int id, double salario, int vendas){
        super(nome, id, salario);
        this.vendas = vendas;
    }

    public double calcularPagamento(){
        taxaComissao = 60.0;
        setSalario(getSalario() + (taxaComissao * vendas));
        return getSalario();
    }
    public int getVendas(){
        return vendas;
    }
    public void setVendas(int vendas){
        this.vendas = vendas;
    }
}
