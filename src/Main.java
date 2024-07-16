public class Main {
    public static void main(String[] args) {
        // Objetos das regras de negócio
        RegraNegocioFuncionario regNegFun = new RegraNegocioFuncionario();
        RegraNegocioEmpresa regNegEmp = new RegraNegocioEmpresa();

        // Objetos das empresas
        Empresa emp1 = new Empresa("123456", "Dell", "(00) 91111-1111");
        Empresa emp2 = new Empresa("654321", "Acer", "(11) 92222-2222");

        // Objetos dos funcionários
        Funcionario fun1 = new Funcionario("000.000.000-00", "Ana", "123456789", "(82) 91111-1111", emp1);
        Funcionario fun2 = new Funcionario("111.111.111-11", "Clara", "987654321", "(82) 92222-2222", emp2);
        Funcionario fun3 = new Funcionario("222.222.222-22", "Letícia", "111222333", "(82) 93333-3333", emp2);

        // Cadastro
        regNegEmp.cadastrarEmpresa(emp1);
        regNegEmp.cadastrarEmpresa(emp2);

        regNegFun.cadastrarFuncionario(fun1);
        regNegFun.cadastrarFuncionario(fun2);
        regNegFun.cadastrarFuncionario(fun3);

        regNegFun.removerFuncionario("Clara");

        // Listagem
        System.out.println("EMPRESAS:");
        System.out.println(regNegEmp.listarEmpresa().toString());
        System.out.println();
        System.out.println("FUNCIONÁRIOS:");
        System.out.println(regNegFun.listarFuncionario().toString());
    }
}
