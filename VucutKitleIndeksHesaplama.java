import java.util.Scanner;

public class VucutKitleIndeksHesaplama {

    public static void main(String[] args) {

        double boy, kilo, indeks;

        Scanner inp = new Scanner(System.in);

        System.out.print("Boyunuzu (metre cinsinden) Giriniz: ");
        boy = inp.nextDouble();

        System.out.print("Kilonuzu giriniz: ");
        kilo = inp.nextDouble();

        indeks = kilo / (boy * boy);

        System.out.println("Vucut Kitle Endeksiniz: " + indeks);






    }
}
