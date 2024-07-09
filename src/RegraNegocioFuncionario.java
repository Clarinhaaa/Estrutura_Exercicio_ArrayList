import java.util.ArrayList;

public class RegraNegocioFuncionario {
    private ArrayList<Funcionario> lista = new ArrayList<Funcionario>();
    
    public void cadastrarFuncionario(Funcionario fun) {
        this.lista.add(fun);
    }

    public ArrayList<Funcionario> listarFuncionario() {
        return this.lista;
    }
}
