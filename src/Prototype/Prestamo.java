package Prototype;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Prestamo implements Cloneable {
    private String Libro;
    private String Usuario;
    private String FechaInicio;
    private String FechaFin;

    @Override
    public Prestamo clone(){
        try {
            return (Prestamo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
    public void mostrar(){
        System.out.println("Libro: " + Libro + " Usuario: " + Usuario +  " " + FechaInicio + " al " + FechaFin);
    }
}
