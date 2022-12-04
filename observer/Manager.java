/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhofinal.trabalhofinalpooii.observer;

import java.util.ArrayList;
import trabalhofinal.trabalhofinalpooii.decorator.ComponenteComputador;

/**
 *
 * @author Jeferson
 */
public class Manager implements ISubject{
    private final ArrayList<Client> clients = new ArrayList();
    
    @Override
    public void add(Client c) {
        clients.add(c);
    }

    @Override
    public void remove(Client c) {
        clients.remove(c);
    }

    @Override
    public void notify(Client c, ComponenteComputador componenteComputador) {
        String paramComputer = componenteComputador.getDescricao();
        String clientComputer = c.getComponenteComputador().getDescricao();
        
        if(paramComputer == clientComputer) {
            c.update(c.getComponenteComputador());
        }
    }

    @Override
    public void notifyEveryBody(ComponenteComputador componenteComputador) {
        for(Client client: clients) {
            String paramComputer = componenteComputador.getDescricao();
            String clientComputer = client.getComponenteComputador().getDescricao();
            
            if(paramComputer == clientComputer) {
                client.update(client.getComponenteComputador());
            }
        }
    }
    
}
