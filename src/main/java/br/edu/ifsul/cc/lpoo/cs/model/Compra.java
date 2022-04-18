package br.edu.ifsul.cc.lpoo.cs.model;
import java.util.Calendar;
import java.util.List;
/**
 *
 * @author 20201pf.cc0270
 * @data : 18/03/2022
 */
public class Compra {
    private Integer id;
    private Calendar data;
    private Float total;
    private Jogador jogador;//agregação por compsição
    private List<ItensCompra> itens;//agregação por compsição

    public Compra(){

}

}
