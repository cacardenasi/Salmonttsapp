package model;

public class CentroCultivo extends UnidadOperativa {

    private double toneladasProduccion;

    public CentroCultivo(String nombre, String comuna, double toneladasProduccion) {
        super(nombre, comuna);
        this.toneladasProduccion = toneladasProduccion;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("=== Centro de Cultivo ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Comuna: " + comuna);
        System.out.println("Producción: " + toneladasProduccion + " toneladas");
    }

    @Override
    public String toString() {
        return "CentroCultivo{" +
                "nombre='" + nombre + '\'' +
                ", comuna='" + comuna + '\'' +
                ", toneladasProduccion=" + toneladasProduccion +
                '}';
    }
}
