package aracSigortaApp;


/*
    Tarife dönemi:Aralık 2023,Haziran 2023
            1.dönem :Haziran 2023               2.dönem:Aralık 2023
    otomobil: 2000                       otomobil: 2500
    kamyon:   3000                       kamyon:   3500
    otobüs: tip1: 4000 tip2: 5000        otobüs: tip1: 4500 tip2: 5500
    motosiklet: 1500                     motosiklet: 1750

 */

import java.util.Scanner;

public class Arac {//Classlar objelerin özelliklerini taşır

    //bir class içindeki method objenin davranışını primi hesaplayan davranış
    public String type;

    public int prim;//tarife dönemi , tipine hesapla



    //5.Prim hesaplama
    public void countPrim(int term){

        switch (this.type){//this bu classın objesinin tipine göre demek
            case "otomobil":
                this.prim=term==1 ? 2000 : 2500;
                break;
            case "kamyon":
                this.prim=term==1 ? 3000 : 3500;
               break;
            case"otobüs":
                //2 tip var, kullanıcıdan bilgi alınacak


            break;
            case "motosiklt":
                this.prim=term==1 ? 1500 : 1750;
                break;
            default:
                System.out.println("Hatalı giris");
                this.prim=0;
                break;



        }



    }
    //6.Otobüs tipine göre prim hesaplama

    public void countBusPrim(int term){
        Scanner input = new Scanner(System.in);
        System.out.println("Otobüs tipini giriniz");
        System.out.println("1. 18-30 koltuk arası");
        System.out.println("2. 31 koltuk ve üzeri");
        int busType = input.nextInt();
        switch (busType){
            case 1:
                this.prim=term==1 ? 4000 : 4500;
                break;
            case 2:
                this.prim=term==1 ? 5000 : 5500;
                break;
            default:
                System.out.println("Hatalı giriş");
                this.prim=0;
                break;

        }


    }






}
