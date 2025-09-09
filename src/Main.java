import AbstractFactory.*;
import FactoryMethod.LibroDigital;
import FactoryMethod.LibroFisico;
import FactoryMethod.LibroTipardos;
import FactoryMethod.LogisticaLibro;
import Prototype.Prestamo;
import Singleton.Biblioteca;
import Builder.Usuario;

public class Main {
    public static void main(String[] args) {
        //Singleton
                Biblioteca biblioteca = Biblioteca.getInstancia();
                biblioteca.agregarLibro("puto", "Agus", "el falopero del gonza");
                biblioteca.listarLibros();
        //FactoryMethod
                LibroTipardos Fisico = LogisticaLibro.fabricarLibro("Fisico");
                LibroTipardos Digital = LogisticaLibro.fabricarLibro("Digital");
                Fisico.tipolibro();
                Digital.tipolibro();
        //AbstractFactory
        //Administrador
                AbstractFactory adminFactory = new AdminFactory();
                InterfazUI adminUI = adminFactory.crearUI();
                MetodoEnvio adminEnvio = adminFactory.crearEnvio();
                adminUI.mostrar();
                adminEnvio.enviar();
        //Normal
        AbstractFactory usuarioFactory = new UsuarioFactory();
                InterfazUI usuarioUI = usuarioFactory.crearUI();
                MetodoEnvio usuarioEnvio = usuarioFactory.crearEnvio();
                usuarioUI.mostrar();
                usuarioEnvio.enviar();
        //Builder
        Usuario u = new Usuario.Builder()
                .setnombre("Fernet")
                .setapellido("GORILA")
                .setdireccion("Putio")
                .build();
        u.mostrar();
        //Prototype
                // Original
                Prestamo original = new Prestamo("Los pituficums", "Licenciado Agustin aguilera el gilaso, es como que el agus se volvio una jojo reference", "10/11/2025", "11/11/2025");
                // Clon 1
                Prestamo clon1 = original.clone();
                clon1.setUsuario("Licenciado George");
                clon1.setFechaFin("25/09/2025");
                // Clon 2
                Prestamo clon2 = original.clone();
                clon2.setUsuario("Usuario Ano");
                clon2.setLibro("Cien Años de Anal");

                original.mostrar();
                clon1.mostrar();
                clon2.mostrar();
    }
}