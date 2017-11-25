package lv.vea.jade;

/**
 * Created by m7_kalasn_l on 11/25/2017.
 */
public class Main {

    public static void main(String[] args) {

        Customer newCustomer = new Customer();
        Ticket newTicket = new GeneralTickets();
        Ticket newTicket2 = new ButterflyHouseTickets();
        Shop shop = new Shop();

        shop.printCustomerTicketInformation(newCustomer.getTickets());

        shop.sellTicket(newCustomer, newTicket);
        shop.sellTicket(newCustomer, newTicket2);

        shop.printCustomerTicketInformation(newCustomer.getTickets());
    }
}
