package banco_digital;

public interface IConta {
    void sacar(double valor);
    void transferir(double valor, Conta contaDestino);
    void depositar(double valor);
    void imprimirExtrato();
}
