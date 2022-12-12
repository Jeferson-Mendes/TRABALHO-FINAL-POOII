/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhofinal.trabalhofinalpooii.decorator.pecas;

import trabalhofinal.trabalhofinalpooii.decorator.Processador;
import trabalhofinal.trabalhofinalpooii.decorator.ComponenteComputador;

/**
 *
 * @author Jeferson
 */
public class ProcessadorA extends Processador{
    
    public ProcessadorA(ComponenteComputador compComputador) {
        super(compComputador);
        setDescricao("Processador Intel core i9 12ª geração");
        setValor(2000);
    }
    
}
