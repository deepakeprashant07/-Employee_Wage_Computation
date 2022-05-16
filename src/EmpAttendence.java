public class EmpAttendence {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int present=1,Wage=0;
        int Per_Hrs_Wage=20;
        int Daily_Hrs=8;
        double empcheck=Math.floor(Math.random() * 10) % 2 ;
        if (empcheck == present){
            Wage = Per_Hrs_Wage * Daily_Hrs;
            System.out.println("Employee Present \n Employee Today Wage = " +Wage);
        }
        else
        {
            Wage = Per_Hrs_Wage * Daily_Hrs;
            System.out.println("Employee Absent \n Employee Today Wage = " +Wage);
        }
    }
}
