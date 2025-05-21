package aplicacaobancopsc.cliente;

//composicao
public class Cliente {
    private Pessoa pessoa;
    private String conta;
    private String agencia;

    public Cliente(Pessoa pessoa, String conta, String agencia) {
        this.pessoa = pessoa;
        this.conta = conta;
        this.agencia = agencia;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public String getConta() {
        return conta;
    }

    public String getAgencia() {
        return agencia;
    }
    
    
}
