import java.net.*;
public class ClientMain {
                                                                                                                                                       
        public static void main(String[] args) {
                DatagramSocket socket=null;
                                                                                                                                                       
                try {
                                                                                                                                                       
                socket=new DatagramSocket(6000);
                }catch(Exception ex) {ex.printStackTrace();}
                                                                                                                                                       
                Thread t1=new Thread(new ClientSend(socket));
                Thread t2=new Thread(new ClientRec(socket));
                                                                                                                                                       
                t1.start();                                                                                                                            
                t2.start();                                                                                                                            
                                                                                                                                                       
        }                                                                                                                                              
                                                                                                                                                       
                                                                                                                                                       
                                                                                                                                                       
}                    