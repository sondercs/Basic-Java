package excecoes;

public class Excecoes {
    
    // Conteudo:
    // Checked Exceptions
    // Unchecked Exceptions

    public static void main(String[] args){
        // Código: int numero = 10;
        // Código: if(numero < 100){
            // Caso for colocado apenas "throw new Exception("O numero é menor que 100");" 
            // A mensagem de erro irá dizer que temos uma "Checked Exception"
            // Ele adiciona o tipo de exceção do erro
        // Código: throw new Exception("O numero é menor que 100");
            // Resposta do console: "Exception in thread "main" java.lang.Exception: O numero é menor que 100
            // at excecoes.Excecoes.main(Excecoes.java:15)"

        
            // Try - Catch 

        // try{
        //    validaNumero();
        // }catch(Exception e){
        //    System.out.println("Deu ruim tropa");
        //    e.printStackTrace();
        //}

        }
        public static void validaNumero() throws Exception{
            int numero = 10;
            if (numero < 100){
                throw new Exception("O numero é menor que 100");
        }
    }
}




