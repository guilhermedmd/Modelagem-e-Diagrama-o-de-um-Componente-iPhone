import java.util.Scanner;

public class App {
    static final Scanner input = new Scanner(System.in);
    static Iphone iphone = new Iphone("preto", "Iphone de fulano");

    public static void main(String[] args) throws Exception {
        int option;
        do{
            System.out.println("0-encerrar");
            System.out.println("1-tocar música");
            System.out.println("2-pausar música");
            System.out.println("3-selecionar música");
            System.out.println("4-ligar");
            System.out.println("5-atender chamada");
            System.out.println("6-inciar correio de voz");
            System.out.println("7-exibir página");
            System.out.println("8-adicionar nova guia");
            System.out.println("9-atualizar Página");
            option = input.nextInt();
            input.nextLine();

            switch (option) {
                case 0 -> System.exit(0);
                case 1 -> iphone.tocar();
                case 2 -> iphone.pausar();
                case 3 -> selecionaMusica();
                case 4 -> ligarPara();
                case 5 -> iphone.atender();
                case 6 -> iphone.inciarCorreioDeVoz();
                case 7 -> pesquisarUrl();
                case 8 -> iphone.adicionarNovaAba();
                case 9 -> iphone.atualizarPagina();
                default -> System.out.println("Opção inválida");
            }
        }while (true);
        


    }
    static void selecionaMusica(){
        System.out.println("Digite o número da música:");
        String musica = input.nextLine();
        iphone.selecionarMusica(musica);

    }

    static void ligarPara(){
        System.out.println("Digite o número para ligar:");
        String numero = input.nextLine();
        iphone.ligar(numero);

    }
    static void pesquisarUrl(){
        System.out.println("Digite a url do site:");
        String url = input.nextLine();
        iphone.exibirPagina(url);

    }
}
