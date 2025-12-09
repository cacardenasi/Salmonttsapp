package data;

import model.CentroCultivo;
import model.PlantaProceso;
import model.UnidadOperativa;

import java.util.ArrayList;
import java.util.List;

public class GestorUnidades {

    private List<UnidadOperativa> unidades = new ArrayList<>();

    public GestorUnidades() {
        cargarUnidades();
    }

    private void cargarUnidades() {
        unidades.add(new CentroCultivo("Cultivo 1", "Puerto Montt", 300));
        unidades.add(new CentroCultivo("Cultivo 2", "Puerto Montt", 500));
        unidades.add(new PlantaProceso("Planta A", "Puerto Varas", 200));
        unidades.add(new PlantaProceso("Planta B", "Santiago", 350));
    }

    public List<UnidadOperativa> getUnidades() {
        return unidades;
    }

    public void mostrarUnidades() {
        for (UnidadOperativa u : unidades) {
            u.mostrarInformacion();
            System.out.println();
        }
    }
}
