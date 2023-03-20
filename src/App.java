import java.util.Locale;
import java.util.Scanner;

import entities.Adress;
import entities.Department;
import entities.Employee;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do departamento: ");
        String departamentName = sc.next();
        System.out.print("Dia do pagamento: ");
        int payday = sc.nextInt();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Telefone: ");
        String tel = sc.next();
        Department dept = new Department(departamentName, payday, new Adress(email, tel));

        System.out.println();
        System.out.print("Quantos funcionários tem o departamento? ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Dados do funcionário " + i + " : ");
            sc.nextLine();
            System.out.print("Nome: "); 
            String employeeName = sc.nextLine();
            System.out.print("Salário: ");
            Double salary = sc.nextDouble();
            Employee employee = new Employee(employeeName, salary);
            dept.addEmployee(employee);
        }

        showReport(dept);

        sc.close();
    }

    private static void showReport(Department dept) {
        System.out.println();
        System.out.println("FOLHA DE PAGAMENTO:");
        System.out.println("Departamento de vendas = R$ " + String.format("%.2f", dept.payroll()));
        System.out.println("Pagamento realizado no dia " + dept.getPayday());
        System.out.println("Funcionários: ");
        System.out.println(dept);
        System.out.println("Para dúvidas favor entrar em contato: " + dept.getAdress().getEmail());    
    }
}