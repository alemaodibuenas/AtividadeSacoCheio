package com.mycompany.crudarraylist.Service;
import com.mycompany.crudarraylist.Service.MenuService;
import java.util.Scanner;
/**
 *
 * @author Giovanni Pratto
 */
public class MenuService {
    
    int op; 
    
    private Scanner sc;
    
    public MenuService(){
        this.sc = new Scanner(System.in);
    }
        
    public void exibirMenu(){
        
        op = 1;
        
        FuncionarioService funcionario = new FuncionarioService();
        
        while(op != 0){
            this.menu();
            System.out.print("Digite uma opção: \n");
            op = this.sc.nextInt();
            switch(op){
                case 1:                    
                    funcionario.adicionarFuncionario();
                    break;
                case 2:
                    funcionario.listarFuncionarios();
                    break;
                case 3:
                    funcionario.detalharFuncionario();
                    break;
                case 4:
                    funcionario.alterFuncionario();
                    break;
                case 5:
                    funcionario.excluirFuncionario();
                    break;                            
                default:
                    System.out.println("Opção não disponível. Tente novamente.");
            }            
        }
        
        if(op == 0){
            System.out.println("Programa encerrado!");
        }
    }
    
    private void menu(){
        System.out.print("+-----------------------------------------+\n");
        System.out.print("|             Menu Opções                 |\n");
        System.out.print("|-----------------------------------------|\n");
        System.out.print("| 1 - Cadastrar  Funcionário              |\n");
        System.out.print("| 2 - Listar     Funcionários             |\n");
        System.out.print("| 3 - Detalhar   Funcionário              |\n");
        System.out.print("| 4 - Alterar    Funcionário              |\n");
        System.out.print("| 5 - Excluir    Funcionário              |\n");
        System.out.print("| 0 - Sair do  Programa                   |\n");
        System.out.print("+-----------------------------------------+\n");
    }
    
    /* Método que coloca esperar. */
    public static void load(){ 
        Scanner sc = new Scanner(System.in);
        System.out.println("Pressione qualquer tecla para continuar...");        
        sc.nextLine();
        System.out.print("\n");
    }    
}
