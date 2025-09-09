package Builder;

public class Usuario {
    private String nombre;
    private String apellido;
    private String direccion;

    public static class Builder {
        private String nombre;
        private String apellido;
        private String direccion;
        public Builder setnombre(String nombre) { this.nombre = nombre; return this; }
        public Builder setapellido(String apellido) { this.apellido = apellido; return this; }
        public Builder setdireccion(String direccion) { this.direccion = direccion; return this; }
        public Usuario build() {
            return new Usuario(this);
        }
    }
    private Usuario(Builder builder) {
        this.nombre = builder.nombre;
        this.apellido = builder.apellido;
        this.direccion = builder.direccion;
    }
    public void mostrar() {
        System.out.println( nombre + " " + apellido + " " + direccion);
    }
}