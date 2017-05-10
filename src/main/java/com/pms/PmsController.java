package com.pms;

import org.springframework.web.bind.annotation.*;

@RestController @RequestMapping("/pms")
public class PmsController {

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody Reservation createReservation(@RequestBody(required = false) ReservationVO v) {

        Reservation r = new Reservation();
        r.setClientFirstName(v.getClientFirstName());
        r.setClientLastName(v.getClientLastName());
        r.setRoomNumber(v.getRoomNumber());
        r.setFrDate(v.getFrDate());
        r.setToDate(v.getToDate());

        return r;
    }
}
