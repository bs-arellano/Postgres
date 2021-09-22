import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
	
	Connection conection = null;
	
	//Conecta con la base de datos indicada
	public void connect (String url, String user, String password) {
		
		try {
			Class.forName("org.postgresql.Driver");
			conection=DriverManager.getConnection("jdbc:postgresql://"+url, user,password);
			
			if(conection!=null) {
				System.out.println("Connection estabilished");
			} else {
				System.out.println("Refused connection");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	//Inserta un comisario dado en la tabla 'comisario'
	public void insertarComisario(String id, String nombre) {

		try {
			Statement sta = conection.createStatement();
			String query = "INSERT INTO comisario (idcomisario,nomcomisario) VALUES ('"+id+"','"+nombre+"');";
			sta.executeLargeUpdate(query);
			sta.close();
			System.out.println("Comisario insertartado con exito");
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
