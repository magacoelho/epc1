package es.upm.miw.concesionario;

public class Coche extends Vehiculo{
    private char categoria;

    public Coche(Integer id, String descripcion, char categoria) {
        super(id, descripcion);
        this.categoria = categoria;
    }

    public Coche() {
        super();
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Coche [categoria=" + categoria + ", getId()=" + getId() + ", getDescripcion()="
                + getDescripcion() + "]";
    }

    @Override
    public double determinarAlquiler(int dias) {
        double precioBase=0.0;
        double valor=0.0;
        switch(this.categoria){
        case 'A': precioBase=10;
                  break;
        case 'B': precioBase=15;
                  break;
        case 'C': precioBase=20;          
        
        }
        if(dias<=3){
             valor = precioBase*dias;
             }
        else{
             if (dias<=7){
                  valor = precioBase*3+precioBase*0.8 *(dias-3);
             }
             else{
                 valor = precioBase*3+precioBase*4+precioBase*(dias-7);
             }
        }
        
        return valor;
    }

   
    
   
}
