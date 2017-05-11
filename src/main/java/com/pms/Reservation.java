package com.pms;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

public class Reservation implements Serializable {

    private int reservationId;
    private String  firstName;
    private String  lastName;
    private String  roomNumber;
    @JsonFormat(pattern="MM-dd-yyyy")
    private Date    frDate;
    @JsonFormat(pattern="MM-dd-yyyy")
    private Date    toDate;

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getFrDate() {
        return frDate;
    }

    public void setFrDate(Date frDate) {
        this.frDate = frDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "clientFirstName='" + firstName + '\'' +
                ", clientLastName='" + lastName + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                ", frDate=" + frDate +
                ", toDate=" + toDate +
                '}';
    }
}