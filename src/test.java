import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a1,b1;
        int select;
        System.out.print("İlk Sayıyı Giriniz: ");
        a1=input.nextDouble();
        System.out.print("İkinci Sayıyı Giriniz:  ");
        b1=input.nextDouble();
        System.out.println("****************************");
        System.out.println("1.TOPLAMA|\n2.ÇIKARMA|\n3.ÇARPMA|\n4.BÖLME");
        System.out.println("İŞLEM SEÇİN:");
        select=input.nextInt();
        System.out.println("****************************");

        switch (select){
            case 1:
                System.out.print("Cevap: "+(a1+b1));
                break;
            case 2:
                System.out.print("Cevap: "+(a1-b1));
                break;
            case 3:
                System.out.print("Cevap: "+(a1*b1));
                break;
            case 4:
                System.out.print("Cevap: "+(a1/b1));
                break;
            default:
                System.out.print("Yanlış Sayı Girdiniz!");
//Fiplik
        }
    }}