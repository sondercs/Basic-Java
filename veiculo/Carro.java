package veiculo;

public class Carro implements Veiculo{

    //Feita a implementação

    @Override
    public void acelerar() {
       System.out.println("Acelerando o Carro...");
    }

    @Override
    public void freiar() {
       System.out.println("Freando o Carro...");
    }

}

