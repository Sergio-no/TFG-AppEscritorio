package org.example.tfgjavafx.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;

public class DashboardController {

    @FXML
    private VBox alertasContainer;

    @FXML
    private TableView<?> citasTable;

    @FXML
    private TableColumn<?, ?> colCitaCliente;

    @FXML
    private TableColumn<?, ?> colCitaEstado;

    @FXML
    private TableColumn<?, ?> colCitaHora;

    @FXML
    private TableColumn<?, ?> colCitaTipo;

    @FXML
    private TableColumn<?, ?> colRepCoste;

    @FXML
    private TableColumn<?, ?> colRepEstado;

    @FXML
    private TableColumn<?, ?> colRepInicio;

    @FXML
    private TableColumn<?, ?> colRepMecanico;

    @FXML
    private TableColumn<?, ?> colRepVehiculo;

    @FXML
    private Label fechaLabel;

    @FXML
    private Label metricAlertas;

    @FXML
    private Label metricAlertasSub;

    @FXML
    private Label metricCitas;

    @FXML
    private Label metricCitasSub;

    @FXML
    private Label metricFacturacion;

    @FXML
    private Label metricFacturacionSub;

    @FXML
    private Label metricRep;

    @FXML
    private Label metricRepSub;

    @FXML
    private Button navCitas;

    @FXML
    private Button navClientes;

    @FXML
    private Button navDashboard;

    @FXML
    private Button navEstadisticas;

    @FXML
    private Button navFacturas;

    @FXML
    private Button navInventario;

    @FXML
    private Button navReparaciones;

    @FXML
    private TableView<?> reparacionesTable;

    @FXML
    private Label rolBadge;

    @FXML
    private Label userEmailLabel;

    @FXML
    void goToCitas(ActionEvent event) {

    }

    @FXML
    void goToClientes(ActionEvent event) {

    }

    @FXML
    void goToDashboard(ActionEvent event) {

    }

    @FXML
    void goToEstadisticas(ActionEvent event) {

    }

    @FXML
    void goToFacturas(ActionEvent event) {

    }

    @FXML
    void goToInventario(ActionEvent event) {

    }

    @FXML
    void goToReparaciones(ActionEvent event) {

    }

    @FXML
    void handleLogout(ActionEvent event) {

    }

}

