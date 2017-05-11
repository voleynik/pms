package com.pms;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Repository {

    private static int id = 0;

    public static int nextId(){
        id = id + 1;
        return id;
    }

    public static List<Reservation> lstReservations = new ArrayList<>();

    public static List<Reservation> filter(ReservationVO v){
        List<Reservation> lstSelected = new ArrayList<>();
        Date f1 = v.getFrDate();
        Date f2 = v.getToDate();

        if(f1 == null && f2 == null){
            return getAll();
        }

        for(int i = 0; i < lstReservations.size(); i++){
            Reservation temp = lstReservations.get(i);
            Date d1 = temp.getFrDate();
            Date d2 = temp.getToDate();
            if  (   (d1.compareTo(f1) >= 0 && d1.compareTo(f2) <= 0) ||
                    (d2.compareTo(f1) >= 0 && d2.compareTo(f2) <= 0))
            {
                lstSelected.add(temp);
            }
        }

        return lstSelected;
    }

    public static List getAll(){

        return lstReservations;
    }

    public static void delete(int id){
        for(int i = 0; i < lstReservations.size(); i++){
            if(lstReservations.get(i).getReservationId() == id){
                lstReservations.remove(i);
            }
        }
    }

    public static Reservation update(ReservationVO v){
        Reservation r = null;
        int indexToUpdate = -1;

        for(int i = 0; i < lstReservations.size(); i++){
            Reservation temp = lstReservations.get(i);
            if(temp.getReservationId()  == v.getReservationId()){
                indexToUpdate = i;
                r = temp;
            }
        }

        if(r != null){//  Reservation found
            r.setFirstName(     v.getFirstName()    != null ? v.getFirstName()  : r.getFirstName());
            r.setLastName(      v.getLastName()     != null ? v.getLastName()   : r.getLastName());
            r.setRoomNumber(    v.getRoomNumber()   != null ? v.getRoomNumber() : r.getRoomNumber());
            r.setFrDate(        v.getFrDate()       != null ? v.getFrDate()     : r.getFrDate());
            r.setToDate(        v.getToDate()       != null ? v.getToDate()     : r.getToDate());
            lstReservations.set(indexToUpdate, r);
            return find(v.getReservationId());
        }

        return null;
    }

    public static Reservation find(int id){
        for(Reservation r : lstReservations){
            if(r.getReservationId() == id){
               return r;
            }
        }
        return null;
    }

    public static Reservation add(Reservation r){
        int reservationId = nextId();
        r.setReservationId(reservationId);
        lstReservations.add(r);
        return find(reservationId);
    }
}
