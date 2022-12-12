/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhofinal.trabalhofinalpooii;

import trabalhofinal.trabalhofinalpooii.decorator.ComponenteComputador;

/**
 *
 * @author Jeferson
 */
public abstract class ComputadorCreator extends ComponenteComputador{
    
    ComponenteComputador comPc;

    public ComputadorCreator(ComponenteComputador compComputador) {
        this.comPc = compComputador;
    }    
    
    public ComponenteComputador addPecas() {
        IMontaPecas pecas = montaPecas();
        comPc = pecas.montaProcessador(comPc);
        comPc = pecas.montaSSD(comPc);

        return comPc;
    }

    public abstract IMontaPecas montaPecas();
}
