public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
    private String cor, info;

    public Iphone(String cor, String info) {
        this.cor = cor;
        this.info = info;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

     public void tocar(){
        System.out.println("Reprodutor musical: Iphone está tocando música...");
     }

    public void pausar(){
        System.out.println("Reprodutor musical: Iphone pausou a música...");
    }

    public void selecionarMusica(String musica){
        System.out.println("Reprodutor musical: Iphone selecionou a música: "+ musica);
    }

    public void ligar(String numero){
        System.out.println("Aparelho telefônico: Iphone está a ligar para o número: "+numero);
    }

    public void atender(){
        System.out.println("Aparelho telefônico: ligação atendida");
    }

    public void inciarCorreioDeVoz(){
        System.out.println("Aparelho telefônico: iniciando correio de voz...");
    }

    public void exibirPagina(String url){
        System.out.println("Navegador de internet: Iphone exibe a página, cujo url é: "+url);
    }

    public void adicionarNovaAba(){
        System.out.println("Navegador de internet: Nova aba adicionada");

    }

    public void atualizarPagina(){
        System.out.println("Navegador de internet: atualizando página...");
    }
}
