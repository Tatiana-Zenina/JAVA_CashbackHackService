package ru.netology.service;

public class CashbackHackServiceTest {


    @org.junit.Test //№1 (JUnit 4)
    public void shouldCalculateWhen500J4() {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;
        int expected = 500;
        int actual = service.remain(amount);

        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test // № 1.1 (JUnit 5)
    public void shouldCalculateWhen500J5() {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;
        int expected = 500;
        int actual = service.remain(amount);

        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    @org.junit.Test //№ 2 (JUnit 4)
    public void shouldCalculateWhen1753J4() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1753;
        int expected = 247;
        int actual = service.remain(amount);

        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test //№ 2.1 (JUnit 5)
    public void shouldCalculateWhen1753J5() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1753;
        int expected = 247;
        int actual = service.remain(amount);

        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    @org.junit.Test //№ 3 (JUnit 4)
    public void shouldCalculateWhen999J4() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int expected = 1;
        int actual = service.remain(amount);

        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test //№ 3.1 (JUnit 5)
    public void shouldCalculateWhen999J5() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int expected = 1;
        int actual = service.remain(amount);

        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    @org.junit.Test // №4 (JUnit 4)
    public void shouldCalculateWhen1000J4() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);

        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test // №4.1 (JUnit 5)
    public void shouldCalculateWhen1000J5() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);

        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    @org.junit.Test // №5 (JUnit 4)
    public void shouldCalculateWhen1001J4() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int expected = 999;
        int actual = service.remain(amount);

        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test // №5.1 (JUnit 5)
    public void shouldCalculateWhen1001J5() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int expected = 999;
        int actual = service.remain(amount);

        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }
}