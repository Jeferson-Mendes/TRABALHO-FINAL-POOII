/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhofinal.trabalhofinalpooii.observer;

import trabalhofinal.trabalhofinalpooii.decorator.ComponenteComputador;

/**
 *
 * @author Jeferson
 */
public class Client implements IListener{

    private final String name;
    ComponenteComputador componenteComputador;
    
    public Client(String name, ComponenteComputador comp){
        this.name = name;
        this.componenteComputador = comp;
    }

    public ComponenteComputador getComponenteComputador() {
        return componenteComputador;
    }
    
    @Override
    public void update(ComponenteComputador compPc) {
        System.out.println("Notify user about computer. User: " + name + ". Computer: " + compPc.getDescricao());
    }
    
}
