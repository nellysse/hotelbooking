package org.example.hotelbkn;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ReservationController {

    @FXML private TableView<Reservation> reservationTable;
    @FXML private TableColumn<Reservation, Integer> idColumn;
    @FXML private TableColumn<Reservation, String> nameColumn;
    @FXML private TableColumn<Reservation, String> roomColumn;
    @FXML private TableColumn<Reservation, String> contactColumn;
    @FXML private TableColumn<Reservation, String> periodColumn;

    @FXML private TextField guestNameField;
    @FXML private TextField roomNumberField;
    @FXML private TextField contactNumberField;
    @FXML private DatePicker checkInDatePicker;
    @FXML private DatePicker checkOutDatePicker;

    private ObservableList<Reservation> reservations = FXCollections.observableArrayList();
    private int nextId = 1;

    @FXML
    public void initialize() {
        configureTableColumns();
        reservationTable.setItems(reservations);
    }

    private void configureTableColumns() {
        idColumn.setCellValueFactory(cell -> new javafx.beans.property.SimpleIntegerProperty(cell.getValue().getReservationId()).asObject());
        nameColumn.setCellValueFactory(cell -> new javafx.beans.property.SimpleStringProperty(cell.getValue().getGuestName()));
        roomColumn.setCellValueFactory(cell -> new javafx.beans.property.SimpleStringProperty(cell.getValue().getRoomNumber()));
        contactColumn.setCellValueFactory(cell -> new javafx.beans.property.SimpleStringProperty(cell.getValue().getContactNumber()));
        periodColumn.setCellValueFactory(cell -> new javafx.beans.property.SimpleStringProperty(cell.getValue().getPeriod()));
    }

    @FXML
    private void handleReserveButton() {
        Reservation reservation = new Reservation(
                nextId++,
                guestNameField.getText(),
                roomNumberField.getText(),
                contactNumberField.getText(),
                checkInDatePicker.getValue(),
                checkOutDatePicker.getValue()
        );
        reservations.add(reservation);
        clearFields();
    }

    @FXML
    private void handleDeleteButton() {
        Reservation selected = reservationTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            reservations.remove(selected);
            int id = 1;
            for (Reservation r : reservations) {
                r.setReservationId(id++);
            }
            nextId = id;
            reservationTable.refresh();
        }
    }
    @FXML
    private void handleLoadAll() {
        reservationTable.refresh();
    }
    private void clearFields() {
        guestNameField.clear();
        roomNumberField.clear();
        contactNumberField.clear();
        checkInDatePicker.setValue(null);
        checkOutDatePicker.setValue(null);
    }
}
