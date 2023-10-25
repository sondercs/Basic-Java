package Conta;

public class ContaBancaria {
    

        private String numero;
        private String titular;
        private double saldo;

        // Getters & Setters - Encapsulamento 
        public ContaBancaria(){
            saldo = 0.0;
        }

        //Numero
        public void setNumero(String numero){
            this.numero = numero;
        }
        public String getNumero(){
            return this.numero;
        }
        //Titular

        public void setTitular(String titular) {
            this.titular = titular;
        }
        public String getTitular() {
            return titular;
        }

        //Saldo
        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }
        public double getSaldo() {
            return saldo;
        }

        //Fim dos Getters & Setters

        //Depositar
        void depositar(double valor){
            if(valor > 0 ){
                saldo = saldo + valor;
                System.out.println("Depósito de R$" + valor + ". Saldo atual R$" + saldo);


            }else{
                System.out.println("Valor inválido para depósito");
            }
        }

        // Sacar
        void sacar(double valor){
            if (valor > 0 && valor <= saldo) {
                saldo = saldo - valor;
                System.out.println("Saque de R$ "+valor+". Saldo atual: R$"+saldo);
        }   
    }
}