
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Interface dos métodos remotos.
 * 
 * @author osmar
 */
public interface RemoteHello extends Remote {

    public String getMensagem() throws RemoteException;

    public void setMensagem(String msg) throws RemoteException;
}
