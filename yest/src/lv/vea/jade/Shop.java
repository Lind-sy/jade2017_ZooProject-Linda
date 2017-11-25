package lv.vea.jade;

import sun.invoke.empty.Empty;

import java.util.Calendar;
import java.util.List;

/**
 * Created by m7_kalasn_l on 11/25/2017.
 */
public class Shop {

    public void sellTicket(Customer customer, Ticket ticket) {
        Calendar startDate = Calendar.getInstance();
        ticket.setDate(startDate.getTime());
        customer.addTicket(ticket);
    }

    private boolean isTicketValid(Ticket ticket) {
        Calendar startDate = Calendar.getInstance();
        if (ticket.getDate() != startDate.getTime()) {
            return true;
        } else {
            return false;
        }
    }

    public void printOneCustomerTicketInformation(Ticket ticket) {
        if (ticket != null) {
                System.out.println((ticket.getName()
                        + "ticket is valid:"
                        + isTicketValid(ticket)));
        } else {
            System.out.println("Customer has no tickets!");
        }
    }

    public void printCustomerAllTicketInformation(List<Ticket> tickets) {
        if (!tickets.isEmpty()) {
            for (Ticket ticket : tickets) {
                System.out.println((ticket.getName()
                        + "ticket is valid:"
                        + isTicketValid(ticket)));
            }
        } else {
            System.out.println("Customer has no tickets!");
        }
    }
}
