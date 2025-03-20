public class Conta {

    public String nomeTitular;
    public Integer numero;
    public String agencia;
    public Double saldo;
    public String dataAbertura;

    public void deposita(Double valor) {
        this.saldo += valor;
    }

    public void saca(Double valor) {
        this.saldo -= valor;
    }

    public Double calculaRendimento() {
        return this.saldo * 0.1;
    }

    public String recuperaDadosParaImpressao() {
        return String.format("Titular: %s\nNúmero: %d\nAgência: %s\nSaldo: %.2f\nData de abertura: %s",
                this.nomeTitular, this.numero, this.agencia, this.saldo, this.dataAbertura);
    }

    

}
