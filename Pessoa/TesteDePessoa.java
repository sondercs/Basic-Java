package pessoa;

public class TesteDePessoa {

    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.setCpf("158855701201");
        professor.setNome("Joao");
        professor.setIdade(34);
        professor.setSalario(5000);

        System.out.println(professor.imprimirDadosDaPessoa());

        Aluno aluno = new Aluno();
        aluno.setCpf("323232323232");
        aluno.setIdade(19);
        aluno.setNome("Aline");
        aluno.setMatricula("123456");
       System.out.println(aluno.imprimirDadosDaPessoa());
    }
}
