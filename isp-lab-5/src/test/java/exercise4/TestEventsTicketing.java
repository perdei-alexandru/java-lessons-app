package exercise4;

import isp.lab5.exercise4.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestEventsTicketing {
    @Test
    public void TestSystem() {
        TicketManager manager = new TicketManager();
        manager.generateTicket("123A");
        assertEquals("123A", manager.getTicket().getId());
        assertEquals(TicketStatus.AVAILABLE, manager.getTicket().getTicketStatus());

        UserApp userApp = new UserApp();
        PaymentGateway paymentGateway = new CardPayment();
        userApp.buyTicket(manager.getTicket(), paymentGateway);
        assertEquals(TicketStatus.SOLD, manager.getTicket().getTicketStatus());

        OrganizerApp organizerApp = new OrganizerApp();
        organizerApp.checkIn(manager);
        assertEquals(TicketStatus.VALIDATED, manager.getTicket().getTicketStatus());

    }
}
