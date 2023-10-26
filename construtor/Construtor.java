package construtor;

public class Construtor {
    // Um construtor é um metodo especial dentro de uma classe, que ele é chamado quando o metodo dessa classe é chamado ou instanciado.
    private int numero;

    public Construtor(int numero){
        this.numero = numero;
        System.out.println("Construtor com um parametro criado");
    }

    public Construtor(int numero, String texto){
        // Um construtor não possui valor.
        // Respeitar a sequencia.
        this.numero = numero;
        System.out.println("Construtor com 2 parametros criado");

    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    
}
