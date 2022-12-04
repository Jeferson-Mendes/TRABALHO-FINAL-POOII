/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package trabalhofinal.trabalhofinalpooii.observer;

import trabalhofinal.trabalhofinalpooii.decorator.ComponenteComputador;

/**
 *
 * @author Jeferson
 */
public interface ISubject {
    void add(Client c);
    void remove(Client c);
    void notify(Client c, ComponenteComputador componenteComputador);
    void notifyEveryBody(ComponenteComputador componenteComputador);
}
