import java.util.Objects;

public class Usuario {
    public int id;
    public String nome;
    public String email;
    public String password;

    public static Usuario cadastrarUsuario(int id, String nome, String email, String password){
        Usuario novoUsuario = new Usuario();
        novoUsuario.id = id;
        novoUsuario.nome = nome;
        novoUsuario.email = email;
        novoUsuario.password = password;

        return novoUsuario;
    }

    public boolean verificarSenha(String senha) {
        return Objects.equals(this.password, senha);
    }

    public void alterarUsuario(String novoNome, String novaSenha) {
        this.nome = novoNome;
        this.password = novaSenha;
        System.out.println("Usuário alterado com sucesso!");
    }

    public void excluirUsuario() {
        System.out.println("Usuário excluído com sucesso!");
    }

    public boolean realizarLogin(String senha) {
        if (verificarSenha(senha)) {
            System.out.println("Login realizado com sucesso!");
            return true;
        } else {
            System.out.println("Credenciais inválidas.");
            return false;
        }
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return password;
    }

    public void setSenha(String senha) {
        this.password = senha;
    }
}
