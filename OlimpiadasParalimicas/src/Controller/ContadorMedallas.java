/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

/**
 * FXML Controller class
 *
 * @author dilan
 */
public class ContadorMedallas implements Initializable {

    @FXML
    private Button btn_Calendario_Resultados;
    @FXML
    private Button btn_Ventana_Medallas;
    @FXML
    private Button btn_Ventana_Competencias;
    @FXML
    private Button btn_Ventana_Atletas;
    @FXML
    private Button btn_Ventana_Paises;
    @FXML
    private TextField Buscardor_ventana_contadorMedallas;
    @FXML
    private ComboBox<?> comboBox_All_Sports;
    @FXML
    private GridPane gridPane_ContadorDeMedallas;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
