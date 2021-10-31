/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.AnimalController;
import Model.Alimentacao;
import Model.Cachorro;
import Model.Aguia;

/**
 *
 * @author wilsonjacoud
 */
public class Main {
    public static void main(String[] args) {
        //Instancias
        Cachorro cachorro = new Cachorro("Pedro", 1, "Bob", 30, 15, Alimentacao.Onivoro);
        Aguia aguia = new Aguia(true, 500, "Juju", 20, 10, Alimentacao.Carnivoro);
        
        //Metodos
        AnimalController cachorroController = new AnimalController(cachorro);
        System.out.println(cachorroController.Alimentarse());
        
        AnimalController aguiaController = new AnimalController(aguia);
        System.out.println(aguiaController.Alimentarse()); 
    }
}
