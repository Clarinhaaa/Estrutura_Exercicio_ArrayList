import java.util.ArrayList;

public class RegraNegocioFuncionario {
    private ArrayList<Funcionario> lista = new ArrayList<Funcionario>();
    
    public void cadastrarFuncionario(Funcionario fun) {
        this.lista.add(fun);
    }

    public ArrayList<Funcionario> listarFuncionario() {
        return this.lista;
    }

    public void removerFuncionario(String nome) {
        for (Funcionario fun : this.lista) {
            if (nome.equalsIgnoreCase(fun.getNome())) {
                this.lista.remove(fun);
            }
        }
    }
}
