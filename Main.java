// Bu programda Z ve N oyunucusu yerine kendi ve oyun arkadaşınızın adını yazıp, kaç kere zar atmak isterseniz yazıp hepsi sonucunda kazananı kolayca bulabilirsiniz.
import java.util.*;

public class Main
{
    public static void main(String [] args)
    {

        int kacKere;
        int zarZ;
        int zarN;
        int sayacN=0;
        int sayacZ=0;

        Scanner klavye = new Scanner(System.in);
        System.out.println("Zar atma sayısı:");
        kacKere = klavye.nextInt();



        for (int i = 0; i < kacKere; i++)
        {
            System.out.println("\n");
            System.out.println("Z oyuncusunun zar atma sırası,");
            zarZ = ((int)(Math.random() * 6 ) +1 );
            /* Math sınıfından olan random metodu 0-1 arası random sayılar üretir fakat 0 ve 1 üretemez. Bunlardan min sayı 0,.. max sayı 5,... gibi bir değer olur.İnt de bunu
             0 ve 5 alır. Yani "Math.random() * 6"den 0 1 2 3 4 5 değerleri çıkabilir. Zar üzerindeki 1 2 3 4 5 6 değerlerini elde etmek için buna 1 eklemek yeterlidir. Bu sebeple
             +1 eklenmiştir. */
            System.out.println("Z oyuncusunun zar sayısı:" +zarZ);

            System.out.println("\n");

            System.out.println("N oyuncusunun zar atma sırası,");
            zarN = ((int)(Math.random() * 6 ) +1 );
            System.out.println("N oyuncusunun zar sayısı:" +zarN);


            if (zarZ > zarN)
            {
                System.out.println("**************************\nZ oyuncusu kazandııı!.\n**************************");
                sayacZ++;

            }

            else if(zarN > zarZ)
            {
                System.out.println("**************************\nN oyuncusu kazandııı!\n**************************");
                sayacN++;
            }
            else
            {
                System.out.println("**************************\nBerabere kaldınız!\n**************************");
            }


        }
        System.out.println("\n");
       /*Bu for döngüsünün dışına zarZ ve zarN çıkamıyor. Yani bu satırda veya daha aşağıda onları yazdıramıyor veya karşılaştıramıyorum. Bunun sebebi yerel tanımlanan ve tanımı
       sürekli değişen değişkenler olması. O yüzden if(zarZ>zarN) döngünün dışında yeni bir döngüde çalışmaz. Zaten o fazladan işlem yapmak olurdu. Her seferinde o karşılaştırma
       yapılacağı için döngünün içinde olması gerekti. sayacZ ve sayacN değişkenleri döngü dışında kullanılabildi çünkü döngünün içinde sürekli yeni değerler oluşturmadı.
       Döngünün üstünde atanan değeri sadece arttırıldı.
        */

        if (sayacN>sayacZ)
        {
            System.out.println("----------------------------------------------\n"+kacKere + " adet oyunu "+sayacN+" galibiyetle kazanan:N Oyuncusu.\n----------------------------------------------");
        }
        else if (sayacZ>sayacN)
        {
            System.out.println("----------------------------------------------\n"+kacKere + " adet oyunu "+sayacZ+" galibiyetle kazanan:Z Oyuncusu\n----------------------------------------------");
        }
        else
        {
            System.out.println("----------------------------------------------\n"+kacKere + " adet oyun berabere bitmiştir.EŞİTLİK.\n----------------------------------------------");
        }



    }
}
