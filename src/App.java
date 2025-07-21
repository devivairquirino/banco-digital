import banco_digital.*;


public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente1 = new Cliente("Ivair");
        Conta cc= new ContaCorrente(cliente1);
        Conta poupanca= new ContaPoupanca(cliente1);

        cc.depositar(1500.00);

       cc.imprimirExtrato();

       cc.transferir(300.0, poupanca);

       poupanca.imprimirExtrato();

       cc.imprimirExtrato();

    
    
    }
}
