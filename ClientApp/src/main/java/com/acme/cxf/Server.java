package com.acme.cxf;

import com.acme.cxf.impl.HelloServiceImpl;
import jakarta.xml.ws.Endpoint;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class Server {
        public static void main(String[] args) {
            String address = "http://localhost:8088/services/hello";
            JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
            factory.setServiceClass(HelloServiceImpl.class);
            factory.setAddress(address);
            factory.create();
            System.out.println("WSDL: " + address + "?wsdl");
        }

}