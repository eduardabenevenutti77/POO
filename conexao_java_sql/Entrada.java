import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Entrada {

    public int id;
    public String nome;
    public String email;
    public String senha;

    public Entrada(int id, String nome, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }
    
    public void cadastrar() {
        try (Connection connManager = DriverManager.getConnection("jdbc:mysql://localhost:3306/usuario", "root", "")) {
            try (PreparedStatement sc = connManager.prepareStatement("INSERT INTO usuario.usuario VALUES (?, ?, ?, ?)")) {
                sc.setLong(1, 0); 
                sc.setString(2, this.nome);
                sc.setString(3, this.email);
                sc.setString(4, this.senha);
                sc.executeUpdate();

                System.out.println("Usuário cadastrado com sucesso!");
            }
        } catch (SQLException exception) {
            System.out.println("Erro ao cadastrar usuário: " + exception.getMessage());
        }
    }
    public void alterar() {
       try (Connection connManager = DriverManager.getConnection("jdbc:mysql://localhost:3306/usuario", "root", "")) {
            try (PreparedStatement sc = connManager.prepareStatement("UPDATE usuario.usuario SET nome=?, email=?, senha=? WHERE id=?")) {
                sc.setString(1, this.nome);
                sc.setString(2, this.email);
                sc.setString(3, this.senha);
                sc.setInt(4, this.id);
                sc.executeUpdate();

                System.out.println("Usuário alterado com sucesso!");
            }
        } catch (SQLException exception) {
            System.out.println("Erro ao alterar usuário: " + exception.getMessage());
        }
    }
    public void deletar() {
        try (Connection connManager = DriverManager.getConnection("jdbc:mysql://localhost:3306/usuario", "root", "")) {
            try (PreparedStatement sc = connManager.prepareStatement("DELETE FROM usuario.usuario WHERE id=?")) {
                sc.setInt(1, this.id);
                sc.executeUpdate();

                System.out.println("Usuário deletado com sucesso!");
            }
        } catch (SQLException exception) {
            System.out.println("Erro ao deletar usuário: " + exception.getMessage());
        }
    }
    public static void mostrar() {
        try (Connection connManager = DriverManager.getConnection("jdbc:mysql://localhost:3306/usuario", "root", "")) {
            try (PreparedStatement sc = connManager.prepareStatement("SELECT * FROM usuario.usuario");
                ResultSet rs = sc.executeQuery()) {
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String nome = rs.getString("nome");
                    String email = rs.getString("email");
                    String senha = rs.getString("senha");

                    System.out.println("ID: " + id + ", Nome do Usuário: " + nome + ", E-mail do Usuário: " + email + ", Senha do Usuário: " + senha);
                }
            }
        } catch (SQLException exception) {
            System.out.println("Erro ao selecionar os usuários para a visualização: " + exception.getMessage());
        }
    }
}