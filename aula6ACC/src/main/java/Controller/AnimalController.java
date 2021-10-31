/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Animal;
import Model.Ave;
import Model.Cachorro;

/**
 *
 * @author wilsonjacoud
 */
public class AnimalController {
    private Animal animal;
    private Ave ave;
    
    public AnimalController(Animal animal) {
        this.animal = animal;
    }
    
    public AnimalController(){
        this.ave = ave;
    }
    
    public String Alimentarse(){
        if (this.animal != null){
            return this.animal.Alimentarse();
        }else if(this.ave != null){
            return this.ave.Alimentarse();
        }
        return null;
    }
   
    public void Crescer(int idade){
        if (this.animal != null){
            this.animal.Crescer(idade);
        }
    }
    
    public String Voar(){
        if (this.animal instanceof Ave){
            return this.ave.Voar();
        }
        return "Esse animal não voa";
    }
}
