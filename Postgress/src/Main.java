
public class Main {

	public static void main(String[] args) {
		
		Conexion conexion = new Conexion();
		String usuario="";
		String contrase�a="";
		conexion.connect("localhost:5432/Olimpiadas",usuario,contrase�a);
		conexion.insertarComisario("123456", "Juan Perez");
	}
}
