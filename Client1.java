import java.io.*;
import java.net.*;
public class Client1 {
public static void main(String[] args) {
try {
Socket socket = new Socket("localhost", 1234);
BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
System.out.print("Enter a string: ");
String userString = userInput.readLine();
out.println(userString);
String response = in.readLine();
System.out.println("Server: " + response);
userInput.close();
in.close();
out.close();
socket.close();
} catch (IOException e) {
e.printStackTrace();
}
}
}