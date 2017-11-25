package lv.vea.jade;

/**
 * Created by m7_kalasn_l on 11/25/2017.
 */
public class Main {

    public static void main(String[] args) {

        Customer newCustomer = new Customer();
        Ticket generalTicket = new GeneralTickets();
        Ticket butterflyHouseTicket = new ButterflyHouseTickets();
        Ticket pettingZoneTicket = new PettingZoneTickets();
        Shop shop = new Shop();

       // shop.printCustomerAllTicketInformation(newCustomer.getTickets());

        shop.sellTicket(newCustomer, generalTicket);
        shop.sellTicket(newCustomer, butterflyHouseTicket);

        shop.printOneCustomerTicketInformation(newCustomer.getTickets(),1);
        shop.printCustomerAllTicketInformation(newCustomer.getTickets());

        Customer newCustomer2 = new Customer();
        shop.sellTicket(newCustomer2, pettingZoneTicket);
    }
}
