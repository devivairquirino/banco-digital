public class App {
    public static void main(String[] args) throws Exception {
        Conta cc= new ContaCorrente();
        Conta poupanca= new ContaPoupanca();

        cc.depositar(1500.00);

       cc.imprimirExtrato();

       cc.transferir(300.0, poupanca);

       poupanca.imprimirExtrato();

       cc.imprimirExtrato();
    
    
    }
}
