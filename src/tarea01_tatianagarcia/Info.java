
package tarea01_tatianagarcia;

import java.util.Date;

/**
 *
 * @author tatig
 */
public class Info {
    
    private String Marca;
    private String Modelo; 
    private Date Creacion; 
    private Date Venta;
    private String Color;
    
    public Info(){
        
    }

    /**
     * @return the Marca
     */
    public String getMarca() {
        return Marca;
    }

    /**
     * @param Marca the Marca to set
     */
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    /**
     * @return the Modelo
     */
    public String getModelo() {
        return Modelo;
    }

    /**
     * @param Modelo the Modelo to set
     */
    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    /**
     * @return the Creacion
     */
    public Date getCreacion() {
        return Creacion;
    }

    /**
     * @param Creacion the Creacion to set
     */
    public void setCreacion(Date Creacion) {
        this.Creacion = Creacion;
    }

    /**
     * @return the Venta
     */
    public Date getVenta() {
        return Venta;
    }

    /**
     * @param Venta the Venta to set
     */
    public void setVenta(Date Venta) {
        this.Venta = Venta;
    }

    /**
     * @return the Color
     */
    public String getColor() {
        return Color;
    }

    /**
     * @param Color the Color to set
     */
    public void setColor(String Color) {
        this.Color = Color;
    }
    
}
