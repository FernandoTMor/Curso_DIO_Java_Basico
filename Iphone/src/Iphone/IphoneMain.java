package Iphone;

public class IphoneMain {

	public static void main(String[] args) {
		System.out.println("Reprodutor musical\n");
		ReprodutorMusical R = new ReprodutorMusical();
		R.selecionarMusica();
		R.tocarMusica();
		R.pausarMusica();
		
		System.out.println("Aparelho Telefonico\n");
		AparelhoTelefonico A = new AparelhoTelefonico();
		A.ligar();
		A.atender();
		A.iniciarCorreioDeVoz();
		
		System.out.println("Navegador da Internet\n");
		NavegadorInternet N = new NavegadorInternet();
		N.exibirPagina();
		N.adicionarNovaAba();
		N.atualizarPagina();

	}

}
