package lab2_cesarbrito;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2_CesarBrito {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList Restaurantes = new ArrayList();

        System.out.println("===========Login===========");
        System.out.print("Ingrese su usuario: ");
        String user = sc.next();
        System.out.print("Ingrese su contraseña: ");
        String pass = sc.next();
        while (!user.equals("david") || !pass.equals("99")) {
            System.out.println("El nombre o la contraseña esta incorrecta, trate de nuevo");
            System.out.print("Ingrese su usuario: ");
            user = sc.next();
            System.out.print("Ingrese su contraseña: ");
            pass = sc.next();
        }
        int opcion = 0;
        while (opcion != 3) {
            System.out.println("1- Reporte de restaurantes\n"
                    + "2- Manejo de restaurantes\n"
                    + "3- Salir");
            switch (opcion) {
                case 1:
                    
                    break;
                case 2:

                    break;
            }
        }

    }

}
