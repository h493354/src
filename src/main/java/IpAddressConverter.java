public class IpAddressConverter {
        public static long ipAddressToIpNumber(String ipAddress) {
            // mi�rt kell static-nak lennie?

                final long FIRST_IP_BYTE = 16777216;
                final long SECOND_IP_BYTE = 65536;
                final long THIRD_IP_BYTE = 256;

                String[] ipAddressParts;
                long ipNumber;

                ipAddressParts = ipAddress.trim().split("\\.");

                ipNumber = FIRST_IP_BYTE * Long.parseLong(ipAddressParts[0])
                        + SECOND_IP_BYTE * Long.parseLong(ipAddressParts[1])
                        + THIRD_IP_BYTE * Long.parseLong(ipAddressParts[2])
                        + Long.parseLong(ipAddressParts[3]);

                return ipNumber;
        }
}


