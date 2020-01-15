package javahttpserver;

import java.io.File;
import java.io.StringWriter;
import java.net.URISyntaxException;
import java.net.URL;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class AppClientParser
{
    public Cliente parse(Cliente client) throws URISyntaxException, JAXBException
    {
        //istanzia il parser
        JAXBContext jaxbContext = JAXBContext.newInstance(Cliente.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        StringWriter sw = new StringWriter();
             
        //Write XML to StringWriter
        jaxbMarshaller.marshal(client, sw);

        //Verify XML Content
        String xmlContent = sw.toString();
        System.out.println( xmlContent );
        return client;
    }
}
