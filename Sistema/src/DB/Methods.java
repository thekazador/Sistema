package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class Methods {

	public static void Connect() {
		
		Properties p = System.getProperties();
		p.setProperty("derby.system.home", ".");
		
		String driver = "org.apache.derby.jdbc.EmbeddedDriver";
	    String dbName = "/MyDB";
	    String dbParam = "create=true";
	    String connectionURL = "jdbc:derby:" + dbName + ";" + dbParam;
	    Connection conn = null;
	 
	    try {
	      Class.forName(driver);
	    }
	    catch(java.lang.ClassNotFoundException e) {
	      e.printStackTrace();
	    }

	    try {
	        conn = DriverManager.getConnection(connectionURL);
	   
	        Statement st = conn.createStatement();
	        System.out.println("Conectado a la DB: '" + dbName + "'");
            
	        ResultSet results = st.executeQuery("select * from SYS.SYSTABLES");
        	boolean tableok = false;
            while(results.next()) {
            	if (results.getString(2).equals("USERS")) {
            		tableok = true;
            		break;
            	}
            }
	        
	        if (tableok == false) {
	        	st.executeUpdate("create table users(id_user INT NOT NULL PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1), name_user varchar(20), pass_user varchar(20))");
	        	st.executeUpdate("insert into users(name_user, pass_user) values ('admin', 'admin123')");
	        }
	        
	        results = st.executeQuery("select * from users");
            while(results.next()) {
                int id = results.getInt(1);
                String usuario = results.getString(2);
                String clave = results.getString(3);
                System.out.println(id + "\t\t" + usuario + "\t\t" + clave);
            }
            results.close();

	    }
	    catch (Throwable e)  {
	    	System.out.println("Error al crear la base de datos '" + dbName + "'");
	    	e.printStackTrace();
	    }
	    finally {
	    	try {
	    		// conn.close();
	    		// test 2
	    	}
	        catch (Throwable t){}
	    }
	}		
}
