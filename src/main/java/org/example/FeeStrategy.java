package org.example;

public interface FeeStrategy {

    int ADULT_EXCULSIVE_LIMIT = 14;

    double calculate(TicketType ticketType);

    boolean accept(Visitor visitor);
}
