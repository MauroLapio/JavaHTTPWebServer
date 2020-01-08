package javahttpserver;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Conf
{
    private int port; //porta di connessione
    private String index; //pagina iniziale
    private String notfound; //pagina di errore 404
    private String notsupported; //pagina di errore metodo non supportato

    public int getPort()
    {
        return port;
    }

    public void setPort(int port)
    {
        this.port = port;
    }

    public String getIndex()
    {
        return index;
    }

    public void setIndex(String index)
    {
        this.index = index;
    }

    public String getNotfound()
    {
        return notfound;
    }

    public void setNotfound(String notfound)
    {
        this.notfound = notfound;
    }

    public String getNotsupported()
    {
        return notsupported;
    }

    public void setNotsupported(String notsupported)
    {
        this.notsupported = notsupported;
    }

    @Override
    public String toString()
    {
        return "Conf{" + "port=" + port + ", index=" + index + ", notfound=" + notfound + ", notsupported=" + notsupported + '}';
    }
}

