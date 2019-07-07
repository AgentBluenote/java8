package CECS;

 
import java.net.*;
import java.io.*;
 
public class EchoServer {
        ServerSocket serverSocket = null; 
        Socket clientSocket       = null; 
        PrintWriter out           = null; 

    public static void main(String[] args) throws IOException {
         

        if (args.length != 1) {
            System.err.println("Usage: java EchoServer <port number>");
            System.exit(1);
        }
         
        int portNumber = Integer.parseInt(args[0]);
         
        try ( ServerSocket serverSocket = new ServerSocket(Integer.parseInt(args[0]));

              Socket clientSocket = serverSocket.accept();     

              PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);                   

              BufferedReader in = new BufferedReader( new InputStreamReader(clientSocket.getInputStream()));  )
        {
            String inputLine;

                System.out.println("MIKE before in.readLine()" );

            while ((inputLine = in.readLine()) != null) {

                System.out.println("MIKE Home-Boy Trottled that \nmother he blocked until you said let him through  " );

                out.println( inputLine );
            }
        } catch (IOException e) {

            System.out.println("Exception caught when trying to listen on port "
                + portNumber + " or listening for a connection");

            System.out.println(e.getMessage());
        }
    }
}
