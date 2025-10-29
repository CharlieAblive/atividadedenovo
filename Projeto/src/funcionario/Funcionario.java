package funcionario;

public abstract class Funcionario {
    private String nome;
    private int id;
    private double salarioLiquido;

    public Funcionario(String nome, int id, double salarioLiquido){
        this.nome = nome;
        this.id = id;
        this.salarioLiquido = salarioLiquido;
    }

    public String getNome(){
        return nome;
    }

    public int getId(){
        return id;
    }

    public double getSalarioLiquido(){
        return salarioLiquido;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Erro");
        }
    }
    public void setId(int id) {
        if (id >= 0) {
            this.id = id;
        } else {
            System.out.println("Erro");
        }
    }

    public void setSalario(double salarioLiquido) {
        if (salarioLiquido >= 0) {
            this.salarioLiquido = salarioLiquido;
        } else {
            System.out.println("Erro");
        }
    }

    public abstract double getSalarioTotal();

}