
import java.io.*;
import java.net.*;
public class Server1 {
public static void main(String[] args) {
try {
ServerSocket serverSocket = new ServerSocket(1234);
System.out.println("Server started. Waiting for client connection...");
Socket clientSocket = serverSocket.accept();
System.out.println("Client connected!");
BufferedReader in = new BufferedReader(new
InputStreamReader(clientSocket.getInputStream()));
PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
String clientString = in.readLine();
System.out.println("Received from client: " + clientString);
String originalString = clientString.replaceAll("\\s+", "").toLowerCase();
int start = 0;
int end = originalString.length() - 1;
boolean isPalindrome = true;
while (start < end) {
if (originalString.charAt(start) != originalString.charAt(end)) {
isPalindrome = false;
break;
}
start++;
end--;
}
if (isPalindrome) {
out.println("The string is a palindrome.");
} else {
out.println("The string is not a palindrome.");
}
in.close();
out.close();
clientSocket.close();
serverSocket.close();
} catch (IOException e) {
e.printStackTrace();
}
}
}
