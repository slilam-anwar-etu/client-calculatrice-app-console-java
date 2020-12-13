
package clientcalculatrice;


public class ClientCalculatrice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        serviceclient.CalculatriceWS_Service service = new serviceclient.CalculatriceWS_Service();
        serviceclient.CalculatriceWS port = service.getCalculatriceWSPort();
        int res = port.add(15, 5);
        System.out.println(res);
        
        
    }


}


