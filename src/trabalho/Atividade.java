
package trabalho;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade {

    final static int linha = 5;
    final static int coluna = 5;
    
    
    //Aqui fica a tabela usada para armazenar inteiros
    static Pessoa tabela[][] = new Pessoa[coluna][linha];
    
    public void gravar(Pessoa p){
        //O resto da divisão da variável 'leitura' por 5 é uma coluna da tabela
        int leitura = Integer.parseInt(p.verCpf().charAt(1)+"");
        int resto = leitura%5;
        
        //Função 'testa' verifica se há espaço na tabela 
        testa(resto, p);

    }
    
    private static void testa(int resto, Pessoa p){
        for (int i = 0; i < linha; i++) {
            if (tabela[resto][i] == null){
                tabela[resto][i] = p;      
                break;
            }
        }
    }
    
    
    public String pesquisar(String pesquisar){ 
        int cod = Integer.parseInt(pesquisar.charAt(1)+"");;
        int resto = cod%5;  
        boolean aux = false;
        String menssagem = "";
        
        for (int i = 0; i < linha; i++) {
            if (tabela[resto][i] == null){}
            else if (tabela[resto][i].verCpf().equals(pesquisar)){
                aux = true;
                menssagem = ("Os dados são:"+tabela[resto][i].verTudo()+"\n \n Localizado na linha: "+i+", e coluna: "+resto);
                break;
            }    
        }
        
        if (aux == true){
            return menssagem;
        }else{
            return ("O cpf "+pesquisar+" não existe na tabela");
        }
    }
    
    public boolean excluir(String pesquisar){ 
        int cod = Integer.parseInt(pesquisar.charAt(1)+"");;
        int resto = cod%5;  
        
        for (int i = 0; i < linha; i++) {
            if (tabela[resto][i] == null){}
            else if (tabela[resto][i].verCpf().equals(pesquisar)){
                tabela[resto][i] = null;
                return true;
            }    
        }
        return false;
    }
    
    public static String imprimir(){
        String impressao = "Nome: \n";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(tabela[i][j] == null){
                    impressao += " NULO ";
                }
                else{
                    impressao += " "+tabela[i][j].verNome()+" ";
                }
            }
            impressao += "\n";
        }
        impressao += "\n \n"+imprimirCpf();
        return impressao;
    }
    
    public static String imprimirCpf(){
        String impressao = "CPF: \n";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(tabela[i][j] == null){
                    impressao += " NULO ";
                }
                else{
                    impressao += " "+tabela[i][j].verCpf()+" ";
                }
            }
            impressao += "\n";
        }
        return impressao;
    }

}

