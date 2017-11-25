package lv.vea.jade;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by m7_kalasn_l on 11/25/2017.
 */
public class Customer {
    private static List<Ticket> tickets = new ArrayList<>();

    public static List<Ticket> getTickets() {
        return tickets;
    }

    public static void addTicket(Ticket ticket) {
       tickets.add(ticket);
    }
}
