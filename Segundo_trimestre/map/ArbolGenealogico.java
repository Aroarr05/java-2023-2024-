package map;

/*Árbol genealógico: usa un Map para presentar un árbol genealógico, almacenado
 * las relaciones de parentesco, y luego implementa funciones para encontrar
 */
import java.util.*;
 public class ArbolGenealogico {
    private Map<String, List<String>> mapaGenealogico;

    public ArbolGenealogico() {
        this.mapaGenealogico = new HashMap<>();
    }

    public void agregarRelacion(String persona, List<String> hijos) {
        mapaGenealogico.put(persona, hijos);
    }

    public List<String> encontrarAncestros(String persona) {
        List<String> ancestros = new ArrayList<>();
        encontrarAncestrosRecursivo(persona, ancestros);
        return ancestros;
    }

    private void encontrarAncestrosRecursivo(String persona, List<String> ancestros) {
        for (Map.Entry<String, List<String>> entry : mapaGenealogico.entrySet()) {
            List<String> hijos = entry.getValue();
            if (hijos.contains(persona)) {
                ancestros.add(entry.getKey());
                encontrarAncestrosRecursivo(entry.getKey(), ancestros);
            }
        }
    }

    public List<String> encontrarDescendientes(String persona) {
        List<String> descendientes = new ArrayList<>();
        encontrarDescendientesRecursivo(persona, descendientes);
        return descendientes;
    }

    private void encontrarDescendientesRecursivo(String persona, List<String> descendientes) {
        if (mapaGenealogico.containsKey(persona)) {
            List<String> hijos = mapaGenealogico.get(persona);
            descendientes.addAll(hijos);
            for (String hijo : hijos) {
                encontrarDescendientesRecursivo(hijo, descendientes);
            }
        }
    }

    public static void main(String[] args) {
        ArbolGenealogico arbol = new ArbolGenealogico();

        // Agregar relaciones de parentesco
        arbol.agregarRelacion("Juan", Arrays.asList("María", "Pedro"));
        arbol.agregarRelacion("María", Arrays.asList("Luisa", "Carlos"));
        arbol.agregarRelacion("Carlos", Arrays.asList("Ana", "Miguel"));

        // Encontrar ancestros de "Miguel"
        List<String> ancestrosMiguel = arbol.encontrarAncestros("Miguel");
        System.out.println("Ancestros de Miguel: " + ancestrosMiguel);

        // Encontrar descendientes de "Juan"
        List<String> descendientesJuan = arbol.encontrarDescendientes("Juan");
        System.out.println("Descendientes de Juan: " + descendientesJuan);
    }
}