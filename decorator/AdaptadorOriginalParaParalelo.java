/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhofinal.trabalhofinalpooii.decorator;

/**
 *
 * @author Jeferson
 */
public class AdaptadorOriginalParaParalelo extends Peca{
    PecaParalela pecaParalela;

    public AdaptadorOriginalParaParalelo(ComponenteComputador compComputador, PecaParalela pecaParalela) {
        super(compComputador);
        this.pecaParalela = pecaParalela;
    }
    
    @Override
    public String getDescricao(){
        return pecaParalela.getDescricao();
    }
    
    @Override
    public double getValor(){
        return pecaParalela.getValor();
    }
}
