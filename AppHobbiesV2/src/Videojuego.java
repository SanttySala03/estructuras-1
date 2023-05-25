/**
 * David Santiago Carrillo Salamanca
 */
public class Videojuego {
    private String nombre;
    private String categoria;
    private int ano;

    public Videojuego(String nombre, String categoria, int ano) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.ano = ano;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "\t\nVideojuego\n" +
                "Nombre del Videojuego: " + nombre + "\n" +
                "Categoría: " + categoria + "\n" +
                "Año: " + ano + "\n";
    }
}
