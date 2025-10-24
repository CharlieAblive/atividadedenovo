package funcionario;

public abstract class Funcionario {
    private String nome;
    private int id;
    private double salario;

    public Funcionario(String nome, int id, double salario){
        this.nome = nome;
        this.id = id;
        this.salario = salario;
    }

    public String getNome(){
        return nome;
    }

    public int getId(){
        return id;
    }

    public double getSalario(){
        return salario;
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

    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            System.out.println("Erro");
        }
    }

    public abstract double calcularPagamento();

}