package clase10;

public class Main 
{
    public static void main(String args[])
    {
        ProductoControlador productoC = new ProductoControlador(4);

        productoC.crear("casaquera",40f,2782652);
        productoC.crear("pantalon",100.9f,4982475);
        productoC.crear("polo",122.5f,54358723);
        productoC.crear("chanclas",23f,1234029);


        productoC.listar();
      
        System.out.println("------------- Buscar Producto -------------");

        int producto = 1234029;

        Producto encontrado;

        encontrado = productoC.buscar(producto);

        if(encontrado != null)
        {
            System.out.println("Producto encontrado: "+encontrado.mostrarNombres());

        } else {

            System.out.println("No se encontro: "+producto);
        }

    }
}
