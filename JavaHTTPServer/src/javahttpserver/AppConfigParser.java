package javahttpserver;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.bind.Unmarshaller;

public class AppConfigParser
{
    public Conf parse(String filename) throws URISyntaxException, JAXBException
    {
        //cerca il file nel classpath
        URL resource = getClass().getClassLoader().getResource(filename);
        File file = new File(resource.toURI());
        //istanzia il parser
        JAXBContext jaxbContext = JAXBContext.newInstance(Conf.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        //effettua il parse del contenuto del file all'interno di una istanza della classe
        Conf conf = (Conf) jaxbUnmarshaller.unmarshal(file);
        return conf;
    }
}
