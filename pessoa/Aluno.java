package pessoa;

public class Aluno extends Pessoa{
    
        private String matricula;

        public String getMatricula(){
            return matricula;
        }

        public void  setMatricula(String matricula){
            this.matricula = matricula;
        }
        
        // Observamos que aconteceu um Polimorfismo, onde o metodo se adaptou
        // as carácteristicas de Professor e Aluno
        String imprimirDadosDaPessoa(){
            System.out.println(super.imprimirDadosDaPessoa());
            return "Você é um aluno";
        }

}
