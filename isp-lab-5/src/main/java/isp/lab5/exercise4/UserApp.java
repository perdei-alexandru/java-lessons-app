package isp.lab5.exercise4;

public class UserApp {

    public void buyTicket(Ticket ticket, PaymentGateway paymentGateway) {
        if (paymentGateway.executePayment(100)) {
            ticket.setTicketStatus(TicketStatus.SOLD);
        } else throw new RuntimeException("Payment failed. Ticket can't be bought");


    }

    public void viewTicket(Ticket ticket) {
        System.out.println("Ticket id:" + ticket.getId() + ". Status ticket:" + ticket.getTicketStatus());

    }
}
