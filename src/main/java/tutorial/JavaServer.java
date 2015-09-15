package tutorial;

import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
import org.apache.thrift.transport.TTransportException;



public class JavaServer {

    public static void main(String[] args) throws TTransportException{
        DemoHandler handler = new DemoHandler();
        Demo.Processor<Demo.Iface> processor = new Demo.Processor<Demo.Iface>(handler);
        
        TServerTransport serverTransport = new TServerSocket(8080);
        TServer server = new TSimpleServer(new TServer.Args(serverTransport).processor(processor));
        
        server.serve();
    }
}
