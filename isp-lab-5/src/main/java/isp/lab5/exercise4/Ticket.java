package isp.lab5.exercise4;

public class Ticket {
    private String id;
    private TicketStatus ticketStatus;
    public Ticket(String id,TicketStatus ticketStatus)
    {
        this.id=id;
        this.ticketStatus=ticketStatus;
    }

    public void setTicketStatus(TicketStatus ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    public String getId() {
        return id;
    }

    public TicketStatus getTicketStatus() {
        return ticketStatus;
    }
}
