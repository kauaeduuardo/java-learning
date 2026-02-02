### 🔒 2. Encapsulamento

#### Conceito
O encapsulamento protege os dados internos de um objeto contra acessos indevidos. \
Ele faz isso através de **modificadores de acesso** (`private`, `public`) e métodos de acesso (`get` e `set`).

#### Analogia
> É como um cofre: você não abre o cofre por dentro do código, mas usa \ 
> chaves (métodos) para acessar ou alterar o valor guardado.

#### Exemplo
~~~java
public class ContaBancaria {
    private double saldo;

    public void depositar(double valor) {
        if (valor > 0) saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= saldo) saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }
}
~~~ 
👉 **O que acontece:** o atributo `saldo` não pode ser acessado diretamente — apenas por métodos que controlam a lógica.