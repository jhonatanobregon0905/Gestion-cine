package Cine;
import java.util.Scanner;

public class FuncionCine {
    
   
    public static final double TARIFA_BASE = 12000.0;

    private String tituloPelicula;
    private String sala;
    private int asientosOcupados;
    private double recaudacion;

    public FuncionCine() {
    }

    public FuncionCine(String tituloPelicula, String sala, int asientosOcupados) {
        this.tituloPelicula = tituloPelicula;
        this.sala = sala;
        setAsientosOcupados(asientosOcupados);
    }

    
    public void ingresarFuncion() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el titulo de la pelicula: ");
        tituloPelicula = teclado.nextLine();
        System.out.print("Ingrese la sala asignada: ");
        sala = teclado.nextLine();
        System.out.print("Ingrese la cantidad de asientos ocupados: ");
        setAsientosOcupados(teclado.nextInt());
    }

   
    public void calcularRecaudacion() {
        this.recaudacion = this.asientosOcupados * TARIFA_BASE;
    }

 
    public void visualizar() {
        System.out.println("Pelicula: " + tituloPelicula);
        System.out.println("Sala: " + sala);
        System.out.println("Asientos Ocupados: " + asientosOcupados);
        System.out.println("Recaudacion Total: $" + recaudacion + " COP");
    }

    
    public int getAsientosOcupados() {
        return asientosOcupados;
    }

    public void setAsientosOcupados(int asientosOcupados) {
        if (asientosOcupados >= 0) {
            this.asientosOcupados = asientosOcupados;
            calcularRecaudacion();
        } else {
            System.out.println("Error: Los asientos no pueden ser negativos.");
        }
    }

    public String getTituloPelicula() {
        return tituloPelicula;
    }

    public void setTituloPelicula(String tituloPelicula) {
        this.tituloPelicula = tituloPelicula;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public double getRecaudacion() {
        return recaudacion;
    }

    public void setRecaudacion(double recaudacion) {
        this.recaudacion = recaudacion;
    }
}