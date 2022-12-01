/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabalhofinal.trabalhofinalpooii;

import trabalhofinal.trabalhofinalpooii.decorator.Adaptador;
import trabalhofinal.trabalhofinalpooii.decorator.ComponenteComputador;
import trabalhofinal.trabalhofinalpooii.decorator.ComponenteComputadorParalelo;
import trabalhofinal.trabalhofinalpooii.decorator.Computador01;
import trabalhofinal.trabalhofinalpooii.decorator.ComputadorParalelo01;
import trabalhofinal.trabalhofinalpooii.decorator.pecas.ProcessadorA;
import trabalhofinal.trabalhofinalpooii.decorator.pecas.ProcessadorAParalelo;
import trabalhofinal.trabalhofinalpooii.decorator.pecas.SsdA;

/**
 *
 * @author Jeferson
 */
public class Testando {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ComponenteComputador compPc = new Computador01();
//        ComponenteComputadorParalelo compPcParalelo = new ComputadorParalelo01();
        
//        ComponenteComputador test = new Adaptador(new ProcessadorAParalelo(compPcParalelo));;
        
//        compPc = new ProcessadorA(compPc);
        compPc = new SsdA(compPc);

        ComponenteComputadorParalelo compParalelo = new Adaptador(compPc);
        compParalelo = new ProcessadorAParalelo(compParalelo);
        
        System.out.println(compParalelo.getDescricao());
        System.out.println(compPc.getDescricao());
        System.out.println(compParalelo.getValor());
        System.out.println(compPc.getValor());
    }
    
}
