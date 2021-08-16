import java.net.*;
import java.io.*;
import java.math.*;

public class Server_week15{
    public static void main(String... args) throws Exception {
        System.out.println("Server Started");
        int port = 1064;
        ServerSocket server_socket = new ServerSocket(port);
        System.out.println("Server is wqaiting for the client");
        Socket socket = server_socket.accept();
        System.out.println("Client connected to the server");
        InputStreamReader isr = new InputStreamReader(socket.getInputStream());
        BufferedReader b = new BufferedReader(isr);
        String client_radius = b.readLine();
        int r = Integer.parseInt(client_radius);
        System.out.println("Client Data :"+client_radius);
        Double area = (Math.PI)*r*r;

        OutputStreamWriter osw = new OutputStreamWriter(socket.getOutputStream());
        PrintWriter pw = new PrintWriter(osw);
        pw.println(area);
        pw.flush();
    }
}