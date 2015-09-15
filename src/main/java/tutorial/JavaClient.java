package tutorial;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

import tutorial.Demo.Client;


public class JavaClient {

    public static void main(String[] args) throws TException{
        TTransport transport = new TSocket("localhost", 8080);
        transport.open();
        
        
        TProtocol protocol = new TBinaryProtocol(transport);
        Demo.Client client = new Demo.Client(protocol);
        
        perform(client);
        
        transport.close();
    }

    private static void perform(Client client) throws TException {
        String request = "nihao";
        System.out.println( "request:" + request );
        String response = client.sayHello( request );
        System.out.println( "response: " + response );
    }
}
