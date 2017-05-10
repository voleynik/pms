package com.pms;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

public class ReservationVO implements Serializable {

    private String  clientFirstName;
    private String  clientLastName;
    private String  roomNumber;
    @JsonFormat(pattern="MM-dd-yyyy")
    private Date    frDate;
    @JsonFormat(pattern="MM-dd-yyyy")
    private Date    toDate;

    public String getClientFirstName() {
        return clientFirstName;
    }

    public void setClientFirstName(String clientFirstName) {
        this.clientFirstName = clientFirstName;
    }

    public String getClientLastName() {
        return clientLastName;
    }

    public void setClientLastName(String clientLastName) {
        this.clientLastName = clientLastName;
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
        return "ReservationVO{" +
                "clientFirstName='" + clientFirstName + '\'' +
                ", clientLastName='" + clientLastName + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                ", frDate=" + frDate +
                ", toDate=" + toDate +
                '}';
    }

}