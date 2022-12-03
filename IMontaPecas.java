/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package trabalhofinal.trabalhofinalpooii;

import trabalhofinal.trabalhofinalpooii.decorator.ComponenteComputador;

/**
 *
 * @author Jeferson
 */
public interface IMontaPecas {
    Processador montaProcessador(ComponenteComputador componenteComputador);
    SSD montaSSD(ComponenteComputador componenteComputador);
}
