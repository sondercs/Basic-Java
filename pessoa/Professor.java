package pessoa;

public class Professor extends Pessoa{
    
        private double salario;

        public double getSalario(){
            return salario;
        }

        public void setSalario(double salario){
            this.salario = salario;

        }

    // SonbreEscvreveu

    // Observamos que aconteceu um Polimorfismo, onde o metodo se adaptou
    // as carácteristicas de Professor e Aluno
        
        String imprimirDadosDaPessoa(){
            System.out.println(super.imprimirDadosDaPessoa());
            return "Você é um professor";
        }
}
