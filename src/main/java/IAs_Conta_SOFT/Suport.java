package IAs_Conta_SOFT;
import java.util.Random;

public class Suport {
    public int idSuporte;
    public String nome;

    public void checarUser(int idUser) {
        // Finge que usuários com ID positivo existem
        if (idUser > 0) {
            System.out.println("Agente " + this.nome + ": Usuário " + idUser + " localizado no sistema. Iniciando atendimento...");
        } else {
            System.out.println("Agente " + this.nome + ": ERRO. Usuário " + idUser + " não encontrado na base de dados.");
        }
    }

    public void acessarConta(String nomePerfil) {
        System.out.println("...Acessando dados sensíveis de: " + nomePerfil);
        System.out.println("...Permissão de administrador concedida.");
        System.out.println("...Visualizando dashboard financeiro.");
    }

    // O suporte pode dar bônus/créditos ao cliente (ex: estorno ou promoção)
    // Retorna o valor que foi efetivamente creditado.
    public int beneficiar(int quantidade) {
        int limiteAprovacao = 500; // O suporte só pode dar até 500 de bônus sem supervisor

        if (quantidade <= limiteAprovacao) {
            System.out.println("SUCESSO: Bônus de " + quantidade + " créditos aplicado à conta do cliente.");
            return quantidade; // Retorna o valor confirmado
        } else {
            System.out.println("FALHA: O valor " + quantidade + " excede meu limite de aprovação (Máx: " + limiteAprovacao + ").");
            return 0; // Não creditou nada
        }
    }

    // Gera um protocolo de atendimento e retorna esse código (String)
    public String registrarChamado() {
        // Coloquei Random por enquanto, porém depois podemos com banco de dados, podemos fazer em sequência
        Random gerador = new Random();
        int numeroProtocolo = gerador.nextInt(9999); // Gera número aleatório entre 0 e 9999

        String protocoloFormatado = "SUP-" + numeroProtocolo + "-2025";

        System.out.println("Chamado finalizado. Protocolo gerado.");
        return protocoloFormatado;
    }
}
