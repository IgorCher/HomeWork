import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите день");
        int d = scan.nextInt();
        System.out.println("Введите месяц");
        int m = scan.nextInt();
        if (m==1 & d>=20 & d<=31) {
            System.out.println("Водолей");
        } else if (m==2 & d>=1 & d<=18){
            System.out.println("Водолей");
        }else if (m==2 & d>=19 & d<=28) {
            System.out.println("Рыбы");
        } else if (m==3 & d>=1 & d<=20) {
            System.out.println("Рыбы");
        } else if (m==3 & d>=21 & d<=31) {
            System.out.println("Овен");
        } else if (m==4 & d>=1 & d<=20) {
            System.out.println("Овен");
        } else if (m==4 & d>=21 & d<=30) {
            System.out.println("Телец");
        } else if (m==5 & d>=1 & d<=20) {
            System.out.println("Телец");
        } else if (m==5 & d>=21 & d<=31) {
            System.out.println("Близнецы");
        } else if (m==6 & d>=1 & d<=21) {
            System.out.println("Близнецы");
        } else if (m==6 & d>=22 & d<=30) {
            System.out.println("Рак");
        } else if (m==7 & d>=1 & d<=22) {
            System.out.println("Рак");
        } else if (m==7 & d>=23 & d<=31) {
            System.out.println("Лев");
        } else if (m==8 & d>=1 & d<=22) {
            System.out.println("Лев");
        } else if (m==8 & d>=23 & d<=31) {
            System.out.println("Дева");
        } else if (m==9 & d>=1 & d<=22) {
            System.out.println("Дева");
        } else if (m==9 & d>=23 & d<=30) {
            System.out.println("Весы");
        } else if (m==10 & d>=1 & d<=22) {
            System.out.println("Весы");
        } else if (m==10 & d>=23 & d<=31) {
            System.out.println("Скорпион");
        } else if (m==11 & d>=1 & d<=22) {
            System.out.println("Скорпион");
        } else if (m==11 & d>=23 & d<=30) {
            System.out.println("Стрелец");
        } else if (m==12 & d>=1 & d<=21) {
            System.out.println("Стрелец");
        } else if (m==12 & d>=22 & d<=31) {
            System.out.println("Козерог");
        } else if (m==1 & d>=1 & d<=19) {
            System.out.println("Козерог");
        } else {
            System.out.println("Такой даты не существует!");
        }
    }
}