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
public class ComputadorConcreteCreatorBrazil extends ComputadorCreator{

    public ComputadorConcreteCreatorBrazil(ComponenteComputador compComputador) {
        super(compComputador);
    }

    @Override
    public IMontaPecas montaPecas() {
        return new FabricaBrazil();
    }
    
}
