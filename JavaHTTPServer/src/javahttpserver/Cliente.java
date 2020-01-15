package javahttpserver;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Cliente
{
    String cognome;
    String città;
    int id;
    
    public Cliente()
    {
        this.cognome = "Luhwpeeo";
        this.città = "Firenze";
        this.id = 42069;
    }

    @XmlElement
    public String getCognome()
    {
        return cognome;
    }

    public void setCognome(String cognome)
    {
        this.cognome = cognome;
    }

    @XmlElement
    public String getCittà()
    {
        return città;
    }

    public void setCittà(String città)
    {
        this.città = città;
    }

    @XmlElement
    public int getId() {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    @Override
    public String toString()
    {
        return "Cliente{" + "cognome=" + cognome + ", citt\u00e0=" + città + ", id=" + id + '}';
    }
}
