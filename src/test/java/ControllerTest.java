import org.junit.Assert;

public class ControllerTest {

    @org.junit.Test
    public void perform() {

        Assert.assertTrue(Controller.perform("123", "123", Operation.ADDITION).equals("246"));
        Assert.assertTrue(Controller.perform("-123", "123", Operation.ADDITION).equals("0"));
        Assert.assertTrue(Controller.perform("-123", "123.1118", Operation.ADDITION).equals("0.1118"));
        Assert.assertTrue(Controller.perform("-6.2", "-3.1", Operation.DIVISION).equals("2"));
        Assert.assertTrue(Controller.perform("0", "34", Operation.MULTIPLICATION).equals("0"));
        Assert.assertTrue(Controller.perform("-0.12 +", "-0.3", Operation.ADDITION).equals("-0.42"));
        Assert.assertTrue(Controller.perform("", "6", Operation.MULTIPLICATION).equals("0"));
        Assert.assertTrue(Controller.perform("1.0", "0.0", Operation.MULTIPLICATION).equals("0"));
        Assert.assertTrue(Controller.perform("1.2", "0.3", Operation.SUBTRACTION).equals("0.9"));
        Assert.assertTrue(Controller.perform("1.2 -", "-0.3", Operation.SUBTRACTION).equals("1.5"));
        Assert.assertTrue(Controller.perform("-0.2 +", "-0.3", Operation.SUBTRACTION).equals("0.1"));

    }


}