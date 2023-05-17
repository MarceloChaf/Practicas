import java.util.Scanner;

public class Tiempo {

    private static int year,month,day,hour,minute,second;
    private static Scanner sc=new Scanner(System.in);

    public static String setFecha(){

        return String.format("%02d/%02d/%02d ",setYear(),setMonth(),setDay());
    }

    public static String setHorario(){

        return String.format("%02d:%02d:%02d ",setHour(),setMinute(),setSecond());
    }
    private static int setYear() {
        do {
            System.out.printf("Ingrese el año de fabricacion");
            year =sc.nextInt();
        }while (year<1886 || year>2024);
        return year;
    }

    private static int setMonth() {
        do {
            System.out.printf("Ingrese el mes de fabricacion");
            month =sc.nextInt();
        }while (month<1 || month>12);
        return month;
    }

    private static int setDay() {
        if(month==1 && month==3 && month==5 && month==7 && month==8 && month==10 && month==12 ){

            do{
                System.out.println("ingrese el dia de fabricacion");
                day=sc.nextInt();
                if (day<1 || day>31){
                    System.out.println("ingrese un dia valido");
                }}while (day<1 || day>31);

        } else if (month==4 && month==6 && month==9 && month==11) {

            do{
                System.out.println("ingrese el dia de fabricacion");
                day=sc.nextInt();
                if (day<1 || day>30){
                    System.out.println("ingrese un dia valido");
                }}while (day<1 || day>30);

        }else{
            boolean valid=false;
            do{
                System.out.println("ingrese el dia de fabricacion");
                day=sc.nextInt();
                if (year%4==0 && day ==29){
                    valid=true;
                } else if (day>0 && day <29) {
                    valid=true;
                }
                if (valid==false){
                    System.out.printf("Ingrese un dia valido");
                }
            }while (valid==false);
        }
            return day;
    }

    private static int setHour() {
        do {
            System.out.println("ingrese la hora");
            hour= sc.nextInt();
            if (hour<1 || hour >23){
                System.out.println("Hora fuera de rango");
            }}while (hour<1 || hour >23);
        return hour;
    }

    private static int setMinute() {
        do {
            System.out.println("ingrese el minuto");
            minute= sc.nextInt();
            if (minute<1 || minute >59){
                System.out.println("Minuto fuera de rango");
            }}while (minute<1 || minute >59);
        return minute;
    }

    private static int setSecond() {
        do {
            System.out.println("ingrese el segundo");
            second= sc.nextInt();
            if (second<1 || second >59){
                System.out.println("Segundo fuera de rango");}
        }while (second<1 || second >59);
        return second;
    }
}
