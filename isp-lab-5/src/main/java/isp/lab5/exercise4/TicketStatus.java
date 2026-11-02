package isp.lab5.exercise4;

public enum TicketStatus {
    AVAILABLE("Available"),
    SOLD("Sold"),
    VALIDATED("Validated");
    private String status;
    TicketStatus(String status)
    {
        this.status=status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

