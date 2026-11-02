package isp.lab5.exercise4;

public class Exercise4 {
    public static void main(String[] args) {

        TicketManager manager = new TicketManager();
        manager.generateTicket("123A");
        UserApp userApp=new UserApp();
        PaymentGateway paymentGateway=new CardPayment();
        userApp.buyTicket(manager.getTicket(),paymentGateway);
        OrganizerApp organizerApp=new OrganizerApp();
        organizerApp.checkIn(manager);


    }


}
