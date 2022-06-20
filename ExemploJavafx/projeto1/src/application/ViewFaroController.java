package application;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class ViewFaroController {

	String caminhoAudio1 = "C:\\Users\\WINDOWS\\Documents\\faroAudios\\cavalo.mp3";
	Media audio1 = new Media ( new File (caminhoAudio1).toURI().toString()) ;
	MediaPlayer mediaPlayer1 = new MediaPlayer(audio1);
	
	String caminhoAudio2 = "C:\\Users\\WINDOWS\\Documents\\faroAudios\\dancaGatinho.mp3";
	Media audio2 = new Media ( new File (caminhoAudio2).toURI().toString()) ;
	MediaPlayer mediaPlayer2 = new MediaPlayer(audio2);
	
	String caminhoAudio3 = "C:\\Users\\WINDOWS\\Documents\\faroAudios\\queIsso.mp3";
	Media audio3 = new Media ( new File (caminhoAudio3).toURI().toString()) ;
	MediaPlayer mediaPlayer3 = new MediaPlayer(audio3);
	
	String caminhoAudio4 = "C:\\Users\\WINDOWS\\Documents\\faroAudios\\ui.mp3";
	Media audio4 = new Media ( new File (caminhoAudio4).toURI().toString()) ;
	MediaPlayer mediaPlayer4 = new MediaPlayer(audio4);
	
	
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
	@FXML
	public void botao4 (ActionEvent e) {
		mediaPlayer4.play();
	}
	
}

