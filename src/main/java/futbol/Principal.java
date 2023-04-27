
package futbol;
import java.sql.*;

import java.util.Scanner;

/**
 *
 * @author CAROLINA
 */

public class Principal {
    public static void main(String args[]) throws SQLException{
        Connection con;

    //Abro conexion con bbdd
        
        try {//conexion con la BBDD
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("No se encontró el driver. \n" + e);}
        try {
            String url = "jdbc:mysql://localhost:3306/futbol";
            con = DriverManager.getConnection(url, "root", "");
            Statement st = con.createStatement();
            //Pregunto al usuario qué desea ver  
            System.out.println("Ingrese la opción correspondiente:\n 1: Listar todos los equipos\n 2: Mostrar un equipo según su ID\n 3: Salir");
            Scanner sc = new Scanner(System.in);
            //guardo su opcion en una variable:
            int opcion = sc.nextInt(); 
            //Aplico el método según la opción elegida:
            switch (opcion){
                case 1 -> Equipo.mostrarEquipos(st);
                case 2 -> {
                    System.out.println("Elija un equipo para ver sus características (1-10)");
                    int opcion2 = sc.nextInt();
                    Equipo.mostrarEquipo(opcion2, st);
                }
                case 3 -> System.out.println("Adiós!");
}
            //Cierro conexión con BBDD
            con.close();

            } catch (SQLException e) {
                System.out.println(e);}
    
    
}
}
