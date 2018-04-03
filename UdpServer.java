import java.io.*;
import java.net.*;
 class UdpServer
{
public static void main(String args[]) throws Exception
      {
      DatagramSocket serverSocket = new DatagramSocket(4444);
            byte[] receiveData = new byte[1024];
            byte[] sendData = new byte[1024];
