package e_7July;

public class ReformatDate {
    public String reformatDate(String date) {
        String year = date.split(" ")[2];
        String month = date.split(" ")[1];
        String day = date.split(" ")[0];
        if(month.equals("Jan")){
            month = "01";
        }else if(month.equals("Feb")){
            month = "02";
        }else if(month.equals("Mar")){
            month = "03";
        }else if(month.equals("Apr")){
            month = "04";
        }else if(month.equals("May")){
            month = "05";
        }else if(month.equals("Jun")){
            month = "06";
        }else if(month.equals("Jul")){
            month = "07";
        }else if(month.equals("Aug")){
            month = "08";
        }else if(month.equals("Sep")){
            month = "09";
        }else if(month.equals("Oct")){
            month = "10";
        }else if(month.equals("Nov")){
            month = "11";
        }else if(month.equals("Dec")){
            month = "12";
        }
        if(day.length() == 3){
            day = "0"+day.substring(0,1);
        }
        else if(day.length() == 4){
            day = day.substring(0, 2);
        }
        return year+"-"+month+"-"+day;
    }
}
