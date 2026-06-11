package day_4;

import java.util.Scanner;

public class Date_checker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        date(s);

    }

    static void date(String s){
        String[] arr = s.split("/");
        int date = Integer.parseInt(arr[0]);
        int month = Integer.parseInt(arr[1]);
        int year = Integer.parseInt(arr[2]);

        boolean flag = false;

        if(month >= 1 && month <= 12){
            if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){

                if(date >= 1 && date <= 31){
                    flag = true;
                }
            }
            else if(month == 4 || month == 6 || month == 9 || month == 11){
                    if (date >= 1 && date <= 30) {
                        flag = true;
                    }
            }else if(month == 2 && (date <= 28 && date >= 1)){
//                if {
                    flag = true;
//                }
            }else if(month == 2 && date == 29){
                if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                    flag = true;
                }
            }
        }

        if(flag){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }
    }
}
