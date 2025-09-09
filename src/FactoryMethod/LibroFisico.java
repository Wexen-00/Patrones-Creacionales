package FactoryMethod;

public class LibroFisico implements LibroTipardos {
    @Override
    public void tipolibro() {
        System.out.println("Libro Fisico");
    }
}
