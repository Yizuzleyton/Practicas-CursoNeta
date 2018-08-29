package net.netasystems.recursos.conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class AccesoDatos {
	
	
	System.out.println("Inicio de programa");
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con = DriverManager.getConnection(  
			"jdbc:oracle:thin:@198.23.75.98:1521:neta","EGLOBAL","egl0b4l");  
	System.out.println("Conexion realizada");

}
