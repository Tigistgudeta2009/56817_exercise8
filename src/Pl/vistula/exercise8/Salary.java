package Pl.vistula.exercise8;

public interface Salary {

    double salaryToPay_Gudeta_56817(double hours, double rate);

    default double salaryForOvertime_Gudeta_56817(double overtimeHours, double rate){
        return  1;
    }

    static int bonus_Gudeta_56817(int yearsOfExperience){

        if(yearsOfExperience>4){
            return 100;

        }else {
            return 0;
        }
    }



}
