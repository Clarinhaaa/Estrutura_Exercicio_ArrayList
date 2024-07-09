import java.util.ArrayList;

public class RegraNegocioEmpresa {
    private ArrayList<Empresa> lista = new ArrayList<Empresa>();
    
    public void cadastrarEmpresa(Empresa emp) {
        this.lista.add(emp);
    }

    public ArrayList<Empresa> listarEmpresa() {
        return this.lista;
    }
}
