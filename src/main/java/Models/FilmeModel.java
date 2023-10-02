package Models;

import javax.persistence.*;

@Entity
@Table(name="filme")
public class FilmeModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titulo;
    private int anoLancamento;
    private String dataLancamento;
    private int tempoTela;
    private String generoTitulo;
    public FilmeModel(String titulo, int anoLancamento, String dataLancamento, int tempoTela, String generoTitulo){
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.dataLancamento = dataLancamento;
        this.tempoTela = tempoTela;
        this.generoTitulo = generoTitulo;
    }
    public FilmeModel(int id, String titulo, int anoLancamento, String dataLancamento, int tempoTela, String generoTitulo){
        this.id = id;
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.dataLancamento = dataLancamento;
        this.tempoTela = tempoTela;
        this.generoTitulo = generoTitulo;
    }
    public FilmeModel(){

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public int getTempoTela() {
        return tempoTela;
    }

    public void setTempoTela(int tempoTela) {
        this.tempoTela = tempoTela;
    }

    public String getGeneroTitulo() {
        return generoTitulo;
    }

    public void setGeneroTitulo(String generoTitulo) {
        this.generoTitulo = generoTitulo;
    }

    @Override
    public String toString() {
        return "FilmeModel{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", anoLancamento=" + anoLancamento +
                ", dataLancamento='" + dataLancamento + '\'' +
                ", tempoTela=" + tempoTela +
                ", generoTitulo='" + generoTitulo + '\'' +
                '}';
    }

}
