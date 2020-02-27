/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraexercisessolutions;

/**
 *
 * @author mwn
 */
public class LeapYear {

    public static void main(String[] args) {
        
        //Deklarer en variabel med navnet year og giv denne et årstal
        //Brug if/else sætninger til at beregne om årstallet er et skudår
        //Følgende regneregler er gældende ved udregning af skudår
        /*
            Regler til beregning af skudår
                Årstal deleligt med 4 = skudår.
                Årstal deleligt med 100 = alligevel ikke skudår.
                Årstal deleligt med 400 = alligevel skudår.
        */
        //Hint: Der kan oprettes flere if/else sætninger i andre if/else sætninger

        int year = 1996;
        boolean isLeapYear = false;
        
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                } else {
                    isLeapYear = false;
                }
            } else {
                isLeapYear = true;
            }
        } else {
            isLeapYear = false;
        }
        
        
        if (isLeapYear) {
            System.out.println(year + " er skudår");
        } else {
            System.out.println(year + " er ikke skudår");
        }
    }

}
