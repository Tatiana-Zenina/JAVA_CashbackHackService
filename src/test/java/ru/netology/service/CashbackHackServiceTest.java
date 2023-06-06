package ru.netology.service;


public class CashbackHackServiceTest {


    @org.testng.annotations.Test //№1
    public void shouldCalculateWhen500() {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;
        int expected = 500;
        int actual = service.remain(amount);

        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test //№2
    public void shouldCalculateWhen1753() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1753;
        int expected = 247;
        int actual = service.remain(amount);

        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test //№3
    public void shouldCalculateWhen999() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int expected = 1;
        int actual = service.remain(amount);

        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test //№4
    public void shouldCalculateWhen1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);

        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test //№5
    public void shouldCalculateWhen1001() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int expected = 999;
        int actual = service.remain(amount);

        org.testng.Assert.assertEquals(actual, expected);
    }
}