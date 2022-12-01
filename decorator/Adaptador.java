/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhofinal.trabalhofinalpooii.decorator;

/**
 *
 * @author Jeferson
 */
public class Adaptador extends ComponenteComputadorParalelo{
    ComponenteComputador componente;
    
    public Adaptador(ComponenteComputador componente){
        this.componente = componente;
    }
    
    @Override
    public String getDescricao(){
        return componente.getDescricao();
    }
    
    @Override
    public double getValor(){
        return componente.getValor();
    }
}
