package f_8August;

public class DayOfTheWeek {
    public static void main(String[] args) {
        System.out.println(dayOfTheWeek(31, 8, 2019));
        System.out.println(dayOfTheWeek(18, 7, 1999));
    }
    public static String dayOfTheWeek(int day, int month, int year) {
        // 1971.1.1 Fri
        int sum = 4;
        for(int i = 1971; i < year; i++){
            if(i % 4 == 0&& i % 100 !=0 || i%400 == 0)sum += 366;
            else sum += 365;
        }
        if(year % 4 == 0&& year % 100 !=0 || year%400 == 0){//闰年的情况
            if(month == 1)sum += 0;
            else if(month == 2)sum += 31;
            else if(month == 3)sum += 31 + 29;
            else if(month == 4)sum += 31 + 29 + 31;
            else if(month == 5)sum += 31 + 29 + 31 + 30;
            else if(month == 6)sum += 31 + 29 + 31 + 30 + 31;
            else if(month == 7)sum += 31 + 29 + 31 + 30 + 31 + 30;
            else if(month == 8)sum += 31 + 29 + 31 + 30 + 31 + 30 + 31;
            else if(month == 9)sum += 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31;
            else if(month == 10)sum += 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
            else if(month == 11)sum += 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
            else if(month == 12)sum += 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
        }
        else {//闰年的情况
            if(month == 1)sum += 0;
            else if(month == 2)sum += 31;
            else if(month == 3)sum += 31 + 28;
            else if(month == 4)sum += 31 + 28 + 31;
            else if(month == 5)sum += 31 + 28 + 31 + 30;
            else if(month == 6)sum += 31 + 28 + 31 + 30 + 31;
            else if(month == 7)sum += 31 + 28 + 31 + 30 + 31 + 30;
            else if(month == 8)sum += 31 + 28 + 31 + 30 + 31 + 30 + 31;
            else if(month == 9)sum += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
            else if(month == 10)sum += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
            else if(month == 11)sum += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
            else if(month == 12)sum += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
        }
        sum += day;
        sum = sum % 7;
        if(sum == 1){
            return "Monday";
        }
        else if(sum == 2){
            return "Tuesday";
        } else if(sum == 3){
            return "Wednesday";
        } else if(sum == 4){
            return "Thursday";
        } else if(sum == 5){
            return "Friday";
        } else if(sum == 6){
            return "Saturday";
        } else {
            return "Sunday";
        }
    }
}
/**
 class Solution {
 public String dayOfTheWeek(int day, int month, int year) {
 int sum = 4;
 if(year!=1971) {
 for(int i = 1971;i<year;i++) {
 sum+=Tianshu(i);
 }
 }



 String[] arr = new String[7];
 arr[0]="Sunday";
 arr[1]="Monday";
 arr[2]="Tuesday";
 arr[3]="Wednesday";
 arr[4]="Thursday";
 arr[5]="Friday";
 arr[6]="Saturday";
 int[] brr = new int[12];
 brr[0] = 31;
 brr[2] = 31;
 brr[3] = 30;
 brr[4] = 31;
 brr[5] = 30;
 brr[6] = 31;
 brr[7] = 31;
 brr[8] = 30;
 brr[9] = 31;
 brr[10] = 30;
 brr[11] = 31;



 if(year%4==0&&year%100!=0||year%400==0) {
 brr[1]=29;
 if(month==1) {
 return arr[(day+sum)%7];
 }
 for(int i = 0;i<month-1;i++) {
 sum+=brr[i];
 }
 sum+=day;
 return arr[sum%7];
 }else {
 brr[1]=28;
 if(month==1) {
 return arr[(day+sum)%7];
 }
 for(int i = 0;i<month-1;i++) {
 sum+=brr[i];
 }
 sum+=day;
 return arr[sum%7];
 }


 }

 public int Tianshu(int a) {
 if(a%4==0&&a%100!=0||a%400==0) {
 return 366;
 }
 return 365;
 }


 }
 */