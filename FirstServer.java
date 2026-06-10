
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
public class FirstServer{
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(8001);
        System.out.println("server is running at 8001 port");
        Socket socket= ss.accept();
        System.out.println("socket");
        System.out.println("connection established");
        DataInputStream din = new DataInputStream(socket.getInputStream());
        int num=din.readInt();
        num=num*num;
        DataOutputStream  dout= new DataOutputStream(socket.getOutputStream());
        dout.writeInt(num);
        dout.close();
        din.close();
        socket.close();
        ss.close();
        
    }
}
