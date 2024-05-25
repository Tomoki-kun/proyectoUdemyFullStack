
package Tomoki.inventario.servicio;

import Tomoki.inventario.Entidad.Producto;
import java.util.List;


public interface IProductoServicio {
    public List<Producto> listarProductos();
    
    public Producto buscarProductoPorId(Integer idProducto);
    
    public Producto guardarProducto(Producto producto);
    
    public void eliminarProductoPorId(Integer idProducto);
}
