package IAs_Conta_SOFT;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Olá, Bem-Vindo!"); //será feita a aba de login ou cadastro
        User u1 = new User();
        System.out.println();
        u1.id = random.nextInt();
        System.out.println("Seu id é: " + u1.id);
        System.out.println("Insira seu e-mail: ");
        u1.email = scanner.nextLine();
        System.out.println("Insira seu nome: ");
        u1.nome = scanner.nextLine();
        System.out.println("Insira seu nome de usuário: ");
        u1.nome_usuario = scanner.nextLine();
        System.out.println("Teste de perfil: "); //será substituido por quizz ao iniciar uma nova conta
        u1.perfil = scanner.nextLine();
        System.out.println("Parabéns, seu cadastro foi completo!");
        u1.criar_user();
        u1.editar_user();
        u1.excluir_user();
        u1.consultar_user();
        u1.criar_perfil();
        u1.editar_perfil();
        u1.enviar_mensagem();
        u1.editar_mensagem();

        }
    }