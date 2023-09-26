package aracSigortaApp;

/*
         Proje: Araç Sigorta Prim Hesaplama
           Araç tipleri:otomobil, kamyon, otobüs, motosiklet
                    -otobüs: 18-30 koltuk veya 31 ve üstü koltuk
       Tarife dönemi:Aralık 2023,Haziran 2023
          1.dönem :Haziran 2023               2.dönem:Aralık 2023
          otomobil: 2000                       otomobil: 2500
          kamyon:   3000                       kamyon:   3500
          otobüs: tip1: 4000 tip2: 5000        otobüs: tip1: 4500 tip2: 5500
          motosiklet: 1500                     motosiklet: 1750

        1-Tekrar tekrar kullanılan bir seçim menüsü(form) gösterelim.
        2-Tarife dönemi bilgisi,araç tipi bilgilerini kullanıcıdan alalım.
        3-Hatalı girişte hesaplama başarısız uyarısı verip tekrar menü(form) gösterilsin.
        4-Menüde yeni işlem veya çıkış için seçenek sunulsun .
        5-tarife dönemi ve araç tipine göre sigorta primi hesaplansın.
         */

import java.util.Scanner;

public class AracSigortaApplication {
    public static void main(String[] args) {//Kodu tekrar tekrar yazdırabilmek için

        //1.uygulamayı başlatan bir method

        start();


    }

    public static void start(){

        //2.Kullanıcıdan bilgi alma
        Scanner input = new Scanner(System.in);
        boolean iAgain;
        //3.tekrar tekrar menü gösterilsin//For kullanmak istersek kaç kere döngü olacağını bilmemiz gerekir

        do {

            System.out.println("------Zorunlu Arac Aigorta Primi Hesapmala -------");
            System.out.println("Tarife dönemini seçiniz");
            System.out.println("1. Haziran 2023");
            System.out.println("2. Aralık 2023");
            int term =input.nextInt();
            String termName = term==1 ? "Haziran 2023 " : "Aralık 2023";

            //Tarife dönemi doğru girilirse işleme devam edeceğiz fakat hatalı girilirse mesajı ver yeniden form göster
            int sellect;

            if (term==1||term==2){
            //4.Arac objesi olusturalım
            Arac arac=new Arac();//defolutta parametresiz concructer vardır
                System.out.println("Araç tipini giriniz : ");
                System.out.println("otomobil, kamyon, otobüs, motosiklet");
                arac.type =input.next();//Arac özelliği kullanıcını girdiği değer olsun dedik buarda
                arac.countPrim(term);//Prim değeri belinlenmiş oldu
                //prim=0 ise hatalı giriş yeni işlem seçeneği
                //prim>0 ise hesaplama başarılı , sonucu görüntüle
                if (arac.prim>0){
                    System.out.println("---------------");
                    System.out.println("Arac tipi :" + arac.type);
                    System.out.println("Tarife dönemi : " +termName);
                    System.out.println("Aracınızın ilgili dönem sigorta primi" +arac.prim);

                    System.out.println("Yeni işlem için 1, çıkış için 0 seçiniz");
                    sellect=input.nextInt();

                    iAgain=sellect==1 ? true : false;



                }else{
                    System.out.println("Hesaplama başarısız , tekrardeneyiniz");
                    System.out.println("Yeni işlem için 1, çıkış için 0 seçiniz");
                    sellect=input.nextInt();

                    iAgain=sellect==1 ? true : false;



                }

            }else{//Hatalı giriste mesaj vereceğiz

                System.out.println("Hatalı giris!");
                iAgain=true;

            }

        }while (iAgain);//isAgain doğru olduğu sürecen dön

        System.out.println("İyigünler dileriz..");







    }





























}
