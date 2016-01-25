import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IpAddressConverterTest {
    long ipNumber;
    String ip;

    @Test
    public void testSimpleCorrect() {
        ip = "127.0.0.1";
        ipNumber = 2130706433;
        assertEquals(ipNumber, IpAddressConverter.ipAddressToIpNumber(ip));
    }

    @Test(expected=IllegalArgumentException.class)
    public void testSimpleNotCorrect() {
        ip = "192.168.0.1";
        //ipNumber = 211106243543040;
        //assertNotEquals(ipNumber, IpAddressConverter.ipAddressToIpNumber(ip));
    }
}
