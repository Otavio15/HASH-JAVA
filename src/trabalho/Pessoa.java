
package trabalho;

public class Pessoa {
    private String nome;
    private String cpf;
    private String telefone;
    
    public Pessoa(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }
    
    public String verNome(){
        return this.nome;
    }
    
    public String verCpf(){
        return this.cpf;
    }
    
    public String verTelefone(){
        return this.telefone;
    }
    
    public String verTudo(){
        return " \n Nome: "+this.nome+"\n CPF: "+this.cpf+"\n Telefone: "+this.telefone;
    }
    
}
