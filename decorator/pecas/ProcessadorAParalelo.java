/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhofinal.trabalhofinalpooii.decorator.pecas;

import trabalhofinal.trabalhofinalpooii.decorator.ComponenteComputador;
import trabalhofinal.trabalhofinalpooii.decorator.PecaParalela;

/**
 *
 * @author Jeferson
 */
public class ProcessadorAParalelo extends PecaParalela {

    public ProcessadorAParalelo(ComponenteComputador compComputador) {
        super(compComputador);
        setDescricao("Processador i3 paralelo");
        setValor(500);
    }

}
