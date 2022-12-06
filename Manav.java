import java.util.Scanner;
public class Manav {
    public static void main(String[] args){

        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5,armutkg,elmakg,domateskg,muzkg,patlicankg,toplam;

        Scanner ar=new Scanner(System.in);
        System.out.println("Armut kaç kilo:");
        armutkg=ar.nextDouble();

        Scanner el=new Scanner(System.in);
        System.out.println("Elma kaç kilo:");
        elmakg=el.nextDouble();

        Scanner dom=new Scanner(System.in);
        System.out.println("Domates kaç kilo:");
        domateskg=dom.nextDouble();

        Scanner mu=new Scanner(System.in);
        System.out.println("Muz kaç kilo:");
        muzkg=mu.nextDouble();

        Scanner pat=new Scanner(System.in);
        System.out.println("Patlican kaç kilo:");
        patlicankg=pat.nextDouble();

        toplam=armutkg*armut+elma*elmakg+domates*domateskg+muz*muzkg+patlican*patlicankg;
        System.out.println("Toplam tutar:" +toplam);

    }
}