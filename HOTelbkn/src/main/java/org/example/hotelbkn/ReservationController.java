package org.example.hotelbkn;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ReservationController {

    @FXML private TextField guestNameField;
    @FXML private TextField roomNumberField;
    @FXML private TextField contactNumberField;
    @FXML private DatePicker checkInDatePicker;
    @FXML private DatePicker checkOutDatePicker;
    @FXML private TableView<Reservation> reservationTable;
    @FXML private TableColumn<Reservation, Number> idColumn;
    @FXML private TableColumn<Reservation, String> nameColumn;
    @FXML private TableColumn<Reservation, String> roomColumn;
    @FXML private TableColumn<Reservation, String> contactColumn;
    @FXML private TableColumn<Reservation, String> periodColumn;

    private ObservableList<Reservation> reservations = FXCollections.observableArrayList();
    private int nextId = 1;

    @FXML
    private void initialize() {
        idColumn.setCellValueFactory(cell -> new javafx.beans.property.SimpleIntegerProperty(cell.getValue().getReservationId()));
        nameColumn.setCellValueFactory(cell -> new javafx.beans.property.SimpleStringProperty(cell.getValue().getGuestName()));
        roomColumn.setCellValueFactory(cell -> new javafx.beans.property.SimpleStringProperty(cell.getValue().getRoomNumber()));
        contactColumn.setCellValueFactory(cell -> new javafx.beans.property.SimpleStringProperty(cell.getValue().getContactNumber()));
        periodColumn.setCellValueFactory(cell -> new javafx.beans.property.SimpleStringProperty(cell.getValue().getPeriod()));

        reservationTable.setItems(reservations);
    }

    // CREATE
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

    // DELETE
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

    //JSON
    public void saveToFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("reservations.json"))) {
            writer.println("{");
            writer.println("  \"reservations\": [");

            for (int i = 0; i < reservations.size(); i++) {
                Reservation r = reservations.get(i);
                writer.println("    {");
                writer.println("      \"id\": " + r.getReservationId() + ",");
                writer.println("      \"name\": \"" + r.getGuestName() + "\",");
                writer.println("      \"room\": \"" + r.getRoomNumber() + "\",");
                writer.println("      \"contact\": \"" + r.getContactNumber() + "\",");
                writer.println("      \"checkIn\": \"" + r.getCheckInDate() + "\",");
                writer.println("      \"checkOut\": \"" + r.getCheckOutDate() + "\"");
                writer.println("    }" + (i < reservations.size() - 1 ? "," : ""));
            }

            writer.println("  ]");
            writer.println("}");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleSaveButton() {
        saveToFile();
    }

    private void clearFields() {
        guestNameField.clear();
        roomNumberField.clear();
        contactNumberField.clear();
        checkInDatePicker.setValue(null);
        checkOutDatePicker.setValue(null);
    }
}


