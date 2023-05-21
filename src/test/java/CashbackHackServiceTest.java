import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    @org.junit.Test
    public void AddedAmountForCashback() {
        int amount = 500;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        int expected = 500;
        org.junit.Assert.assertEquals(expected,actual);
    }
    @org.junit.Test
    public void AddedAmountForCashback1() {
        int amount = 999;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        int expected = 1;
        org.junit.Assert.assertEquals(expected,actual);
    }
    @org.junit.Test
    public void AddedAmountForCashback2() {
        int amount = 1000;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        int expected = 0;
        org.junit.Assert.assertEquals(expected,actual);
    }
    @org.junit.Test
    public void AddedAmountForCashback3() {
        int amount = 1001;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        int expected = 999;
        org.junit.Assert.assertEquals(expected,actual);
    }

}