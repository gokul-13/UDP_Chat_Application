import java.net.*;
public class ClientSend implements Runnable{
                                                                                                                                                       
        DatagramSocket socket;                                                                                                                         
        DatagramPacket pack;                                                                                                                           
                                                                                                                                                       
        public ClientSend(DatagramSocket s) {this.socket=s;}
                                                                                                                                                       
                                                                                                                                                       
        public void run(){
                                                                                                                                                       
                                                                                                                                                       
                while(true) {
                String msg= new java.util.Scanner(System.in).nextLine();
                                                                                                                                                       
                byte[] buffer=msg.getBytes();
                try {
                 pack=new DatagramPacket(buffer,buffer.length,InetAddress.getByName("localhost"),5000);
                }catch(Exception ex) {
                }                                                                                                                                      
                try {
                socket.send(pack);                                                                                                                     
                                                                                                                                                       
                }                                                                                                                                      
                catch(Exception ex) {
                        ex.printStackTrace();                                                                                                          
                }                                                                                                                                      
                                                                                                                                                       
                }                                                                                                                                      
                                                                                                                                                       
        }                                                                                                                                              
}                                      