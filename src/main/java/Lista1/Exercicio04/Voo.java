package Lista1.Exercicio04;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public abstract class Voo
{
    private String origem;
    private String destino;
    private Date data;
    private float distancia;
    protected float taxa;


    public String getOrigem()
    {
        return this.origem;
    }

    public void setOrigem(String origem)
    {
        this.origem = origem;
    }

    public String getDestino()
    {
        return this.destino;
    }

    public void setDestino(String destino)
    {
        this.destino = destino;
    }

    public Date getData()
    {
        return this.data;
    }

    public float getDistancia()
    {
        return this.distancia;
    }

    public void setDistancia(float distancia)
    {
        this.distancia = distancia;
    }

    public float getTaxa()
    {
        return this.taxa;
    }

    public void setTaxa(float taxa)
    {
        this.taxa = taxa/100.0f;
    }

    public void setData(String dataString) throws ParseException
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date data = sdf.parse(dataString);
        this.data = data;
    }

    public abstract float calculaPreco();
}