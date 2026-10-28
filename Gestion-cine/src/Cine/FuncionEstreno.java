package Cine;
import java.util.Scanner;

public class FuncionEstreno extends FuncionCine {
    
    private double recargoEstreno;

    public FuncionEstreno() {
        super();
    }

    public FuncionEstreno(String tituloPelicula, String sala, int asientosOcupados, double recargoEstreno) {
        super(tituloPelicula, sala, asientosOcupados);
        setRecargoEstreno(recargoEstreno);
    }


   
    public void calcularRecaudacion() {
        double total = getAsientosOcupados() * (TARIFA_BASE + this.recargoEstreno);
        super.setRecaudacion(total);
    }

  
    public void ingresarFuncion() {
        super.ingresarFuncion();
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el recargo adicional por estreno: ");
        setRecargoEstreno(teclado.nextDouble());
    }

   
    public void visualizar() {
        super.visualizar();
        System.out.println("Recargo de Estreno Aplicado: $" + recargoEstreno + " COP");
    }

    public double getRecargoEstreno() {
        return recargoEstreno;
    }

    public void setRecargoEstreno(double recargoEstreno) {
        if (recargoEstreno >= 0) {
            this.recargoEstreno = recargoEstreno;
            calcularRecaudacion();
        } else {
            System.out.println("Error: El recargo no puede ser negativo. Se asignará $0 de recargo.");
            this.recargoEstreno = 0;
            calcularRecaudacion(); // Recalculamos para que la recaudación baje solo a la tarifa base
        }
    
    }
}