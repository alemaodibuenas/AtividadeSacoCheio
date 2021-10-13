package com.mycompany.crudarraylist.Service;
import com.mycompany.crudarraylist.Dao.*;
import com.mycompany.crudarraylist.Pojo.*;
import java.util.Scanner;

/**
 *
 * @author Giovanni Pratto
 */
public class FuncionarioService {
    
    private Scanner sc;
    
    int op;
    
    private FuncionarioDao dao;
    
    private MenuService menu;
    
    
    public FuncionarioService(){
        this.menu = new MenuService();
        this.sc = new Scanner(System.in);
        this.dao = new FuncionarioDao();
    }

    public void adicionarFuncionario(){        
        System.out.print("+-----------------------------------------+\n");
        System.out.print("|         Cadastrar Funcionário           |\n");
        System.out.print("+-----------------------------------------+\n");
        System.out.printf("FuncionarioID  : \n");int funcionarioID = this.sc.nextInt();
        System.out.printf("Chave          : \n");int chave = this.sc.nextInt();
        System.out.printf("Nome           : \n");String nome = this.sc.next();
        System.out.printf("SobreNome      : \n");String sobreNome = this.sc.next();
        System.out.printf("Sexo           : \n");String sexo = this.sc.next();
        System.out.printf("DataNascimento : \n");String dataNascimento = this.sc.next();
        System.out.printf("Email          : \n");String email = this.sc.next();
        System.out.printf("CodigoPais     : \n");int codigoPais = this.sc.nextInt();
        System.out.printf("DataAdmissao   : \n");String dataAdmissao = this.sc.next();
        System.out.printf("Ctps           : \n");String ctps = this.sc.next();
        System.out.printf("CtpsNum        : \n");int ctpsNum = this.sc.nextInt();
        System.out.printf("CtpsSerie      : \n");int ctpsSerie = this.sc.nextInt();
        System.out.printf("DataInsert     : \n");String dataInsert = this.sc.next();
        System.out.printf("|**********************************************\n"); 
        
        FuncionarioPojo pojo = new FuncionarioPojo();
        pojo.setFuncionarioID(funcionarioID);
        pojo.setChave(chave);
        pojo.setNome(nome);
        pojo.setSobreNome(sobreNome);
        pojo.setSexo(sexo);
        pojo.setDataNascimento(dataNascimento);
        pojo.setEmail(email);
        pojo.setCodigoPais(codigoPais);
        pojo.setDataAdmissao(dataAdmissao);
        pojo.setCtps(ctps);
        pojo.setCtpsNum(ctpsNum);
        pojo.setCtpsSerie(ctpsSerie);
        pojo.setDataInsert(dataInsert);
        this.dao.create(pojo);
        
        if (this.dao.read(funcionarioID) != null){
            System.out.println("| Funcionário adicionado com sucesso.");
            System.out.print("|**********************************************\n");
            this.menu.load();
        }
        else{
            System.out.println("| Erro ao adicionar funcionário.");
            System.out.print("|**********************************************\n");
            this.menu.load();
        }      

    }
    
    public void listarFuncionarios(){        
        System.out.print("+-----------------------------------------+\n");
        System.out.print("|            Listar Funcionários          |\n");
        System.out.print("+-----------------------------------------+\n");
        for (FuncionarioPojo item : this.dao.readAll()) {
            System.out.printf("| FuncionarioID  : %d\n", item.getFuncionarioID());
            System.out.printf("| Chave          : %d\n", item.getChave());
            System.out.printf("| Nome           : %s\n", item.getNome());
            System.out.printf("| SobreNome      : %s\n", item.getSobreNome());
            System.out.printf("| Sexo           : %s\n", item.getSexo());
            System.out.printf("| DataNascimento : %s\n", item.getDataNascimento());
            System.out.printf("| Email          : %s\n", item.getEmail());
            System.out.printf("| CodigoPais     : %d\n", item.getCodigoPais());
            System.out.printf("| DataAdmissao   : %s\n", item.getDataAdmissao());
            System.out.printf("| Ctps           : %s\n", item.getCtps());
            System.out.printf("| CtpsNum        : %d\n", item.getCtpsNum());
            System.out.printf("| CtpsSerie      : %d\n", item.getCtpsSerie());
            System.out.printf("| DataInsert     : %s\n", item.getDataInsert());
            System.out.printf("|**********************************************\n");
        }
        this.menu.load();
    }
    
    public void detalharFuncionario(){
        System.out.print("Informe o funcionarioID de 10001 a 10018: \n");
        op = this.sc.nextInt();
        System.out.print("+-----------------------------------------+\n");
        System.out.print("|         Detalhar Funcionário            |\n");
        System.out.print("+-----------------------------------------+\n");
        FuncionarioPojo item = this.dao.read(op);
        if (item == null){
            System.out.println("Funcionário não existe!");
            this.menu.load();
        }
        else{
            System.out.printf("| FuncionarioID  : %d\n", item.getFuncionarioID());
            System.out.printf("| Chave          : %d\n", item.getChave());
            System.out.printf("| Nome           : %s\n", item.getNome());
            System.out.printf("| SobreNome      : %s\n", item.getSobreNome());
            System.out.printf("| Sexo           : %s\n", item.getSexo());
            System.out.printf("| DataNascimento : %s\n", item.getDataNascimento());
            System.out.printf("| Email          : %s\n", item.getEmail());
            System.out.printf("| CodigoPais     : %d\n", item.getCodigoPais());
            System.out.printf("| DataAdmissao   : %s\n", item.getDataAdmissao());
            System.out.printf("| Ctps           : %s\n", item.getCtps());
            System.out.printf("| CtpsNum        : %d\n", item.getCtpsNum());
            System.out.printf("| CtpsSerie      : %d\n", item.getCtpsSerie());
            System.out.printf("| DataInsert     : %s\n", item.getDataInsert());
            System.out.printf("|**********************************************\n"); 
            this.menu.load();
        }
    }
    
