package lab2_cesarbrito;

import java.util.Scanner;

public class Lab2_CesarBrito {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===========Login===========");
        System.out.print("Ingrese su usuario: ");
        String user = sc.next();
        System.out.print("Ingrese su contraseña: ");
        String pass = sc.next();
        System.out.println(user + "   " + pass);
        while (!user.equals("david") || !pass.equals("99")) {
            System.out.println("El nombre o la contraseña esta incorrecta, trate de nuevo");
            System.out.print("Ingrese su usuario: ");
            user = sc.next();
            System.out.print("Ingrese su contraseña: ");
            pass = sc.next();
        }
        System.out.println("funciona");

    }

}
