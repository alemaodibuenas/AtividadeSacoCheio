package com.mycompany.crudarraylist.Dao;
import com.mycompany.crudarraylist.FakeDB.*;
import com.mycompany.crudarraylist.Pojo.*;
import java.util.*;

/**
 *
 * @author Giovanni Pratto
 */
public class FuncionarioDao {
    //Construtor da Classe e popula o banco
    public FuncionarioDao(){
        FuncionarioFakeDB.getFuncionarios();
    } 
    //Adiciona um Funcionario
    public void create(FuncionarioPojo pojo){
        FuncionarioFakeDB.getFuncionarios().add(pojo);        
    }
    //lista todos os funcionarios
    public ArrayList<FuncionarioPojo> readAll(){
        return FuncionarioFakeDB.getFuncionarios();
    }
    //Busca funcionario pelo id, remove e adiciona um novo elemento
    public void update(FuncionarioPojo pojo){
        FuncionarioPojo busca = this.search(pojo.getFuncionarioID());
        FuncionarioFakeDB.getFuncionarios().remove(busca);
        FuncionarioFakeDB.getFuncionarios().add(pojo);
    }
    //busca funcionario pelo id e deleta o funcionario
    public void delete(int funcioarioID){
        FuncionarioPojo busca = this.search(funcioarioID);
        FuncionarioFakeDB.getFuncionarios().remove(busca);
    }
    //busca funcionario pelo id
    public FuncionarioPojo read(int funcionarioID){
        return this.search(funcionarioID);        
    }
    //metodo search que usa lambda para buscar um funcionario pelo id 
    public FuncionarioPojo search(int id){
        return FuncionarioFakeDB.getFuncionarios().stream()
                .filter(l -> l.getFuncionarioID() == id)
                .findFirst()
                .orElse(null);
    }    
}
