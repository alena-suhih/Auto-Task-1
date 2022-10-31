package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void AmountLessThan1000 () {
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Amount1000 () {
        int amount = 1000;

        int actual  = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void AmountMoreThan1000 () {
        int amount = 1001;

        int actual  = service.remain(amount);
        int expected = 999;

        Assert.assertEquals(expected, actual);
    }
}
