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

    public void printOneCustomerTicketInformation(List<Ticket> tickets, int ticketNumber) {
        if (!tickets.isEmpty() && tickets.size()>ticketNumber && ticketNumber > 0) {
                System.out.println((tickets.get(ticketNumber - 1)
                        + "ticket is valid:"
                        + isTicketValid(tickets.get(ticketNumber - 1))));
        } else {
            System.out.println("Customer does not have a ticket with this number!");
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
