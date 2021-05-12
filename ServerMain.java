import java.net.*;
public class ServerMain {
                                                                                                                                                       
        public static void main(String[] args) {
                DatagramSocket socket=null;
                                                                                                                                                       
                try {
                                                                                                                                                       
                socket=new DatagramSocket(5000);
                }catch(Exception ex) {ex.printStackTrace();}
                                                                                                                                                       
                Thread t1=new Thread(new ServerSend(socket));
                Thread t2=new Thread(new ServerRec(socket));
                                                                                                                                                       
                t1.start();                                                                                                                            
                t2.start();                                                                                                                            
                                                                                                                                                       
        }                                                                                                                                              
                                                                                                                                                       
                                                                                                                                                       
                                                                                                                                                       
}                    