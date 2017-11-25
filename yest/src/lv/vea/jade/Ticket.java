package lv.vea.jade;

import java.util.Date;

/**
 * Created by m7_kalasn_l on 11/25/2017.
 */
abstract class Ticket {
    private double price;
    private Date date;
    private String name;

    public Ticket(Date time) {
        this.date = time;
    }

    public Ticket() {

    }

    public Ticket(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
