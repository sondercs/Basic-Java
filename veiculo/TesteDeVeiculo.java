package veiculo;

public class TesteDeVeiculo {
    public static void main(String[] args) {
        // Interfaces não podem ser instanciadas pois eu preciso de um objeto.
        Veiculo carro = new Carro();
        Veiculo moto = new Moto();

        carro.acelerar();
        carro.freiar();

        moto.acelerar();
        moto.freiar();
    }
    
}


// Com isso podemos ver mais uma forma para executar o Polimorfismo
// Ultilizando a implementação.