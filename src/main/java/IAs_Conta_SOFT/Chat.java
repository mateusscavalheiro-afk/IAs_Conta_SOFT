package IAs_Conta_SOFT;

public class Chat {
    public String idChat;
    public int dataCriacao;
    public String meta;
    public String objetivo;
    public int renda;

    public void criarChat() {
        System.out.println("Chat criado com sucesso.");
    }

    public void excluirChat() {
        System.out.println("Chat excluído.");
    }

    public void consultarChat() {
        System.out.println("Detalhes do chat: ");
        System.out.println("ID: " + this.idChat);
        System.out.println("Data de Criação: " + this.dataCriacao);
        System.out.println("Meta: " + this.meta);
        System.out.println("Objetivo: " + this.objetivo);
        System.out.println("Renda: " + this.renda);
    }

    public void interagirChat() {
        System.out.println("Interagindo com o chat...");
    }

    public void status() {
        System.out.println("Status do Chat:");
        System.out.println("ID do Chat: " + this.idChat);
        System.out.println("Data de Criação: " + this.dataCriacao);
        System.out.println("Meta: " + this.meta);
        System.out.println("Objetivo: " + this.objetivo);
        System.out.println("Renda: " + this.renda);
    }
}
