/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

/**
 * FXML Controller class
 *
 * @author dilan
 */
public class IniciarSesionController implements Initializable {

    @FXML
    private TextField ingrese_usuario_textfield;
    @FXML
    private PasswordField ingrese_contrasennia_passwordfield;
    @FXML
    private Button btn_iniciar_sesion;
    @FXML
    private Button btn_registro;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void VerificarInicioSesion(ActionEvent event) {
    }

    @FXML
    private void VentanaRegistro(ActionEvent event) {
    }

    
}
