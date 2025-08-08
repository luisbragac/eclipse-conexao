package dragonball;
import javax.swing.*;
public class draagonball {

	public static void main(String[] args) {
	String personagem = JOptionPane.showInputDialog(null,"Digite um personanagem");
	String nomeImagem = "";
	String Origem = "";
	switch(personagem) {
	case"Goku":
	   Origem = "Planeta Sayajin";
	   nomeImagem = "src/imagem/goku-icone.png";
	 break;
	case"Piccolo":
		Origem = "Planeta Namekuseijin";
		nomeImagem = "src/imagem/Piccolo-icone.png";
	break;
	case "Vegeta":
		Origem = "Planeta Sayajin";
		nomeImagem = "src/imagem/vageta-icone.png";
	break;
	case "Bulma":
		Origem = "Planeta Terra";
		nomeImagem = "src/imagem/bulma-icone.png";
	break;
	case "Kuririn":
		Origem = "Planeta Terra";
		nomeImagem = "src/imagem/kuririn-icone.png";
	break;
	default:
		Origem = "Desconhecida";
		nomeImagem = "src/imagem/default.png";
	}
	
	ImageIcon icone = new ImageIcon (nomeImagem);
	JOptionPane.showConfirmDialog(null,"Personagem: "+personagem+"\n"+"Origem:"+Origem,"Descrição",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,icone);
	}

	
}