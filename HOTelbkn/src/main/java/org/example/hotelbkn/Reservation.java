package org.example.hotelbkn;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reservation {
    private int reservationId;
    private String guestName;
    private String roomNumber;
    private String contactNumber;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;

    public Reservation(int reservationId, String guestName, String roomNumber,
                       String contactNumber, LocalDate checkInDate, LocalDate checkOutDate) {
        this.reservationId = reservationId;
        this.guestName = guestName;
        this.roomNumber = roomNumber;
        this.contactNumber = contactNumber;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public int getReservationId() { return reservationId; }
    public void setReservationId(int reservationId) { this.reservationId = reservationId; }

    public String getGuestName() { return guestName; }
    public void setGuestName(String guestName) { this.guestName = guestName; }

    public String getRoomNumber() { return roomNumber; }
    public void setRoomNumber(String roomNumber) { this.roomNumber = roomNumber; }

    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) { this.contactNumber = contactNumber; }

    public LocalDate getCheckInDate() { return checkInDate; }
    public void setCheckInDate(LocalDate checkInDate) { this.checkInDate = checkInDate; }

    public LocalDate getCheckOutDate() { return checkOutDate; }
    public void setCheckOutDate(LocalDate checkOutDate) { this.checkOutDate = checkOutDate; }

    public String getPeriod() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("DD.MM.YYYY");
        if (checkInDate != null && checkOutDate != null) {
            return fmt.format(checkInDate) + " - " + fmt.format(checkOutDate);
        } else if (checkInDate != null) {
            return fmt.format(checkInDate);
        } else {
            return "";
        }
    }
}
