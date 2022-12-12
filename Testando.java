/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabalhofinal.trabalhofinalpooii;

import trabalhofinal.trabalhofinalpooii.decorator.ComponenteComputador;
import trabalhofinal.trabalhofinalpooii.decorator.Aspire5;
import trabalhofinal.trabalhofinalpooii.decorator.Positivo;
import trabalhofinal.trabalhofinalpooii.observer.Client;
import trabalhofinal.trabalhofinalpooii.observer.Manager;

/**
 *
 * @author Jeferson
 */
public class Testando {
    private static ComputadorCreator compCreator;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }
    
    static void configure() {
        int flag = 0;
        
        Manager manager = new Manager();

        ComponenteComputador aspire5 = new Aspire5();
        ComponenteComputador positivo = new Positivo();
        
        Client cliente01 = new Client("Carlos", aspire5);
        Client cliente02 = new Client("Maria", aspire5);
        Client cliente03 = new Client("Carlita", positivo);
        
        manager.add(cliente03);
        manager.add(cliente01);
        manager.add(cliente02);
        
        manager.remove(cliente02);
        
        if (flag == 1) {
            // Fábrica Alemanha produz equipamentos com peças classe B
            compCreator = new ComputadorConcreteCreatorAlemanha(positivo);
            manager.notifyEveryBody(positivo);
        } else {
            // Fábrica Brasil Produz equipamentos com peças melhores, classe A
            compCreator = new ComputadorConcreteCreatorBrazil(aspire5);
            manager.notifyEveryBody(aspire5);
        }  
    }
    
    static void runBusinessLogic(){
        ComponenteComputador pc = compCreator.addPecas();
        System.out.println(pc.getDescricao());
        System.out.println(pc.getValor());

    }
}
