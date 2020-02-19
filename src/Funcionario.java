public class Funcionario extends Pessoa {
    int matricula;

    public Funcionario(String nome, int idade, String cidadeNasc, int matricula) {
        super(nome, idade, cidadeNasc);
        this.matricula = matricula;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
    }
}
