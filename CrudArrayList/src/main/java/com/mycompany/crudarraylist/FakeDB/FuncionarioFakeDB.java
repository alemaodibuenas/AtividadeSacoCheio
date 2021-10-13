package com.mycompany.crudarraylist.FakeDB;
import com.mycompany.crudarraylist.Pojo.*;
import java.util.ArrayList;

/**
 *
 * @author Giovanni Pratto
 */
public class FuncionarioFakeDB{ 
        
        private static ArrayList<FuncionarioPojo> funcionarios;
        
        public static ArrayList<FuncionarioPojo> getFuncionarios(){
            //design Partner
            if(funcionarios == null){
                funcionarios = new ArrayList();
                inicializarFuncionario();
            }
            return funcionarios;
        }
        
        private static void inicializarFuncionario(){                         
            adicionarFuncionario(10001,	 2010015001,    "Georgi",       "Facello",      "M",    "1953-09-02",   "facello.georgi@acme.com",      1,      "1986-06-26",   "49001540741/380",      490015407,      380,    "2021-10-08" );
            adicionarFuncionario(10002,	 2010015002,	"Bezalel",	"Simmel",	"F",	"1964-06-02",	"simmel.bezalel@acme.com",	1,	"1985-11-21",	"38050201548/584",	380502015,	584,	"2021-10-08" );
            adicionarFuncionario(10003,	 2010015003,	"Parto", 	"Bamford", 	"M",	"1959-12-03", 	"bamford.parto@acme.com",  	1,	"1986-08-28", 	"45152038868/403", 	451520388,	403,	"2021-10-08" );
            adicionarFuncionario(10004,	 2010015004,	"Chirstian",	"Koblick",	"M",	"1954-05-01", 	"koblick.chirstian@acme.com",	1,	"1986-12-01", 	"93993062385/891", 	939930623,	891,	"2021-10-08" );
            adicionarFuncionario(10005,	 2010015005,	"Kyoichi",	"Maliniak",	"M",	"1955-01-21", 	"maliniak.kyoichi@acme.com",	1,	"1989-09-12", 	"64885131268/229",      648851312,	229,	"2021-10-08" );
            adicionarFuncionario(10006,	 2010015006,	"Anneke",	"Preusig", 	"F",	"1953-04-20", 	"preusig.anneke@acme.com",      1,	"1989-06-02", 	"32097781440/565", 	320977814,	565,	"2021-10-08" );
            adicionarFuncionario(10007,	 2010015007,	"Tzvetan",	"Zielinski",	"F",	"1957-05-23", 	"zielinski.tzvetan@acme.com",	1,	"1989-02-10", 	"45521773009/130", 	455217730,	130,	"2021-10-08" );
            adicionarFuncionario(10008,	 2010015008,	"Saniya",	"Kalloufi",	"M",	"1958-02-19", 	"kalloufi.saniya@acme.com",	1,	"1994-09-15", 	"61346916570/146", 	613469165,	146,	"2021-10-08" );
            adicionarFuncionario(10009,	 2010015009,	"Sumant",	"Peac",         "F",	"1952-04-19", 	"peac.sumant@acme.com",         1,	"1985-02-18", 	"97392551134/059", 	973925511,	59,	"2021-10-08" );
            adicionarFuncionario(10010,	 2010015010,	"Duangkaew",	"Piveteau",	"F",	"1963-06-01", 	"piveteau.duangkaew@acme.com",	1,	"1989-08-24", 	"67883327357/459", 	678833273,	459,	"2021-10-08" );
            adicionarFuncionario(10011,	 2010015011,	"Mary", 	"Sluis",     	"F",	"1953-11-07", 	"sluis.mary@acme.com",          1,	"1990-01-22", 	"27643038714/533",      276430387,	533,	"2021-10-08" );
            adicionarFuncionario(10012,	 2010015012,	"Patricio",	"Bridgland",	"M",	"1960-10-04", 	"bridgland.patricio@acme.com",	1,	"1992-12-18", 	"21351765725/934",      213517657,	934,	"2021-10-08" );
            adicionarFuncionario(10013,	 2010015013,	"Eberhardt",	"Terkki",  	"M",	"1963-06-07", 	"terkki.eberhardt@acme.com",	1,	"1985-10-20", 	"56169715657/667",      561697156,	667,	"2021-10-08" );
            adicionarFuncionario(10014,	 2010015014,	"Berni", 	"Genin",   	"M",	"1956-02-12", 	"genin.berni@acme.com",         1,	"1987-03-11", 	"65552228659/809",      655522286,	809,	"2021-10-08" );
            adicionarFuncionario(10015,	 2010015015,	"Guoxiang",	"Nooteboom",	"M",	"1959-08-19",	"nooteboom.guoxiang@acme.com",	1,	"1987-07-02", 	"53561554492/173",     	535615544,	173,	"2021-10-08" );
            adicionarFuncionario(10016,	 2010015016,	"Kazuhito",	"Cappelletti",	"M",	"1961-05-02", 	"cappelletti.kazuhito@acme.com",1,	"1995-01-27", 	"75799810902/082",      757998109,	82,	"2021-10-08" );
            adicionarFuncionario(10017,	 2010015017,	"Cristinel",	"Bouloucos",	"F",	"1958-07-06", 	"bouloucos.cristinel@acme.com",	1,	"1993-08-03", 	"34272721832/847",      342727218,	847,	"2021-10-08" );
            adicionarFuncionario(10018,	 2010015018,	"Kazuhide",	"Peha",    	"F",	"1954-06-19", 	"peha.kazuhide@acme.com",       1,	"1987-04-03", 	"65049299321/002",     	650492993,	2,	"2021-10-08" );
        }

        private static void adicionarFuncionario(int funcionarioID, long chave, String nome, String sobreNome, String sexo, String dataNascimento, String email, int codigoPais, String dataAdmissao, String ctps, long ctpsNum, int ctpsSerie, String dataInsert){
            FuncionarioPojo funcionario = new FuncionarioPojo();
            funcionario.setFuncionarioID(funcionarioID);
            funcionario.setChave(chave);
            funcionario.setNome(nome);
            funcionario.setSobreNome(sobreNome);
            funcionario.setSexo(sexo);
            funcionario.setDataNascimento(dataNascimento);
            funcionario.setEmail(email);
            funcionario.setCodigoPais(codigoPais);
            funcionario.setDataAdmissao(dataAdmissao);
            funcionario.setCtps(ctps);
            funcionario.setCtpsNum(ctpsNum);
            funcionario.setCtpsSerie(ctpsSerie);
            funcionario.setDataInsert(dataInsert);   
            funcionarios.add(funcionario);
        }    
}
