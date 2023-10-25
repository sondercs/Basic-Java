package veiculo;

public class Moto implements Veiculo{

    //Feita a implementação
    @Override
    public void acelerar() {
        System.out.println("Acelerando a Moto...");
    }

    @Override
    public void freiar() {
       System.out.println("Freando a Moto...");
    }
    
}
