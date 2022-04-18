package br.edu.ifsul.cc.lpoo.cs.model;
/**
 *
 * @author 20201pf.cc0270
 * @data : 18/03/2022
 */
public class ItensCompra {
    private Integer id;
    private String quantidade;
    private Float valor;

    private Artefato artefato;
    private Compra compra;//agregação por composição - ref. ent. forte.

    public ItensCompra(){

}
}
