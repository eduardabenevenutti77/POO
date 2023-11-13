import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
// import java.sql.ResultSet;
import java.sql.SQLException;
// import java.sql.Statement;

public class Entrada {

        private String nome;
        private String email;
        private String senha;

        public Entrada(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }
 
    public void inserirUsuario() {
        try {
            Connection connManager = DriverManager
                .getConnection(
                    "jdbc:mysql://localhost:3306/usuario",
                    "root",
                    ""
                );
         System.out.println("Conexão estabelecida!"); //informa que a conexão com banco ocorreu corretamente
         PreparedStatement ps = connManager.prepareStatement("insert into usuario.usuario values (?, ?, ?, ?)"); //comando que será realizado
         ps.setLong(1, 0); //puxa o campo e o valor que será inserido
         ps.setString(2, this.nome); 
         ps.setString(3, this.email);
         ps.setString(4, this.senha);
         ps.executeUpdate(); //executa o comando
         connManager.close(); //termina a conexão
        } catch (SQLException exception) {
            System.out.println(exception.getMessage()); //puxa uma mensagem de erro de conexão automático
        }
    }  
}