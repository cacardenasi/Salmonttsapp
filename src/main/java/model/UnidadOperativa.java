package model;

public class UnidadOperativa {

    protected String nombre;
    protected String comuna;

    public UnidadOperativa(String nombre, String comuna) {
        this.nombre = nombre;
        this.comuna = comuna;
    }

    public void mostrarInformacion() {
        System.out.println("Unidad Operativa: " + nombre);
        System.out.println("Comuna: " + comuna);
    }

    @Override
    public String toString() {
        return "UnidadOperativa{" +
                "nombre='" + nombre + '\'' +
                ", comuna='" + comuna + '\'' +
                '}';
    }
}
