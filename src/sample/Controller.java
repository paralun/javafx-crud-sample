package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{

    @FXML
    TextField nim;

    @FXML
    TextField nama;

    @FXML
    DatePicker tanggal;

    @FXML
    TextArea alamat;

    @FXML
    TextField phone;

    @FXML
    TextField email;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    public void tambah(ActionEvent event){

    }

    @FXML
    public void rubah(ActionEvent event){

    }

    @FXML
    public void hapus(ActionEvent event){

    }

    @FXML
    public void reload(ActionEvent event){

    }

    @FXML
    public void keluar(ActionEvent event){

    }
}
