
package aplicacaobancopsc.cliente;

public class ClienteH extends Pessoa{
    private String conta, agencia;

    public ClienteH(String conta, String agencia, String nome, String cpf) {
        super(nome, cpf);
        this.conta = conta;
        this.agencia = agencia;
    }

    @Override
    public String getNome(){
        return super.getNome();
    }
    
    @Override
    public String getCpf(){
        return super.getCpf();
    }

    public String getConta() {
        return conta;
    }

    public String getAgencia() {
        return agencia;
    }
    
    
}

