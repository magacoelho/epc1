package es.upm.miw.concesionario;

public class Concesionario {
     GestorVehiculos gestorVehiculos= new GestorVehiculos();
     GestorAlquiler gestorAlquiler= new GestorAlquiler();
     public void darAlta(Vehiculo v){
         gestorVehiculos.darAlta(v);
     }
     public  String todosVehiculos(){
         return gestorVehiculos.todosVehiculos();
     }
     public double determinarAlquiler(int id, int dias){
         
         return gestorAlquiler.determinarAlquiler(id, dias);
     }
}
