/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhofinal.trabalhofinalpooii;

import trabalhofinal.trabalhofinalpooii.decorator.SSD;
import trabalhofinal.trabalhofinalpooii.decorator.Processador;
import trabalhofinal.trabalhofinalpooii.decorator.ComponenteComputador;
import trabalhofinal.trabalhofinalpooii.decorator.pecas.ProcessadorB;
import trabalhofinal.trabalhofinalpooii.decorator.pecas.SSDB;

/**
 *
 * @author Jeferson
 */
/*
    No Factory method, representa o produto concreto.
    São implementações diferentes da interface produto.
*/
public class FabricaAlemanha implements IMontaPecas{

    @Override
    public Processador montaProcessador(ComponenteComputador componenteComputador) {
        return new ProcessadorB(componenteComputador);
    }

    @Override
    public SSD montaSSD(ComponenteComputador componenteComputador) {
        return new SSDB(componenteComputador);
    }
    
}
