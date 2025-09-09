package FactoryMethod;

public class LogisticaLibro {
    public static LibroTipardos fabricarLibro(String tipo) {
        switch (tipo) {
            case "Fisico": return new LibroFisico();
            case "Digital": return new LibroDigital();
            default: throw new IllegalArgumentException("Tipo de libro no encontrado");
        }
    }
}
