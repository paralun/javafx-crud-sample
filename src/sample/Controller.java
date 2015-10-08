package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.util.Callback;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{

    @FXML
    TextField nim;

    @FXML
    TextField nama;

    @FXML
    TextArea alamat;

    @FXML
    TextField phone;

    @FXML
    TextField email;

    @FXML
    TableView<Mahasiswa> tabelView;
    @FXML
    TableColumn<Mahasiswa, String> nimColumn;
    @FXML
    TableColumn<Mahasiswa, String> namaColumn;
    @FXML
    TableColumn<Mahasiswa, String> alamatColumn;
    @FXML
    TableColumn<Mahasiswa, String> phoneColumn;
    @FXML
    TableColumn<Mahasiswa, String> emailColumn;

    private ObservableList<Mahasiswa> maha = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        maha.add(new Mahasiswa("102093883","Hariyono","Bandung","0949494","har@yahoo.com"));
        maha.add(new Mahasiswa("234556677","Atep","Cianjur","32225556","atep@gmail.com"));
        maha.add(new Mahasiswa("838838388","Firman","Jawa","456465456","iman@yahoo.com"));
        maha.add(new Mahasiswa("938474774","Imade","Bali","232234234","made@yahoo.com"));

        nimColumn.setCellValueFactory(param -> param.getValue().nimProperty());
        namaColumn.setCellValueFactory(param -> param.getValue().namaProperty());
        alamatColumn.setCellValueFactory(param -> param.getValue().alamatProperty());
        phoneColumn.setCellValueFactory(param -> param.getValue().phoneProperty());
        emailColumn.setCellValueFactory(param -> param.getValue().emailProperty());

        tabelView.setItems(maha);
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
