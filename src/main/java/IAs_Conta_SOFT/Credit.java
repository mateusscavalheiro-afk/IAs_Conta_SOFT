package IAs_Conta_SOFT;
import java.util.Date; //será colocado o sistema de datas após a conexão das classes

public class Credit {
    public int idCreditos;
    public int quantidade;      // Representa o Saldo atual
    public int limite;          // Limite de segurança definido pelo cliente
    public int validadeRetorno; // Data para atingir o objetivo

    public void gasto(int valorGasto) {
        // CORREÇÃO: Verifica apenas se o gasto é maior que o saldo atual (quantidade)
        if (valorGasto > this.quantidade) {
            System.out.println("ALERTA IA: Saldo insuficiente! Você tem apenas " + this.quantidade + " créditos.");
        } else {
            // Se tiver saldo suficiente, desconta
            this.quantidade = this.quantidade - valorGasto;
            System.out.println("Consumo realizado! Créditos restantes: " + this.quantidade);
        }
    }

    public String verStatus(int idParaVerificar) {
        if (this.idCreditos == idParaVerificar) {
            return  "\n--- STATUS DA CONTA (IA) ---\n" +
                    "ID: " + this.idCreditos + "\n" +
                    "Saldo Atual: " + this.quantidade + " / " + this.limite + " (Limite Diário)\n" +
                    "Renovação em: " + this.validadeRetorno;
        } else {
            return "Erro: ID incorreto.";
        }
    }
}
