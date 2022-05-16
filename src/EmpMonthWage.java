public class EmpMonthWage {
    static final int Part_Time = 1;
    static final int Full_Time = 2;
    static final int Part_Time_Hrs = 8;
    static final int Full_Time_Hrs = 12;
    static final int Per_Hrs_Wage = 20;
    static final int Total_Month_Day = 20;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int Wage = 0;
        int Persent_Count = 0;
        int Absent_Count = 0;
        int Part_Time_Count = 0;
        for (int i = 0; i < Total_Month_Day; i++) {
            double empcheck = Math.floor(Math.random() * 10) % 3;
            if (empcheck == Part_Time) {
                Wage += Per_Hrs_Wage * Part_Time_Hrs;
                Persent_Count += 1;
                Part_Time_Count += 1;
            } else if (empcheck == Full_Time) {
                Wage += Per_Hrs_Wage * Full_Time_Hrs;
                Persent_Count += 1;
            } else {
                Absent_Count += 1;
            }
        }
        System.out.println("Total Month Persent Day " + Persent_Count + " \tTotal Month Absent Day " + Absent_Count);
        System.out.println("Total Month Part Time Day " + Part_Time_Count + "\tTotal Month Full Time Day " + (Persent_Count-Part_Time_Count));
        System.out.println("Total Month Wage " + Wage);
    }
}
