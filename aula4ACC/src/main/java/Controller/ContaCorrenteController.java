package Controller;
/**
 * @author wilsonjacoud
 */
import Model.*;

public class ContaCorrenteController {
    public static boolean Sacar(ContaCorrente conta, float valor){
        if(conta != null){
            return conta.Sacar(valor);
        }
        return false;
    }
    
    public static boolean Depositar(ContaCorrente conta, float valor){
        if(conta != null){
            return conta.Depositar(valor);
        }
        return false;
    }
    
    public static float obterSaldo(ContaCorrente conta){
        if(conta != null){
            return conta.getSaldo();
        }
        return 0;
    }     
}
