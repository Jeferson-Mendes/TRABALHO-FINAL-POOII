/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabalhofinal.trabalhofinalpooii;

import trabalhofinal.trabalhofinalpooii.decorator.ComponenteComputador;
import trabalhofinal.trabalhofinalpooii.decorator.Aspire5;
import trabalhofinal.trabalhofinalpooii.decorator.Positivo;

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
        
        ComponenteComputador aspire5 = new Aspire5();
        ComponenteComputador positivo = new Positivo();
        
        if (flag == 0) {
            // Fábrica Alemanha produz equipamentos com peças classe B
            compCreator = new ComputadorConcreteCreatorAlemanha(positivo);
        } else {
            // Fábrica Brasil Produz equipamentos com peças melhores, classe A
            compCreator = new ComputadorConcreteCreatorBrazil(aspire5);
        }  
    }
    
    static void runBusinessLogic(){
        ComponenteComputador pc = compCreator.addPecas();
        System.out.println(pc.getDescricao());
    }
}
