public class PartTimeWage
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Employee Wage Computation Program");
        int Part_Time=1,Full_time=2,Wage=0;
        int Per_Hrs_Wage=20;
        int Part_Time_Hrs=8;
        int Full_Time_Hrs=12;
        double empcheck=Math.floor(Math.random() * 10) % 3 ;
        if (empcheck == Part_Time)
        {
            Wage = Per_Hrs_Wage * Part_Time_Hrs;
            System.out.println("Employee Present \n Employee Part Time Wage = " +Wage);
        }
        else if (empcheck == Full_time)
        {
            Wage = Per_Hrs_Wage * Full_Time_Hrs;
            System.out.println("Employee Present \n Employee Full Time Wage = " +Wage);
        }
        else
        {
            System.out.println("Employee Absent \n Employee Wage =" + Wage);

        }
    }
}
