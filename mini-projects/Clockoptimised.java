/*
logic : enter hours, mins, seconds 
if mins >=0 && mins <=59 -> valid 
    if valid
        display 
    else
        warning wrong mins
if seconds >=0 && seconds <=59 -> valid
    if valid
        display
    else
        warning wrong secs
if hour >=0 && hours <= 23 -> valid
    if valid 
        then check AM or PM or NOON or MIDNIGHT
            AND
        display
    else
        warning wrong hours
*/

import java.util.Scanner;

public class Clockoptimised {
    int hours , minutes, seconds;

    Clockoptimised(int h, int m ,int s){
        hours = h;
        minutes = m;
        seconds = s;
    }

    String zone;

    public boolean validityChecker(){
        boolean isValid_time = true;
        if (!((hours>= 0 && hours <=23) && (minutes >=0 && minutes <=59) && (seconds >=0 && seconds <=59)) ){
            isValid_time = false;
            return isValid_time;
        }
        return isValid_time;
    }

    public String am_pm_Setter(){
        if (hours== 0 && minutes==0 && seconds==0){
            zone = "Midnight";
        }
        else if (hours== 12 && minutes == 0 && seconds== 0){
            zone = "Noon";
        }
        else if (hours >= 0 && hours < 12) {
            zone = "AM";
        }
        else if (hours >= 12 && this.hours <= 23) {
            zone = "PM";
        }
        return zone;
    }

    public void displayTime(){
        System.out.println(hours + ":" + minutes + ":" + seconds + " " + zone );
    }

    public static void main(String[] args){
        int hrs, mins, secs;
        String choice;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Enter hours in 24 hour format: ");
            hrs = sc.nextInt();
            System.out.print("Enter mins: ");
            mins = sc.nextInt();
            System.out.print("Enter secs: ");
            secs = sc.nextInt();

            Clockoptimised obj1 = new Clockoptimised(hrs, mins, secs);

            if (obj1.validityChecker()){
                obj1.am_pm_Setter();
                obj1.displayTime();
            }
            else{
                System.out.println("Wrong input!");
            }

            System.out.println("Do you want to enter again? Yes or No");
            choice = sc.next();
        } while(choice.equalsIgnoreCase("yes"));

        System.out.println("Exiting---");
        System.exit(0);
         
    }  
}
