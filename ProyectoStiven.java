package ProyectoStiven;

public class ProyectoStiven {
  public static void main(String[] args) {
    
  }
   String nombre;
   double precio;
   int stock;

  public ProyectoStiven(String nombre, double precio, int stock) {
      this.nombre = nombre;
      this.precio = precio;
      this.stock = stock;
   }

   @Override
  public String toString() {
    return "producto {" +
           "nombre='" + nombre + '\'' +
           ", precio=" + precio +
           ", stock=" + stock +
           '}';
   }

   @Override
  public boolean equals(Object obj) {
     if (this == obj) return true;
     if (obj == null || getClass() != obj.getClass()) return false;
     ProyectoStiven producto = (ProyectoStiven) obj;
     return nombre.equals(producto.nombre);
  }               

   @Override
  public int hashCode() {
    return nombre.hashCode();
  }

}
