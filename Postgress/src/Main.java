
public class Main {

	public static void main(String[] args) {
		
		Conexion conexion = new Conexion();
		String usuario="";
		String contraseņa="";
		conexion.connect("localhost:5432/Olimpiadas",usuario,contraseņa);
		conexion.insertarComisario("123456", "Juan Perez");
	}
}
