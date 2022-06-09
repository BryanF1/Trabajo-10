package clase10;

public class Producto 
{
    private int codigo;
    private String nombre;
    private double precio;

    Producto(String nombre, double precio, int codigo)
    {
        this.codigo = codigo;

        this.nombre = nombre;

        this.precio = precio;
    }

    public void establecerCodigo(int codigo) 
    {
        this.codigo = codigo;
    }
    public int mostrarCodigo()
    {
        return codigo;
    }

    public void establecerNombres(String nombre) 
    {
        this.nombre = nombre;
    }
    public String mostrarNombres() 
    {
        return nombre;
    }
    
    public void establecerPrecio(double precio) 
    {
        this.precio = precio;
    }
    public double mostrarPrecio() 
    {
        return precio;
    }
    public void verProducto()
    {
        System.out.println("Codigo: "+ this.mostrarCodigo());
        System.out.println("Nombre: "+ this.mostrarNombres());
        System.out.println("Precio: "+ this.mostrarPrecio());
    }

}