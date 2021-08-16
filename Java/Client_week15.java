import java.net.*;
import java.util.*;
import java.io.*;

class Client_week15{
    public static void main(String... args) throws Exception {
        final String host = "localhost";
        final int port = 1064;
        Socket s = new Socket(host,port);

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter radius to send to server :");
        int radius = sc.nextInt();
        
        OutputStreamWriter osr = new OutputStreamWriter(s.getOutputStream());
        PrintWriter p = new PrintWriter(osr);
        p.println(radius);
        osr.flush();

        InputStreamReader isr = new InputStreamReader(s.getInputStream());
        BufferedReader b = new BufferedReader(isr);
        String server_area = b.readLine();
        System.out.println("Area is :"+server_area);
        System.out.println("Server Disconnected");
    }
}