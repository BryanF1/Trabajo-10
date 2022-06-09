package clase10;

public class ProductoControlador 
{
    private Producto producto[];

    private int contador;

    public ProductoControlador(int size)
    {
        this.producto = new Producto[size];

        this.contador = 0;
    }

    
    public void crear(String nombre, double precio, int codigo)
    {
        this.producto[this.contador] = new Producto(nombre, precio, codigo);

        this.contador++;
    }

    public void listar()
    {
        for(int i=0; i<this.contador; i++)
        {

            this.producto[i].verProducto();
        }
    }

    public Producto buscar(int codigo)
    {
        int i;

        for(i=0; i<this.contador; i++)
        {
            if(this.producto[i].mostrarCodigo()== codigo)
            {
                break;
            }
        }

        if(i == this.contador)
        {
            return null;

        } else {

            return this.producto[i];
        }
    }

    

}