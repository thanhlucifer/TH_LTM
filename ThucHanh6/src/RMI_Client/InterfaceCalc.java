/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI_Client;
import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author ad
 */
public interface InterfaceCalc extends Remote {
    
    public int sum(int a, int b) throws RemoteException ;
    public PhanSo sum(PhanSo a, PhanSo b) throws RemoteException ;
}