    public void alterFuncionario(){
        System.out.print("Informe o funcionarioID de 10001 a 10018: \n");
        op = this.sc.nextInt();
        System.out.print("+-----------------------------------------+\n");
        System.out.print("|     Alter dados do Funcionário           |\n");
        System.out.print("+-----------------------------------------+\n");
        FuncionarioPojo item = this.dao.read(op);
        if (item == null){
            System.out.println("funcionário não existe!");
            this.menu.load();
        }else{
            System.out.printf("| FuncionarioID  : %d\n", item.getFuncionarioID());
            System.out.printf("| Chave          : %d\n", item.getChave());
            System.out.printf("| Nome           : %s\n", item.getNome());
            System.out.printf("| SobreNome      : %s\n", item.getSobreNome());
            System.out.printf("| Sexo           : %s\n", item.getSexo());
            System.out.printf("| DataNascimento : %s\n", item.getDataNascimento());
            System.out.printf("| Email          : %s\n", item.getEmail());
            System.out.printf("| CodigoPais     : %d\n", item.getCodigoPais());
            System.out.printf("| DataAdmissao   : %s\n", item.getDataAdmissao());
            System.out.printf("| Ctps           : %s\n", item.getCtps());
            System.out.printf("| CtpsNum        : %d\n", item.getCtpsNum());
            System.out.printf("| CtpsSerie      : %d\n", item.getCtpsSerie());
            System.out.printf("| DataInsert     : %s\n", item.getDataInsert());            
            System.out.printf("|**********************************************\n");
            
            System.out.printf("Nome           : \n");String nome = this.sc.next();
            System.out.printf("SobreNome      : \n");String sobreNome = this.sc.next();
            System.out.printf("Sexo           : \n");String sexo = this.sc.next();
            System.out.printf("DataNascimento : \n");String dataNascimento = this.sc.next();
            System.out.printf("Email          : \n");String email = this.sc.next();
            System.out.printf("CodigoPais     : \n");int codigoPais = this.sc.nextInt();
            System.out.printf("DataAdmissao   : \n");String dataAdmissao = this.sc.next();
            System.out.printf("Ctps           : \n");String ctps = this.sc.next();
            System.out.printf("CtpsNum        : \n");int ctpsNum = this.sc.nextInt();
            System.out.printf("CtpsSerie      : \n");int ctpsSerie = this.sc.nextInt();
            System.out.printf("DataInsert     : \n");String dataInsert = this.sc.next();
            System.out.printf("|**********************************************\n"); 

            item.setNome(nome);
            item.setSobreNome(sobreNome);
            item.setSexo(sexo);
            item.setDataNascimento(dataNascimento);
            item.setEmail(email);
            item.setCodigoPais(codigoPais);
            item.setDataAdmissao(dataAdmissao);
            item.setCtps(ctps);
            item.setCtpsNum(ctpsNum);
            item.setCtpsSerie(ctpsSerie);
            item.setDataInsert(dataInsert);
            this.dao.create(item);

            if (this.dao.read(item.getFuncionarioID()) != null){
                System.out.println("| Funcionário alterado com sucesso.");
                System.out.print("|**********************************************\n");
                this.menu.load();
            }
            else{
                System.out.println("| Erro ao alterar funcionário.");
                System.out.print("|**********************************************\n");
                this.menu.load();
            }  
        }  
    }
    
    public void excluirFuncionario(){
        System.out.print("+-----------------------------------------+\n");
        System.out.print("|   Excluir Funcionário por funcionarioID |\n");
        System.out.print("+-----------------------------------------+\n");
        
        this.listarFuncionarios();
        System.out.print("Informe o funcionarioID para excluir funcionário: \n");
        op = this.sc.nextInt();
        FuncionarioPojo item = this.dao.read(op);
        if (item == null){
            System.out.println("Funcionário não existe.");
            this.menu.load();
        }
        else{
            System.out.printf("| FuncionarioID  : %d\n", item.getFuncionarioID());
            System.out.printf("| Chave          : %d\n", item.getChave());
            System.out.printf("| Nome           : %s\n", item.getNome());
            System.out.printf("| SobreNome      : %s\n", item.getSobreNome());
            System.out.printf("| Sexo           : %s\n", item.getSexo());
            System.out.printf("| DataNascimento : %s\n", item.getDataNascimento());
            System.out.printf("| Email          : %s\n", item.getEmail());
            System.out.printf("| CodigoPais     : %d\n", item.getCodigoPais());
            System.out.printf("| DataAdmissao   : %s\n", item.getDataAdmissao());
            System.out.printf("| Ctps           : %s\n", item.getCtps());
            System.out.printf("| CtpsNum        : %d\n", item.getCtpsNum());
            System.out.printf("| CtpsSerie      : %d\n", item.getCtpsSerie());
            System.out.printf("| DataInsert     : %s\n", item.getDataInsert());            
            System.out.printf("|**********************************************\n");            
            
            this.dao.delete(item.getFuncionarioID());
            FuncionarioPojo itemDeletado = this.dao.read(op);
            if (itemDeletado == null){
                System.out.println("Funcionário excluído com sucesso.");
                this.menu.load();
            }
            System.out.print("|**********************************************\n");
        }  
    }
}
