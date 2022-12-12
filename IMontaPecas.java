/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package trabalhofinal.trabalhofinalpooii;

import trabalhofinal.trabalhofinalpooii.decorator.SSD;
import trabalhofinal.trabalhofinalpooii.decorator.Processador;
import trabalhofinal.trabalhofinalpooii.decorator.ComponenteComputador;

/**
 *
 * @author Jeferson
 */

/*
    No factory method, representa o produto, interface
    que é comum a todos os objetos e podem
    ser produzidos pelo criador e suas subclasses
*/
public interface IMontaPecas {
    Processador montaProcessador(ComponenteComputador componenteComputador);
    SSD montaSSD(ComponenteComputador componenteComputador);
}
