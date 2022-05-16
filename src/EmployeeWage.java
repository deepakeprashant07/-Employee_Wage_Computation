public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int Wage = 0;
        int Per_Hrs_Wage = 20;
        int Full_Day_Hrs = 8;
        double empcheck = Math.floor(Math.random() * 10) % 3;
        if (empcheck == 1) {
            Wage = Per_Hrs_Wage * Full_Day_Hrs;
            System.out.println("Employee Present \n Employee Part Time Wage = " + Wage);
        } else {
            System.out.println("Employee Absent \n Employee Wage =" + Wage);

        }
    }
}
