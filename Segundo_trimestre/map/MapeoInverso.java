
/*
 * Dado un Map de empleado y sus de partamentos y sus respectivos departamentos,
 * crea un nuevo Map que use el departamento como clave y un Set de empleados
 * como valor.
 */

package map;

import java.util.*;

public class MapeoInverso {
    public static void main(String[] args) {
        HashMap<String,String> empleados =new HashMap<>();

        empleados.put("Juan","Ventas");
        empleados.put("María","Ventas");
        empleados.put("Pedro","Recursos Humanos");
        empleados.put("Ana","Recursos Humanos");
        empleados.put("Luis","Finanzas");
        
        HashMap<String, List<String>> departamentos = new HashMap<String, List<String>>();
        
        for (Map.Entry<String,String> elemento : empleados.entrySet()) {

            String departamento = elemento.getValue();
            String empleado = elemento.getKey();

            System.out.println(elemento.getValue());

            //if para comprobar

            if(departamentos.containsKey(departamento)){
                
                List<String>listaTemporal=new ArrayList<String>();
                listaTemporal=departamentos.get(departamento);
                listaTemporal.add(empleado);
                departamentos.put(departamento,listaTemporal);
               
            }else{
                List<String> listaTemporal = new ArrayList<String>();
                listaTemporal.add(empleado);
                  
                departamentos.put(departamento,listaTemporal);
            }  
        }
         for(Map.Entry<String, List<String>> elemento : departamentos.entrySet()) {
            System.out.println(elemento);
        }
        departamentos.put("Ventas", Arrays.asList("Juan","Maria"));
    }
}
