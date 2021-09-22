
public class Main {

	public static void main(String[] args) {
		
		Conexion conexion = new Conexion();
		String usuario="";
		String contraseña="";
		conexion.connect("localhost:5432/Olimpiadas",usuario,contraseña);
		conexion.insertarComisario("123456", "Juan Perez");
	}
}
