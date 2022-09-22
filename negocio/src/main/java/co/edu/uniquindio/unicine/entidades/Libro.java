package co.edu.uniquindio.unicine.entidades;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Libro implements Serializable {

    @Id
    private String ibsn;

    private String nombre;

    private int unidades;

    private int anio;

    @Enumerated(EnumType.STRING)
    private Genero genero;

    public Libro() {
    }

    public Libro(String ibsn, String nombre, int unidades, int anio) {
        this.ibsn = ibsn;
        this.nombre = nombre;
        this.unidades = unidades;
        this.anio = anio;
    }

    public String getIbsn() {
        return ibsn;
    }

    public void setIbsn(String ibsn) {
        this.ibsn = ibsn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Libro libro = (Libro) o;

        return Objects.equals(ibsn, libro.ibsn);
    }

    @Override
    public int hashCode() {
        return ibsn != null ? ibsn.hashCode() : 0;
    }
}
