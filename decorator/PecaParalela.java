/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhofinal.trabalhofinalpooii.decorator;

/**
 *
 * @author Jeferson
 */
public class PecaParalela extends ComponenteComputador {
    private final ComponenteComputador compComputador;
    
    public PecaParalela(ComponenteComputador compComputador){
        this.compComputador = compComputador;
    }
    
    @Override
    public double getValor() {
        return compComputador.getValor() + valor;
    }
    
    @Override
    public String getDescricao() {
        return compComputador.getDescricao() +", "+descricao;
    }
}
