package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class FeeCalculatorTest {

    @Test
    public void devrait_calculer_20_pour_enfant_half_day()
    {
        //GIVEN
        Visitor child = new Visitor(10);

        //WHEN
        double actualFee = FeeCalculator.calculateFee(child, TicketType.HALF_DAY);

        //THEN
        assertThat(actualFee).isEqualTo(20.0);
    }

    @Test
    public void devrait_calculer_50_pour_enfant_full_day()
    {
        //GIVEN
        Visitor child = new Visitor(10);

        //WHEN
        double actualFee = FeeCalculator.calculateFee(child, TicketType.FULL_DAY);

        //THEN
        assertThat(actualFee).isEqualTo(50.0);
    }

    @Test
    public void devrait_calculer_60_pour_adulte_half_day()
    {
        //GIVEN
        Visitor adult = new Visitor(20);

        //WHEN
        double actualFee = FeeCalculator.calculateFee(adult, TicketType.HALF_DAY);

        //THEN
        assertThat(actualFee).isEqualTo(60.0);
    }

    @Test
    public void devrait_calculer_120_pour_adulte_full_day()
    {
        //GIVEN
        Visitor adult = new Visitor(20);

        //WHEN
        double actualFee = FeeCalculator.calculateFee(adult, TicketType.FULL_DAY);

        //THEN
        assertThat(actualFee).isEqualTo(120.0);
    }

    //void devrait_produire_erreur_pour_adult_typeTicket_invalide()
    //void devrait_produire_erreur_pour_child_typeTicket_invalide()

}