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
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("1- Reporte 1\n"
                            + "2- Reporte 2\n"
                            + "3- Reporte 3");
                    int opcion3 = sc.nextInt();
                    switch (opcion3) {
                        case 1:
                            System.out.println("Ingrese que estado desea buscar los restaurantes [Remodelacion/ Demolicion/ Funcional]: ");
                            String busq = sc.next();
                            System.out.println("Restaurantes " + busq);
                            for (Object g : Restaurantes) {
                                Object h = ((Restaurante) g).getEstado();
                                String estado = h.toString();
                                if(estado.equals(busq)){
                                    System.out.println(Restaurantes.indexOf(g) + " - " + g);
                                }
                            }
                            break;
                        case 2:
                            System.out.println("Restaurantes premium");
                            for (Object g : Restaurantes) {
                                Object h = ((Restaurante) g).getParqueo();
                                String park = h.toString();
                                Object j = ((Restaurante) g).getJuegos();
                                String games = j.toString();
                                if (park.equals("Si hay parqueo") & games.equals("Si hay area de juegos")) {
                                    Object nombre = ((Restaurante) g).getNombre();
                                    Object especialidad = ((Restaurante) g).getEspecialidad();
                                    Object ubicacion = ((Restaurante) g).getUbicacion();
                                    System.out.println(Restaurantes.indexOf(g) + " - Nombre: " + nombre + ", Especialidad: " + especialidad + ", Ubicacion: " + ubicacion);
                                }
                            }
                            break;
                        case 3:

                            break;
                    }
                    break;
                case 2:
                    System.out.println("1- Crear\n"
                            + "2- Listar\n"
                            + "3- Modificar\n"
                            + "4. Eliminar");
                    opcion3 = sc.nextInt();
                    switch (opcion3) {
                        case 1:
                            System.out.print("Ingrese el nombre de franquicia: ");
                            String franquicia = sc.next();
                            System.out.print("Ingrese el nombre del restaurante: ");
                            String nombre = sc.next();
                            System.out.print("Ingrese la ubicacion: ");
                            String ubicacion = sc.next();
                            while (Restaurantes.contains(ubicacion)) {
                                System.out.println("Ya hay un restaurante en esa ubicacion");
                                System.out.print("Ingrese la ubicacion: ");
                                ubicacion = sc.next();
                            }
                            System.out.print("Ingrese la cantidad de empleados: ");
                            int empleados = sc.nextInt();
                            System.out.print("Tiene parqueo? [s/n]: ");
                            char resp = sc.next().charAt(0);
                            String parqueo;
                            if (resp == 's' || resp == 'S') {
                                parqueo = "Si hay parqueo";
                            } else {
                                parqueo = "No hay parqueo";
                            }
                            System.out.print("Tiene area de juegos? [s/n]: ");
                            resp = sc.next().charAt(0);
                            String juegos;
                            if (resp == 's' || resp == 'S') {
                                juegos = "Si hay area de juegos";
                            } else {
                                juegos = "No hay area de juegos";
                            }
                            System.out.print("Ingrese la cantidad de mesas: ");
                            int mesas = sc.nextInt();
                            System.out.print("Ingrese la cantidad de cajeros: ");
                            int cajeros = sc.nextInt();
                            System.out.print("Ingrese el nombre del gerente: ");
                            String gerente = sc.next();
                            System.out.print("Ingrese la especialidad: ");
                            String especialidad = sc.next();
                            System.out.println("Ingrese el estado del restaurante\n"
                                    + "1- Remodelacion\n"
                                    + "2- Demolicion\n"
                                    + "3- Funcional");
                            int respuesta = sc.nextInt();
                            String estado;
                            if (respuesta == 1) {
                                estado = "Remodelacion";
                            } else if (respuesta == 2) {
                                estado = "Demolicion";
                            } else {
                                estado = "Funcional";
                            }
                            String premium;
                            if (parqueo.equals("Si hay parqueo") & juegos.equals("Si hay area de juegos")) {
                                premium = "Premium";
                            } else {
                                premium = "Normal";
                            }
                            if (estado.equals("Funcional")) {
                                Restaurantes.add(new Restaurante(franquicia, nombre, ubicacion, empleados, parqueo, juegos, mesas, cajeros, gerente, especialidad, estado));
                            } else {
                                Restaurantes.add(new Restaurante(franquicia, nombre, ubicacion, empleados, parqueo, juegos, 0, cajeros, "No hay gerente", "No hay especialidad", estado));
                            }

                            break;
                        case 2:
                            for (Object g : Restaurantes) {
                                System.out.println(Restaurantes.indexOf(g) + " - " + g);
                            }
                            break;
                        case 3:
                            System.out.print("Ingrese la posicion que desea eliminar: ");
                            int po = sc.nextInt();
                            if (po <= Restaurantes.size()) {
                                System.out.print("Ingrese el nombre de franquicia: ");
                                franquicia = sc.next();
                                System.out.print("Ingrese el nombre del restaurante: ");
                                nombre = sc.next();
                                System.out.print("Ingrese la ubicacion: ");
                                ubicacion = sc.next();
                                while (Restaurantes.contains(ubicacion)) {
                                    System.out.println("Ya hay un restaurante en esa ubicacion");
                                    System.out.print("Ingrese la ubicacion: ");
                                    ubicacion = sc.next();
                                }
                                System.out.print("Ingrese la cantidad de empleados: ");
                                empleados = sc.nextInt();
                                System.out.print("Tiene parqueo? [s/n]: ");
                                resp = sc.next().charAt(0);
                                parqueo = "";
                                if (resp == 's' || resp == 'S') {
                                    parqueo = "Si hay parqueo";
                                } else {
                                    parqueo = "No hay parqueo";
                                }
                                System.out.print("Tiene area de juegos? [s/n]: ");
                                resp = sc.next().charAt(0);
                                juegos = "";
                                if (resp == 's' || resp == 'S') {
                                    juegos = "Si hay area de juegos";
                                } else {
                                    juegos = "No hay area de juegos";
                                }
                                System.out.print("Ingrese la cantidad de mesas: ");
                                mesas = sc.nextInt();
                                System.out.print("Ingrese la cantidad de cajeros: ");
                                cajeros = sc.nextInt();
                                System.out.print("Ingrese el nombre del gerente: ");
                                gerente = sc.next();
                                System.out.print("Ingrese la especialidad: ");
                                especialidad = sc.next();
                                System.out.println("Ingrese el estado del restaurante\n"
                                        + "1- Remodelacion\n"
                                        + "2- Demolicion\n"
                                        + "3- Funcional");
                                respuesta = sc.nextInt();
                                estado = "";
                                if (respuesta == 1) {
                                    estado = "Remodelacion";
                                } else if (respuesta == 2) {
                                    estado = "Demolicion";
                                } else {
                                    estado = "Funcional";
                                }
                                if (estado.equals("Funcional")) {
                                    ((Restaurante) Restaurantes.get(po)).setFranquicia(franquicia);
                                    ((Restaurante) Restaurantes.get(po)).setNombre(nombre);
                                    ((Restaurante) Restaurantes.get(po)).setUbicacion(ubicacion);
                                    ((Restaurante) Restaurantes.get(po)).setEmpleados(empleados);
                                    ((Restaurante) Restaurantes.get(po)).setParqueo(parqueo);
                                    ((Restaurante) Restaurantes.get(po)).setJuegos(juegos);
                                    ((Restaurante) Restaurantes.get(po)).setMesas(mesas);
                                    ((Restaurante) Restaurantes.get(po)).setCajeros(cajeros);
                                    ((Restaurante) Restaurantes.get(po)).setGerente(gerente);
                                    ((Restaurante) Restaurantes.get(po)).setEspecialidad(especialidad);
                                    ((Restaurante) Restaurantes.get(po)).setEstado(estado);
                                } else {
                                    ((Restaurante) Restaurantes.get(po)).setFranquicia(franquicia);
                                    ((Restaurante) Restaurantes.get(po)).setNombre(nombre);
                                    ((Restaurante) Restaurantes.get(po)).setUbicacion(ubicacion);
                                    ((Restaurante) Restaurantes.get(po)).setEmpleados(empleados);
                                    ((Restaurante) Restaurantes.get(po)).setParqueo(parqueo);
                                    ((Restaurante) Restaurantes.get(po)).setJuegos(juegos);
                                    ((Restaurante) Restaurantes.get(po)).setMesas(0);
                                    ((Restaurante) Restaurantes.get(po)).setCajeros(cajeros);
                                    ((Restaurante) Restaurantes.get(po)).setGerente("No hay gerente");
                                    ((Restaurante) Restaurantes.get(po)).setEspecialidad("No hay especialidad");
                                    ((Restaurante) Restaurantes.get(po)).setEstado(estado);
                                }
                            } else {
                                System.out.println("La posicion que ingreso no tiene restaurante");
                            }
                            break;
                        case 4:
                            System.out.print("Ingrese la posicion que desea eliminar: ");
                            int p = sc.nextInt();
                            if (p <= Restaurantes.size()) {
                                Restaurantes.remove(p);
                            } else {
                                System.out.println("La posicion que ingreso no tiene restaurante");
                            }
                            break;
                    }

            }
        }

    }

}
