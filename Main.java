public class Main {
    public static void main(String[] args) {
        
        DocenteCatedra docente1 = new DocenteCatedra("Juan", 2, 0, 0);
        DocenteCatedra docente2 = new DocenteCatedra("Maria", 4, 1, 1);
        DocenteCatedra docente3 = new DocenteCatedra("Pedro", 6, 1, 1);
        DocenteCatedra docente4 = new DocenteCatedra("Ana", 8, 2, 2);

        
        System.out.println("Salario mensual de los docentes de cátedra:");
        System.out.println("Docente 1: $" + docente1.calcularSalarioMensual());
        System.out.println("Categoría del Docente 1: " + docente1.validarCategoria());
        System.out.println("Docente 2: $" + docente2.calcularSalarioMensual());
        System.out.println("Categoría del Docente 2: " + docente2.validarCategoria());
        System.out.println("Docente 3: $" + docente3.calcularSalarioMensual());
        System.out.println("Categoría del Docente 3: " + docente3.validarCategoria());
        System.out.println("Docente 4: $" + docente4.calcularSalarioMensual());
        System.out.println("Categoría del Docente 4: " + docente4.validarCategoria());

        
        
        Universidad ufps = new Universidad();
        double nuevoSMMLV = 970000; 
        ufps.actualizarSMMLV(nuevoSMMLV);
        System.out.println("Nuevo valor del SMMLV: $" + ufps.getSMMLV());
        ufps.actualizarSMMLV(950000);
        
    }
}