/*
date input date 
if month >= 1 && month <=12
    valid
    if date in that month -> 
        display date
else
    wrong input
*/

/*
day checker:
29- 2
31 - 1, 3, 5, 7, 8,10, 12 
30- 4, 6, 9, 11
*/

import java.util.Scanner;

public class Date {
    int day, month, year;
    Date(int d, int m, int y){
        day =d;
        month=m;
        year=y;
    }

    boolean monthValid = true;
    public boolean monthChecker(){
        if (!(month>=1 && month<=12)){
            monthValid = false;
            return monthValid;
        }
        return monthValid;
    }

    boolean dayValid = true;
    public boolean dayChecker(){
        if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && (day>=1 && day <=31)){
            dayValid = true;
        }
        else if ((month == 4 || month == 6 || month == 9 || month == 11) && (day>=1 && day<=30)){
            dayValid = true;
        }
        else if (month == 2) {
            if ((year%400 == 0) || (year%4==0) ){
               if (day>=1 && day<=29){
                dayValid = true;
               }
            else{
                if (day>=1 && day<=28){
                dayValid = true;
            }
            }      
        }
        }
        else{
            dayValid = false;
        }
        return dayValid;
    }

    public void dateDisplay(){
        System.out.println("Toady's date: "+ day + "/" + month +"/" +year);
    }

    public void nextDateDisplay(){
        if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && day == 31){
            System.out.println("Next date: 1/" + month+1 +"/" +year);
        }
        else if ((month == 4 || month == 6 || month == 9 || month == 11) && day == 30){
            System.out.println("Next date: 1/" + month+1 +"/" +year);
        }
        else if (day==31 && month ==12){
            System.out.println("Next date: 1/1/" +(year+1));
        }
        else{
            System.out.println("Toady's date: "+ (day+1) + "/" + month +"/" +year);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String choice;
        do{
            System.out.print("Enter date (dd//mm/yyyy): ");
            String mydate = sc.next();

            String[] mydate_parts = mydate.split("/");

            int myday = Integer.parseInt(mydate_parts[0]);
            int mymonth = Integer.parseInt(mydate_parts[1]);
            int myyear = Integer.parseInt(mydate_parts[2]);
        
            Date obj1 = new Date(myday, mymonth, myyear);
            if (obj1.monthChecker()){
                if(obj1.dayChecker()){
                    obj1.dateDisplay();
                    obj1.nextDateDisplay();
                }
            }
            else{
                System.out.println("Invalid Input!");
            }
            System.out.println("Do you want to enter again? Yes or No? ");
            choice = sc.next();
        } while(choice.equalsIgnoreCase("Yes"));
        System.out.println("Exiting Date System---");
        System.exit(0);
         
    }
}
