package application;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class ViewRatinhoController {

	String caminhoAudio1 = "C:\\Users\\WINDOWS\\Documents\\ratinhoAudios\\rapaz.mp3";
	Media audio1 = new Media ( new File (caminhoAudio1).toURI().toString()) ;
	MediaPlayer mediaPlayer1 = new MediaPlayer(audio1);
	
	String caminhoAudio2 = "C:\\Users\\WINDOWS\\Documents\\ratinhoAudios\\uepa.mp3";
	Media audio2 = new Media ( new File (caminhoAudio2).toURI().toString()) ;
	MediaPlayer mediaPlayer2 = new MediaPlayer(audio2);
	
	String caminhoAudio3 = "C:\\Users\\WINDOWS\\Documents\\ratinhoAudios\\pare.mp3";
	Media audio3 = new Media ( new File (caminhoAudio3).toURI().toString()) ;
	MediaPlayer mediaPlayer3 = new MediaPlayer(audio3);
	
	
	@FXML
	public void botao1 (ActionEvent e) {
		mediaPlayer1.play();
	}
	
	@FXML
	public void botao2 (ActionEvent e) {
		mediaPlayer2.play();
	}
	
	@FXML
	public void botao3 (ActionEvent e) {
		mediaPlayer3.play();
	}
	
}
