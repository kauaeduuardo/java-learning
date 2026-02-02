package poo.enumeracao.teste;

import poo.enumeracao.dominio.Cliente;
import poo.enumeracao.dominio.TipoCliente;
import  poo.enumeracao.dominio.TipoPagamento;

public class ClienteTest01 {
    static void main() {
        Cliente cliente1 = new Cliente("José", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Maria", TipoCliente.PESSOA_JURIDICA , TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);

        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));

        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());

        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente2);
    }
}
