public class LeapYear {
    public static void main(String[] args) {
isLeapYear(2000);
    }
    public static boolean isLeapYear(int year){
    if (year<=1||year>=9999){
        System.out.println(year+" is not a leap year");
        return false;
    }else if ((year%4==0)&&(year%100!=0)){
        System.out.println(year+" artık yıl");
        return true;
    }else if ((year%100==0)&&(year%400==0)){
        System.out.println(year+" artık yıl");
        return true;
    }else {
        System.out.println(year+" is not a leap year");
    }

        return false;
    }





}




