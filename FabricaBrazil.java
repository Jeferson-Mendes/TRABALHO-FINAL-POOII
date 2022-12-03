/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhofinal.trabalhofinalpooii;

import trabalhofinal.trabalhofinalpooii.decorator.ComponenteComputador;
import trabalhofinal.trabalhofinalpooii.decorator.pecas.ProcessadorA;
import trabalhofinal.trabalhofinalpooii.decorator.pecas.ProcessadorB;
import trabalhofinal.trabalhofinalpooii.decorator.pecas.SSDA;
import trabalhofinal.trabalhofinalpooii.decorator.pecas.SSDB;

/**
 *
 * @author Jeferson
 */
public class FabricaBrazil implements IMontaPecas{

    @Override
    public Processador montaProcessador(ComponenteComputador componenteComputador) {
        return new ProcessadorA(componenteComputador);
    }

    @Override
    public SSD montaSSD(ComponenteComputador componenteComputador) {
        return new SSDA(componenteComputador);
    }
    
}
