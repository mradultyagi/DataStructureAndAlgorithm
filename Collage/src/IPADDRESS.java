import java.net.InetAddress;
import java .util.*;
public class IPADDRESS {
    public static void main(String[] args) {
        try{
            InetAddress ip = InetAddress.getByName("www.ipe.org");
            System.out.println("host name"+ip.getHostName());
            System.out.println("ip address" + ip.getHostAddress());
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
