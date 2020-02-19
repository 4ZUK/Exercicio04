public class Cliente extends Pessoa {
        String cpf;

    public Cliente(String nome, int idade, String cidadeNasc, String cpf) {
        super(nome, idade, cidadeNasc);
        this.cpf = cpf;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
    }
}
