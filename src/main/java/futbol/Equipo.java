
package futbol;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Equipo {
    
   
    public Equipo(){}
    
  
    
    
    /**
     *
     * @param opcion2
     * @param st
     * @throws SQLException
     */
    public static void mostrarEquipo(int opcion2, Statement st) throws SQLException{
      
        
        try {
            switch (opcion2){
                case 1:
                    
                    ResultSet rs1=st.executeQuery("select * from equipos where id=1");
                    while (rs1.next()){
                        System.out.println("ID: " + rs1.getString(1) +"\nNombre: " + rs1.getString(2)+"\nTitulares: " + rs1.getInt(3) + "\nSuplentes: " + rs1.getInt(4) + "\nDirector Técnico: " + rs1.getString(5) + "\nPuntos: " + rs1.getInt(6) + "\nPartidos jugados: " + rs1.getInt(7));}
                    break;
                case 2:
                    ResultSet rs2 = st.executeQuery("select * from equipos where id=2");
                    while (rs2.next()){
                        System.out.println("ID: " + rs2.getString(1) +"\nNombre: " + rs2.getString(2)+"\nTitulares: " + rs2.getInt(3) + "\nSuplentes: " + rs2.getInt(4) + "\nDirector Técnico: " + rs2.getString(5) + "\nPuntos: " + rs2.getInt(6) + "\nPartidos jugados: " + rs2.getInt(7));}
                    break;
                case 3:
                    ResultSet rs3=st.executeQuery("select * from equipos where id=3");
                    while (rs3.next()){
                        System.out.println("ID: " + rs3.getString(1) +"\nNombre: " + rs3.getString(2)+"\nTitulares: " + rs3.getInt(3) + "\nSuplentes: " + rs3.getInt(4) + "\nDirector Técnico: " + rs3.getString(5) + "\nPuntos: " + rs3.getInt(6) + "\nPartidos jugados: " + rs3.getInt(7));}
                    break;
                case 4:
                    ResultSet rs4=st.executeQuery("select * from equipos where id=4");
                    while (rs4.next()){
                        System.out.println("ID: " + rs4.getString(1) +"\nNombre: " + rs4.getString(2)+"\nTitulares: " + rs4.getInt(3) + "\nSuplentes: " + rs4.getInt(4) + "\nDirector Técnico: " + rs4.getString(5) + "\nPuntos: " + rs4.getInt(6) + "\nPartidos jugados: " + rs4.getInt(7));}
                    break;
                case 5:
                    ResultSet rs5=st.executeQuery("select * from equipos where id=5");
                    while (rs5.next()){
                        System.out.println("ID: " + rs5.getString(1) +"\nNombre: " + rs5.getString(2)+"\nTitulares: " + rs5.getInt(3) + "\nSuplentes: " + rs5.getInt(4) + "\nDirector Técnico: " + rs5.getString(5) + "\nPuntos: " + rs5.getInt(6) + "\nPartidos jugados: " + rs5.getInt(7));}
                    break;
                case 6:
                    ResultSet rs6=st.executeQuery("select * from equipos where id=6");
                    while (rs6.next()){
                        System.out.println("ID: " + rs6.getString(1) +"\nNombre: " + rs6.getString(2)+"\nTitulares: " + rs6.getInt(3) + "\nSuplentes: " + rs6.getInt(4) + "\nDirector Técnico: " + rs6.getString(5) + "\nPuntos: " + rs6.getInt(6) + "\nPartidos jugados: " + rs6.getInt(7));}
                    break;
                case 7:
                    ResultSet rs7=st.executeQuery("select * from equipos where id=7");
                    while (rs7.next()){
                        System.out.println("ID: " + rs7.getString(1) +"\nNombre: " + rs7.getString(2)+"\nTitulares: " + rs7.getInt(3) + "\nSuplentes: " + rs7.getInt(4) + "\nDirector Técnico: " + rs7.getString(5) + "\nPuntos: " + rs7.getInt(6) + "\nPartidos jugados: " + rs7.getInt(7));}
                    break;
                case 8:
                    ResultSet rs8=st.executeQuery("select * from equipos where id=8");
                    while (rs8.next()){
                        System.out.println("ID: " + rs8.getString(1) +"\nNombre: " + rs8.getString(2)+"\nTitulares: " + rs8.getInt(3) + "\nSuplentes: " + rs8.getInt(4) + "\nDirector Técnico: " + rs8.getString(5) + "\nPuntos: " + rs8.getInt(6) + "\nPartidos jugados: " + rs8.getInt(7));}
                    break;
                case 9:
                    ResultSet rs9=st.executeQuery("select * from equipos where id=9");
                    while (rs9.next()){
                        System.out.println("ID: " + rs9.getString(1) +"\nNombre: " + rs9.getString(2)+"\nTitulares: " + rs9.getInt(3) + "\nSuplentes: " + rs9.getInt(4) + "\nDirector Técnico: " + rs9.getString(5) + "\nPuntos: " + rs9.getInt(6) + "\nPartidos jugados: " + rs9.getInt(7));}
                    break;
                case 10:
                    ResultSet rs10=st.executeQuery("select * from equipos where id=10");
                    while (rs10.next()){
                        System.out.println("ID: " + rs10.getString(1) +"\nNombre: " + rs10.getString(2)+"\nTitulares: " + rs10.getInt(3) + "\nSuplentes: " + rs10.getInt(4) + "\nDirector Técnico: " + rs10.getString(5) + "\nPuntos: " + rs10.getInt(6) + "\nPartidos jugados: " + rs10.getInt(7));}
                    break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Equipo.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }
    
    /**
     *
     * @param st
     * @throws SQLException
     */
    public static void mostrarEquipos(Statement st) throws SQLException{
        
        ResultSet rs=st.executeQuery("select * from equipos"); 
        while(rs.next())
            System.out.println("ID: " + rs.getInt(1)+"\nNombre: "+rs.getString(2)+"\nTitulares "+rs.getInt(3) + "\nSuplentes: " + rs.getInt(4) +"\nDirector Técnico: "+rs.getString(5)+"\nPuntos: "+rs.getInt(6)+"\nPartidos jugados: "+rs.getInt(7) + "\n");
            
    }
                                           
}
