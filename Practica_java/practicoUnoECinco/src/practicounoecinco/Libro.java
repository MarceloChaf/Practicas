package practicounoecinco;

public class Libro {
    private String titulo,autor;
    private int nPag;

    public Libro(String titulo, String autor, int nPag) {
        this.titulo = titulo;
        this.autor = autor;
        this.nPag = nPag;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setnPag(int nPag) {
        this.nPag = nPag;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getnPag() {
        return nPag;
    }
    
    public void datos(){
        System.out.println("el titulo del libro es: "+titulo.toUpperCase()
                           +"\ny el autor del libro es: "+autor.toUpperCase());
    }
    
}
