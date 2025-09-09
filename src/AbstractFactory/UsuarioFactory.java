package AbstractFactory;

public class UsuarioFactory implements AbstractFactory {
    @Override
    public InterfazUI crearUI() {
        return new UsuarioUI();
    }

    @Override
    public MetodoEnvio crearEnvio() {
        return new EnvioNormal(); // Usuario normal tiene envío estándar
    }
}
