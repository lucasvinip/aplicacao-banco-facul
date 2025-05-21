package aplicacaobancopsc;

import aplicacaobancopsc.cliente.Cliente;
import aplicacaobancopsc.cliente.Pessoa;

public class AplicacaoBancoPSC {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("lucas", "5261813215");
        Cliente cliente = new Cliente(pessoa, "52669", "16632");
        
        System.out.println(cliente.getPessoa().getNome());
        
    }
}
