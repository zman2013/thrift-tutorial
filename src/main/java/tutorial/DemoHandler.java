package tutorial;

import org.apache.thrift.TException;


public class DemoHandler implements Demo.Iface{

    @Override
    public String sayHello(String msg) throws TException {
        System.out.println( "server is working ..." );
        System.out.println( "request: " + msg );
        String response = "asdfflkjasd";
        System.out.println( "response: " + response );
        return response;
    }

}
