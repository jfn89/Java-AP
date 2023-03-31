package principal;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
	class Producto {
	    private String nombre;
	    private double precio;

	    public Producto(String nombre, double precio) {
	        this.nombre = nombre;
	        this.precio = precio;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public double getPrecio() {
	        return precio;
	    }
	}

	class ItemCarrito {
	    private Producto producto;
	    private int cantidad;

	    public ItemCarrito(Producto producto, int cantidad) {
	        this.producto = producto;
	        this.cantidad = cantidad;
	    }

	    public Producto getProducto() {
	        return producto;
	    }

	    public int getCantidad() {
	        return cantidad;
	    }

	    public double getPrecio() {
	        return cantidad * producto.getPrecio();
	    }
	}

	class Carrito {
	    private List<ItemCarrito> items;

	    public Carrito() {
	        items = new ArrayList<>();
	    }

	    public void addItem(ItemCarrito item) {
	        items.add(item);
	    }

	    public double precio() {
	        double precio = 0;
	        for (ItemCarrito item : items) {
	            precio += item.getPrecio();
	        }
	        return precio;
	    }
	    
	    public List<ItemCarrito> getItems() {
	        return items;
	    }
	}

	abstract class Descuento {
	    private String descripcion;
	    private double porcentajeDescuento;

	    public Descuento(String descripcion, double porcentajeDescuento) {
	        this.descripcion = descripcion;
	        this.porcentajeDescuento = porcentajeDescuento;
	    }

	    public String getDescripcion() {
	        return descripcion;
	    }

	    public double getPorcentajeDescuento() {
	        return porcentajeDescuento;
	    }

	    public abstract double getDescuento(Carrito carrito);
	}

	class DescuentoPorCantidad extends Descuento {
	    private int cantidadMinima;
	    private double descuentoAdicional;

	    public DescuentoPorCantidad(String descripcion, double porcentajeDescuento, int cantidadMinima, double descuentoAdicional) {
	        super(descripcion, porcentajeDescuento);
	        this.cantidadMinima = cantidadMinima;
	        this.descuentoAdicional = descuentoAdicional;
	    }

	    public double getDescuento(Carrito carrito) {
	        int cantidadTotal = 0;
	        for (ItemCarrito item : carrito.getItems()) {
	            cantidadTotal += item.getCantidad();
	        }
	        if (cantidadTotal >= cantidadMinima) {
	            return super.getPorcentajeDescuento() + descuentoAdicional;
	        } else {
	            return super.getPorcentajeDescuento();
	        }
	    }
	}

	class DescuentoPorMonto extends Descuento {
	    private double montoMinimo;
	    private double descuentoAdicional;

	    public DescuentoPorMonto(String descripcion, double porcentajeDescuento, double montoMinimo, double descuentoAdicional) {
	        super(descripcion, porcentajeDescuento);
	        this.montoMinimo = montoMinimo;
	        this.descuentoAdicional = descuentoAdicional;
	    }

	    public double getDescuento(Carrito carrito) {
	        double precioTotal = carrito.precio();
	        if (precioTotal >= montoMinimo) {
	            return super.getPorcentajeDescuento() + (descuentoAdicional / precioTotal);
	        } else {
	            return super.getPorcentajeDescuento();
	        }
	    }
	}
}
