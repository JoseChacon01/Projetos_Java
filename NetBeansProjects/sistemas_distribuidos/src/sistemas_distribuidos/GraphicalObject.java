
package sistemas_distribuidos;
import java.rmi.*;
import java.util.Vector;
/**
 *
 * @author josem
 */
public class GraphicalObject {
    public interface Shape extends Remote{
        int getVersion()throws RemoteException; 
        GraphicalObject getAllState()throws RemoteException;  
    }
    public interface ShapeList extends Remote {
        Shape newShaper(GraphicalObject g) throws RemoteException;
        Vector allShapest()throws RemoteException;
        int getVersion()throws RemoteException;
    }
}
