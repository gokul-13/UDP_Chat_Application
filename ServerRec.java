import java.net.*;
import java.util.*;
public class ServerRec implements Runnable{
                                                                                                                                                       
        DatagramSocket socket;                                                                                                                         
                                                                                                                                                       
        public ServerRec(DatagramSocket s) {this.socket=s;}
                                                                                                                                                       
                                                                                                                                                       
        public void run(){
                                                                                                                                                       
                                                                                                                                                       
                while(true) {
                byte[] buffer=new byte[200];
                DatagramPacket pack=new DatagramPacket(buffer,200);
                try {
                socket.receive(pack);                                                                                                                  
                System.out.println("Client:<--"+parse(buffer));
                }                                                                                                                                      
                catch(Exception ex) {
                        ex.printStackTrace();                                                                                                          
                }                                                                                                                                      
                buffer=new byte[200];
                                                                                                                                                       
                }                                                                                                                                      
                                                                                                                                                       
        }                                                                                                                                              
                                                                                                                                                       
        public static  synchronized String parse(byte[] buf) {
                                                                                                                                                       
                int i=0;
                String ans="";
                while(buf[i]!=0) {ans+=(char)buf[i];i++;}
                return ans;
                                                                                                                                                       
        }                                                                                                                                              
}                                                   