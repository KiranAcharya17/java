import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class FirstClient {
    public static void main(String[] args) throws Exception {
        Socket socket =new Socket("localhost",8001);
        System.out.println("connection sucess");
        DataOutputStream dout=new DataOutputStream(socket.getOutputStream());
        dout.writeInt(5);
        DataInputStream din = new DataInputStream(socket.getInputStream());
        int num =din.readInt();
        System.out.println("squre is :"+num);
        din.close();
        dout.close();
        socket.close();
        
    }
    
}
