/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhofinal.trabalhofinalpooii.decorator.pecas;

import trabalhofinal.trabalhofinalpooii.decorator.ComponenteComputador;
import trabalhofinal.trabalhofinalpooii.decorator.Peca;

/**
 *
 * @author Jeferson
 */
public class ProcessadorB extends Peca{
    
    public ProcessadorB(ComponenteComputador compComputador) {
        super(compComputador);
        setDescricao("Processador Intel core i5 11ª geração.");
    }
    
}
