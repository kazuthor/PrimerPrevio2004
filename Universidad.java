
/**
 * Write a description of class Universidad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Universidad {
    private double SMMLV; 
    
    
    public Universidad() {
        
        this.SMMLV = 0;
    }

    
    public void actualizarSMMLV(double nuevoValor) {
        this.SMMLV = nuevoValor;
    }

    
    public double getSMMLV() {
        return SMMLV;
    }
    
    
}