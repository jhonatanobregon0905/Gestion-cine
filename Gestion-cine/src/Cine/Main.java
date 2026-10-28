package Cine;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("========================================");
        System.out.println("   SISTEMA DE GESTION DE CINE BASICO    ");
        System.out.println("========================================");

       
        System.out.println("\n--- REGISTRO DE FUNCION NORMAL ---");
        FuncionNormal funcionNormal = new FuncionNormal();
        funcionNormal.ingresarFuncion(); 

     
        System.out.println("\n--- REGISTRO DE FUNCION DE ESTRENO ---");
        FuncionEstreno funcionEstreno = new FuncionEstreno();
        funcionEstreno.ingresarFuncion();

    
        System.out.println("\n========================================");
        System.out.println("      RESULTADOS FINALES DE TAQUILLA    ");
        System.out.println("========================================");

        System.out.println("\n[1] Reporte de Funcion Normal:");
        funcionNormal.visualizar();

        System.out.println("\n[2] Reporte de Funcio de Estreno:");
        funcionEstreno.visualizar();
        
        System.out.println("\n========================================");
    }
}