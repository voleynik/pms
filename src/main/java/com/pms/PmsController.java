package com.pms;

import org.springframework.web.bind.annotation.*;

@RestController @RequestMapping("/pms")
public class PmsController {

    // TEST: http://localhost:8080/pms/2
    @RequestMapping(value = "/{reservationId}", method = RequestMethod.DELETE)
    public @ResponseBody void deleteReservation(@PathVariable("reservationId") String strReservationId) {

        int reservationId = Integer.valueOf(strReservationId);
        Repository.delete(reservationId);
    }

    // TEST: http://localhost:8080/pms/2
    @RequestMapping(value = "/{reservationId}", method = RequestMethod.PUT)
    public @ResponseBody Reservation updateReservation(@RequestBody(required = true) ReservationVO v) {

        return Repository.update(v);
    }

    // TEST: http://localhost:8080/pms/2
    @RequestMapping(value = "/{reservationId}", method = RequestMethod.GET)
    public @ResponseBody Reservation findReservation(@PathVariable("reservationId") String strReservationId) {

        int reservationId = Integer.valueOf(strReservationId);
        return Repository.find(reservationId);
    }

    // TEST: http://localhost:8080/pms
    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody Reservation createReservation(@RequestBody(required = true) ReservationVO v) {

        Reservation r = new Reservation();
        r.setFirstName(v.getFirstName());
        r.setLastName(v.getLastName());
        r.setRoomNumber(v.getRoomNumber());
        r.setFrDate(v.getFrDate());
        r.setToDate(v.getToDate());

        return Repository.add(r);
    }
}
