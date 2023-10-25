package pessoa;

public class Pessoa {
    // O objeto "Pessoa" tem os seguintes atributos
    // Nome
    // Idade
    // Cpf
    //tipo nomeDaVariavel
    private String nome;
    private int idade;
    private String cpf;

    //Getters & Setters

    //CPF
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    // Idade
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    //Nome
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    String imprimirDadosDaPessoa(){
        return "O nome da pessoa é " + nome + " a idade é "
         + idade + " o seu cpf é " + cpf;

    }

}
