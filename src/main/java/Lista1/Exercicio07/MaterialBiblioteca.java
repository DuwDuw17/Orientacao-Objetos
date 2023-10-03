package Lista1.Exercicio07;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class MaterialBiblioteca {
    private Date dataPublicacao;
    private String titulo;

    public Date getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(String dataString) throws ParseException
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date data = sdf.parse(dataString);
        this.dataPublicacao = data;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
