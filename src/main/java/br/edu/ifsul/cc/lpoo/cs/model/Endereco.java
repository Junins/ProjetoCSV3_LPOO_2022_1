package br.edu.ifsul.cc.lpoo.cs.model;

/**
 *
 * @author 20201pf.cc0270
 * @data : 11/03/2022
 */
public class Endereco {
    //atributos seguindo a nomenclatura de DC.
    private Integer id;
    private String cep;
    private String complemento;

    public Endereco(){//construtor sem parametros.

    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * @return the complemento
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * @param complemento the complemento to set
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}
