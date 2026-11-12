import java.awt.List;
import java.util.ArrayList;

public abstract class Productos{
  private int id;
  private String nombre;
  private int precio;
  private int stock;

  public int getid(){
    return id;
  }
  
  
  public String getnombre(){
    return nombre;
  }

  public int getprecio(){
    return precio;
  }

  public int getstock(){
    return stock;
  }
  
  public Productos(int id, String nombre, int precio, int stock){
    this.id = id;
    this.nombre = nombre;
    this.precio = precio;
    this.stock = stock;
  }


@Override 
public String toString(){
  return "ID: " + this.getid() + " " +  "Producto: "  + this.getnombre() + " " +  "Precio: " + this.getprecio() + System.lineSeparator(); 
}

}


class Videojuegos extends Productos{

  public Videojuegos(int id, String nombre, int precio, int stock){
    super(id, nombre, precio, stock);
  }
  
  public ArrayList<Productos> Videojuegos_I(){

    ArrayList<Productos> v = new ArrayList<>();

    v.add(new Videojuegos(1, "The Legend of Zelda: Ocarina of time", 50, 50));
    v.add(new Videojuegos(1, "Grand Theft Auto IV", 100, 100));
   
    return v;
  }


}



class Figuras extends Productos{

  public Figuras(int id, String nombre, int precio, int stock){
    super(id, nombre, precio, stock);
  }

  public ArrayList<Productos> Figuras_I(){

  ArrayList<Productos> f = new ArrayList<>();

    f.add(new Figuras(2, "Estatuilla Sekiro", 20, 10));
    f.add(new Figuras(2, "Amiibo Splatoon", 30, 10));
  
    return f;
  
  }

}


class Consolas extends Productos{

  public Consolas(int id, String nombre, int precio, int stock){
    super(id, nombre, precio, stock);
  } 

  public ArrayList<Productos> Consolas_I(){
  
  ArrayList<Productos> c = new ArrayList<>();

  c.add(new Consolas(3, "PS5", 500, 3));  
  c.add(new Consolas(3, "NS2", 400, 5));
  
  
    return c;
  }


}







