package model;

public class PlantaProceso extends UnidadOperativa {

    private int capacidadProceso;

    public PlantaProceso(String nombre, String comuna, int capacidadProceso) {
        super(nombre, comuna);
        this.capacidadProceso = capacidadProceso;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("=== Planta de Proceso ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Comuna: " + comuna);
        System.out.println("Capacidad: " + capacidadProceso + " toneladas/día");
    }

    @Override
    public String toString() {
        return "PlantaProceso{" +
                "nombre='" + nombre + '\'' +
                ", comuna='" + comuna + '\'' +
                ", capacidadProceso=" + capacidadProceso +
                '}';
    }
}
