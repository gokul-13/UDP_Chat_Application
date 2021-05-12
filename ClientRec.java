import java.net.*;
public class ClientRec implements Runnable{
                                                                                                                                                       
        DatagramSocket socket;                                                                                                                         
                                                                                                                                                       
        public ClientRec(DatagramSocket s) {this.socket=s;}
                                                                                                                                                       
                                                                                                                                                       
        public void run(){
                                                                                                                                                       
                                                                                                                                                       
                while(true) {
                byte[] buffer=new byte[1024];
                DatagramPacket pack=new DatagramPacket(buffer,1024);
                try {
                socket.receive(pack);                                                                                                                  
                System.out.println("Server:<--"+parse(buffer));
                }                                                                                                                                      
                catch(Exception ex) {
                        ex.printStackTrace();                                                                                                          
                }                                                                                                                                      
                                                                                                                                                       
                }                                                                                                                                      
                                                                                                                                                       
        }                                                                                                                                              
                                                                                                                                                       
                                                                                                                                                       
        public static  synchronized String parse(byte[] buf) {
                                                                                                                                                       
                int i=0;
                String ans="";
                while(buf[i]!=0) {ans+=(char)buf[i];i++;}
                return ans;
                                                                                                                                                       
        }                                                                                                                                              
}                                  