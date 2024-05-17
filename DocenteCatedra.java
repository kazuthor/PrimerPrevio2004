public class DocenteCatedra {
    private String nombre;
    private int experiencia;
    private int cursosActualizacion;
    private int trabajosEscritos;
    
    public DocenteCatedra(String nombre, int experiencia, int cursosActualizacion, int trabajosEscritos) {
        this.nombre = nombre;
        this.experiencia = experiencia;
        this.cursosActualizacion = cursosActualizacion;
        this.trabajosEscritos = trabajosEscritos;
    }

    
    public double calcularSalarioMensual() {
        double salarioBase = 0;
        if (experiencia >= 8 && cursosActualizacion > 0 && trabajosEscritos >= 2) {
            salarioBase = 55000; 
        } else if (experiencia >= 6 && cursosActualizacion > 0 && trabajosEscritos > 0) {
            salarioBase = 50000; 
        } else if (experiencia >= 4 && cursosActualizacion > 0 && trabajosEscritos > 0) {
            salarioBase = 45000; 
        } else if (experiencia >= 2) {
            salarioBase = 40000; 
        }
        return salarioBase;
    }

   
    
    public String validarCategoria() {
        if (experiencia >= 8 && cursosActualizacion > 0 && trabajosEscritos >= 2) {
            return "Profesor Titular";
        } else if (experiencia >= 6 && cursosActualizacion > 0 && trabajosEscritos > 0) {
            return "Profesor Asociado";
        } else if (experiencia >= 4 && cursosActualizacion > 0 && trabajosEscritos > 0) {
            return "Profesor Asistente";
        } else if (experiencia >= 2) {
            return "Profesor Auxiliar";
        } else {
            return "No cumple con los requisitos mínimos";
        }
    }
    
}

