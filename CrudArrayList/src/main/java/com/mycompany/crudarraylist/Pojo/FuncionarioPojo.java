package com.mycompany.crudarraylist.Pojo;

import java.math.BigInteger;
import java.util.Date;

/**
 *
 * @author Giovanni Pratto
 */
public class FuncionarioPojo extends PessoaPojo{
    
    private int funcionarioID;
    private long  chave;
    private int codigoPais;
    private String dataAdmissao;
    private String ctps;
    private long ctpsNum;
    private int ctpsSerie;
    private String DataInsert;  

    /**
     * @return the funcionarioID
     */
    public int getFuncionarioID() {
        return funcionarioID;
    }

    /**
     * @param funcionarioID the funcionarioID to set
     */
    public void setFuncionarioID(int funcionarioID) {
        this.funcionarioID = funcionarioID;
    }

    /**
     * @return the chave
     */
    public long  getChave() {
        return chave;
    }

    /**
     * @param chave the chave to set
     */
    public void setChave(long  chave) {
        this.chave = chave;
    }

    /**
     * @return the codigoPais
     */
    public int getCodigoPais() {
        return codigoPais;
    }

    /**
     * @param codigoPais the codigoPais to set
     */
    public void setCodigoPais(int codigoPais) {
        this.codigoPais = codigoPais;
    }

    /**
     * @return the dataAdmissao
     */
    public String getDataAdmissao() {
        return dataAdmissao;
    }

    /**
     * @param dataAdmissao the dataAdmissao to set
     */
    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    /**
     * @return the ctps
     */
    public String getCtps() {
        return ctps;
    }

    /**
     * @param ctps the ctps to set
     */
    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    /**
     * @return the ctpsNum
     */
    public long getCtpsNum() {
        return ctpsNum;
    }

    /**
     * @param ctpsNum the ctpsNum to set
     */
    public void setCtpsNum(long ctpsNum) {
        this.ctpsNum = ctpsNum;
    }

    /**
     * @return the ctpsSerie
     */
    public int getCtpsSerie() {
        return ctpsSerie;
    }

    /**
     * @param ctpsSerie the ctpsSerie to set
     */
    public void setCtpsSerie(int ctpsSerie) {
        this.ctpsSerie = ctpsSerie;
    }

    /**
     * @return the DataInsert
     */
    public String getDataInsert() {
        return DataInsert;
    }

    /**
     * @param DataInsert the DataInsert to set
     */
    public void setDataInsert(String DataInsert) {
        this.DataInsert = DataInsert;
    }
    
    //Construtor Vazio
    public FuncionarioPojo(){
        
    }
    
}
