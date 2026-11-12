import java.util.ArrayList;


public class Carrito{
  
    public void AñadirP(){
  }
  





}


class Inventario{

Videojuegos v = new Videojuegos(0, "", 0, 0);
Figuras f = new Figuras(0, "", 0, 0);
Consolas c = new Consolas(0, "",0 ,0);

  public ArrayList<Productos> Inventarios(){
    
    ArrayList<Productos> I = new ArrayList<>();

    I.addAll(v.Videojuegos_I());
    I.addAll(f.Figuras_I());
    I.addAll(c.Consolas_I());
    
  
    return I;
  }

}
