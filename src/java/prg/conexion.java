package prg;

import java.sql.*;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class conexion {

    public Connection conexion = null;
    public String bde = "PD2";
    public int pregunta = 0;
    public String login = "postgres";
    public String password = "perro1990";
    //FINAL NO PERMITE A SE LE ASIGNE NINGUN OTRO VALOR SIEMPRE CONTENTRA EL MISMO
    public final String CONTROLADOR_JDBC = "org.postgresql.Driver";
    public final String URL_BASEDEDATOS = "jdbc:postgresql://localhost:5432/" + bde;
    public Statement statement;
    public ResultSet resultado;
    /*-------------------------------------------------------------------------------*/

    public Connection conecta() {
        try {
            //Aqui se carga el driver..
            Class.forName(CONTROLADOR_JDBC);
            //Efectua la conexion con la direccion de bd el login y el password..
            conexion = DriverManager.getConnection(URL_BASEDEDATOS, login, password);
//         JOptionPane.showMessageDialog(null, "Conexion Exitosa");
        } catch (ClassNotFoundException driver) {
            JOptionPane.showMessageDialog(null, "Driver no lacalizado" + driver);
        } catch (SQLException fuente) {
            JOptionPane.showMessageDialog(null, "No localizo la base de datos" + fuente);
        }
        return conexion;
    }

    public void listar_datos(String sql) {

        try {
            statement = conexion.createStatement();
            resultado = statement.executeQuery(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error al listar datos" + e);
        }
    }

    public void autonumerico(String tabla, String condicion, JTextField texto) {
        try {
            statement = conexion.createStatement();
            resultado = statement.executeQuery("select coalesce(max(" + condicion + "),0) + 1 as cod from " + tabla + "");
            resultado.next();
            texto.setText(resultado.getString("cod"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error en autonumerico" + e);
        }
    }

    public void deshabilitar_botones(
            JButton btnuevo,
            JButton btmodificar,
            JButton bteliminar,
            JButton btgrabar) {
        btnuevo.setEnabled(false);
        btmodificar.setEnabled(false);
        bteliminar.setEnabled(false);
        btgrabar.setEnabled(true);
    }

    public void habilitar_botones(
            JButton btnuevo,
            JButton btmodificar,
            JButton bteliminar,
            JButton btgrabar
    ) {
        btnuevo.setEnabled(true);
        btmodificar.setEnabled(true);
        bteliminar.setEnabled(true);
        btgrabar.setEnabled(false);
    }

    public String convertirfecha(String fec) {
    //02/11/2016 actual
        //2016-11-02 nuevo
        String dia = "", mes = "", anho = "";
        dia = fec.substring(0, 2);
        mes = fec.substring(3, 5);
        anho = fec.substring(6, 10);
        fec = anho + "-" + mes + "-" + dia;
        return fec;
    }

}
