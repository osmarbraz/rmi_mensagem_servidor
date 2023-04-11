
import java.rmi.RemoteException;

/**
 * Classe que implementa os métodos remotos.
 * 
 * @author osmar
 */
public class HelloImpl implements RemoteHello {

    private String mensagem;

    public HelloImpl() throws RemoteException {
        this("inicial");
    }

    public HelloImpl(String mensagem) throws RemoteException {
        setMensagem(mensagem);
    }

    @Override
    public String getMensagem() throws RemoteException {
        return mensagem;
    }

    @Override
    public void setMensagem(String mensagem) throws RemoteException {
        this.mensagem = mensagem;
    }
}
