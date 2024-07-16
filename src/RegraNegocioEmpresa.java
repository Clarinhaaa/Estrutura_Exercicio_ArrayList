import java.util.ArrayList;

public class RegraNegocioEmpresa {
    private ArrayList<Empresa> lista = new ArrayList<Empresa>();
    
    public void cadastrarEmpresa(Empresa emp) {
        this.lista.add(emp);
    }

    public ArrayList<Empresa> listarEmpresa() {
        return this.lista;
    }

    public void removerEmpresa(String nome) {
        for(Empresa emp : this.lista) {
            if (nome.equalsIgnoreCase(emp.getNome())) {
                this.lista.remove(emp);
            }
        }
    }
}
