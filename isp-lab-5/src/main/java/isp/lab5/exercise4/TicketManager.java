package isp.lab5.exercise4;

public class TicketManager {
    private Ticket ticket;

    public void generateTicket(String id) {

        this.ticket = new Ticket(id, TicketStatus.AVAILABLE);
        System.out.println("The ticket with id:" + ticket.getId() + " is available");
    }

    public void validateTicket() {
        if (ticket.getTicketStatus() == TicketStatus.SOLD) {
            this.ticket.setTicketStatus(TicketStatus.VALIDATED);
            System.out.println("Ticket " + ticket.getId() + " has been VALIDATED. YOU CAN COME IN!!!!!");
        } else {
            System.out.println("The ticket can't be validated. It isn't available");
        }

    }

    public Ticket getTicket() {
        return ticket;
    }
}
