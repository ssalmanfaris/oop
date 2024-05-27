public class Repeat_2 {
    public static void main(String[] args){

    //Tax paid
        double TotalPay = 850000;

        double TaxAmount_1 = (TotalPay * 5) / 100;
        double SalaryLeft_1 = (TotalPay - TaxAmount_1);
        double TaxAmount_2 = (SalaryLeft_1 * 2) / 100;
        double SalaryLeft_2 = (SalaryLeft_1 - TaxAmount_2);
        double NetSalary = (TotalPay - SalaryLeft_2);

        System.out.println(NetSalary);
    }
}
