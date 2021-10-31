package Model;
/**
 * @author wilsonjacoud
 */
public abstract class Conta {
    protected final int agencia;
    protected final int numero;
    protected final Cliente cliente;
    protected float saldo;
    
    public Conta(int agencia, int numero, Cliente cliente, float saldo){
        this.agencia = agencia;
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public float getSaldo() {
        return saldo;
    }
    
    public boolean Sacar(float valor){
        if(valor > 0 && saldo >= valor){
            this.saldo -= valor;
            return true;
        }
        return false;
    }
    
    public boolean Depositar(float valor){
        if(valor > 0){
            this.saldo += valor;
            return true;
        }
        return false;
    }
    
    public Conta Transferir(Conta contaDestino, float valor){
        if (this.Sacar(valor)){
            contaDestino.Depositar(valor);
            return contaDestino;
        }
        return contaDestino;
    }
}
