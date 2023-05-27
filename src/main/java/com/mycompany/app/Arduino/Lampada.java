package com.mycompany.app.Arduino;

public class Lampada implements Iluminador{

    boolean ligado = false;

    public void ligar(){
        this.ligado = true;
    }

    public void desligar(){
        this.ligado = false;
    }

    public void exibir(){
        if(ligado){
            System.out.println("Led acesso!!");
        }else{
            System.out.println("Led apagado!!");
        }
    }
        
    

    
}