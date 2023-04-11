
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * Programa servidor do objeto de mensagens.
 * 
 * Instancia o objeto e registra no binder.
 * 
 * @author osmar
 */
public class Principal {

    public static void main(String args[]) {
        try {
            // Este é o nome pelo qual o serviço ser-a posteriormente localizado
            String nomeServico = "mensagens"; 
            //Cria o objeto a ser servido
            RemoteHello hello = new HelloImpl(); 
            //Cria o stub dinamicamente do objeto a ser servido
            RemoteHello stub = (RemoteHello) UnicastRemoteObject.exportObject(hello, 0);
            // Referência para rmiregistry na porta 1099
            Registry registro = LocateRegistry.getRegistry();
            //Registra o stub no rmiregistry
            registro.bind(nomeServico, stub); 
            System.out.println("Servidor no ar. Nome do objeto no servidor: \'" + nomeServico + "\'");
        } catch (Exception ex) {
            System.out.println("Excecao: " + ex.getMessage());
        }
    }
}
