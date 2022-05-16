public class EmployeeWageSwitch {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int Part_Time = 1, Full_Time = 2, Wage = 0;
        int Part_Time_Hrs = 8;
        int Full_Time_Hrs = 12;
        int Per_Hrs_Wage = 20;
        double empcheck = Math.floor(Math.random() * 10) % 3;
        switch ((int) empcheck) {
            case 0:
                System.out.println("Employee Absent \n Employee Wage =" + Wage);
                break;
            case 1:
                Wage = Per_Hrs_Wage * Part_Time_Hrs;
                System.out.println("Employee Present \n Employee Part Time Wage = " + Wage);
                break;
            case 2:
                Wage = Per_Hrs_Wage * Full_Time_Hrs;
                System.out.println("Employee Present \n Employee Full Time Wage = " + Wage);
                break;
            default:
                System.out.println("Employee Invalid Data ");
        }
    }
}
