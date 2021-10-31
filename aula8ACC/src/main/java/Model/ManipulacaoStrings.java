/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author wilsonjacoud
 */
public class ManipulacaoStrings {
    public static char retornarChar(String texto, int posicao){
        return texto.charAt(posicao);
    }
    
    public static String Concatenacao(String textoOri, String textoConca){
        return textoOri.concat(textoConca);
    }
    
    public static boolean iniciaCom(String texto, String procura){
        return texto.startsWith(procura);
    }
    
    public static String[] divideString(String texto){
        return texto.split(",");
    }
    public static String AlterarTexto(String textoOri, String sai, String entra){
        return textoOri.replace(sai, entra);
    }
}
