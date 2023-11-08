package oyun;

import java.util.Scanner;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;



public class oyun {
	
	
    public static void main(String[] Args){

        Scanner input = new Scanner(System.in);

        
        
        kart bosluk = new kart();
        
        List<kart> birmana = new ArrayList<>();
        
        List<kart> ikimana = new ArrayList<>();
        
        List<kart> ücmana = new ArrayList<>();
        
        List<kart> dörtmana = new ArrayList<>();
        
        List<kart> besmana = new ArrayList<>();
        
        List<String> oyuncu1deste = new ArrayList<>();
        
        List<kart> oyuncu1destekart = new ArrayList<>();
        
        List<kart> oyuncu2destekart = new ArrayList<>();
        
        List<String> oyuncu2deste = new ArrayList<>();
        
        List<String> birmanastr = new ArrayList<>();
        
        List<String> ikimanastr = new ArrayList<>();

        List<String> ücmanastr = new ArrayList<>();

        List<String> dörtmanastr = new ArrayList<>();

        List<String> besmanastr = new ArrayList<>();
        
        birmanastr.add("ıska");
        birmanastr.add("korkuluk");
        birmanastr.add("minyon");
        birmanastr.add("çığırtkan");
        birmanastr.add("bıçakçı");
        
        ikimanastr.add("değnek");
        ikimanastr.add("kışla");
        ikimanastr.add("panayır");
        ikimanastr.add("alevtopu");
        ikimanastr.add("asker");
        
        ücmanastr.add("kılıç");
        ücmanastr.add("kulübe");
        ücmanastr.add("kurt");
        ücmanastr.add("obur");
        ücmanastr.add("kıyametalameti");
        
        dörtmanastr.add("zırh");
        dörtmanastr.add("meteor");
        dörtmanastr.add("alevtopları");
        dörtmanastr.add("golem");
        dörtmanastr.add("dolunay");
        
        besmanastr.add("şövalye");
        besmanastr.add("asya");
        besmanastr.add("barbar");
        besmanastr.add("kıyamet");
        besmanastr.add("emirg");
        
        oyuncu1deste.add(" ");
        oyuncu1deste.add(" ");
        oyuncu1deste.add(" ");
        oyuncu1deste.add(" ");
        oyuncu1deste.add(" ");
        oyuncu1deste.add(" ");
        oyuncu1deste.add(" ");
        oyuncu1deste.add(" ");
        oyuncu1deste.add(" ");
        
        oyuncu1destekart.add(bosluk);
        oyuncu1destekart.add(bosluk);
        oyuncu1destekart.add(bosluk);
        oyuncu1destekart.add(bosluk);
        oyuncu1destekart.add(bosluk);
        oyuncu1destekart.add(bosluk);
        oyuncu1destekart.add(bosluk);
        oyuncu1destekart.add(bosluk);
        oyuncu1destekart.add(bosluk);
        
        oyuncu2deste.add(" ");
        oyuncu2deste.add(" ");
        oyuncu2deste.add(" ");
        oyuncu2deste.add(" ");
        oyuncu2deste.add(" ");
        oyuncu2deste.add(" ");
        oyuncu2deste.add(" ");
        oyuncu2deste.add(" ");
        oyuncu2deste.add(" ");

        oyuncu2destekart.add(bosluk);
        oyuncu2destekart.add(bosluk);
        oyuncu2destekart.add(bosluk);
        oyuncu2destekart.add(bosluk);
        oyuncu2destekart.add(bosluk);
        oyuncu2destekart.add(bosluk);
        oyuncu2destekart.add(bosluk);
        oyuncu2destekart.add(bosluk);
        oyuncu2destekart.add(bosluk);
        
        Random random = new Random();

        int turbasioyuncu1mana = 1;
        
        int turbasioyuncu2mana = 1;
        
        int oyuncu1cani = 30;
        
        int oyuncu2cani = 30;
        
        int bilgi = 2;
        
        int oyuncu1barbaryalniz = 1;
        
        int oyuncu2barbaryalniz = 1;
        
        int tanıtımsecenegi = 1;

        int oyuncu1mana = 1;
        
        int oyuncu2mana = 1; 
        
        int secenek = 0;

        int durbi = 0;
        
        int oyuncu1saldir;
        
        int oyuncu2saldir;
        
        int tanıtım = 1;

        int değnekgiriş = 1;
        
        
        int deste1boş = 1;
        
        int deste2boş = 1;
        
        int deste1ye = 1;
        
        int deste2ye = 1;

        int tur = 1;
        
        int oyuncu1saldirduzgun = 2;
        
        int oyuncu2saldirduzgun = 2;
        
        int oyuncu1ozellikogren;
        
        int oyuncu2ozellikogren;
        
        int loop = 1;
        
        int sayım = 1;
        
        int zırhgiriş = 1;
		
		int artıs = 0;
        
        int loop2 = 1;
        
        int bilgiloop = 1;
        
        int oyuncu1secenegi;
        
        int oyuncu2secenegi;
        
        int c;
        
        int secenek3loopu = 0;
        
        int k;
        
        int looop = 1;
        
        int oyuncu1saldiri;
        
        int oyuncu2saldiri;
        
        int oyuncu1vurmagücü=0;
        
        int oyuncu2vurmagücü=0;
        
        int oyuncu1dayanmagücü=0;
        
        int oyuncu2dayanmagücü=0;
        
        int saldirloop1 = 1;
        
        int saldirloop2 = 1;
        
        int oyuncu1turhamle0 = 1,oyuncu1turhamle1 = 1,oyuncu1turhamle2 = 1,oyuncu1turhamle3 = 1,oyuncu1turhamle4 = 1,oyuncu1turhamle5 = 1,oyuncu1turhamle6 = 1,oyuncu1turhamle7 = 1,oyuncu1turhamle8 = 1;

        int oyuncu2turhamle0 = 1,oyuncu2turhamle1 = 1,oyuncu2turhamle2 = 1,oyuncu2turhamle3 = 1,oyuncu2turhamle4 = 1,oyuncu2turhamle5 = 1,oyuncu2turhamle6 = 1,oyuncu2turhamle7 = 1,oyuncu2turhamle8 = 1;

        int büyühedefi = 0;
        
        int büyüloopu = 1;
        
        int büyülooopu = 1;
        
        int durbii = 1;
        
        int oyuncu1slot0can=0;
        int oyuncu1slot1can=0;
        int oyuncu1slot2can=0;
        int oyuncu1slot3can=0;
        int oyuncu1slot4can=0;
        int oyuncu1slot5can=0;
        int oyuncu1slot6can=0;
        int oyuncu1slot7can=0;
        int oyuncu1slot8can=0;
        int oyuncu1slot9can=0;

        int oyuncu2slot0can=0;
        int oyuncu2slot1can=0;
        int oyuncu2slot2can=0;
        int oyuncu2slot3can=0;
        int oyuncu2slot4can=0;
        int oyuncu2slot5can=0;
        int oyuncu2slot6can=0;
        int oyuncu2slot7can=0;
        int oyuncu2slot8can=0;
        int oyuncu2slot9can=0;
        
        int oyuncu1slot0saldırıgücü=0;
        int oyuncu1slot1saldırıgücü=0;
        int oyuncu1slot2saldırıgücü=0; 
        int oyuncu1slot3saldırıgücü=0;
        int oyuncu1slot4saldırıgücü=0;
        int oyuncu1slot5saldırıgücü=0;
        int oyuncu1slot6saldırıgücü=0;
        int oyuncu1slot7saldırıgücü=0;
        int oyuncu1slot8saldırıgücü=0;
        int oyuncu1slot9saldırıgücü=0;

        int oyuncu2slot0saldırıgücü=0;
        int oyuncu2slot1saldırıgücü=0;
        int oyuncu2slot2saldırıgücü=0; 
        int oyuncu2slot3saldırıgücü=0;
        int oyuncu2slot4saldırıgücü=0;
        int oyuncu2slot5saldırıgücü=0;
        int oyuncu2slot6saldırıgücü=0;
        int oyuncu2slot7saldırıgücü=0;
        int oyuncu2slot8saldırıgücü=0;
        int oyuncu2slot9saldırıgücü=0;
        
        int oyuncu1kıyamet0 = 0, oyuncu1kıyamet1 = 0, oyuncu1kıyamet2 = 0, oyuncu1kıyamet3 = 0, oyuncu1kıyamet4 = 0, oyuncu1kıyamet5 = 0, oyuncu1kıyamet6 = 0, oyuncu1kıyamet7 = 0, oyuncu1kıyamet8 = 0;

        int oyuncu2kıyamet0 = 0, oyuncu2kıyamet1 = 0, oyuncu2kıyamet2 = 0, oyuncu2kıyamet3 = 0, oyuncu2kıyamet4 = 0, oyuncu2kıyamet5 = 0, oyuncu2kıyamet6 = 0, oyuncu2kıyamet7 = 0, oyuncu2kıyamet8 = 0;

        int oyuncu1asya0 = 3, oyuncu1asya1 = 3, oyuncu1asya2 = 3, oyuncu1asya3 = 3, oyuncu1asya4 = 3, oyuncu1asya5 = 3, oyuncu1asya6 = 3, oyuncu1asya7 = 3, oyuncu1asya8 = 3;

        int oyuncu2asya0 = 3, oyuncu2asya1 = 3, oyuncu2asya2 = 3, oyuncu2asya3 = 3, oyuncu2asya4 = 3, oyuncu2asya5 = 3, oyuncu2asya6 = 3, oyuncu2asya7 = 3, oyuncu2asya8 = 3;

        kart emirg = new kart();
        emirg.bedel = 5;
        emirg.saldırıgücü = 25;
        emirg.can = 25;
        emirg.özellik = "oyundaki en güçlü kart. oyuncunun canını 5 arttırır. bütün takım arkadaşlarını ve düşman kartları öldürür.";
        emirg.nadirlik = 5;
        		
        kart golem = new kart();
        golem.bedel = 4;
        golem.saldırıgücü = 1;
        golem.can = 5;
        golem.özellik = "golemin canı her tur 2 e katlanır. eğer golemin canı 50 yi geçerse oyun biter.";
        golem.nadirlik = 4;
        
        kart çığırtkan = new kart();
        çığırtkan.bedel = 1;
        çığırtkan.saldırıgücü = 2;
        çığırtkan.can = 1;
        çığırtkan.özellik = "--";
        çığırtkan.nadirlik = 4;
        
        kart bıçakçı = new kart();
        bıçakçı.bedel = 1;
        bıçakçı.saldırıgücü = 1;
        bıçakçı.can = 2;
        bıçakçı.özellik = "canlı olduğu her tur saldırı gücü 1 artar.";
        bıçakçı.nadirlik = 5;
        
        kart minyon = new kart();
        minyon.bedel = 1;
        minyon.saldırıgücü = 1;
        minyon.can = 1;
        minyon.özellik = "--";
        minyon.nadirlik = 3;
        
        kart panayır = new kart();
        panayır.bedel = 2;
        panayır.özellik = "3 tane minyon çağır.";
        panayır.nadirlik = 3;
        
        kart kulübe = new kart();
        kulübe.bedel = 3;
        kulübe.saldırıgücü = 0;
        kulübe.can = 8;
        kulübe.özellik = ("canlı olduğu her tur 2 minyon çağır.");
        kulübe.nadirlik = 2;
        
        kart obur = new kart();
        obur.bedel = 3;
        obur.saldırıgücü = 1;
        obur.can = 8;
        obur.özellik = "oburun elinde olduğu her tur, oyuncunun canı 1 artar.";
        obur.nadirlik = 4;
        
        kart barbar = new kart();
        barbar.bedel = 5;
        barbar.saldırıgücü = 6;
        barbar.can = 5;
        barbar.özellik = "seçtiği takım arkadaşının canını 2 azaltır, kendi ve seçtiği arkadaşının saldırı gücünü 2 arttırır.";
        barbar.nadirlik = 3;
        
        kart meteor = new kart();
        meteor.bedel = 4;
        meteor.özellik = "seçtiğin kart ölür";
        meteor.nadirlik= 2;
        meteor.saldırıgücü =999;
        
        kart asker = new kart();
        asker.bedel = 2;
        asker.saldırıgücü = 3;
        asker.can = 5;
        asker.özellik = "--";
        asker.nadirlik = 5;
        
        kart kılıç = new kart();
        kılıç.bedel = 3;
        kılıç.saldırıgücü = 6;
        kılıç.can = 1;
        kılıç.özellik = "--";
        kılıç.nadirlik = 1;
        
        kart alevtopu = new kart();
        alevtopu.bedel = 2;
        alevtopu.özellik = "seçtiğin birime 2 hasar verir.";
        alevtopu.nadirlik = 4;
        alevtopu.saldırıgücü = 2;
        		
        kart asya = new kart();
        asya.bedel = 5;
        asya.saldırıgücü = 7;
        asya.can = 3;
        asya.özellik = "ölmediği her tur canı linear bir şekilde tazelenir. (3-4-5...)";
        asya.nadirlik = 2;
        
        kart korkuluk = new kart();
        korkuluk.bedel = 1;
        korkuluk.saldırıgücü = 0;
        korkuluk.can = 1;
        korkuluk.özellik = "-";
        korkuluk.nadirlik = 2;
        
        
        
        kart ıska = new kart();
        ıska.bedel = 1;
        ıska.saldırıgücü = 0;
        ıska.can = 0;
        ıska.özellik = "-";
        ıska.nadirlik = 1;
        
        kart kurt = new kart();
        kurt.bedel = 3;
        kurt.saldırıgücü = 3;
        kurt.can = 3;
        kurt.özellik = ("-");
        kurt.nadirlik = 3;
        
        kart dolunay = new kart();
        dolunay.bedel = 4;
        dolunay.özellik = ("3 tane kurt çağır.");
        dolunay.nadirlik = 5;
        
        kart şövalye = new kart();
        şövalye.bedel = 5;
        şövalye.saldırıgücü = 6;
        şövalye.can = 6;
        şövalye.özellik = "--";
        şövalye.nadirlik = 1;
        
        kart alevtopları = new kart();
        alevtopları.bedel = 4;
        alevtopları.özellik = "3 tane alev topu kartı.";
        alevtopları.nadirlik = 3;
        
        kart kıyametalameti = new kart();
        kıyametalameti.bedel = 3;
        kıyametalameti.saldırıgücü = 0;
        kıyametalameti.can = 8;
        kıyametalameti.özellik = "3 tur içinde öldürülmez ise oyunu kart sahibi kazanır.";
        kıyametalameti.nadirlik = 5;
        
        kart zırh = new kart();
        zırh.bedel = 4;
        zırh.özellik = "seçtiğin kartın canını 10 yapar.";
        zırh.nadirlik = 1;
        
        kart değnek = new kart();
        değnek.bedel = 2;
        değnek.özellik = "hem kendinden hemde karşıdan bir birime 1 hasar verirsin";
        değnek.nadirlik = 1;
        
        kart kışla = new kart();
        kışla.bedel = 2;
        kışla.özellik = "seçtiğin bir kartını asker kartına dönüştür";
        kışla.nadirlik = 2;
       
        
        kart kıyamet = new kart();
        kıyamet.bedel = 5;
        kıyamet.özellik = "karşıdaki bütün kartları öldürür.";
        kıyamet.nadirlik = 4;
        
        
        birmana.add(ıska);
        birmana.add(korkuluk);
        birmana.add(minyon);
        birmana.add(çığırtkan);
        birmana.add(bıçakçı);
        
        ikimana.add(değnek);
        ikimana.add(kışla);
        ikimana.add(panayır);
        ikimana.add(alevtopu);
        ikimana.add(asker);
        
        ücmana.add(kılıç);
        ücmana.add(kulübe);
        ücmana.add(kurt);
        ücmana.add(obur);
        ücmana.add(kıyametalameti);
        
        dörtmana.add(zırh);
        dörtmana.add(meteor);
        dörtmana.add(alevtopları);
        dörtmana.add(golem);
        dörtmana.add(dolunay);
        
        besmana.add(şövalye);
        besmana.add(asya);
        besmana.add(barbar);
        besmana.add(kıyamet);
        besmana.add(emirg);
        
        
        
        System.out.println("Oyuna hoşgeldiniz, oyunla ilgili bilgi almak istiyorsanız 1, devam etmek istiyorsanız 2 ye basınız.");
        
        while(bilgiloop == 1) {
        	bilgi = input.nextInt();
        if(bilgi==1) {
        	System.out.println("\n1. ve 2. oyuncunun 30 canı var. mana bedeline göre saldırı gücü ve canı olan kartlar, büyüler alıyorsunuz ve her seçenek için kötü/orta-kötü/orta/orta-iyi/iyi ihtimalleri arasından rastgele kart geliyor. \n");
        	
        	break;
        }
        else if(bilgi==2)
        	break;
        else
        	System.out.println("girdiğiniz değer geçersiz.");
        }
        	
        	
        
            
        
        
        while(oyuncu1cani > 0 && oyuncu2cani > 0){
            
            
            
            oyuncu1mana = turbasioyuncu1mana;
            
            oyuncu2mana = turbasioyuncu2mana;
            
            tur=0;
            
            System.out.println("\n1. oyuncunun sırası\n\n1. oyuncunun güncel manası = " +oyuncu1mana);
            
            System.out.println("\nSeçenekler 1/2/3/4/5 mana bedelli kartlar.");
            
            do {
            
            oyuncu1secenegi = input.nextInt();
            
            if(oyuncu1secenegi == 1||oyuncu1secenegi == 2 ||oyuncu1secenegi == 3 || oyuncu1secenegi == 4|| oyuncu1secenegi == 5) {
            
            	secenek3loopu = 0;
                    
                    if(oyuncu1secenegi == 1){
                    	while(loop==1){
                    
                    System.out.println("\nkartın bedeli " + 1 + ". sizin mananız " + oyuncu1mana +  ". yapmak istediğiniz işlemi seçiniz.\n");
                    
                    System.out.println("almak için 1, ihtimalleri incelemek için 2'ye, seçeneğinizi değiştirmek için 3'e, turu bitirmek için 4'e basınız.");
                    secenek = input.nextInt();
                    if(secenek == 1){
                        if(oyuncu1mana>=1){
                        	
                        	c = random.nextInt((4 - 0) + 1); 
                        	
                        	
                        	
                        	for(k = 0; k < 9; k++) {
                        		if(birmanastr.get(c).equals("ıska")) {
                            		System.out.println("ıska geldi, boş çektiniz!.\n");
                            		break;
                        		}
                    			if(oyuncu1deste.get(k).equals(" ")) {
                    			oyuncu1deste.set(k, birmanastr.get(c));
                    			break;
                    			}
                    		}
                        	for(k = 0; k < 9; k++) {
                    			if(oyuncu1destekart.get(k).equals(bosluk)) {
                    				if(birmanastr.get(c).equals("ıska")) {
                                		
                                		break;
                            		}
                    			oyuncu1destekart.set(k, birmana.get(c));
                    			if(k==0) {
                    				oyuncu1slot0can = birmana.get(c).can;
                    				oyuncu1slot0saldırıgücü = birmana.get(c).saldırıgücü;
                    			}
                    			if(k==1) {
                    				oyuncu1slot1can = birmana.get(c).can;
                    				oyuncu1slot1saldırıgücü = birmana.get(c).saldırıgücü;
                    			}
                    			if(k==2) {
                    				oyuncu1slot2can = birmana.get(c).can;
                    				oyuncu1slot2saldırıgücü = birmana.get(c).saldırıgücü;
                    			}
                    			if(k==3) {
                    				oyuncu1slot3can = birmana.get(c).can;
                    				oyuncu1slot3saldırıgücü = birmana.get(c).saldırıgücü;
                    			}
                    			if(k==4) {
                    				oyuncu1slot4can = birmana.get(c).can;
                    				oyuncu1slot4saldırıgücü = birmana.get(c).saldırıgücü;
                    			}
                    			if(k==5) {
                    				oyuncu1slot5can = birmana.get(c).can;
                    				oyuncu1slot5saldırıgücü = birmana.get(c).saldırıgücü;
                    			}
                    			if(k==6) {
                    				oyuncu1slot6can = birmana.get(c).can;
                    				oyuncu1slot6saldırıgücü = birmana.get(c).saldırıgücü;
                    			}
                    			if(k==7) {
                    				oyuncu1slot7can = birmana.get(c).can;
                    				oyuncu1slot7saldırıgücü = birmana.get(c).saldırıgücü;
                    			}
                    			if(k==8) {
                    				oyuncu1slot8can = birmana.get(c).can;
                    				oyuncu1slot8saldırıgücü = birmana.get(c).saldırıgücü;
                    			}
                    			
                    			break;
                    		}
                        	}
                        	if(birmanastr.get(c).equals("ıska"));
                        	else
                        	System.out.println("\n" +birmanastr.get(c) +" kartını aldınız.\n");
                            
                            System.out.println("güncel desteniz = " + oyuncu1deste + "\n");
                            oyuncu1mana = oyuncu1mana - 1;
                            
                            durbi = 1;
                        }
                        else if(oyuncu1mana<1){
                            System.out.println("\nalmak için yeterince mananız yok.\n");
                        }
                    }
                    else if(secenek == 2){
                    	while(tanıtım ==1) {
                        System.out.println("(1) "+ birmanastr.get(0) +"\n\n(2) "+birmanastr.get(1)+"\n\n(3) "+birmanastr.get(2)+"\n\n(4) "+birmanastr.get(3)+"\n\n(5) "+birmanastr.get(4)+"\n\nözelliklerini görmek istediğiniz kartın numarasını yazınız. çıkmak için 0 yazınız.");
                    	
                        tanıtımsecenegi = input.nextInt();
                        if(tanıtımsecenegi == 1 || tanıtımsecenegi == 2 || tanıtımsecenegi == 3 || tanıtımsecenegi == 4 || tanıtımsecenegi == 5) {
                        	
                        	System.out.println("\nkart - " + birmanastr.get(tanıtımsecenegi-1) + "\nsaldırı gücü = " + birmana.get(tanıtımsecenegi-1).saldırıgücü + "\ncan = " + birmana.get(tanıtımsecenegi-1).can + "\nözellik = " + birmana.get(tanıtımsecenegi-1).özellik + "\n");
                         }
                        
                        else if(tanıtımsecenegi == 0)
                        	break;
                    	
                    	else
                    		System.out.println("geçersiz değer\n");
                    		}
                    }
                    else if(secenek == 3){ secenek3loopu = 1;
                    	System.out.println("Seçenekler 1/2/3/4/5 mana bedelli kartlar.");
                        loop = 0;
                        durbi = 1;
                        
                        
                    }
                    else if(secenek == 4){
                        turbasioyuncu1mana++;
                        loop=0;
                        durbi = 1;
                        tur++;
                    }
                	

                    }
                }
                
                    if(oyuncu1secenegi == 2){
                    	while(loop==1){
                        System.out.println("\nkartın bedeli " + 2 + ". sizin mananız " + oyuncu1mana +  ". yapmak istediğiniz işlemi seçiniz.\n");
                        
                        System.out.println("almak için 1, ihtimalleri incelemek için 2'ye, seçeneğinizi değiştirmek için 3'e, turu bitirmek için 4'e basınız.");
                        secenek = input.nextInt();
                        if(secenek == 1){
                            if(oyuncu1mana>=2){
                            	
                            	c = random.nextInt((4 - 0) + 1); 
                                
                            	for(k = 0; k < 9; k++) {
                        			if(oyuncu1deste.get(k).equals(" ")) {
                        			oyuncu1deste.set(k, ikimanastr.get(c));
                        			break;
                        			}
                        		}
                            	for(k = 0; k < 9; k++) {
                        			if(oyuncu1destekart.get(k).equals(bosluk)) {
                        			oyuncu1destekart.set(k, ikimana.get(c));
                        			if(k==0) {
                        				oyuncu1slot0can = ikimana.get(c).can;
                        				oyuncu1slot0saldırıgücü = ikimana.get(c).saldırıgücü;
                        			}
                        			if(k==1) {
                        				oyuncu1slot1can = ikimana.get(c).can;
                        				oyuncu1slot1saldırıgücü = ikimana.get(c).saldırıgücü;
                        			}
                        			if(k==2) {
                        				oyuncu1slot2can = ikimana.get(c).can;
                        				oyuncu1slot2saldırıgücü = ikimana.get(c).saldırıgücü;
                        			}
                        			if(k==3) {
                        				oyuncu1slot3can = ikimana.get(c).can;
                        				oyuncu1slot3saldırıgücü = ikimana.get(c).saldırıgücü;
                        			}
                        			if(k==4) {
                        				oyuncu1slot4can = ikimana.get(c).can;
                        				oyuncu1slot4saldırıgücü = ikimana.get(c).saldırıgücü;
                        			}
                        			if(k==5) {
                        				oyuncu1slot5can = ikimana.get(c).can;
                        				oyuncu1slot5saldırıgücü = ikimana.get(c).saldırıgücü;
                        			}
                        			if(k==6) {
                        				oyuncu1slot6can = ikimana.get(c).can;
                        				oyuncu1slot6saldırıgücü = ikimana.get(c).saldırıgücü;
                        			}
                        			if(k==7) {
                        				oyuncu1slot7can = ikimana.get(c).can;
                        				oyuncu1slot7saldırıgücü = ikimana.get(c).saldırıgücü;
                        			}
                        			if(k==8) {
                        				oyuncu1slot8can = ikimana.get(c).can;
                        				oyuncu1slot8saldırıgücü = ikimana.get(c).saldırıgücü;
                        			}
                        			break;
                        			}
                        		}
                            	System.out.println("\n" +ikimanastr.get(c) +" kartını aldınız.\n");
                                
                                System.out.println("güncel desteniz = " + oyuncu1deste + "\n");
                                oyuncu1mana = oyuncu1mana - 2;
                                
                                durbi = 1;
                            }
                            else if(oyuncu1mana<2){
                                System.out.println("\nalmak için yeterince mananız yok.\n");
                            }
                        }
                        else if(secenek == 2){
                        	while(tanıtım ==1) {
                            System.out.println("(1) "+ ikimanastr.get(0) +"\n\n(2) "+ikimanastr.get(1)+"\n\n(3) "+ikimanastr.get(2)+"\n\n(4) "+ikimanastr.get(3)+"\n\n(5) "+ikimanastr.get(4)+"\n\nözelliklerini görmek istediğiniz kartın numarasını yazınız. çıkmak için 0 yazınız.");
                        	
                            tanıtımsecenegi = input.nextInt();
                            if(tanıtımsecenegi == 1 || tanıtımsecenegi == 2 || tanıtımsecenegi == 3 || tanıtımsecenegi == 4 || tanıtımsecenegi == 5) {
                            	
                            	System.out.println("\nkart - " + ikimanastr.get(tanıtımsecenegi-1) + "\nsaldırı gücü = " + ikimana.get(tanıtımsecenegi-1).saldırıgücü + "\ncan = " + ikimana.get(tanıtımsecenegi-1).can + "\nözellik = " + ikimana.get(tanıtımsecenegi-1).özellik + "\n");
                             }
                            
                            else if(tanıtımsecenegi == 0)
                            	break;
                        	
                        	else
                        		System.out.println("geçersiz değer\n");
                        		}
                        }
                        else if(secenek == 3){ secenek3loopu = 1;
                        	System.out.println("Seçenekler 1/2/3/4/5 mana bedelli kartlar.");
                            loop = 0;
                            durbi = 1;
                            
                        }
                        else if(secenek == 4){
                            turbasioyuncu1mana++;
                            loop=0;
                            durbi = 1;
                            tur++;
                        }
                        }
                    }
                    
                    if(oyuncu1secenegi == 3){
                    	while(loop==1){
                        System.out.println("\nkartın bedeli " + 3 + ". sizin mananız " + oyuncu1mana +  ". yapmak istediğiniz işlemi seçiniz.\n");
                        System.out.println("almak için 1, ihtimalleri incelemek için 2'ye, seçeneğinizi değiştirmek için 3'e, turu bitirmek için 4'e basınız.");
                        secenek = input.nextInt();
                        if(secenek == 1){
                            if(oyuncu1mana>=3){
                            	
                            	c = random.nextInt((4 - 0) + 1); 
                                
                            	for(k = 0; k < 9; k++) {
                        			if(oyuncu1deste.get(k).equals(" ")) {
                        			oyuncu1deste.set(k, ücmanastr.get(c));
                        			break;
                        			}
                        		}
                            	for(k = 0; k < 9; k++) {
                        			if(oyuncu1destekart.get(k).equals(bosluk)) {
                        			oyuncu1destekart.set(k, ücmana.get(c));
                        			if(k==0) {
                        				oyuncu1slot0can = ücmana.get(c).can;
                        				oyuncu1slot0saldırıgücü = ücmana.get(c).saldırıgücü;
                        			}
                        			if(k==1) {
                        				oyuncu1slot1can = ücmana.get(c).can;
                        				oyuncu1slot1saldırıgücü = ücmana.get(c).saldırıgücü;
                        			}
                        			if(k==2) {
                        				oyuncu1slot2can = ücmana.get(c).can;
                        				oyuncu1slot2saldırıgücü = ücmana.get(c).saldırıgücü;
                        			}
                        			if(k==3) {
                        				oyuncu1slot3can = ücmana.get(c).can;
                        				oyuncu1slot3saldırıgücü = ücmana.get(c).saldırıgücü;
                        			}
                        			if(k==4) {
                        				oyuncu1slot4can = ücmana.get(c).can;
                        				oyuncu1slot4saldırıgücü = ücmana.get(c).saldırıgücü;
                        			}
                        			if(k==5) {
                        				oyuncu1slot5can = ücmana.get(c).can;
                        				oyuncu1slot5saldırıgücü = ücmana.get(c).saldırıgücü;
                        			}
                        			if(k==6) {
                        				oyuncu1slot6can = ücmana.get(c).can;
                        				oyuncu1slot6saldırıgücü = ücmana.get(c).saldırıgücü;
                        			}
                        			if(k==7) {
                        				oyuncu1slot7can = ücmana.get(c).can;
                        				oyuncu1slot7saldırıgücü = ücmana.get(c).saldırıgücü;
                        			}
                        			if(k==8) {
                        				oyuncu1slot8can = ücmana.get(c).can;
                        				oyuncu1slot8saldırıgücü = ücmana.get(c).saldırıgücü;
                        			}
                        			break;
                        			}
                        		}
                            	
                            	System.out.println("\n" +ücmanastr.get(c) +" kartını aldınız.\n");
                                
                                System.out.println("güncel desteniz = " + oyuncu1deste + "\n");
                                oyuncu1mana = oyuncu1mana - 3;
                                
                                durbi = 1;
                            }
                            else if(oyuncu1mana<3){
                                System.out.println("\nalmak için yeterince mananız yok.\n");
                            }
                        }
                        else if(secenek == 2){
                        	while(tanıtım ==1) {
                            System.out.println("(1) "+ ücmanastr.get(0) +"\n\n(2) "+ücmanastr.get(1)+"\n\n(3) "+ücmanastr.get(2)+"\n\n(4) "+ücmanastr.get(3)+"\n\n(5) "+ücmanastr.get(4)+"\n\nözelliklerini görmek istediğiniz kartın numarasını yazınız. çıkmak için 0 yazınız.");
                        	
                            tanıtımsecenegi = input.nextInt();
                            if(tanıtımsecenegi == 1 || tanıtımsecenegi == 2 || tanıtımsecenegi == 3 || tanıtımsecenegi == 4 || tanıtımsecenegi == 5) {
                            	
                            	System.out.println("\nkart - " + ücmanastr.get(tanıtımsecenegi-1) + "\nsaldırı gücü = " + ücmana.get(tanıtımsecenegi-1).saldırıgücü + "\ncan = " + ücmana.get(tanıtımsecenegi-1).can + "\nözellik = " + ücmana.get(tanıtımsecenegi-1).özellik + "\n");
                             }
                            
                            else if(tanıtımsecenegi == 0)
                            	break;
                        	
                        	else
                        		System.out.println("geçersiz değer\n");
                        		}
                        }
                        else if(secenek == 3){ secenek3loopu = 1;
                        	System.out.println("Seçenekler 1/2/3/4/5 mana bedelli kartlar.");
                            loop = 0;
                            durbi = 1;
                            
                        }
                        else if(secenek == 4){
                            turbasioyuncu1mana++;
                            loop=0;
                            durbi = 1;
                            tur++;
                        }
                        }
                    }

                    if(oyuncu1secenegi == 4){
                    	while(loop==1){
                        System.out.println("\nkartın bedeli " + 4 + ". sizin mananız " + oyuncu1mana +  ". yapmak istediğiniz işlemi seçiniz.\n");
                        System.out.println("almak için 1, ihtimalleri incelemek için 2'ye, seçeneğinizi değiştirmek için 3'e, turu bitirmek için 4'e basınız.");
                        secenek = input.nextInt();
                        if(secenek == 1){
                            if(oyuncu1mana>=4){
                            	
                            	c = random.nextInt((4 - 0) + 1); 
                                
                            	for(k = 0; k < 9; k++) {
                        			if(oyuncu1deste.get(k).equals(" ")) {
                        			oyuncu1deste.set(k, dörtmanastr.get(c));
                        			
                        			break;
                        			}
                        			
                        			
                            	}
                            	for(k = 0; k < 9; k++) {
                        			if(oyuncu1destekart.get(k).equals(bosluk)) {
                        			oyuncu1destekart.set(k, dörtmana.get(c));
                        			if(k==0) {
                        				oyuncu1slot0can = dörtmana.get(c).can;
                        				oyuncu1slot0saldırıgücü = dörtmana.get(c).saldırıgücü;
                        			}
                        			if(k==1) {
                        				oyuncu1slot1can = dörtmana.get(c).can;
                        				oyuncu1slot1saldırıgücü = dörtmana.get(c).saldırıgücü;
                        			}
                        			if(k==2) {
                        				oyuncu1slot2can = dörtmana.get(c).can;
                        				oyuncu1slot2saldırıgücü = dörtmana.get(c).saldırıgücü;
                        			}
                        			if(k==3) {
                        				oyuncu1slot3can = dörtmana.get(c).can;
                        				oyuncu1slot3saldırıgücü = dörtmana.get(c).saldırıgücü;
                        			}
                        			if(k==4) {
                        				oyuncu1slot4can = dörtmana.get(c).can;
                        				oyuncu1slot4saldırıgücü = dörtmana.get(c).saldırıgücü;
                        			}
                        			if(k==5) {
                        				oyuncu1slot5can = dörtmana.get(c).can;
                        				oyuncu1slot5saldırıgücü = dörtmana.get(c).saldırıgücü;
                        			}
                        			if(k==6) {
                        				oyuncu1slot6can = dörtmana.get(c).can;
                        				oyuncu1slot6saldırıgücü = dörtmana.get(c).saldırıgücü;
                        			}
                        			if(k==7) {
                        				oyuncu1slot7can = dörtmana.get(c).can;
                        				oyuncu1slot7saldırıgücü = dörtmana.get(c).saldırıgücü;
                        			}
                        			if(k==8) {
                        				oyuncu1slot8can = dörtmana.get(c).can;
                        				oyuncu1slot8saldırıgücü = dörtmana.get(c).saldırıgücü;
                        			}
                        			break;
                        			}
                        		}
                            	
                            	System.out.println("\n" +dörtmanastr.get(c) +" kartını aldınız.\n");
                                
                                System.out.println("güncel desteniz = " + oyuncu1deste + "\n");
                                oyuncu1mana = oyuncu1mana - 4;
                                
                                
                                durbi = 1;
                            }
                            else if(oyuncu1mana<4){
                                System.out.println("\nalmak için yeterince mananız yok.\n");
                            }
                        }
                        else if(secenek == 2){
                        	while(tanıtım ==1) {
                            System.out.println("(1) "+ dörtmanastr.get(0) +"\n\n(2) "+dörtmanastr.get(1)+"\n\n(3) "+dörtmanastr.get(2)+"\n\n(4) "+dörtmanastr.get(3)+"\n\n(5) "+dörtmanastr.get(4)+"\n\nözelliklerini görmek istediğiniz kartın numarasını yazınız. çıkmak için 0 yazınız.");
                        	
                            tanıtımsecenegi = input.nextInt();
                            if(tanıtımsecenegi == 1 || tanıtımsecenegi == 2 || tanıtımsecenegi == 3 || tanıtımsecenegi == 4 || tanıtımsecenegi == 5) {
                            	
                            	System.out.println("\nkart - " + dörtmanastr.get(tanıtımsecenegi-1) + "\nsaldırı gücü = " + dörtmana.get(tanıtımsecenegi-1).saldırıgücü + "\ncan = " + dörtmana.get(tanıtımsecenegi-1).can + "\nözellik = " + dörtmana.get(tanıtımsecenegi-1).özellik + "\n");
                             }
                            
                            else if(tanıtımsecenegi == 0)
                            	break;
                        	
                        	else
                        		System.out.println("geçersiz değer\n");
                        		}
                        }
                        else if(secenek == 3){ secenek3loopu = 1;
                        	System.out.println("Seçenekler 1/2/3/4/5 mana bedelli kartlar.");
                            loop = 0;
                            durbi = 1;
                            
                        }
                        else if(secenek == 4){
                            turbasioyuncu1mana++;
                            loop=0;
                            durbi = 1;
                            tur++;
                        }
                        }
                    }

                    if(oyuncu1secenegi == 5){
                    	while(loop==1){
                        System.out.println("\nkartın bedeli " + 5 + ". sizin mananız " + oyuncu1mana +  ". yapmak istediğiniz işlemi seçiniz.\n");
                        System.out.println("almak için 1, ihtimalleri incelemek için 2'ye, seçeneğinizi değiştirmek için 3'e, turu bitirmek için 4'e basınız.");
                        secenek = input.nextInt();
                        if(secenek == 1){
                            if(oyuncu1mana>=5){
                            	
                            	
                            	c = random.nextInt((4 - 0) + 1); 
                            	
                            	if(besmanastr.get(c).equals("emirg")) {
                            		System.out.println("emirg bütün takım arkadaslarını öldürdü ve 2 askeriyle beraber geldi.");
                            		oyuncu1cani = oyuncu1cani + 5;
                            		System.out.println("emirg oyuncu 1 in canını 5 arttırdı = " + oyuncu1cani);
                            		oyuncu1deste.set(0, "asker");
                					oyuncu1destekart.set(0, asker);
                					oyuncu1slot0saldırıgücü = 3;
                					oyuncu1slot0can = 5;
                					
                					oyuncu1deste.set(1, "asker");
                					oyuncu1destekart.set(1, asker);
                					oyuncu1slot1saldırıgücü = 3;
                					oyuncu1slot1can = 5;
                					
                					oyuncu1deste.set(2, " ");
                					oyuncu1destekart.set(2, bosluk);
                					oyuncu1slot2saldırıgücü = 0;
                					oyuncu1slot2can = 0;
                					
                					oyuncu1deste.set(3, " ");
                					oyuncu1destekart.set(3, bosluk);
                					oyuncu1slot3saldırıgücü = 0;
                					oyuncu1slot3can = 0;
                					
                					oyuncu1deste.set(4, " ");
                					oyuncu1destekart.set(4, bosluk);
                					oyuncu1slot4saldırıgücü = 0;
                					oyuncu1slot4can = 0;
                					
                					oyuncu1deste.set(5, " ");
                					oyuncu1destekart.set(5, bosluk);
                					oyuncu1slot5saldırıgücü = 0;
                					oyuncu1slot5can = 0;
                					
                					oyuncu1deste.set(6, " ");
                					oyuncu1destekart.set(6, bosluk);
                					oyuncu1slot6saldırıgücü = 0;
                					oyuncu1slot6can = 0;
                					
                					oyuncu1deste.set(7, " ");
                					oyuncu1destekart.set(7, bosluk);
                					oyuncu1slot7saldırıgücü = 0;
                					oyuncu1slot7can = 0;
                					
                					oyuncu1deste.set(8, " ");
                					oyuncu1destekart.set(8, bosluk);
                					oyuncu1slot8saldırıgücü = 0;
                					oyuncu1slot8can = 0;
                					
                					
                            	}
                                
                            	for(k = 0; k < 9; k++) {
                        			if(oyuncu1deste.get(k).equals(" ")) {
                        			oyuncu1deste.set(k, besmanastr.get(c));
                        			break;
                        			}
                        		}
                            	for(k = 0; k < 9; k++) {
                        			if(oyuncu1destekart.get(k).equals(bosluk)) {
                        			oyuncu1destekart.set(k, besmana.get(c));
                        			if(k==0) {
                        				oyuncu1slot0can = besmana.get(c).can;
                        				oyuncu1slot0saldırıgücü = besmana.get(c).saldırıgücü;
                        			}
                        			if(k==1) {
                        				oyuncu1slot1can = besmana.get(c).can;
                        				oyuncu1slot1saldırıgücü = besmana.get(c).saldırıgücü;
                        			}
                        			if(k==2) {
                        				oyuncu1slot2can = besmana.get(c).can;
                        				oyuncu1slot2saldırıgücü = besmana.get(c).saldırıgücü;
                        			}
                        			if(k==3) {
                        				oyuncu1slot3can = besmana.get(c).can;
                        				oyuncu1slot3saldırıgücü = besmana.get(c).saldırıgücü;
                        			}
                        			if(k==4) {
                        				oyuncu1slot4can = besmana.get(c).can;
                        				oyuncu1slot4saldırıgücü = besmana.get(c).saldırıgücü;
                        			}
                        			if(k==5) {
                        				oyuncu1slot5can = besmana.get(c).can;
                        				oyuncu1slot5saldırıgücü = besmana.get(c).saldırıgücü;
                        			}
                        			if(k==6) {
                        				oyuncu1slot6can = besmana.get(c).can;
                        				oyuncu1slot6saldırıgücü = besmana.get(c).saldırıgücü;
                        			}
                        			if(k==7) {
                        				oyuncu1slot7can = besmana.get(c).can;
                        				oyuncu1slot7saldırıgücü = besmana.get(c).saldırıgücü;
                        			}
                        			if(k==8) {
                        				oyuncu1slot8can = besmana.get(c).can;
                        				oyuncu1slot8saldırıgücü = besmana.get(c).saldırıgücü;
                        			}
                        			break;
                        			}
                        		}
                            	
                            	System.out.println("\n" + besmanastr.get(c) +" kartını aldınız.\n");
                            	
                                
                                System.out.println("güncel desteniz = " + oyuncu1deste + "\n");
                                oyuncu1mana = oyuncu1mana - 5;
                                
                                if(besmanastr.get(c).equals("barbar")) {
                    				for(k=0;k<9;k++) {
                    					if(oyuncu1deste.get(k).equals(" ") || oyuncu1deste.get(k).equals("değnek") || oyuncu1deste.get(k).equals("kışla") || oyuncu1deste.get(k).equals("panayır") || oyuncu1deste.get(k).equals("alevtopu") || oyuncu1deste.get(k).equals("zırh") || oyuncu1deste.get(k).equals("meteor") || oyuncu1deste.get(k).equals("alevtopları") || oyuncu1deste.get(k).equals("dolunay") || oyuncu1deste.get(k).equals("kıyamet"));
                    					
                    					else if(oyuncu1barbaryalniz == 0)
                    						
                    						break;
                    					
                    					else
                    					oyuncu1barbaryalniz--;
                    				}
                    				if(oyuncu1barbaryalniz > 0) {
                    					System.out.println("barbar yalnız olduğu için kendi saldırı gücü ve canını 2 arttırdı");
                    					if((oyuncu1deste.get(0).equals("barbar") && oyuncu1slot0can == 5) || (oyuncu1deste.get(0).equals("barbar") && oyuncu1slot0can == 7)) {
                    						oyuncu1barbaryalniz = -1;
                    						oyuncu1slot0saldırıgücü = oyuncu1slot0saldırıgücü + 2;
                    						oyuncu1slot0can = oyuncu1slot0can + 2;
                    						break;
                    					}
                    					if((oyuncu1deste.get(1).equals("barbar") && oyuncu1slot1can == 5) || (oyuncu1deste.get(1).equals("barbar") && oyuncu1slot1can == 7)) {
                    						oyuncu1barbaryalniz = -1;
                    						oyuncu1slot1saldırıgücü = oyuncu1slot1saldırıgücü + 2;
                    						oyuncu1slot1can = oyuncu1slot1can + 2;
                    						break;
                    					}
                    					if((oyuncu1deste.get(2).equals("barbar") && oyuncu1slot2can == 5) || (oyuncu1deste.get(2).equals("barbar") && oyuncu1slot2can == 7)) {
                    						oyuncu1barbaryalniz = -1;
                    						oyuncu1slot2saldırıgücü = oyuncu1slot2saldırıgücü + 2;
                    						oyuncu1slot2can = oyuncu1slot2can + 2;
                    						break;
                    					}
                    					if((oyuncu1deste.get(3).equals("barbar") && oyuncu1slot3can == 5) || (oyuncu1deste.get(3).equals("barbar") && oyuncu1slot3can == 7)) {
                    						oyuncu1barbaryalniz = -1;
                    						oyuncu1slot3saldırıgücü = oyuncu1slot3saldırıgücü + 2;
                    						oyuncu1slot3can = oyuncu1slot3can + 2;
                    						break;
                    					}
                    					if((oyuncu1deste.get(4).equals("barbar") && oyuncu1slot4can == 5) || (oyuncu1deste.get(4).equals("barbar") && oyuncu1slot4can == 7)) {
                    						oyuncu1barbaryalniz = -1;
                    						oyuncu1slot4saldırıgücü = oyuncu1slot4saldırıgücü + 2;
                    						oyuncu1slot4can = oyuncu1slot4can + 2;
                    						break;
                    					}
                    					if((oyuncu1deste.get(5).equals("barbar") && oyuncu1slot5can == 5) || (oyuncu1deste.get(5).equals("barbar") && oyuncu1slot5can == 7)) {
                    						oyuncu1barbaryalniz = -1;
                    						oyuncu1slot5saldırıgücü = oyuncu1slot5saldırıgücü + 2;
                    						oyuncu1slot5can = oyuncu1slot5can + 2;
                    						break;
                    					}
                    					if((oyuncu1deste.get(6).equals("barbar") && oyuncu1slot6can == 5) || (oyuncu1deste.get(6).equals("barbar") && oyuncu1slot6can == 7)) {
                    						oyuncu1barbaryalniz = -1;
                    						oyuncu1slot6saldırıgücü = oyuncu1slot6saldırıgücü + 2;
                    						oyuncu1slot6can = oyuncu1slot6can + 2;
                    						break;
                    					}
                    					if((oyuncu1deste.get(7).equals("barbar") && oyuncu1slot7can == 5) || (oyuncu1deste.get(7).equals("barbar") && oyuncu1slot7can == 7)) {
                    						oyuncu1barbaryalniz = -1;
                    						oyuncu1slot7saldırıgücü = oyuncu1slot7saldırıgücü + 2;
                    						oyuncu1slot7can = oyuncu1slot7can + 2;
                    						break;
                    					}
                    					if((oyuncu1deste.get(8).equals("barbar") && oyuncu1slot8can == 5) || (oyuncu1deste.get(8).equals("barbar") && oyuncu1slot8can == 7)) {
                    						oyuncu1barbaryalniz = -1;
                    						oyuncu1slot8saldırıgücü = oyuncu1slot8saldırıgücü + 2;
                    						oyuncu1slot8can = oyuncu1slot8can + 2;
                    						break;
                    					}
                    				}
                    				
                    				else if(oyuncu1barbaryalniz == 0) {
                    					
                    					while(true) {
                    			        System.out.println("\noyuncu 1 in kartları = \n0. " + oyuncu1deste.get(0) + "\n1. " + oyuncu1deste.get(1) + "\n2. " + oyuncu1deste.get(2) + "\n3. " + oyuncu1deste.get(3) + "\n4. " + oyuncu1deste.get(4) + "\n5. " + oyuncu1deste.get(5) + "\n6. " + oyuncu1deste.get(6) + "\n7. " + oyuncu1deste.get(7) + "\n8. " + oyuncu1deste.get(8));

                    					System.out.println("barbarın saldırı gücünü 4 arttıracağı kartı seçiniz");
                    					
                    					
                    					büyühedefi = input.nextInt();
                    					
                    					if(büyühedefi  == 0 || büyühedefi == 1 || büyühedefi == 2 || büyühedefi == 3 || büyühedefi == 4 || büyühedefi == 5 || büyühedefi == 6 || büyühedefi == 7 || büyühedefi == 8) {
                    						if(oyuncu1deste.get(büyühedefi).equals("barbar"))
                    							System.out.println("barbar barbarı güçlendiremez");
                    						
                    						else if(oyuncu1deste.get(büyühedefi).equals(" ") || oyuncu1deste.get(büyühedefi).equals("değnek") || oyuncu1deste.get(büyühedefi).equals("kışla") || oyuncu1deste.get(büyühedefi).equals("panayır") || oyuncu1deste.get(büyühedefi).equals("alevtopu") || oyuncu1deste.get(büyühedefi).equals("zırh") || oyuncu1deste.get(büyühedefi).equals("meteor") || oyuncu1deste.get(büyühedefi).equals("alevtopları") || oyuncu1deste.get(büyühedefi).equals("dolunay") || oyuncu1deste.get(büyühedefi).equals("kıyamet"))
                    							System.out.println("geçersiz değer");
                    						
                    						else {
                    							System.out.println(oyuncu1deste.get(büyühedefi) + " kartının saldırı gücü barbar tarafından 4 arttırıldı");
                    							if(büyühedefi == 0) {
                    								oyuncu1slot0saldırıgücü = oyuncu1slot0saldırıgücü + 4;
                    								System.out.println("kartın yeni saldırı gücü = " +oyuncu1slot0saldırıgücü);
                    								break;
                    							}
                    							else if(büyühedefi == 1) {
                    								oyuncu1slot1saldırıgücü = oyuncu1slot1saldırıgücü + 4;
                    								System.out.println("kartın yeni saldırı gücü = " +oyuncu1slot1saldırıgücü);
                    								break;
                    							}
                    							else if(büyühedefi == 2) {
                    								oyuncu1slot2saldırıgücü = oyuncu1slot2saldırıgücü + 4;
                    								System.out.println("kartın yeni saldırı gücü = " +oyuncu1slot2saldırıgücü);
                    								break;
                    							}
                    							else if(büyühedefi == 3) {
                    								oyuncu1slot3saldırıgücü = oyuncu1slot3saldırıgücü + 4;
                    								System.out.println("kartın yeni saldırı gücü = " +oyuncu1slot3saldırıgücü);
                    								break;
                    							}
                    							else if(büyühedefi == 4) {
                    								oyuncu1slot4saldırıgücü = oyuncu1slot4saldırıgücü + 4;
                    								System.out.println("kartın yeni saldırı gücü = " +oyuncu1slot4saldırıgücü);
                    								break;
                    							}
                    							else if(büyühedefi == 5) {
                    								oyuncu1slot5saldırıgücü = oyuncu1slot5saldırıgücü + 4;
                    								System.out.println("kartın yeni saldırı gücü = " +oyuncu1slot5saldırıgücü);
                    								break;
                    							}
                    							else if(büyühedefi == 6) {
                    								oyuncu1slot6saldırıgücü = oyuncu1slot6saldırıgücü + 4;
                    								System.out.println("kartın yeni saldırı gücü = " +oyuncu1slot6saldırıgücü);
                    								break;
                    							}
                    							else if(büyühedefi == 7) {
                    								oyuncu1slot7saldırıgücü = oyuncu1slot7saldırıgücü + 4;
                    								System.out.println("kartın yeni saldırı gücü = " +oyuncu1slot7saldırıgücü);
                    								break;
                    							}
                    							else if(büyühedefi == 8) {
                    								oyuncu1slot8saldırıgücü = oyuncu1slot8saldırıgücü + 4;
                    								System.out.println("kartın yeni saldırı gücü = " +oyuncu1slot8saldırıgücü);
                    								break;
                    							}
                    						}
                    					}
                    					else
                    						System.out.println("geçersiz değer");
                    					
                    					}
                    					
                    				}
                    			}
                               
                                oyuncu1barbaryalniz = 2;
                                
                                durbi = 1;
                            }
                            else if(oyuncu1mana<5){
                                System.out.println("\nalmak için yeterince mananız yok.\n");
                            }
                        }
                        else if(secenek == 2){
                        	while(tanıtım ==1) {
                            System.out.println("(1) "+ besmanastr.get(0) +"\n\n(2) "+besmanastr.get(1)+"\n\n(3) "+besmanastr.get(2)+"\n\n(4) "+besmanastr.get(3)+"\n\n(5) "+besmanastr.get(4)+"\n\nözelliklerini görmek istediğiniz kartın numarasını yazınız. çıkmak için 0 yazınız.");
                        	
                            tanıtımsecenegi = input.nextInt();
                            if(tanıtımsecenegi == 1 || tanıtımsecenegi == 2 || tanıtımsecenegi == 3 || tanıtımsecenegi == 4 || tanıtımsecenegi == 5) {
                            	
                            	System.out.println("\nkart - " + besmanastr.get(tanıtımsecenegi-1) + "\nsaldırı gücü = " + besmana.get(tanıtımsecenegi-1).saldırıgücü + "\ncan = " + besmana.get(tanıtımsecenegi-1).can + "\nözellik = " + besmana.get(tanıtımsecenegi-1).özellik + "\n");
                             }
                            
                            else if(tanıtımsecenegi == 0)
                            	break;
                        	
                        	else
                        		System.out.println("geçersiz değer\n");
                        		}
                        }
                        else if(secenek == 3){ secenek3loopu = 1;
                        	System.out.println("Seçenekler 1/2/3/4/5 mana bedelli kartlar.");
                            loop = 0;
                            durbi = 1;
                            
                        }
                        else if(secenek == 4){
                            turbasioyuncu1mana++;
                            loop=0;
                            durbi = 1;
                            tur++;
                        }
                        }
                    }
            
            }
         
            
            else {
                if(durbi != 1){
                    
            System.out.println("\ngirdiğiniz değer geçersiz. tekrar deneyiniz\n");

                }
                System.out.println("seçenekler 1/2/3/4/5 mana bedelli kartlar.");
                durbi = 0;
                loop = 1;
                secenek3loopu = 1;
        }
            loop = 1;
        }while(secenek3loopu == 1);
            
        
        
        System.out.println("\n2. oyuncunun sırası\n\n2. oyuncunun güncel manası = " +oyuncu2mana);
        
        System.out.println("\nSeçenekler 1/2/3/4/5 mana bedelli kartlar.");
        
        do {
        oyuncu2secenegi = input.nextInt();
        
        if(oyuncu2secenegi == 1||oyuncu2secenegi == 2 ||oyuncu2secenegi == 3 || oyuncu2secenegi == 4|| oyuncu2secenegi == 5) {
         
        	secenek3loopu = 0;
        	
                if(oyuncu2secenegi == 1){
                	while(loop2==1){
                System.out.println("\nkartın bedeli " + 1 + ". sizin mananız " + oyuncu2mana +  ". yapmak istediğiniz işlemi seçiniz.\n");
                System.out.println("almak için 1, ihtimalleri incelemek için 2'ye, seçeneğinizi değiştirmek için 3'e, turu bitirmek için 4'e basınız.");
                secenek = input.nextInt();
                if(secenek == 1){
                    if(oyuncu2mana>=1){
                    	
                    	c = random.nextInt((4 - 0) + 1); 
                        
                    	for(k = 0; k < 9; k++) {
                    		if(birmanastr.get(c).equals("ıska")) {
                        		System.out.println("ıska geldi, boş çektiniz!.\n");
                        		break;
                    		}
                			if(oyuncu2deste.get(k).equals(" ")) {
                			oyuncu2deste.set(k, birmanastr.get(c));
                			oyuncu2destekart.set(k, birmana.get(c));
                			if(k==0) {
                				oyuncu2slot0can = birmana.get(c).can;
                				oyuncu2slot0saldırıgücü = birmana.get(c).saldırıgücü;
                			}
                			if(k==1) {
                				oyuncu2slot1can = birmana.get(c).can;
                				oyuncu2slot1saldırıgücü = birmana.get(c).saldırıgücü;
                			}
                			if(k==2) {
                				oyuncu2slot2can = birmana.get(c).can;
                				oyuncu2slot2saldırıgücü = birmana.get(c).saldırıgücü;
                			}
                			if(k==3) {
                				oyuncu2slot3can = birmana.get(c).can;
                				oyuncu2slot3saldırıgücü = birmana.get(c).saldırıgücü;
                			}
                			if(k==4) {
                				oyuncu2slot4can = birmana.get(c).can;
                				oyuncu2slot4saldırıgücü = birmana.get(c).saldırıgücü;
                			}
                			if(k==5) {
                				oyuncu2slot5can = birmana.get(c).can;
                				oyuncu2slot5saldırıgücü = birmana.get(c).saldırıgücü;
                			}
                			if(k==6) {
                				oyuncu2slot6can = birmana.get(c).can;
                				oyuncu2slot6saldırıgücü = birmana.get(c).saldırıgücü;
                			}
                			if(k==7) {
                				oyuncu2slot7can = birmana.get(c).can;
                				oyuncu2slot7saldırıgücü = birmana.get(c).saldırıgücü;
                			}
                			if(k==8) {
                				oyuncu2slot8can = birmana.get(c).can;
                				oyuncu2slot8saldırıgücü = birmana.get(c).saldırıgücü;
                			}
                			break;
                			}
                		}
                    	
                    	if(birmanastr.get(c).equals("ıska"));
                    	
                    	else
                    	System.out.println("\n" +birmanastr.get(c) +" kartını aldınız.\n");
                        
                        System.out.println("güncel desteniz = " + oyuncu2deste + "\n");
                        oyuncu2mana = oyuncu2mana - 1;
                        
                        durbi = 1;
                    }
                    else if(oyuncu2mana<1){
                        System.out.println("\nalmak için yeterince mananız yok.\n");
                    }
                }
                else if(secenek == 2){
                	while(tanıtım ==1) {
                    System.out.println("(1) "+ birmanastr.get(0) +"\n\n(2) "+birmanastr.get(1)+"\n\n(3) "+birmanastr.get(2)+"\n\n(4) "+birmanastr.get(3)+"\n\n(5) "+birmanastr.get(4)+"\n\nözelliklerini görmek istediğiniz kartın numarasını yazınız. çıkmak için 0 yazınız.");
                	
                    tanıtımsecenegi = input.nextInt();
                    if(tanıtımsecenegi == 1 || tanıtımsecenegi == 2 || tanıtımsecenegi == 3 || tanıtımsecenegi == 4 || tanıtımsecenegi == 5) {
                    	
                    	System.out.println("\nkart - " + birmanastr.get(tanıtımsecenegi-1) + "\nsaldırı gücü = " + birmana.get(tanıtımsecenegi-1).saldırıgücü + "\ncan = " + birmana.get(tanıtımsecenegi-1).can + "\nözellik = " + birmana.get(tanıtımsecenegi-1).özellik + "\n");
                     }
                    
                    else if(tanıtımsecenegi == 0)
                    	break;
                	
                	else
                		System.out.println("geçersiz değer\n");
                		}
                }
                else if(secenek == 3){ secenek3loopu = 1;
                	System.out.println("Seçenekler 1/2/3/4/5 mana bedelli kartlar.");
                    loop2 = 0;
                    durbi = 1;
                    
                }
                else if(secenek == 4){
                    turbasioyuncu2mana++;
                    loop2=0;
                    durbi = 1;
                    tur++;
                }
                }
            }
            
                if(oyuncu2secenegi == 2){
                	while(loop2==1){
                    System.out.println("\nkartın bedeli " + 2 + ". sizin mananız " + oyuncu2mana +  ". yapmak istediğiniz işlemi seçiniz.\n");
                    
                    System.out.println("almak için 1, ihtimalleri incelemek için 2'ye, seçeneğinizi değiştirmek için 3'e, turu bitirmek için 4'e basınız.");
                    secenek = input.nextInt();
                    if(secenek == 1){
                        if(oyuncu2mana>=2){
                        	
                        	c = random.nextInt((4 - 0) + 1); 
                            
                        	for(k = 0; k < 9; k++) {
                    			if(oyuncu2deste.get(k).equals(" ")) {
                    			oyuncu2deste.set(k, ikimanastr.get(c));
                    			oyuncu2destekart.set(k, ikimana.get(c));
                    			if(k==0) {
                    				oyuncu2slot0can = ikimana.get(c).can;
                    				oyuncu2slot0saldırıgücü = ikimana.get(c).saldırıgücü;
                    			}
                    			if(k==1) {
                    				oyuncu2slot1can = ikimana.get(c).can;
                    				oyuncu2slot1saldırıgücü = ikimana.get(c).saldırıgücü;
                    			}
                    			if(k==2) {
                    				oyuncu2slot2can = ikimana.get(c).can;
                    				oyuncu2slot2saldırıgücü = ikimana.get(c).saldırıgücü;
                    			}
                    			if(k==3) {
                    				oyuncu2slot3can = ikimana.get(c).can;
                    				oyuncu2slot3saldırıgücü = ikimana.get(c).saldırıgücü;
                    			}
                    			if(k==4) {
                    				oyuncu2slot4can = ikimana.get(c).can;
                    				oyuncu2slot4saldırıgücü = ikimana.get(c).saldırıgücü;
                    			}
                    			if(k==5) {
                    				oyuncu2slot5can = ikimana.get(c).can;
                    				oyuncu2slot5saldırıgücü = ikimana.get(c).saldırıgücü;
                    			}
                    			if(k==6) {
                    				oyuncu2slot6can = ikimana.get(c).can;
                    				oyuncu2slot6saldırıgücü = ikimana.get(c).saldırıgücü;
                    			}
                    			if(k==7) {
                    				oyuncu2slot7can = ikimana.get(c).can;
                    				oyuncu2slot7saldırıgücü = ikimana.get(c).saldırıgücü;
                    			}
                    			if(k==8) {
                    				oyuncu2slot8can = ikimana.get(c).can;
                    				oyuncu2slot8saldırıgücü = ikimana.get(c).saldırıgücü;
                    			}
                    			break;
                    			}
                    		}
                        	
                        	System.out.println("\n" +ikimanastr.get(c) +" kartını aldınız.\n");
                            
                            System.out.println("güncel desteniz = " + oyuncu2deste + "\n");
                            oyuncu2mana = oyuncu2mana - 2;
                            
                            durbi = 1;
                        }
                        else if(oyuncu2mana<2){
                            
                            System.out.println("\nalmak için yeterince mananız yok.\n");
                            
                        }
                    }
                    else if(secenek == 2){
                    	while(tanıtım ==1) {
                        System.out.println("(1) "+ ikimanastr.get(0) +"\n\n(2) "+ikimanastr.get(1)+"\n\n(3) "+ikimanastr.get(2)+"\n\n(4) "+ikimanastr.get(3)+"\n\n(5) "+ikimanastr.get(4)+"\n\nözelliklerini görmek istediğiniz kartın numarasını yazınız. çıkmak için 0 yazınız.");
                    	
                        tanıtımsecenegi = input.nextInt();
                        if(tanıtımsecenegi == 1 || tanıtımsecenegi == 2 || tanıtımsecenegi == 3 || tanıtımsecenegi == 4 || tanıtımsecenegi == 5) {
                        	
                        	System.out.println("\nkart - " + ikimanastr.get(tanıtımsecenegi-1) + "\nsaldırı gücü = " + ikimana.get(tanıtımsecenegi-1).saldırıgücü + "\ncan = " + ikimana.get(tanıtımsecenegi-1).can + "\nözellik = " + ikimana.get(tanıtımsecenegi-1).özellik + "\n");
                         }
                        
                        else if(tanıtımsecenegi == 0)
                        	break;
                    	
                    	else
                    		System.out.println("geçersiz değer\n");
                    		}
                    }
                    else if(secenek == 3){ secenek3loopu = 1;
                    	System.out.println("Seçenekler 1/2/3/4/5 mana bedelli kartlar.");
                        loop2 = 0;
                        durbi = 1;
                        
                    }
                    else if(secenek == 4){
                        turbasioyuncu2mana++;
                        loop2=0;
                        durbi = 1;
                        tur++;
                    }
                    }
                }
                
                if(oyuncu2secenegi == 3){
                	while(loop2==1){
                    
                    System.out.println("\nkartın bedeli " + 3 + ". sizin mananız " + oyuncu2mana +  ". yapmak istediğiniz işlemi seçiniz.\n");
                    
                    System.out.println("almak için 1, ihtimalleri incelemek için 2'ye, seçeneğinizi değiştirmek için 3'e, turu bitirmek için 4'e basınız.");
                    secenek = input.nextInt();
                    if(secenek == 1){
                        if(oyuncu2mana>=3){
                        	
                        	c = random.nextInt((4 - 0) + 1); 
                            
                        	for(k = 0; k < 9; k++) {
                    			if(oyuncu2deste.get(k).equals(" ")) {
                    			oyuncu2deste.set(k, ücmanastr.get(c));
                    			oyuncu2destekart.set(k, ücmana.get(c));
                    			if(k==0) {
                    				oyuncu2slot0can = ücmana.get(c).can;
                    				oyuncu2slot0saldırıgücü = ücmana.get(c).saldırıgücü;
                    			}
                    			if(k==1) {
                    				oyuncu2slot1can = ücmana.get(c).can;
                    				oyuncu2slot1saldırıgücü = ücmana.get(c).saldırıgücü;
                    			}
                    			if(k==2) {
                    				oyuncu2slot2can = ücmana.get(c).can;
                    				oyuncu2slot2saldırıgücü = ücmana.get(c).saldırıgücü;
                    			}
                    			if(k==3) {
                    				oyuncu2slot3can = ücmana.get(c).can;
                    				oyuncu2slot3saldırıgücü = ücmana.get(c).saldırıgücü;
                    			}
                    			if(k==4) {
                    				oyuncu2slot4can = ücmana.get(c).can;
                    				oyuncu2slot4saldırıgücü = ücmana.get(c).saldırıgücü;
                    			}
                    			if(k==5) {
                    				oyuncu2slot5can = ücmana.get(c).can;
                    				oyuncu2slot5saldırıgücü = ücmana.get(c).saldırıgücü;
                    			}
                    			if(k==6) {
                    				oyuncu2slot6can = ücmana.get(c).can;
                    				oyuncu2slot6saldırıgücü = ücmana.get(c).saldırıgücü;
                    			}
                    			if(k==7) {
                    				oyuncu2slot7can = ücmana.get(c).can;
                    				oyuncu2slot7saldırıgücü = ücmana.get(c).saldırıgücü;
                    			}
                    			if(k==8) {
                    				oyuncu2slot8can = ücmana.get(c).can;
                    				oyuncu2slot8saldırıgücü = ücmana.get(c).saldırıgücü;
                    			}
                    			break;
                    			}
                    		}
                        	
                        	System.out.println("\n" +ücmanastr.get(c) +" kartını aldınız.\n");
                            
                            System.out.println("güncel desteniz = " + oyuncu2deste + "\n");
                            oyuncu2mana = oyuncu2mana - 3;
                            
                            durbi = 1;
                        }
                        else if(oyuncu2mana<3){
                            
                            System.out.println("\nalmak için yeterince mananız yok.\n");
                            
                        }
                    }
                    else if(secenek == 2){
                    	while(tanıtım ==1) {
                        System.out.println("(1) "+ ücmanastr.get(0) +"\n\n(2) "+ücmanastr.get(1)+"\n\n(3) "+ücmanastr.get(2)+"\n\n(4) "+ücmanastr.get(3)+"\n\n(5) "+ücmanastr.get(4)+"\n\nözelliklerini görmek istediğiniz kartın numarasını yazınız. çıkmak için 0 yazınız.");
                    	
                        tanıtımsecenegi = input.nextInt();
                        if(tanıtımsecenegi == 1 || tanıtımsecenegi == 2 || tanıtımsecenegi == 3 || tanıtımsecenegi == 4 || tanıtımsecenegi == 5) {
                        	
                        	System.out.println("\nkart - " + ücmanastr.get(tanıtımsecenegi-1) + "\nsaldırı gücü = " + ücmana.get(tanıtımsecenegi-1).saldırıgücü + "\ncan = " + ücmana.get(tanıtımsecenegi-1).can + "\nözellik = " + ücmana.get(tanıtımsecenegi-1).özellik + "\n");
                         }
                        
                        else if(tanıtımsecenegi == 0)
                        	break;
                    	
                    	else
                    		System.out.println("geçersiz değer\n");
                    		}
                    }
                    else if(secenek == 3){ secenek3loopu = 1;
                    	System.out.println("Seçenekler 1/2/3/4/5 mana bedelli kartlar.");
                        loop2 = 0;
                        durbi = 1;
                        
                    }
                    else if(secenek == 4){
                        turbasioyuncu2mana++;
                        loop2=0;
                        durbi = 1;
                        tur++;
                    }
                    }
                }

                if(oyuncu2secenegi == 4){
                	while(loop2==1){
                    
                    System.out.println("\nkartın bedeli " + 4 + ". sizin mananız " + oyuncu2mana +  ". yapmak istediğiniz işlemi seçiniz.\n");
                    
                    System.out.println("almak için 1, ihtimalleri incelemek için 2'ye, seçeneğinizi değiştirmek için 3'e, turu bitirmek için 4'e basınız.");
                    secenek = input.nextInt();
                    if(secenek == 1){
                        if(oyuncu2mana>=4){
                        	
                        	c = random.nextInt((4 - 0) + 1); 
                            
                        	for(k = 0; k < 9; k++) {
                    			if(oyuncu2deste.get(k).equals(" ")) {
                    			oyuncu2deste.set(k, dörtmanastr.get(c));
                    			oyuncu2destekart.set(k, dörtmana.get(c));
                    			if(k==0) {
                    				oyuncu2slot0can = dörtmana.get(c).can;
                    				oyuncu2slot0saldırıgücü = dörtmana.get(c).saldırıgücü;
                    			}
                    			if(k==1) {
                    				oyuncu2slot1can = dörtmana.get(c).can;
                    				oyuncu2slot1saldırıgücü = dörtmana.get(c).saldırıgücü;
                    			}
                    			if(k==2) {
                    				oyuncu2slot2can = dörtmana.get(c).can;
                    				oyuncu2slot2saldırıgücü = dörtmana.get(c).saldırıgücü;
                    			}
                    			if(k==3) {
                    				oyuncu2slot3can = dörtmana.get(c).can;
                    				oyuncu2slot3saldırıgücü = dörtmana.get(c).saldırıgücü;
                    			}
                    			if(k==4) {
                    				oyuncu2slot4can = dörtmana.get(c).can;
                    				oyuncu2slot4saldırıgücü = dörtmana.get(c).saldırıgücü;
                    			}
                    			if(k==5) {
                    				oyuncu2slot5can = dörtmana.get(c).can;
                    				oyuncu2slot5saldırıgücü = dörtmana.get(c).saldırıgücü;
                    			}
                    			if(k==6) {
                    				oyuncu2slot6can = dörtmana.get(c).can;
                    				oyuncu2slot6saldırıgücü = dörtmana.get(c).saldırıgücü;
                    			}
                    			if(k==7) {
                    				oyuncu2slot7can = dörtmana.get(c).can;
                    				oyuncu2slot7saldırıgücü = dörtmana.get(c).saldırıgücü;
                    			}
                    			if(k==8) {
                    				oyuncu2slot8can = dörtmana.get(c).can;
                    				oyuncu2slot8saldırıgücü = dörtmana.get(c).saldırıgücü;
                    			}
                    			break;
                    			}
                    		}
                        	
                        	System.out.println("\n" +dörtmanastr.get(c) +" kartını aldınız.\n");
                            
                            System.out.println("güncel desteniz = " + oyuncu2deste + "\n");
                            oyuncu2mana = oyuncu2mana - 4;
                            
                            durbi = 1;
                        }
                        else if(oyuncu2mana<4){
                            
                            System.out.println("\nalmak için yeterince mananız yok.\n");
                            
                        }
                    }
                    else if(secenek == 2){
                    	while(tanıtım ==1) {
                        System.out.println("(1) "+ dörtmanastr.get(0) +"\n\n(2) "+dörtmanastr.get(1)+"\n\n(3) "+dörtmanastr.get(2)+"\n\n(4) "+dörtmanastr.get(3)+"\n\n(5) "+dörtmanastr.get(4)+"\n\nözelliklerini görmek istediğiniz kartın numarasını yazınız. çıkmak için 0 yazınız.");
                    	
                        tanıtımsecenegi = input.nextInt();
                        if(tanıtımsecenegi == 1 || tanıtımsecenegi == 2 || tanıtımsecenegi == 3 || tanıtımsecenegi == 4 || tanıtımsecenegi == 5) {
                        	
                        	System.out.println("\nkart - " + dörtmanastr.get(tanıtımsecenegi-1) + "\nsaldırı gücü = " + dörtmana.get(tanıtımsecenegi-1).saldırıgücü + "\ncan = " + dörtmana.get(tanıtımsecenegi-1).can + "\nözellik = " + dörtmana.get(tanıtımsecenegi-1).özellik + "\n");
                         }
                        
                        else if(tanıtımsecenegi == 0)
                        	break;
                    	
                    	else
                    		System.out.println("geçersiz değer\n");
                    		}
                    }
                    else if(secenek == 3){ secenek3loopu = 1;
                    	System.out.println("Seçenekler 1/2/3/4/5 mana bedelli kartlar.");
                        loop2 = 0;
                        durbi = 1;
                        
                    }
                    else if(secenek == 4){
                        turbasioyuncu2mana++;
                        loop2=0;
                        durbi = 1;
                        tur++;
                    }
                    }
                }

                if(oyuncu2secenegi == 5){
                	while(loop2==1){
                    
                    System.out.println("\nkartın bedeli " + 5 + ". sizin mananız " + oyuncu2mana +  ". yapmak istediğiniz işlemi seçiniz.\n");
                    
                    System.out.println("almak için 1, ihtimalleri incelemek için 2'ye, seçeneğinizi değiştirmek için 3'e, turu bitirmek için 4'e basınız.");
                    secenek = input.nextInt();
                    if(secenek == 1){
                        if(oyuncu2mana>=5){
                        	
                        	c = random.nextInt((4 - 0) + 1); 
                        	
                        	if(besmanastr.get(c).equals("emirg")) {
                        		System.out.println("emirg bütün takım arkadaslarını öldürdü ve 2 askeriyle beraber geldi.");
                        		oyuncu2cani = oyuncu2cani + 5;
                        		System.out.println("emirg oyuncu 2 nin canını 5 arttırdı = " + oyuncu2cani);
                        		oyuncu2deste.set(0, "asker");
            					oyuncu2destekart.set(0, asker);
            					oyuncu2slot0saldırıgücü = 3;
            					oyuncu2slot0can = 5;
            					
            					oyuncu2deste.set(1, "asker");
            					oyuncu2destekart.set(1, asker);
            					oyuncu2slot1saldırıgücü = 3;
            					oyuncu2slot1can = 5;
            					
            					oyuncu2deste.set(2, " ");
            					oyuncu2destekart.set(2, bosluk);
            					oyuncu2slot2saldırıgücü = 0;
            					oyuncu2slot2can = 0;
            					
            					oyuncu2deste.set(3, " ");
            					oyuncu2destekart.set(3, bosluk);
            					oyuncu2slot3saldırıgücü = 0;
            					oyuncu2slot3can = 0;
            					
            					oyuncu2deste.set(4, " ");
            					oyuncu2destekart.set(4, bosluk);
            					oyuncu2slot4saldırıgücü = 0;
            					oyuncu2slot4can = 0;
            					
            					oyuncu2deste.set(5, " ");
            					oyuncu2destekart.set(5, bosluk);
            					oyuncu2slot5saldırıgücü = 0;
            					oyuncu2slot5can = 0;
            					
            					oyuncu2deste.set(6, " ");
            					oyuncu2destekart.set(6, bosluk);
            					oyuncu2slot6saldırıgücü = 0;
            					oyuncu2slot6can = 0;
            					
            					oyuncu2deste.set(7, " ");
            					oyuncu2destekart.set(7, bosluk);
            					oyuncu2slot7saldırıgücü = 0;
            					oyuncu2slot7can = 0;
            					
            					oyuncu2deste.set(8, " ");
            					oyuncu2destekart.set(8, bosluk);
            					oyuncu2slot8saldırıgücü = 0;
            					oyuncu2slot8can = 0;
            					
            					
                        	}
                            
                        	for(k = 0; k < 9; k++) {
                    			if(oyuncu2deste.get(k).equals(" ")) {
                    			oyuncu2deste.set(k, besmanastr.get(c));
                    			oyuncu2destekart.set(k, besmana.get(c));
                    			if(k==0) {
                    				oyuncu2slot0can = besmana.get(c).can;
                    				oyuncu2slot0saldırıgücü = besmana.get(c).saldırıgücü;
                    			}
                    			if(k==1) {
                    				oyuncu2slot1can = besmana.get(c).can;
                    				oyuncu2slot1saldırıgücü = besmana.get(c).saldırıgücü;
                    			}
                    			if(k==2) {
                    				oyuncu2slot2can = besmana.get(c).can;
                    				oyuncu2slot2saldırıgücü = besmana.get(c).saldırıgücü;
                    			}
                    			if(k==3) {
                    				oyuncu2slot3can = besmana.get(c).can;
                    				oyuncu2slot3saldırıgücü = besmana.get(c).saldırıgücü;
                    			}
                    			if(k==4) {
                    				oyuncu2slot4can = besmana.get(c).can;
                    				oyuncu2slot4saldırıgücü = besmana.get(c).saldırıgücü;
                    			}
                    			if(k==5) {
                    				oyuncu2slot5can = besmana.get(c).can;
                    				oyuncu2slot5saldırıgücü = besmana.get(c).saldırıgücü;
                    			}
                    			if(k==6) {
                    				oyuncu2slot6can = besmana.get(c).can;
                    				oyuncu2slot6saldırıgücü = besmana.get(c).saldırıgücü;
                    			}
                    			if(k==7) {
                    				oyuncu2slot7can = besmana.get(c).can;
                    				oyuncu2slot7saldırıgücü = besmana.get(c).saldırıgücü;
                    			}
                    			if(k==8) {
                    				oyuncu2slot8can = besmana.get(c).can;
                    				oyuncu2slot8saldırıgücü = besmana.get(c).saldırıgücü;
                    			}
                    			break;
                    			}
                    		}
                        	
                        	System.out.println("\n" + besmanastr.get(c) +" kartını aldınız.\n");
                        	
                            
                            System.out.println("güncel desteniz = " + oyuncu2deste + "\n");
                            oyuncu2mana = oyuncu2mana - 5;
                            

                            
                            durbi = 1;
                        }
                        else if(oyuncu2mana<5){
                            
                            System.out.println("\nalmak için yeterince mananız yok.\n");
                            
                        }
                    }
                    else if(secenek == 2){
                    	while(tanıtım ==1) {
                        System.out.println("(1) "+ besmanastr.get(0) +"\n\n(2) "+besmanastr.get(1)+"\n\n(3) "+besmanastr.get(2)+"\n\n(4) "+besmanastr.get(3)+"\n\n(5) "+besmanastr.get(4)+"\n\nözelliklerini görmek istediğiniz kartın numarasını yazınız. çıkmak için 0 yazınız.");
                    	
                        tanıtımsecenegi = input.nextInt();
                        if(tanıtımsecenegi == 1 || tanıtımsecenegi == 2 || tanıtımsecenegi == 3 || tanıtımsecenegi == 4 || tanıtımsecenegi == 5) {
                        	
                        	System.out.println("\nkart - " + besmanastr.get(tanıtımsecenegi-1) + "\nsaldırı gücü = " + besmana.get(tanıtımsecenegi-1).saldırıgücü + "\ncan = " + besmana.get(tanıtımsecenegi-1).can + "\nözellik = " + besmana.get(tanıtımsecenegi-1).özellik + "\n");
                         }
                        
                        else if(tanıtımsecenegi == 0)
                        	break;
                    	
                    	else
                    		System.out.println("geçersiz değer\n");
                    		}
                    }
                    else if(secenek == 3){ secenek3loopu = 1;
                    	System.out.println("Seçenekler 1/2/3/4/5 mana bedelli kartlar.");
                        loop2 = 0;
                        durbi = 1;
                        
                    }
                    else if(secenek == 4){
                        turbasioyuncu2mana++;
                        loop2=0;
                        durbi = 1;
                        tur++;
                    }
                    }
                }
        
        }
        
        else {
            if(durbi != 1){
                
        System.out.println("\ngirdiğiniz değer geçersiz. tekrar deneyiniz\n");
        

            }
            System.out.println("seçenekler 1/2/3/4/5 mana bedelli kartlar.");
            durbi = 0;
            loop2 = 1;
            secenek3loopu = 1;
    }
        loop2=1;
        }while(secenek3loopu == 1);
        while(sayım==1) {
        	if (artıs < 200000)
        		System.out.println(" ");
        	else if (artıs < 800000) 
				System.out.println("1");
			else if (artıs < 1400000)
				System.out.println("2");
			else if (artıs<2000000)
				System.out.println("3");
			else if (artıs <2300000)
				System.out.println(" ");
			if (artıs==2400000) {
				System.out.println("savaş başladı!");
			break;
			}
				artıs++;

		}
        artıs = 0;
        
        for(k = 0; k < 9; k++) {
        	
        	if(oyuncu1deste.get(k).equals(" "));
        	
        	else
        		deste1boş = 0;
        		}
        
        for(k = 0; k < 9; k++) {
        	
        	if(oyuncu1deste.get(k).equals(" ") || oyuncu1deste.get(k).equals("değnek") || oyuncu1deste.get(k).equals("kışla") || oyuncu1deste.get(k).equals("panayır") || oyuncu1deste.get(k).equals("alevtopu") || oyuncu1deste.get(k).equals("zırh") || oyuncu1deste.get(k).equals("meteor") || oyuncu1deste.get(k).equals("alevtopları") || oyuncu1deste.get(k).equals("dolunay") || oyuncu1deste.get(k).equals("kıyamet"));
        	
        	else
        		deste1ye = 0;
        		}
        
        for(k = 0; k < 9; k++) {
        	
        	if(oyuncu2deste.get(k).equals(" "));
        	
        	else
        		deste2boş = 0;
        		}
        
        for(k = 0; k < 9; k++) {
        	
        	if(oyuncu2deste.get(k).equals(" ") || oyuncu2deste.get(k).equals("değnek") || oyuncu2deste.get(k).equals("kışla") || oyuncu2deste.get(k).equals("panayır") || oyuncu2deste.get(k).equals("alevtopu") || oyuncu2deste.get(k).equals("zırh") || oyuncu2deste.get(k).equals("meteor") || oyuncu2deste.get(k).equals("alevtopları") || oyuncu2deste.get(k).equals("dolunay") || oyuncu2deste.get(k).equals("kıyamet")); 
        			
        	else
        		deste2ye = 0;
        		}
        
        if(deste1boş == 0) {
        System.out.println("oyuncu 1. saldırıyor\n");
        System.out.println("\noyuncu 1 in kartları = \n0. " + oyuncu1deste.get(0) + "\n1. " + oyuncu1deste.get(1) + "\n2. " + oyuncu1deste.get(2) + "\n3. " + oyuncu1deste.get(3) + "\n4. " + oyuncu1deste.get(4) + "\n5. " + oyuncu1deste.get(5) + "\n6. " + oyuncu1deste.get(6) + "\n7. " + oyuncu1deste.get(7) + "\n8. " + oyuncu1deste.get(8) + "\n9. kart özelliklerini görüntüleme\n10.çıkış" );
        
        oyuncu1saldirduzgun = 1;
        while(oyuncu1saldirduzgun == 1) {
        	oyuncu1saldir = input.nextInt();
        	input.nextLine();
        	
        	if(-1 < oyuncu1saldir || oyuncu1saldir < 11) {
        		if(oyuncu1saldir!=10) {
        			while(looop==1) {
        				if(oyuncu1saldir == 0 && oyuncu1turhamle0 == 1) {
        					oyuncu1turhamle0 = 0;
        					looop=0;
        				}
        				else if(oyuncu1saldir == 1 && oyuncu1turhamle1 == 1) {
        					oyuncu1turhamle1 = 0;
        					looop=0;
        				} 
        				else if(oyuncu1saldir == 2 && oyuncu1turhamle2 == 1) {
        					oyuncu1turhamle2 = 0;
        					looop=0;
        				} 
        				else if(oyuncu1saldir == 3 && oyuncu1turhamle3 == 1) {
        					oyuncu1turhamle3 = 0;
        					looop=0;
        				} 
        				else if(oyuncu1saldir == 4 && oyuncu1turhamle4 == 1) {
        					oyuncu1turhamle4 = 0;
        					looop=0;
        				} 
        				else if(oyuncu1saldir == 5 && oyuncu1turhamle5 == 1) {
        					oyuncu1turhamle5 = 0;
        					looop=0;
        				} 
        				else if(oyuncu1saldir == 6 && oyuncu1turhamle6 == 1) {
        					oyuncu1turhamle6 = 0;
        					looop=0;
        				} 
        				else if(oyuncu1saldir == 7 && oyuncu1turhamle7 == 1) {
        					oyuncu1turhamle7 = 0;
        					looop=0;
        				} 
        				else if(oyuncu1saldir == 8 && oyuncu1turhamle8 == 1) {
        					oyuncu1turhamle8 = 0;
        					looop=0;
        				} 
        				else if(oyuncu1saldir == 0 && oyuncu1turhamle0 == 0) {
        					System.out.println("zaten bu seçeneğinizi kullandınız. lütfen başka seçiniz.");  
        					oyuncu1saldir = input.nextInt();
        					
        				}
        				else if(oyuncu1saldir == 1 && oyuncu1turhamle1 == 0) {
        					System.out.println("zaten bu seçeneğinizi kullandınız. lütfen başka seçiniz.");        				
        					oyuncu1saldir = input.nextInt();

        				} 
        				else if(oyuncu1saldir == 2 && oyuncu1turhamle2 == 0) {
        					System.out.println("zaten bu seçeneğinizi kullandınız. lütfen başka seçiniz.");        				
        					oyuncu1saldir = input.nextInt();

        				} 
        				else if(oyuncu1saldir == 3 && oyuncu1turhamle3 == 0) {
        					System.out.println("zaten bu seçeneğinizi kullandınız. lütfen başka seçiniz.");        				
        					oyuncu1saldir = input.nextInt();

        				} 
        				else if(oyuncu1saldir == 4 && oyuncu1turhamle4 == 0) {
        					System.out.println("zaten bu seçeneğinizi kullandınız. lütfen başka seçiniz.");        				
        					oyuncu1saldir = input.nextInt();

        				} 
        				else if(oyuncu1saldir == 5 && oyuncu1turhamle5 == 0) {
        					System.out.println("zaten bu seçeneğinizi kullandınız. lütfen başka seçiniz.");        				
        					oyuncu1saldir = input.nextInt();

        				} 
        				else if(oyuncu1saldir == 6 && oyuncu1turhamle6 == 0) {
        					System.out.println("zaten bu seçeneğinizi kullandınız. lütfen başka seçiniz.");        				
        					oyuncu1saldir = input.nextInt();

        				} 
        				else if(oyuncu1saldir == 7 && oyuncu1turhamle7 == 0) {
        					System.out.println("zaten bu seçeneğinizi kullandınız. lütfen başka seçiniz.");        				
        					oyuncu1saldir = input.nextInt();

        				} 
        				else if(oyuncu1saldir == 8 && oyuncu1turhamle8 == 0) {
        					System.out.println("zaten bu seçeneğinizi kullandınız. lütfen başka seçiniz.");        				
        					oyuncu1saldir = input.nextInt();
        				}
        				else if(oyuncu1saldir == 9)
        						break;
        				else if (oyuncu1saldir == 10)
        						break;

        				} 
        		}
        	looop=1;
        		while(looop == 1) {
        		if(oyuncu1saldir == 9) {
        			
        			
        			System.out.println("çıkış yapmak için 10, özellik öğrenmek için kartın numarasını yazınız.");
        			oyuncu1ozellikogren = input.nextInt();
        			input.nextLine();
        			if(oyuncu1ozellikogren == 10) {
        				System.out.println("oyuncu 1. saldırıyor\n");
        		        System.out.println("\noyuncu 1 in kartları = \n0. " + oyuncu1deste.get(0) + "\n1. " + oyuncu1deste.get(1) + "\n2. " + oyuncu1deste.get(2) + "\n3. " + oyuncu1deste.get(3) + "\n4. " + oyuncu1deste.get(4) + "\n5. " + oyuncu1deste.get(5) + "\n6. " + oyuncu1deste.get(6) + "\n7. " + oyuncu1deste.get(7) + "\n8. " + oyuncu1deste.get(8) + "\n9. kart özelliklerini görüntüleme\n10.çıkış" );
        		        oyuncu1saldir = input.nextInt();
        		        input.nextLine();
        		        if(oyuncu1saldir!=10) {
                			while(looop==1) {
                				
                				if(oyuncu1saldir == 0 && oyuncu1turhamle0 == 1) {
                					oyuncu1turhamle0 = 0;
                					looop=0;
                				}
                				else if(oyuncu1saldir == 1 && oyuncu1turhamle1 == 1) {
                					oyuncu1turhamle1 = 0;
                					looop=0;
                				} 
                				else if(oyuncu1saldir == 2 && oyuncu1turhamle2 == 1) {
                					oyuncu1turhamle2 = 0;
                					looop=0;
                				} 
                				else if(oyuncu1saldir == 3 && oyuncu1turhamle3 == 1) {
                					oyuncu1turhamle3 = 0;
                					looop=0;
                				} 
                				else if(oyuncu1saldir == 4 && oyuncu1turhamle4 == 1) {
                					oyuncu1turhamle4 = 0;
                					looop=0;
                				} 
                				else if(oyuncu1saldir == 5 && oyuncu1turhamle5 == 1) {
                					oyuncu1turhamle5 = 0;
                					looop=0;
                				} 
                				else if(oyuncu1saldir == 6 && oyuncu1turhamle6 == 1) {
                					oyuncu1turhamle6 = 0;
                					looop=0;
                				} 
                				else if(oyuncu1saldir == 7 && oyuncu1turhamle7 == 1) {
                					oyuncu1turhamle7 = 0;
                					looop=0;
                				} 
                				else if(oyuncu1saldir == 8 && oyuncu1turhamle8 == 1) {
                					oyuncu1turhamle8 = 0;
                					looop=0;
                				} 
                				else if(oyuncu1saldir == 0 && oyuncu1turhamle0 == 0) {
                					System.out.println("zaten bu seçeneğinizi kullandınız. lütfen başka seçiniz.");  
                					oyuncu1saldir = input.nextInt();
                					
                				}
                				else if(oyuncu1saldir == 1 && oyuncu1turhamle1 == 0) {
                					System.out.println("zaten bu seçeneğinizi kullandınız. lütfen başka seçiniz.");        				
                					oyuncu1saldir = input.nextInt();

                				} 
                				else if(oyuncu1saldir == 2 && oyuncu1turhamle2 == 0) {
                					System.out.println("zaten bu seçeneğinizi kullandınız. lütfen başka seçiniz.");        				
                					oyuncu1saldir = input.nextInt();

                				} 
                				else if(oyuncu1saldir == 3 && oyuncu1turhamle3 == 0) {
                					System.out.println("zaten bu seçeneğinizi kullandınız. lütfen başka seçiniz.");        				
                					oyuncu1saldir = input.nextInt();

                				} 
                				else if(oyuncu1saldir == 4 && oyuncu1turhamle4 == 0) {
                					System.out.println("zaten bu seçeneğinizi kullandınız. lütfen başka seçiniz.");        				
                					oyuncu1saldir = input.nextInt();

                				} 
                				else if(oyuncu1saldir == 5 && oyuncu1turhamle5 == 0) {
                					System.out.println("zaten bu seçeneğinizi kullandınız. lütfen başka seçiniz.");        				
                					oyuncu1saldir = input.nextInt();

                				} 
                				else if(oyuncu1saldir == 6 && oyuncu1turhamle6 == 0) {
                					System.out.println("zaten bu seçeneğinizi kullandınız. lütfen başka seçiniz.");        				
                					oyuncu1saldir = input.nextInt();

                				} 
                				else if(oyuncu1saldir == 7 && oyuncu1turhamle7 == 0) {
                					System.out.println("zaten bu seçeneğinizi kullandınız. lütfen başka seçiniz.");        				
                					oyuncu1saldir = input.nextInt();

                				} 
                				else if(oyuncu1saldir == 8 && oyuncu1turhamle8 == 0) {
                					System.out.println("zaten bu seçeneğinizi kullandınız. lütfen başka seçiniz.");        				
                					oyuncu1saldir = input.nextInt();
                				}
                				else if(oyuncu1saldir == 9)
                						break;
                				else if (oyuncu1saldir == 10)
                						break;

                				} 
                		}
                	looop=1;
        				
        			}
        			else {
        				if(oyuncu1ozellikogren==0)
        					System.out.println("\nkart - " + oyuncu1deste.get(oyuncu1ozellikogren) + "\nsaldırı gücü = " + oyuncu1slot0saldırıgücü + "\ncan = " + oyuncu1slot0can + "\nözellik = " + oyuncu1destekart.get(oyuncu1ozellikogren).özellik + "\n");
        				
        				if(oyuncu1ozellikogren==1)
                			System.out.println("\nkart - " + oyuncu1deste.get(oyuncu1ozellikogren) + "\nsaldırı gücü = " + oyuncu1slot1saldırıgücü + "\ncan = " + oyuncu1slot1can + "\nözellik = " + oyuncu1destekart.get(oyuncu1ozellikogren).özellik + "\n");
        				
        				if(oyuncu1ozellikogren==2)
                			System.out.println("\nkart - " + oyuncu1deste.get(oyuncu1ozellikogren) + "\nsaldırı gücü = " + oyuncu1slot2saldırıgücü + "\ncan = " + oyuncu1slot2can + "\nözellik = " + oyuncu1destekart.get(oyuncu1ozellikogren).özellik + "\n");
        				
        				if(oyuncu1ozellikogren==3)
                			System.out.println("\nkart - " + oyuncu1deste.get(oyuncu1ozellikogren) + "\nsaldırı gücü = " + oyuncu1slot3saldırıgücü + "\ncan = " + oyuncu1slot3can + "\nözellik = " + oyuncu1destekart.get(oyuncu1ozellikogren).özellik + "\n");
        				
        				if(oyuncu1ozellikogren==4)
                			System.out.println("\nkart - " + oyuncu1deste.get(oyuncu1ozellikogren) + "\nsaldırı gücü = " + oyuncu1slot4saldırıgücü + "\ncan = " + oyuncu1slot4can + "\nözellik = " + oyuncu1destekart.get(oyuncu1ozellikogren).özellik + "\n");
        				
        				if(oyuncu1ozellikogren==5)
                			System.out.println("\nkart - " + oyuncu1deste.get(oyuncu1ozellikogren) + "\nsaldırı gücü = " + oyuncu1slot5saldırıgücü + "\ncan = " + oyuncu1slot5can + "\nözellik = " + oyuncu1destekart.get(oyuncu1ozellikogren).özellik + "\n");
        				
        				if(oyuncu1ozellikogren==6)
                			System.out.println("\nkart - " + oyuncu1deste.get(oyuncu1ozellikogren) + "\nsaldırı gücü = " + oyuncu1slot6saldırıgücü + "\ncan = " + oyuncu1slot6can + "\nözellik = " + oyuncu1destekart.get(oyuncu1ozellikogren).özellik + "\n");
        				
        				if(oyuncu1ozellikogren==7)
                			System.out.println("\nkart - " + oyuncu1deste.get(oyuncu1ozellikogren) + "\nsaldırı gücü = " + oyuncu1slot7saldırıgücü + "\ncan = " + oyuncu1slot7can + "\nözellik = " + oyuncu1destekart.get(oyuncu1ozellikogren).özellik + "\n");
        				
        				if(oyuncu1ozellikogren==8)
                			System.out.println("\nkart - " + oyuncu1deste.get(oyuncu1ozellikogren) + "\nsaldırı gücü = " + oyuncu1slot8saldırıgücü + "\ncan = " + oyuncu1slot8can + "\nözellik = " + oyuncu1destekart.get(oyuncu1ozellikogren).özellik + "\n");
        				
        			}
        		}
        		else
        			looop = 0;
        		}
        		looop=1;
        		
        		if(oyuncu1saldir==0)
	        		oyuncu1vurmagücü = oyuncu1slot0saldırıgücü;
	        	if(oyuncu1saldir==1)
	        		oyuncu1vurmagücü = oyuncu1slot1saldırıgücü;
	        	if(oyuncu1saldir==2)
	        		oyuncu1vurmagücü = oyuncu1slot2saldırıgücü;
	        	if(oyuncu1saldir==3)
	        		oyuncu1vurmagücü = oyuncu1slot3saldırıgücü;
	        	if(oyuncu1saldir==4)
	        		oyuncu1vurmagücü = oyuncu1slot4saldırıgücü;
	        	if(oyuncu1saldir==5)
	        		oyuncu1vurmagücü = oyuncu1slot5saldırıgücü;
	        	if(oyuncu1saldir==6)
	        		oyuncu1vurmagücü = oyuncu1slot6saldırıgücü;
	        	if(oyuncu1saldir==7)
	        		oyuncu1vurmagücü = oyuncu1slot7saldırıgücü;
	        	if(oyuncu1saldir==8)
	        		oyuncu1vurmagücü = oyuncu1slot8saldırıgücü;
	        	
        			
        			
        			if(oyuncu1saldir != 10) {
        			if(oyuncu1deste.get(oyuncu1saldir).equals(" "))
        				System.out.println("seçiminiz boş");
        			else if (oyuncu1deste.get(oyuncu1saldir).equals("panayır") || oyuncu1deste.get(oyuncu1saldir).equals("zırh") || oyuncu1deste.get(oyuncu1saldir).equals("dolunay") || oyuncu1deste.get(oyuncu1saldir).equals("alevtopları") || oyuncu1deste.get(oyuncu1saldir).equals("kışla") || oyuncu1deste.get(oyuncu1saldir).equals("kıyamet") || oyuncu1deste.get(oyuncu1saldir).equals("değnek")){
        				
        				if(oyuncu1deste.get(oyuncu1saldir).equals("değnek")) {
        					
        					 for(k = 0; k < 9; k++) {
        				        	
        				        	if(oyuncu1deste.get(k).equals(" "));
        				        	
        				        	else
        				        		deste1boş = 0;
        				        		}
        				        
        				        for(k = 0; k < 9; k++) {
        				        	
        				        	if(oyuncu1deste.get(k).equals(" ") || oyuncu1deste.get(k).equals("değnek") || oyuncu1deste.get(k).equals("kışla") || oyuncu1deste.get(k).equals("panayır") || oyuncu1deste.get(k).equals("alevtopu") || oyuncu1deste.get(k).equals("zırh") || oyuncu1deste.get(k).equals("meteor") || oyuncu1deste.get(k).equals("alevtopları") || oyuncu1deste.get(k).equals("dolunay") || oyuncu1deste.get(k).equals("kıyamet"));
        				        	
        				        	else
        				        		deste1ye = 0;
        				        		}
        				        
        				        for(k = 0; k < 9; k++) {
        				        	
        				        	if(oyuncu2deste.get(k).equals(" "));
        				        	
        				        	else
        				        		deste2boş = 0;
        				        		}
        				        
        				        for(k = 0; k < 9; k++) {
        				        	
        				        	if(oyuncu2deste.get(k).equals(" ") || oyuncu2deste.get(k).equals("değnek") || oyuncu2deste.get(k).equals("kışla") || oyuncu2deste.get(k).equals("panayır") || oyuncu2deste.get(k).equals("alevtopu") || oyuncu2deste.get(k).equals("zırh") || oyuncu2deste.get(k).equals("meteor") || oyuncu2deste.get(k).equals("alevtopları") || oyuncu2deste.get(k).equals("dolunay") || oyuncu2deste.get(k).equals("kıyamet")); 
        				        			
        				        	else
        				        		deste2ye = 0;
        				        		}
        					
        						if(deste1ye == 1) {
        							System.out.println("değnek kartı kullanılamaz.");
        							loop=0;
        							değnekgiriş=0;
        							}
        						while(loop==1) {
        							
        							System.out.println("lütfen kendi destenizden 1 hasar vereceğiniz birimi seçiniz");
        							
        						büyühedefi = input.nextInt();
        						durbi=1;
        						
        						if(büyühedefi  == 0 ||büyühedefi == 1 ||büyühedefi == 2 ||büyühedefi == 3 ||büyühedefi == 4 ||büyühedefi == 5 ||büyühedefi == 6 ||büyühedefi == 7 ||büyühedefi == 8) {
        							
        						
        							if(oyuncu1deste.get(büyühedefi).equals(" ") || oyuncu1deste.get(büyühedefi).equals("değnek") || oyuncu1deste.get(büyühedefi).equals("kışla") || oyuncu1deste.get(büyühedefi).equals("panayır") || oyuncu1deste.get(büyühedefi).equals("alevtopu") || oyuncu1deste.get(büyühedefi).equals("zırh") || oyuncu1deste.get(büyühedefi).equals("meteor") || oyuncu1deste.get(büyühedefi).equals("alevtopları") || oyuncu1deste.get(büyühedefi).equals("dolunay") || oyuncu1deste.get(büyühedefi).equals("kıyamet"))
            							System.out.println("geçersiz değer");


        							
            							
        							else {
        								if(büyühedefi==0) {
        									oyuncu1slot0can = oyuncu1slot0can - 1;
        									if(oyuncu1slot0can == 0) {
        										System.out.println(oyuncu1deste.get(0) + " kartı öldürüldü.");
        										oyuncu1deste.set(0, " ");
        										oyuncu1destekart.set(0, bosluk);
        										oyuncu1slot0saldırıgücü = 0;
        										oyuncu1slot0can = 0;
        										break;
        									}
        									else {
        										System.out.println(oyuncu1deste.get(0) +" kartının yeni canı " + oyuncu1slot0can);
        										break;
        									}
        								}
        								if(büyühedefi==1) {
        									oyuncu1slot1can = oyuncu1slot1can - 1;
        									if(oyuncu1slot1can == 0) {
        										System.out.println(oyuncu1deste.get(1) + " kartı öldürüldü.");
        										oyuncu1deste.set(1, " ");
        										oyuncu1destekart.set(1, bosluk);
        										oyuncu1slot1saldırıgücü = 0;
        										oyuncu1slot1can = 0;
        										break;
        									}
        									else {
        										System.out.println(oyuncu1deste.get(1) +" kartının yeni canı " + oyuncu1slot1can);
        										break;
        									}
        								}
        								if(büyühedefi==2) {
        									oyuncu1slot2can = oyuncu1slot2can - 1;
        									if(oyuncu1slot2can == 0) {
        										System.out.println(oyuncu1deste.get(2) + " kartı öldürüldü.");
        										oyuncu1deste.set(2, " ");
        										oyuncu1destekart.set(2, bosluk);
        										oyuncu1slot2saldırıgücü = 0;
        										oyuncu1slot2can = 0;
        										break;
        									}
        									else {
        										System.out.println(oyuncu1deste.get(2) +" kartının yeni canı " + oyuncu1slot2can);
        										break;
        									}
        								}
        								if(büyühedefi==3) {
        									oyuncu1slot3can = oyuncu1slot3can - 1;
        									if(oyuncu1slot3can == 0) {
        										System.out.println(oyuncu1deste.get(3) + " kartı öldürüldü.");
        										oyuncu1deste.set(3, " ");
        										oyuncu1destekart.set(3, bosluk);
        										oyuncu1slot3saldırıgücü = 0;
        										oyuncu1slot3can = 0;
        										break;
        									}
        									else {
        										System.out.println(oyuncu1deste.get(3) +" kartının yeni canı " + oyuncu1slot3can);
        										break;
        									}
        								}
        								if(büyühedefi==4) {
        									oyuncu1slot4can = oyuncu1slot4can - 1;
        									if(oyuncu1slot4can == 0) {
        										System.out.println(oyuncu1deste.get(4) + " kartı öldürüldü.");
        										oyuncu1deste.set(4, " ");
        										oyuncu1destekart.set(4, bosluk);
        										oyuncu1slot4saldırıgücü = 0;
        										oyuncu1slot4can = 0;
        										break;
        									}
        									else {
        										System.out.println(oyuncu1deste.get(4) +" kartının yeni canı " + oyuncu1slot4can);
        										break;
        									}
        								}
        								if(büyühedefi==5) {
        									oyuncu1slot5can = oyuncu1slot5can - 1;
        									if(oyuncu1slot5can == 0) {
        										System.out.println(oyuncu1deste.get(5) + " kartı öldürüldü.");
        										oyuncu1deste.set(5, " ");
        										oyuncu1destekart.set(5, bosluk);
        										oyuncu1slot5saldırıgücü = 0;
        										oyuncu1slot5can = 0;
        										break;
        									}
        									else {
        										System.out.println(oyuncu1deste.get(5) +" kartının yeni canı " + oyuncu1slot5can);
        										break;
        									}
        								}
        								if(büyühedefi==6) {
        									oyuncu1slot6can = oyuncu1slot6can - 1;
        									if(oyuncu1slot6can == 0) {
        										System.out.println(oyuncu1deste.get(6) + " kartı öldürüldü.");
        										oyuncu1deste.set(6, " ");
        										oyuncu1destekart.set(6, bosluk);
        										oyuncu1slot6saldırıgücü = 0;
        										oyuncu1slot6can = 0;
        										break;
        									}
        									else {
        										System.out.println(oyuncu1deste.get(6) +" kartının yeni canı " + oyuncu1slot6can);
        										break;
        									}
        								}
        								if(büyühedefi==7) {
        									oyuncu1slot7can = oyuncu1slot7can - 1;
        									if(oyuncu1slot7can == 0) {
        										System.out.println(oyuncu1deste.get(7) + " kartı öldürüldü.");
        										oyuncu1deste.set(7, " ");
        										oyuncu1destekart.set(7, bosluk);
        										oyuncu1slot7saldırıgücü = 0;
        										oyuncu1slot7can = 0;
        										break;
        									}
        									else {
        										System.out.println(oyuncu1deste.get(7) +" kartının yeni canı " + oyuncu1slot7can);
        										break;
        									}
        								}
        								if(büyühedefi==8) {
        									oyuncu1slot8can = oyuncu1slot8can - 1;
        									if(oyuncu1slot8can == 0) {
        										System.out.println(oyuncu1deste.get(8) + " kartı öldürüldü.");
        										oyuncu1deste.set(8, " ");
        										oyuncu1destekart.set(8, bosluk);
        										oyuncu1slot8saldırıgücü = 0;
        										oyuncu1slot8can = 0;
        										break;
        									}
        									else {
        										System.out.println(oyuncu1deste.get(8) +" kartının yeni canı " + oyuncu1slot8can);
        										break;
        									}
        								}
        								
        							}
        								
        							
        							}
        							
        						else {
        							if(durbi!=1) 
        								System.out.println("geçersiz değer");
            							else
        								durbi=0;
        						}
        						}
        						loop=1;
        				
        						durbi=1;	
        						durbii=1;
        						
        						if(değnekgiriş==1) {
        						
        						if(deste2ye==1){
        							
        							oyuncu1deste.set(oyuncu1saldir, " ");
    								oyuncu1destekart.set(oyuncu1saldir, bosluk);
    								
        							System.out.println("\nkarşıda kart yok ve oyuncuya saldırılacak");
        							oyuncu2cani = oyuncu2cani - 2;
        							System.out.println("oyuncu 2 canı = " + oyuncu2cani);
        						}
        						else {
        							while(true) {
        								
        								oyuncu1deste.set(oyuncu1saldir, " ");
        								oyuncu1destekart.set(oyuncu1saldir, bosluk);
        								
        			        	    System.out.println("\noyuncu 2 nin kartları = \n0. " + oyuncu2deste.get(0) + "\n1. " + oyuncu2deste.get(1) + "\n2. " + oyuncu2deste.get(2) + "\n3. " + oyuncu2deste.get(3) + "\n4. " + oyuncu2deste.get(4) + "\n5. " + oyuncu2deste.get(5) + "\n6. " + oyuncu2deste.get(6) + "\n7. " + oyuncu2deste.get(7) + "\n8. " + oyuncu2deste.get(8));

        							System.out.println("lütfen 2 hasar vereceğiniz kartı seçin ");
        							büyühedefi = input.nextInt();
        							
        							if(büyühedefi  == 0 ||büyühedefi == 1 ||büyühedefi == 2 ||büyühedefi == 3 ||büyühedefi == 4 ||büyühedefi == 5 ||büyühedefi == 6 ||büyühedefi == 7 ||büyühedefi == 8) {
        							
        								if(oyuncu2deste.get(büyühedefi).equals(" ") || oyuncu2deste.get(büyühedefi).equals("değnek") || oyuncu2deste.get(büyühedefi).equals("kışla") || oyuncu2deste.get(büyühedefi).equals("panayır") || oyuncu2deste.get(büyühedefi).equals("alevtopu") || oyuncu2deste.get(büyühedefi).equals("zırh") || oyuncu2deste.get(büyühedefi).equals("meteor") || oyuncu2deste.get(büyühedefi).equals("alevtopları") || oyuncu2deste.get(büyühedefi).equals("dolunay") || oyuncu2deste.get(büyühedefi).equals("kıyamet"))
                							System.out.println("geçersiz değer");
        								
        								else {
            								if(büyühedefi==0) {
            									oyuncu2slot0can = oyuncu2slot0can - 2;
            									if(oyuncu2slot0can == 0) {
            										System.out.println(oyuncu2deste.get(0) + " kartı öldürüldü.");
            										oyuncu2deste.set(0, " ");
            										oyuncu2destekart.set(0, bosluk);
            										oyuncu2slot0saldırıgücü = 0;
            										oyuncu2slot0can = 0;
            										break;
            									}
            									else {
            										System.out.println(oyuncu2deste.get(0) +" kartının yeni canı " + oyuncu2slot0can);
            										break;
            									}
            								}
            								if(büyühedefi==1) {
            									oyuncu2slot1can = oyuncu2slot1can - 2;
            									if(oyuncu2slot1can == 0) {
            										System.out.println(oyuncu2deste.get(1) + " kartı öldürüldü.");
            										oyuncu2deste.set(1, " ");
            										oyuncu2destekart.set(1, bosluk);
            										oyuncu2slot1saldırıgücü = 0;
            										oyuncu2slot1can = 0;
            										break;
            									}
            									else {
            										System.out.println(oyuncu2deste.get(1) +" kartının yeni canı " + oyuncu2slot1can);
            										break;
            									}
            								}
            								if(büyühedefi==2) {
            									oyuncu2slot2can = oyuncu2slot2can - 2;
            									if(oyuncu2slot2can == 0) {
            										System.out.println(oyuncu2deste.get(2) + " kartı öldürüldü.");
            										oyuncu2deste.set(2, " ");
            										oyuncu2destekart.set(2, bosluk);
            										oyuncu2slot2saldırıgücü = 0;
            										oyuncu2slot2can = 0;
            										break;
            									}
            									else {
            										System.out.println(oyuncu2deste.get(2) +" kartının yeni canı " + oyuncu2slot2can);
            										break;
            									}
            								}
            								if(büyühedefi==3) {
            									oyuncu2slot3can = oyuncu2slot3can - 2;
            									if(oyuncu2slot3can == 0) {
            										System.out.println(oyuncu2deste.get(3) + " kartı öldürüldü.");
            										oyuncu2deste.set(3, " ");
            										oyuncu2destekart.set(3, bosluk);
            										oyuncu2slot3saldırıgücü = 0;
            										oyuncu2slot3can = 0;
            										break;
            									}
            									else {
            										System.out.println(oyuncu2deste.get(3) +" kartının yeni canı " + oyuncu2slot3can);
            										break;
            									}
            								}
            								if(büyühedefi==4) {
            									oyuncu2slot4can = oyuncu2slot4can - 2;
            									if(oyuncu2slot4can == 0) {
            										System.out.println(oyuncu2deste.get(4) + " kartı öldürüldü.");
            										oyuncu2deste.set(4, " ");
            										oyuncu2destekart.set(4, bosluk);
            										oyuncu2slot4saldırıgücü = 0;
            										oyuncu2slot4can = 0;
            										break;
            									}
            									else {
            										System.out.println(oyuncu2deste.get(4) +" kartının yeni canı " + oyuncu2slot4can);
            										break;
            									}
            								}
            								if(büyühedefi==5) {
            									oyuncu2slot5can = oyuncu2slot5can - 2;
            									if(oyuncu2slot5can == 0) {
            										System.out.println(oyuncu2deste.get(5) + " kartı öldürüldü.");
            										oyuncu2deste.set(5, " ");
            										oyuncu2destekart.set(5, bosluk);
            										oyuncu2slot5saldırıgücü = 0;
            										oyuncu2slot5can = 0;
            										break;
            									}
            									else {
            										System.out.println(oyuncu2deste.get(5) +" kartının yeni canı " + oyuncu2slot5can);
            										break;
            									}
            								}
            								if(büyühedefi==6) {
            									oyuncu2slot6can = oyuncu2slot6can - 2;
            									if(oyuncu2slot6can == 0) {
            										System.out.println(oyuncu2deste.get(6) + " kartı öldürüldü.");
            										oyuncu2deste.set(6, " ");
            										oyuncu2destekart.set(6, bosluk);
            										oyuncu2slot6saldırıgücü = 0;
            										oyuncu2slot6can = 0;
            										break;
            									}
            									else {
            										System.out.println(oyuncu2deste.get(6) +" kartının yeni canı " + oyuncu2slot6can);
            										break;
            									}
            								}
            								if(büyühedefi==7) {
            									oyuncu2slot7can = oyuncu2slot7can - 2;
            									if(oyuncu2slot7can == 0) {
            										System.out.println(oyuncu2deste.get(7) + " kartı öldürüldü.");
            										oyuncu2deste.set(7, " ");
            										oyuncu2destekart.set(7, bosluk);
            										oyuncu2slot7saldırıgücü = 0;
            										oyuncu2slot7can = 0;
            										break;
            									}
            									else {
            										System.out.println(oyuncu2deste.get(7) +" kartının yeni canı " + oyuncu2slot7can);
            										break;
            									}
            								}
            								if(büyühedefi==8) {
            									oyuncu2slot8can = oyuncu2slot8can - 2;
            									if(oyuncu2slot8can == 0) {
            										System.out.println(oyuncu2deste.get(8) + " kartı öldürüldü.");
            										oyuncu2deste.set(8, " ");
            										oyuncu2destekart.set(8, bosluk);
            										oyuncu2slot8saldırıgücü = 0;
            										oyuncu2slot8can = 0;
            										break;
            									}
            									else {
            										System.out.println(oyuncu2deste.get(8) +" kartının yeni canı " + oyuncu2slot8can);
            										break;
            									}
            								}
            							}
        							
        							}
        							}
        						}
        						}
        						değnekgiriş=1;
        				}
        				
        				
        				if(oyuncu1deste.get(oyuncu1saldir).equals("kıyamet")) {
        					System.out.println("oyuncu 2 nin bütün kartları öldürüldü.");
        					oyuncu2deste.set(0, " ");
        					oyuncu2destekart.set(0, bosluk);
        					oyuncu2slot0saldırıgücü = 0;
        					oyuncu2slot0can = 0;
        					
        					oyuncu2deste.set(1, " ");
        					oyuncu2destekart.set(1, bosluk);
        					oyuncu2slot1saldırıgücü = 0;
        					oyuncu2slot1can = 0;
        					
        					oyuncu2deste.set(2, " ");
        					oyuncu2destekart.set(2, bosluk);
        					oyuncu2slot2saldırıgücü = 0;
        					oyuncu2slot2can = 0;
        					
        					oyuncu2deste.set(3, " ");
        					oyuncu2destekart.set(3, bosluk);
        					oyuncu2slot3saldırıgücü = 0;
        					oyuncu2slot3can = 0;
        					
        					oyuncu2deste.set(4, " ");
        					oyuncu2destekart.set(4, bosluk);
        					oyuncu2slot4saldırıgücü = 0;
        					oyuncu2slot4can = 0;
        					
        					oyuncu2deste.set(5, " ");
        					oyuncu2destekart.set(5, bosluk);
        					oyuncu2slot5saldırıgücü = 0;
        					oyuncu2slot5can = 0;
        					
        					oyuncu2deste.set(6, " ");
        					oyuncu2destekart.set(6, bosluk);
        					oyuncu2slot6saldırıgücü = 0;
        					oyuncu2slot6can = 0;
        					
        					oyuncu2deste.set(7, " ");
        					oyuncu2destekart.set(7, bosluk);
        					oyuncu2slot7saldırıgücü = 0;
        					oyuncu2slot7can = 0;
        					
        					oyuncu2deste.set(8, " ");
        					oyuncu2destekart.set(8, bosluk);
        					oyuncu2slot8saldırıgücü = 0;
        					oyuncu2slot8can = 0;
        					
        					oyuncu1deste.set(oyuncu1saldir, " ");
        					oyuncu1destekart.set(oyuncu1saldir, bosluk);
        				}
        				
        				if(oyuncu1deste.get(oyuncu1saldir).equals("panayır")) {
        					System.out.println("3 tane minyon destenize eklendi!");
        					oyuncu1deste.set(oyuncu1saldir, "minyon");
        					oyuncu1destekart.set(oyuncu1saldir, minyon);
        					if(oyuncu1saldir==0) {
								oyuncu1slot0can = 1;
								oyuncu1slot0saldırıgücü = 1;
								oyuncu1turhamle0 = 1;
							}
							if(oyuncu1saldir==1) {
								oyuncu1slot1can = 1;
								oyuncu1slot1saldırıgücü = 1;
								oyuncu1turhamle1 = 1;
							}
							if(oyuncu1saldir==2) {
								oyuncu1slot2can = 1;
								oyuncu1slot2saldırıgücü = 1;
								oyuncu1turhamle2 = 1;
							}
							if(oyuncu1saldir==3) {
								oyuncu1slot3can = 1;
								oyuncu1slot3saldırıgücü = 1;
								oyuncu1turhamle3 = 1;
							}
							if(oyuncu1saldir==4) {
								oyuncu1slot4can = 1;
								oyuncu1slot4saldırıgücü = 1;
								oyuncu1turhamle4 = 1;
							}
							if(oyuncu1saldir==5) {
								oyuncu1slot5can = 1;
								oyuncu1slot5saldırıgücü = 1;
								oyuncu1turhamle5 = 1;
							}
							if(oyuncu1saldir==6) {
								oyuncu1slot6can = 1;
								oyuncu1slot6saldırıgücü = 1;
								oyuncu1turhamle6 = 1;
							}
							if(oyuncu1saldir==7) {
								oyuncu1slot7can = 1;
								oyuncu1slot7saldırıgücü = 1;
								oyuncu1turhamle7 = 1;
							}
							if(oyuncu1saldir==8) {
								oyuncu1slot8can = 1;
								oyuncu1slot8saldırıgücü = 1;
								oyuncu1turhamle8 = 1;
							}
        					for(k=0;k<9;k++) {
        						if(oyuncu1deste.get(k).equals(" ")) {
        							oyuncu1deste.set(k, "minyon");
        							oyuncu1destekart.set(k, minyon);
        							if(k==0) {
        								oyuncu1slot0can = 1;
        								oyuncu1slot0saldırıgücü = 1;
        								oyuncu1turhamle0 = 1;
        							}
        							if(k==1) {
        								oyuncu1slot1can = 1;
        								oyuncu1slot1saldırıgücü = 1;
        								oyuncu1turhamle1 = 1;
        							}
        							if(k==2) {
        								oyuncu1slot2can = 1;
        								oyuncu1slot2saldırıgücü = 1;
        								oyuncu1turhamle2 = 1;
        							}
        							if(k==3) {
        								oyuncu1slot3can = 1;
        								oyuncu1slot3saldırıgücü = 1;
        								oyuncu1turhamle3 = 1;
        							}
        							if(k==4) {
        								oyuncu1slot4can = 1;
        								oyuncu1slot4saldırıgücü = 1;
        								oyuncu1turhamle4 = 1;
        							}
        							if(k==5) {
        								oyuncu1slot5can = 1;
        								oyuncu1slot5saldırıgücü = 1;
        								oyuncu1turhamle5 = 1;
        							}
        							if(k==6) {
        								oyuncu1slot6can = 1;
        								oyuncu1slot6saldırıgücü = 1;
        								oyuncu1turhamle6 = 1;
        							}
        							if(k==7) {
        								oyuncu1slot7can = 1;
        								oyuncu1slot7saldırıgücü = 1;
        								oyuncu1turhamle7 = 1;
        							}
        							if(k==8) {
        								oyuncu1slot8can = 1;
        								oyuncu1slot8saldırıgücü = 1;
        								oyuncu1turhamle8 = 1;
        							}
        							break;
        						}
        						}
        					for(k=0;k<9;k++) {
        						if(oyuncu1deste.get(k).equals(" ")) {
        							oyuncu1deste.set(k, "minyon");
        							oyuncu1destekart.set(k, minyon);
        							if(k==0) {
        								oyuncu1slot0can = 1;
        								oyuncu1slot0saldırıgücü = 1;
        								oyuncu1turhamle0 = 1;
        							}
        							if(k==1) {
        								oyuncu1slot1can = 1;
        								oyuncu1slot1saldırıgücü = 1;
        								oyuncu1turhamle1 = 1;
        							}
        							if(k==2) {
        								oyuncu1slot2can = 1;
        								oyuncu1slot2saldırıgücü = 1;
        								oyuncu1turhamle2 = 1;
        							}
        							if(k==3) {
        								oyuncu1slot3can = 1;
        								oyuncu1slot3saldırıgücü = 1;
        								oyuncu1turhamle3 = 1;
        							}
        							if(k==4) {
        								oyuncu1slot4can = 1;
        								oyuncu1slot4saldırıgücü = 1;
        								oyuncu1turhamle4 = 1;
        							}
        							if(k==5) {
        								oyuncu1slot5can = 1;
        								oyuncu1slot5saldırıgücü = 1;
        								oyuncu1turhamle5 = 1;
        							}
        							if(k==6) {
        								oyuncu1slot6can = 1;
        								oyuncu1slot6saldırıgücü = 1;
        								oyuncu1turhamle6 = 1;
        							}
        							if(k==7) {
        								oyuncu1slot7can = 1;
        								oyuncu1slot7saldırıgücü = 1;
        								oyuncu1turhamle7 = 1;
        							}
        							if(k==8) {
        								oyuncu1slot8can = 1;
        								oyuncu1slot8saldırıgücü = 1;
        								oyuncu1turhamle8 = 1;
        							}
        							break;
        						}
        						}

        				}
        			
        				if(oyuncu1deste.get(oyuncu1saldir).equals("zırh")){
        					if(deste1ye==1)
        						zırhgiriş=0;
        					
        					if(zırhgiriş==1) {
        					if(oyuncu1saldir==0) {
        						oyuncu1deste.set(0, " ");
        						oyuncu1destekart.set(0, bosluk);
        					}
        					if(oyuncu1saldir==1) {
        						oyuncu1deste.set(1, " ");
        						oyuncu1destekart.set(1, bosluk);
        					}
        					if(oyuncu1saldir==2) {
        						oyuncu1deste.set(2, " ");
        						oyuncu1destekart.set(2, bosluk);
        					}
        					if(oyuncu1saldir==3) {
        						oyuncu1deste.set(3, " ");
        						oyuncu1destekart.set(3, bosluk);
        					}
        					if(oyuncu1saldir==4) {
        						oyuncu1deste.set(4, " ");
        						oyuncu1destekart.set(4, bosluk);
        					}
        					if(oyuncu1saldir==5) {
        						oyuncu1deste.set(5, " ");
        						oyuncu1destekart.set(5, bosluk);
        					}
        					if(oyuncu1saldir==6) {
        						oyuncu1deste.set(6, " ");
        						oyuncu1destekart.set(6, bosluk);
        					}
        					if(oyuncu1saldir==7) {
        						oyuncu1deste.set(7, " ");
        						oyuncu1destekart.set(7, bosluk);
        					}
        					if(oyuncu1saldir==8) {
        						oyuncu1deste.set(8, " ");
        						oyuncu1destekart.set(8, bosluk);
        					}
        					
        					
        					System.out.println("\noyuncu 1 in kartları = \n0. " + oyuncu1deste.get(0) + "\n1. " + oyuncu1deste.get(1) + "\n2. " + oyuncu1deste.get(2) + "\n3. " + oyuncu1deste.get(3) + "\n4. " + oyuncu1deste.get(4) + "\n5. " + oyuncu1deste.get(5) + "\n6. " + oyuncu1deste.get(6) + "\n7. " + oyuncu1deste.get(7) + "\n8. " + oyuncu1deste.get(8) + "\n9. kart özelliklerini görüntüleme\n10.çıkış" );
            		        
        					while(büyüloopu==1) {
            		        System.out.println("\nlütfen canını 10 arttırmak istediğiniz hedefi seçiniz.");
    		        		
            		        

            		        while(büyülooopu==1) {
            		        	büyühedefi = input.nextInt();
                		        
                		        
            		        	if(büyühedefi  == 0 ||büyühedefi == 1 ||büyühedefi == 2 ||büyühedefi == 3 ||büyühedefi == 4 ||büyühedefi == 5 ||büyühedefi == 6 ||büyühedefi == 7 ||büyühedefi == 8) {
            		        		break;
            		        		}
            		        	else {
            		        		if(durbii!=1) {
            		        		System.out.println("geçersiz değer");
            		        		System.out.println("\nlütfen canını 10 arttırmak istediğiniz hedefi seçiniz.");
            		        		}
            		        		else
            		        			durbii= 0;
            		        	}
            		        }
            		        	durbii = 1;
            		        	while(büyülooopu==1) {
                		        	if(büyühedefi  == 0 ||büyühedefi == 1 ||büyühedefi == 2 ||büyühedefi == 3 ||büyühedefi == 4 ||büyühedefi == 5 ||büyühedefi == 6 ||büyühedefi == 7 ||büyühedefi == 8) {

            		        	if(oyuncu1deste.get(büyühedefi).equals(" ") || oyuncu1deste.get(büyühedefi).equals("değnek") || oyuncu1deste.get(büyühedefi).equals("kışla") || oyuncu1deste.get(büyühedefi).equals("panayır") || oyuncu1deste.get(büyühedefi).equals("alevtopu") || oyuncu1deste.get(büyühedefi).equals("zırh") || oyuncu1deste.get(büyühedefi).equals("meteor") || oyuncu1deste.get(büyühedefi).equals("alevtopları") || oyuncu1deste.get(büyühedefi).equals("dolunay") || oyuncu1deste.get(büyühedefi).equals("kıyamet")){
            		        		System.out.println("geçersiz değer");
            		        		System.out.println("\nlütfen canını 10 arttırmak istediğiniz hedefi seçiniz.");
                    		        büyühedefi = input.nextInt();
            		        	}
            		        	else
            		        		break;
            		        	}
                		        	
            		        	}
            		        	
            		        if(büyühedefi  == 0) {
            		        	oyuncu1slot0can = oyuncu1slot0can + 10;
            		        	System.out.println(oyuncu1deste.get(büyühedefi) +" kartının yeni canı = " + oyuncu1slot0can);
            		        	}
            		        else if(büyühedefi == 1) {
                		        oyuncu1slot1can = oyuncu1slot1can + 10;
                		        System.out.println(oyuncu1deste.get(büyühedefi) +" kartının yeni canı = " + oyuncu1slot1can);
                		        }
            		        else if(büyühedefi == 2) {
                		        oyuncu1slot2can = oyuncu1slot2can + 10;
                		        System.out.println(oyuncu1deste.get(büyühedefi) +" kartının yeni canı = " + oyuncu1slot2can);
                		        }
            		        else if(büyühedefi == 3) {
                		        oyuncu1slot3can = oyuncu1slot3can + 10;
                		        System.out.println(oyuncu1deste.get(büyühedefi) +" kartının yeni canı = " + oyuncu1slot3can);
                		        }
            		        else if(büyühedefi == 4) {
                		        oyuncu1slot4can = oyuncu1slot4can + 10;
                		        System.out.println(oyuncu1deste.get(büyühedefi) +" kartının yeni canı = " + oyuncu1slot4can);
                		        }
            		        else if(büyühedefi == 5) {
                		        oyuncu1slot5can = oyuncu1slot5can + 10;
                		        System.out.println(oyuncu1deste.get(büyühedefi) +" kartının yeni canı = " + oyuncu1slot5can);
                		        }
            		        else if(büyühedefi == 6) {
                		        oyuncu1slot6can = oyuncu1slot6can + 10;
                		        System.out.println(oyuncu1deste.get(büyühedefi) +" kartının yeni canı = " + oyuncu1slot6can);
                		        }
            		        else if(büyühedefi == 7) {
                		        oyuncu1slot7can = oyuncu1slot7can + 10;
                		        System.out.println(oyuncu1deste.get(büyühedefi) +" kartının yeni canı = " + oyuncu1slot7can);
                		        }
            		        else if(büyühedefi == 8) {
                		        oyuncu1slot8can = oyuncu1slot8can + 10;
                		        System.out.println(oyuncu1deste.get(büyühedefi) +" kartının yeni canı = " + oyuncu1slot8can);
                		        }
            		        büyühedefi = 0;
            		        
            		        break;

        				}
        				}
        					else
        						System.out.println("desteniz zırh kartını kullanmak için uygun değil");
        					zırhgiriş=1;
        					
        			}
        				if(oyuncu1deste.get(oyuncu1saldir).equals("dolunay")) {
        					System.out.println("3 tane kurt destenize eklendi.");
        					oyuncu1deste.set(oyuncu1saldir, "kurt");
        					oyuncu1destekart.set(oyuncu1saldir, kurt);
        					if(oyuncu1saldir==0) {
								oyuncu1slot0can = 3;
								oyuncu1slot0saldırıgücü = 3;
								oyuncu1turhamle0 = 1;
							}
							if(oyuncu1saldir==1) {
								oyuncu1slot1can = 3;
								oyuncu1slot1saldırıgücü = 3;
								oyuncu1turhamle1 = 1;
							}
							if(oyuncu1saldir==2) {
								oyuncu1slot2can = 3;
								oyuncu1slot2saldırıgücü = 3;
								oyuncu1turhamle2 = 1;
							}
							if(oyuncu1saldir==3) {
								oyuncu1slot3can = 3;
								oyuncu1slot3saldırıgücü = 3;
								oyuncu1turhamle3 = 1;
							}
							if(oyuncu1saldir==4) {
								oyuncu1slot4can = 3;
								oyuncu1slot4saldırıgücü = 3;
								oyuncu1turhamle4 = 1;
							}
							if(oyuncu1saldir==5) {
								oyuncu1slot5can = 3;
								oyuncu1slot5saldırıgücü = 3;
								oyuncu1turhamle5 = 1;
							}
							if(oyuncu1saldir==6) {
								oyuncu1slot6can = 3;
								oyuncu1slot6saldırıgücü = 3;
								oyuncu1turhamle6 = 1;
							}
							if(oyuncu1saldir==7) {
								oyuncu1slot7can = 3;
								oyuncu1slot7saldırıgücü = 3;
								oyuncu1turhamle7 = 1;
							}
							if(oyuncu1saldir==8) {
								oyuncu1slot8can = 3;
								oyuncu1slot8saldırıgücü = 3;
								oyuncu1turhamle8 = 1;
							}
        					for(k=0;k<9;k++) {
        						if(oyuncu1deste.get(k).equals(" ")) {
        							oyuncu1deste.set(k, "kurt");
                					oyuncu1destekart.set(k, kurt);
        							if(k==0) {
        								oyuncu1slot0can = 3;
        								oyuncu1slot0saldırıgücü = 3;
        								oyuncu1turhamle0 = 1;
        							}
        							if(k==1) {
        								oyuncu1slot1can = 3;
        								oyuncu1slot1saldırıgücü = 3;
        								oyuncu1turhamle1 = 1;
        							}
        							if(k==2) {
        								oyuncu1slot2can = 3;
        								oyuncu1slot2saldırıgücü = 3;
        								oyuncu1turhamle2 = 1;
        							}
        							if(k==3) {
        								oyuncu1slot3can = 3;
        								oyuncu1slot3saldırıgücü = 3;
        								oyuncu1turhamle3 = 1;
        							}
        							if(k==4) {
        								oyuncu1slot4can = 3;
        								oyuncu1slot4saldırıgücü = 3;
        								oyuncu1turhamle4 = 1;
        							}
        							if(k==5) {
        								oyuncu1slot5can = 3;
        								oyuncu1slot5saldırıgücü = 3;
        								oyuncu1turhamle5 = 1;
        							}
        							if(k==6) {
        								oyuncu1slot6can = 3;
        								oyuncu1slot6saldırıgücü = 3;
        								oyuncu1turhamle6 = 1;
        							}
        							if(k==7) {
        								oyuncu1slot7can = 3;
        								oyuncu1slot7saldırıgücü = 3;
        								oyuncu1turhamle7 = 1;
        							}
        							if(k==8) {
        								oyuncu1slot8can = 3;
        								oyuncu1slot8saldırıgücü = 3;
        								oyuncu1turhamle8 = 1;
        							}
        							break;
        						}
        					}
        					for(k=0;k<9;k++) {
        						if(oyuncu1deste.get(k).equals(" ")) {
        							oyuncu1deste.set(k, "kurt");
                					oyuncu1destekart.set(k, kurt);
        							if(k==0) {
        								oyuncu1slot0can = 3;
        								oyuncu1slot0saldırıgücü = 3;
        								oyuncu1turhamle0 = 1;
        							}
        							if(k==1) {
        								oyuncu1slot1can = 3;
        								oyuncu1slot1saldırıgücü = 3;
        								oyuncu1turhamle1 = 1;
        							}
        							if(k==2) {
        								oyuncu1slot2can = 3;
        								oyuncu1slot2saldırıgücü = 3;
        								oyuncu1turhamle2 = 1;
        							}
        							if(k==3) {
        								oyuncu1slot3can = 3;
        								oyuncu1slot3saldırıgücü = 3;
        								oyuncu1turhamle3 = 1;
        							}
        							if(k==4) {
        								oyuncu1slot4can = 3;
        								oyuncu1slot4saldırıgücü = 3;
        								oyuncu1turhamle4 = 1;
        							}
        							if(k==5) {
        								oyuncu1slot5can = 3;
        								oyuncu1slot5saldırıgücü = 3;
        								oyuncu1turhamle5 = 1;
        							}
        							if(k==6) {
        								oyuncu1slot6can = 3;
        								oyuncu1slot6saldırıgücü = 3;
        								oyuncu1turhamle6 = 1;
        							}
        							if(k==7) {
        								oyuncu1slot7can = 3;
        								oyuncu1slot7saldırıgücü = 3;
        								oyuncu1turhamle7 = 1;
        							}
        							if(k==8) {
        								oyuncu1slot8can = 3;
        								oyuncu1slot8saldırıgücü = 3;
        								oyuncu1turhamle8 = 1;
        							}
        							break;
        						}
        					}
        				}
        			
        				if(oyuncu1deste.get(oyuncu1saldir).equals("alevtopları")) {
        					System.out.println("3 tane alev topu destenize eklendi");
        					oyuncu1deste.set(oyuncu1saldir, "alevtopu");
        					oyuncu1destekart.set(oyuncu1saldir, alevtopu);
        					if(oyuncu1saldir==0) {
        						oyuncu1slot0saldırıgücü = 2;
								oyuncu1turhamle0 = 1;
        					}
        					if(oyuncu1saldir==1) {
        						oyuncu1slot1saldırıgücü = 2;
								oyuncu1turhamle1 = 1;
        					}
        					if(oyuncu1saldir==2) {
        						oyuncu1slot2saldırıgücü = 2;
								oyuncu1turhamle2 = 1;
        					}
        					if(oyuncu1saldir==3) {
        						oyuncu1slot3saldırıgücü = 2;
								oyuncu1turhamle3 = 1;
        					}
        					if(oyuncu1saldir==4) {
        						oyuncu1slot4saldırıgücü = 2;
								oyuncu1turhamle4 = 1;
        					}
        					if(oyuncu1saldir==5) {
        						oyuncu1slot5saldırıgücü = 2;
								oyuncu1turhamle5 = 1;
        					}
        					if(oyuncu1saldir==6) {
        						oyuncu1slot6saldırıgücü = 2;
								oyuncu1turhamle6 = 1;
        					}
        					if(oyuncu1saldir==7) {
        						oyuncu1slot7saldırıgücü = 2;
								oyuncu1turhamle7 = 1;
        					}
        					if(oyuncu1saldir==8) {
        						oyuncu1slot8saldırıgücü = 2;
								oyuncu1turhamle8 = 1;
        					}
        					for(k=0;k<9;k++) {
        						
        						if(oyuncu1deste.get(k).equals(" ")) {
        							if(k==0) {
        							oyuncu1deste.set(k, "alevtopu");
        							oyuncu1destekart.set(k, alevtopu);
        							oyuncu1slot0saldırıgücü = 2;
        							oyuncu1turhamle0 = 1;
        							break;
        						}
        							if(k==1) {
        							oyuncu1deste.set(k, "alevtopu");
        							oyuncu1destekart.set(k, alevtopu);
        							oyuncu1slot1saldırıgücü = 2;
        							oyuncu1turhamle1 = 1;
        							break;
        						}
        							if(k==2) {
        							oyuncu1deste.set(k, "alevtopu");
        							oyuncu1destekart.set(k, alevtopu);
        							oyuncu1slot2saldırıgücü = 2;
        							oyuncu1turhamle2 = 1;
        							break;
        						}
        							if(k==3) {
        							oyuncu1deste.set(k, "alevtopu");
        							oyuncu1destekart.set(k, alevtopu);
        							oyuncu1slot3saldırıgücü = 2;
        							oyuncu1turhamle3 = 1;
        							break;
        						}
        							if(k==4) {
        							oyuncu1deste.set(k, "alevtopu");
        							oyuncu1destekart.set(k, alevtopu);
        							oyuncu1slot4saldırıgücü = 2;
        							oyuncu1turhamle4 = 1;
        							break;
        						}
        							if(k==5) {
        							oyuncu1deste.set(k, "alevtopu");
        							oyuncu1destekart.set(k, alevtopu);
        							oyuncu1slot5saldırıgücü = 2;
        							oyuncu1turhamle5 = 1;
        							break;
        						}
        							if(k==6) {
        							oyuncu1deste.set(k, "alevtopu");
        							oyuncu1destekart.set(k, alevtopu);
        							oyuncu1slot6saldırıgücü = 2;
        							oyuncu1turhamle6 = 1;
        							break;
        						}
        							if(k==7) {
        							oyuncu1deste.set(k, "alevtopu");
        							oyuncu1destekart.set(k, alevtopu);
        							oyuncu1slot7saldırıgücü = 2;
        							oyuncu1turhamle7 = 1;
        							break;
        						}
        							if(k==8) {
        							oyuncu1deste.set(k, "alevtopu");
        							oyuncu1destekart.set(k, alevtopu);
        							oyuncu1slot8saldırıgücü = 2;
        							oyuncu1turhamle8 = 1;
        							break;
        						}
        					
        						}
        					}
        					
        					for(k=0;k<9;k++) {
        						
        						if(oyuncu1deste.get(k).equals(" ")) {
        							if(k==0) {
        							oyuncu1deste.set(k, "alevtopu");
        							oyuncu1destekart.set(k, alevtopu);
        							oyuncu1slot0saldırıgücü = 2;
        							oyuncu1turhamle0 = 1;
        							break;
        						}
        							if(k==1) {
        							oyuncu1deste.set(k, "alevtopu");
        							oyuncu1destekart.set(k, alevtopu);
        							oyuncu1slot1saldırıgücü = 2;
        							oyuncu1turhamle1 = 1;
        							break;
        						}
        							if(k==2) {
        							oyuncu1deste.set(k, "alevtopu");
        							oyuncu1destekart.set(k, alevtopu);
        							oyuncu1slot2saldırıgücü = 2;
        							oyuncu1turhamle2 = 1;
        							break;
        						}
        							if(k==3) {
        							oyuncu1deste.set(k, "alevtopu");
        							oyuncu1destekart.set(k, alevtopu);
        							oyuncu1slot3saldırıgücü = 2;
        							oyuncu1turhamle3 = 1;
        							break;
        						}
        							if(k==4) {
        							oyuncu1deste.set(k, "alevtopu");
        							oyuncu1destekart.set(k, alevtopu);
        							oyuncu1slot4saldırıgücü = 2;
        							oyuncu1turhamle4 = 1;
        							break;
        						}
        							if(k==5) {
        							oyuncu1deste.set(k, "alevtopu");
        							oyuncu1destekart.set(k, alevtopu);
        							oyuncu1slot5saldırıgücü = 2;
        							oyuncu1turhamle5 = 1;
        							break;
        						}
        							if(k==6) {
        							oyuncu1deste.set(k, "alevtopu");
        							oyuncu1destekart.set(k, alevtopu);
        							oyuncu1slot6saldırıgücü = 2;
        							oyuncu1turhamle6 = 1;
        							break;
        						}
        							if(k==7) {
        							oyuncu1deste.set(k, "alevtopu");
        							oyuncu1destekart.set(k, alevtopu);
        							oyuncu1slot7saldırıgücü = 2;
        							oyuncu1turhamle7 = 1;
        							break;
        						}
        							if(k==8) {
        							oyuncu1deste.set(k, "alevtopu");
        							oyuncu1destekart.set(k, alevtopu);
        							oyuncu1slot8saldırıgücü = 2;
        							oyuncu1turhamle8 = 1;
        							break;
        						}
        					
        						}
        					}
        				}
        				
        				if(oyuncu1deste.get(oyuncu1saldir).equals("kışla")) {
        					oyuncu1deste.set(oyuncu1saldir, " ");
        					oyuncu1destekart.set(oyuncu1saldir, bosluk);
        					while(büyüloopu==1) {
        						if(durbi!=1) {
            				System.out.println("\noyuncu 1 in kartları = \n0. " + oyuncu1deste.get(0) + "\n1. " + oyuncu1deste.get(1) + "\n2. " + oyuncu1deste.get(2) + "\n3. " + oyuncu1deste.get(3) + "\n4. " + oyuncu1deste.get(4) + "\n5. " + oyuncu1deste.get(5) + "\n6. " + oyuncu1deste.get(6) + "\n7. " + oyuncu1deste.get(7) + "\n8. " + oyuncu1deste.get(8) + "\n9. kart özelliklerini görüntüleme\n10.çıkış" );
        					System.out.println("\naskere dönüştürmek istediğiniz kartı seçiniz.");
        						}
        						durbi = 0;
        					büyühedefi = input.nextInt();
        					
        					if(büyühedefi == 10) {
        						oyuncu1deste.set(oyuncu1saldir, "kışla");
        						oyuncu1destekart.set(oyuncu1saldir, kışla);
        						durbi=0;
        						break;	
        					}
        					else if(büyühedefi == 9) {
        						while(büyülooopu==1) {
                    				System.out.println("\noyuncu 1 in kartları = \n0. " + oyuncu1deste.get(0) + "\n1. " + oyuncu1deste.get(1) + "\n2. " + oyuncu1deste.get(2) + "\n3. " + oyuncu1deste.get(3) + "\n4. " + oyuncu1deste.get(4) + "\n5. " + oyuncu1deste.get(5) + "\n6. " + oyuncu1deste.get(6) + "\n7. " + oyuncu1deste.get(7) + "\n8. " + oyuncu1deste.get(8) + "\n10.çıkış" );
        						oyuncu1ozellikogren = input.nextInt();
        						if(oyuncu1ozellikogren< 9 && oyuncu1ozellikogren > -1) {
        							if(oyuncu1ozellikogren==0)
        	        					System.out.println("\nkart - " + oyuncu1deste.get(oyuncu1ozellikogren) + "\nsaldırı gücü = " + oyuncu1slot0saldırıgücü + "\ncan = " + oyuncu1slot0can + "\nözellik = " + oyuncu1destekart.get(oyuncu1ozellikogren).özellik + "\n");
        	        				
        							else if(oyuncu1ozellikogren==1)
        	                			System.out.println("\nkart - " + oyuncu1deste.get(oyuncu1ozellikogren) + "\nsaldırı gücü = " + oyuncu1slot1saldırıgücü + "\ncan = " + oyuncu1slot1can + "\nözellik = " + oyuncu1destekart.get(oyuncu1ozellikogren).özellik + "\n");
        	        				
        							else if(oyuncu1ozellikogren==2)
        	                			System.out.println("\nkart - " + oyuncu1deste.get(oyuncu1ozellikogren) + "\nsaldırı gücü = " + oyuncu1slot2saldırıgücü + "\ncan = " + oyuncu1slot2can + "\nözellik = " + oyuncu1destekart.get(oyuncu1ozellikogren).özellik + "\n");
        	        				
        							else if(oyuncu1ozellikogren==3)
        	                			System.out.println("\nkart - " + oyuncu1deste.get(oyuncu1ozellikogren) + "\nsaldırı gücü = " + oyuncu1slot3saldırıgücü + "\ncan = " + oyuncu1slot3can + "\nözellik = " + oyuncu1destekart.get(oyuncu1ozellikogren).özellik + "\n");
        	        				
        							else if(oyuncu1ozellikogren==4)
        	                			System.out.println("\nkart - " + oyuncu1deste.get(oyuncu1ozellikogren) + "\nsaldırı gücü = " + oyuncu1slot4saldırıgücü + "\ncan = " + oyuncu1slot4can + "\nözellik = " + oyuncu1destekart.get(oyuncu1ozellikogren).özellik + "\n");
        	        				
        							else if(oyuncu1ozellikogren==5)
        	                			System.out.println("\nkart - " + oyuncu1deste.get(oyuncu1ozellikogren) + "\nsaldırı gücü = " + oyuncu1slot5saldırıgücü + "\ncan = " + oyuncu1slot5can + "\nözellik = " + oyuncu1destekart.get(oyuncu1ozellikogren).özellik + "\n");
        	        				
        							else if(oyuncu1ozellikogren==6)
        	                			System.out.println("\nkart - " + oyuncu1deste.get(oyuncu1ozellikogren) + "\nsaldırı gücü = " + oyuncu1slot6saldırıgücü + "\ncan = " + oyuncu1slot6can + "\nözellik = " + oyuncu1destekart.get(oyuncu1ozellikogren).özellik + "\n");
        	        				
        							else if(oyuncu1ozellikogren==7)
        	                			System.out.println("\nkart - " + oyuncu1deste.get(oyuncu1ozellikogren) + "\nsaldırı gücü = " + oyuncu1slot7saldırıgücü + "\ncan = " + oyuncu1slot7can + "\nözellik = " + oyuncu1destekart.get(oyuncu1ozellikogren).özellik + "\n");
        	        				
        							else if(oyuncu1ozellikogren==8)
        	                			System.out.println("\nkart - " + oyuncu1deste.get(oyuncu1ozellikogren) + "\nsaldırı gücü = " + oyuncu1slot8saldırıgücü + "\ncan = " + oyuncu1slot8can + "\nözellik = " + oyuncu1destekart.get(oyuncu1ozellikogren).özellik + "\n");
        						}
        						else if(oyuncu1ozellikogren==10) {
        							durbi=1;
        							break;
        						}
        						else
        							System.out.println("geçersiz değer");
        						}
        					}
        					else if(büyühedefi  == 0 || büyühedefi == 1 || büyühedefi == 2 || büyühedefi == 3 || büyühedefi == 4 || büyühedefi == 5 || büyühedefi == 6 || büyühedefi == 7 || büyühedefi == 8) {
        						if(oyuncu1deste.get(büyühedefi).equals(" ") || oyuncu1deste.get(büyühedefi).equals("asker"))
        							System.out.println("\ngeçersiz değer");
        						else {
        							System.out.println(oyuncu1deste.get(büyühedefi) + " kartı asker kartına dönüştürüldü.");
        							oyuncu1deste.set(büyühedefi, "asker");
        							oyuncu1destekart.set(büyühedefi, asker);
        							if(büyühedefi  == 0) {
        								oyuncu1slot0saldırıgücü=3;
        								oyuncu1slot0can=5;
        							}
        							if(büyühedefi == 1) {
        								oyuncu1slot1saldırıgücü=3;
        								oyuncu1slot1can=5;
        							}
        							if(büyühedefi == 2) {
        								oyuncu1slot2saldırıgücü=3;
        								oyuncu1slot2can=5;
        							}
        							if(büyühedefi == 3) {
        								oyuncu1slot3saldırıgücü=3;
        								oyuncu1slot3can=5;
        							}
        							if(büyühedefi == 4) {
        								oyuncu1slot4saldırıgücü=3;
        								oyuncu1slot4can=5;
        							}
        							if(büyühedefi == 5) {
        								oyuncu1slot5saldırıgücü=3;
        								oyuncu1slot5can=5;
        							}
        							if(büyühedefi == 6) {
        								oyuncu1slot6saldırıgücü=3;
        								oyuncu1slot6can=5;
        							}
        							if(büyühedefi == 7) {
        								oyuncu1slot7saldırıgücü=3;
        								oyuncu1slot7can=5;
        							}
        							if(büyühedefi == 8) {
        								oyuncu1slot8saldırıgücü=3;
        								oyuncu1slot8can=5;
        							}
        							
        							break;
        						}
        					}
        				}
        				}
        				
        				
        				System.out.println("\noyuncu 1 in kartları = \n0. " + oyuncu1deste.get(0) + "\n1. " + oyuncu1deste.get(1) + "\n2. " + oyuncu1deste.get(2) + "\n3. " + oyuncu1deste.get(3) + "\n4. " + oyuncu1deste.get(4) + "\n5. " + oyuncu1deste.get(5) + "\n6. " + oyuncu1deste.get(6) + "\n7. " + oyuncu1deste.get(7) + "\n8. " + oyuncu1deste.get(8) + "\n9. kart özelliklerini görüntüleme\n10.çıkış" );
        			
        			
        			
        			
        			}
        			
        			else {
        				if(oyuncu1saldir==0)
        			System.out.println("seçtiğiniz kart " + oyuncu1deste.get(oyuncu1saldir) + "(saldırı gücü " + oyuncu1slot0saldırıgücü +")");
        				else if(oyuncu1saldir==1)
                			System.out.println("seçtiğiniz kart " + oyuncu1deste.get(oyuncu1saldir) + "(saldırı gücü " + oyuncu1slot1saldırıgücü +")");
        				else if(oyuncu1saldir==2)
                			System.out.println("seçtiğiniz kart " + oyuncu1deste.get(oyuncu1saldir) + "(saldırı gücü " + oyuncu1slot2saldırıgücü +")");
        				else if(oyuncu1saldir==3)
                			System.out.println("seçtiğiniz kart " + oyuncu1deste.get(oyuncu1saldir) + "(saldırı gücü " + oyuncu1slot3saldırıgücü +")");
        				else if(oyuncu1saldir==4)
                			System.out.println("seçtiğiniz kart " + oyuncu1deste.get(oyuncu1saldir) + "(saldırı gücü " + oyuncu1slot4saldırıgücü +")");
        				else if(oyuncu1saldir==5)
                			System.out.println("seçtiğiniz kart " + oyuncu1deste.get(oyuncu1saldir) + "(saldırı gücü " + oyuncu1slot5saldırıgücü +")");
        				else if(oyuncu1saldir==6)
                			System.out.println("seçtiğiniz kart " + oyuncu1deste.get(oyuncu1saldir) + "(saldırı gücü " + oyuncu1slot6saldırıgücü +")");
        				else if(oyuncu1saldir==7)
                			System.out.println("seçtiğiniz kart " + oyuncu1deste.get(oyuncu1saldir) + "(saldırı gücü " + oyuncu1slot7saldırıgücü +")");
        				else if(oyuncu1saldir==8)
                			System.out.println("seçtiğiniz kart " + oyuncu1deste.get(oyuncu1saldir) + "(saldırı gücü " + oyuncu1slot8saldırıgücü +")");
        				
        			
        			if(oyuncu1deste.get(oyuncu1saldir).equals("alevtopu")) {
	        			oyuncu1deste.set(oyuncu1saldir, " ");
	        			oyuncu1destekart.set(oyuncu1saldir, bosluk);
	        		}
	        		
	        		if(oyuncu1deste.get(oyuncu1saldir).equals("meteor")) {
	        			oyuncu1deste.set(oyuncu1saldir, " ");
	        			oyuncu1destekart.set(oyuncu1saldir, bosluk);
	        		}
	        		
        			if(deste2boş == 1 || deste2ye == 1) {
        				System.out.println("rakibinizin destesi boş, oyuncuya saldırılacak.");
        				oyuncu2cani = oyuncu2cani - oyuncu1vurmagücü;
        				System.out.println("oyuncu 2 nin canı = " + oyuncu2cani);
        			}
        			else {
        				saldirloop1=1;
        				while(saldirloop1 == 1) {
        			System.out.println("\nlütfen saldıracağınız kartı seçiniz.");
        	        System.out.println("\noyuncu 2 nin kartları = \n0. " + oyuncu2deste.get(0) + "\n1. " + oyuncu2deste.get(1) + "\n2. " + oyuncu2deste.get(2) + "\n3. " + oyuncu2deste.get(3) + "\n4. " + oyuncu2deste.get(4) + "\n5. " + oyuncu2deste.get(5) + "\n6. " + oyuncu2deste.get(6) + "\n7. " + oyuncu2deste.get(7) + "\n8. " + oyuncu2deste.get(8) + "\n9. kart özelliklerini görüntüleme\n10.çıkış" );
        	        oyuncu1saldiri = input.nextInt();
        	        input.nextLine();
        	        
        	        if(oyuncu2deste.get(oyuncu1saldiri).equals(" ") || oyuncu2deste.get(oyuncu1saldiri).equals("değnek") || oyuncu2deste.get(oyuncu1saldiri).equals("kışla") || oyuncu2deste.get(oyuncu1saldiri).equals("panayır") || oyuncu2deste.get(oyuncu1saldiri).equals("alevtopu") || oyuncu2deste.get(oyuncu1saldiri).equals("zırh") || oyuncu2deste.get(oyuncu1saldiri).equals("meteor") || oyuncu2deste.get(oyuncu1saldiri).equals("alevtopları") || oyuncu2deste.get(oyuncu1saldiri).equals("dolunay") || oyuncu2deste.get(oyuncu1saldiri).equals("kıyamet"))
        	        	System.out.println("seçiminiz geçersiz");
        	        else {

        	        	if(oyuncu1saldiri==0)
        	        		oyuncu2dayanmagücü = oyuncu2slot0can;
        	        	if(oyuncu1saldiri==1)
        	        		oyuncu2dayanmagücü = oyuncu2slot1can;
        	        	if(oyuncu1saldiri==2)
        	        		oyuncu2dayanmagücü = oyuncu2slot2can;
        	        	if(oyuncu1saldiri==3)
        	        		oyuncu2dayanmagücü = oyuncu2slot3can;
        	        	if(oyuncu1saldiri==4)
        	        		oyuncu2dayanmagücü = oyuncu2slot4can;
        	        	if(oyuncu1saldiri==5)
        	        		oyuncu2dayanmagücü = oyuncu2slot5can;
        	        	if(oyuncu1saldiri==6)
        	        		oyuncu2dayanmagücü = oyuncu2slot6can;
        	        	if(oyuncu1saldiri==7)
        	        		oyuncu2dayanmagücü = oyuncu2slot7can;
        	        	if(oyuncu1saldiri==8)
        	        		oyuncu2dayanmagücü = oyuncu2slot8can;
        	        	
        	        	if(oyuncu1vurmagücü > 0) {
        	        		
        	        	if(oyuncu1vurmagücü >= oyuncu2dayanmagücü) {
        	        		
        	        		if(oyuncu2deste.get(oyuncu1saldiri).equals("asya")) {
        	        			if(oyuncu1saldiri==0) {
        	        				oyuncu2asya0 = 3;
        	        			}
        	        			if(oyuncu1saldiri==1) {
        	        				oyuncu2asya1 = 3;
        	        			}
        	        			if(oyuncu1saldiri==2) {
        	        				oyuncu2asya2 = 3;
        	        			}
        	        			if(oyuncu1saldiri==3) {
        	        				oyuncu2asya3 = 3;
        	        			}
        	        			if(oyuncu1saldiri==4) {
        	        				oyuncu2asya4 = 3;
        	        			}
        	        			if(oyuncu1saldiri==5) {
        	        				oyuncu2asya5 = 3;
        	        			}
        	        			if(oyuncu1saldiri==6) {
        	        				oyuncu2asya6 = 3;
        	        			}
        	        			if(oyuncu1saldiri==7) {
        	        				oyuncu2asya7 = 3;
        	        			}
        	        			if(oyuncu1saldiri==8) {
        	        				oyuncu2asya8 = 3;
        	        			}
        	        			
        	        		}
        	        		
        	        		if(oyuncu2deste.get(oyuncu1saldiri).equals("kıyametalameti")) {
        	        			if(oyuncu1saldiri==0) {
        	        				System.out.println("kıyamet durduruldu.");
        	        				oyuncu2kıyamet0 = 0;
        	        			}
        	        			if(oyuncu1saldiri==1) {
        	        				System.out.println("kıyamet durduruldu.");
        	        				oyuncu2kıyamet1 = 0;
        	        			}
        	        			if(oyuncu1saldiri==2) {
        	        				System.out.println("kıyamet durduruldu.");
        	        				oyuncu2kıyamet2 = 0;
        	        			}
        	        			if(oyuncu1saldiri==3) {
        	        				System.out.println("kıyamet durduruldu.");
        	        				oyuncu2kıyamet3 = 0;
        	        			}
        	        			if(oyuncu1saldiri==4) {
        	        				System.out.println("kıyamet durduruldu.");
        	        				oyuncu2kıyamet4 = 0;
        	        			}
        	        			if(oyuncu1saldiri==5) {
        	        				System.out.println("kıyamet durduruldu.");
        	        				oyuncu2kıyamet5 = 0;
        	        			}
        	        			if(oyuncu1saldiri==6) {
        	        				System.out.println("kıyamet durduruldu.");
        	        				oyuncu2kıyamet6 = 0;
        	        			}
        	        			if(oyuncu1saldiri==7) {
        	        				System.out.println("kıyamet durduruldu.");
        	        				oyuncu2kıyamet7 = 0;
        	        			}
        	        			if(oyuncu1saldiri==8) {
        	        				System.out.println("kıyamet durduruldu.");
        	        				oyuncu2kıyamet8 = 0;
        	        			}
        	        			
        	        			}
        	        		
        	        		
        	        		System.out.println("oyuncu 2 nin kartı öldürüldü.");
        	        		oyuncu2destekart.set(oyuncu1saldiri, bosluk);
        	        		oyuncu2deste.set(oyuncu1saldiri, " ");
        	        		oyuncu2dayanmagücü = 0;
        	        		
        	        		for(k = 0; k < 9; k++) {
    				        	
    				        	if(oyuncu2deste.get(k).equals(" "))
    				        		deste2boş = 1;
    				        	
    				        	else {
    				        		deste2boş = 0;
    				        		break;
    				        	}
    				        		}
    				        
    				        for(k = 0; k < 9; k++) {
    				        	
    				        	if(oyuncu2deste.get(k).equals(" ") || oyuncu2deste.get(k).equals("değnek") || oyuncu2deste.get(k).equals("kışla") || oyuncu2deste.get(k).equals("panayır") || oyuncu2deste.get(k).equals("alevtopu") || oyuncu2deste.get(k).equals("zırh") || oyuncu2deste.get(k).equals("meteor") || oyuncu2deste.get(k).equals("alevtopları") || oyuncu2deste.get(k).equals("dolunay") || oyuncu2deste.get(k).equals("kıyamet"))
    				        		saldirloop1=0;
    				        	else {
    				        		deste2ye = 0;
    				        		saldirloop1=1;
    				        		break;
    				        	
    				        	}
    				        		}
    				        
    				        for(k = 0; k < 9; k++) {
    				        	
    				        	if(oyuncu1deste.get(k).equals(" "))
    				        		deste1boş = 1;
    				        	
    				        	else {
    				        		deste1boş = 0;
    				        		break;
    				        		}
    				        		}
    				        
    				        for(k = 0; k < 9; k++) {
    				        	
    				        	if(oyuncu1deste.get(k).equals(" ") || oyuncu1deste.get(k).equals("değnek") || oyuncu1deste.get(k).equals("kışla") || oyuncu1deste.get(k).equals("panayır") || oyuncu1deste.get(k).equals("alevtopu") || oyuncu1deste.get(k).equals("zırh") || oyuncu1deste.get(k).equals("meteor") || oyuncu1deste.get(k).equals("alevtopları") || oyuncu1deste.get(k).equals("dolunay") || oyuncu1deste.get(k).equals("kıyamet"))
    				        		deste1ye=1;
    				        	else {
    				        		deste1ye = 0;
    				        		break;
    				        	}
    				        		}
    				        
            		        System.out.println("\noyuncu 1 in kartları = \n0. " + oyuncu1deste.get(0) + "\n1. " + oyuncu1deste.get(1) + "\n2. " + oyuncu1deste.get(2) + "\n3. " + oyuncu1deste.get(3) + "\n4. " + oyuncu1deste.get(4) + "\n5. " + oyuncu1deste.get(5) + "\n6. " + oyuncu1deste.get(6) + "\n7. " + oyuncu1deste.get(7) + "\n8. " + oyuncu1deste.get(8) + "\n9. kart özelliklerini görüntüleme\n10.çıkış" );
        	        	}
        	        	
        	        	else if(oyuncu1vurmagücü < oyuncu2dayanmagücü) {
        	        		System.out.println("kalan can = " + (oyuncu2dayanmagücü - oyuncu1vurmagücü));
        	        		
        	        		
        	        		if(oyuncu1saldiri==0)
            	        		oyuncu2slot0can = oyuncu2dayanmagücü - oyuncu1vurmagücü;
        	        		if(oyuncu1saldiri==1)
            	        		oyuncu2slot1can = oyuncu2dayanmagücü - oyuncu1vurmagücü;
        	        		if(oyuncu1saldiri==2)
            	        		oyuncu2slot2can = oyuncu2dayanmagücü - oyuncu1vurmagücü;
        	        		if(oyuncu1saldiri==3)
            	        		oyuncu2slot3can = oyuncu2dayanmagücü - oyuncu1vurmagücü;
        	        		if(oyuncu1saldiri==4)
            	        		oyuncu2slot4can = oyuncu2dayanmagücü - oyuncu1vurmagücü;
        	        		if(oyuncu1saldiri==5)
            	        		oyuncu2slot5can = oyuncu2dayanmagücü - oyuncu1vurmagücü;
        	        		if(oyuncu1saldiri==6)
            	        		oyuncu2slot6can = oyuncu2dayanmagücü - oyuncu1vurmagücü;
        	        		if(oyuncu1saldiri==7)
            	        		oyuncu2slot7can = oyuncu2dayanmagücü - oyuncu1vurmagücü;
        	        		if(oyuncu1saldiri==8)
            	        		oyuncu2slot8can = oyuncu2dayanmagücü - oyuncu1vurmagücü;
        	        		
        	        		if(oyuncu1deste.get(oyuncu1saldir).equals("meteor")) {
        	        			oyuncu1deste.set(oyuncu1saldir, " ");
        	        			oyuncu1destekart.set(oyuncu1saldir, bosluk);
        	        		}
        	        		
        	        		if(oyuncu1deste.get(oyuncu1saldir).equals("alevtopu")) {
        	        			oyuncu1deste.set(oyuncu1saldir, " ");
        	        			oyuncu1destekart.set(oyuncu1saldir, bosluk);
        	        		}            	        	
            		        System.out.println("\noyuncu 1 in kartları = \n0. " + oyuncu1deste.get(0) + "\n1. " + oyuncu1deste.get(1) + "\n2. " + oyuncu1deste.get(2) + "\n3. " + oyuncu1deste.get(3) + "\n4. " + oyuncu1deste.get(4) + "\n5. " + oyuncu1deste.get(5) + "\n6. " + oyuncu1deste.get(6) + "\n7. " + oyuncu1deste.get(7) + "\n8. " + oyuncu1deste.get(8) + "\n9. kart özelliklerini görüntüleme\n10.çıkış" );
        	        	}
        	        	saldirloop1=0;
        	        	}
        	        	saldirloop1=0;
        	        }
        			}
        			}
        			}
        		}
        		
        		if(oyuncu1saldir == 10)
        			break;
        }
        else 
        	System.out.println("geçersiz değer");
            
            
        }
        oyuncu1saldirduzgun = 1;
        }
        else
        	System.out.println("\noyuncu 1 in hiçbir kartı yok");
        


	if(deste2boş == 0) {

	        System.out.println("oyuncu 2. saldırıyor\n");
	        System.out.println("\noyuncu 2 in kartları = \n0. " + oyuncu2deste.get(0) + "\n1. " + oyuncu2deste.get(1) + "\n2. " + oyuncu2deste.get(2) + "\n3. " + oyuncu2deste.get(3) + "\n4. " + oyuncu2deste.get(4) + "\n5. " + oyuncu2deste.get(5) + "\n6. " + oyuncu2deste.get(6) + "\n7. " + oyuncu2deste.get(7) + "\n8. " + oyuncu2deste.get(8) + "\n9. kart özelliklerini görüntüleme\n10.çıkış" );
	        
	        oyuncu2saldirduzgun = 1;
	        while(oyuncu2saldirduzgun == 1) {
	        	oyuncu2saldir = input.nextInt();
	        	
	        	if(-1 < oyuncu2saldir || oyuncu2saldir < 11) {
	        		if(oyuncu2saldir!=10) {
	        			while(looop==1) {
	        				if(oyuncu2saldir == 0 && oyuncu2turhamle0 == 1) {
	        					oyuncu2turhamle0 = 0;
	        					looop=0;
	        				}
	        				else if(oyuncu2saldir == 1 && oyuncu2turhamle1 == 1) {
	        					oyuncu2turhamle1 = 0;
	        					looop=0;
	        				} 
	        				else if(oyuncu2saldir == 2 && oyuncu2turhamle2 == 1) {
	        					oyuncu2turhamle2 = 0;
	        					looop=0;
	        				} 
	        				else if(oyuncu2saldir == 3 && oyuncu2turhamle3 == 1) {
	        					oyuncu2turhamle3 = 0;
	        					looop=0;
	        				} 
	        				else if(oyuncu2saldir == 4 && oyuncu2turhamle4 == 1) {
	        					oyuncu2turhamle4 = 0;
	        					looop=0;
	        				} 
	        				else if(oyuncu2saldir == 5 && oyuncu2turhamle5 == 1) {
	        					oyuncu2turhamle5 = 0;
	        					looop=0;
	        				} 
	        				else if(oyuncu2saldir == 6 && oyuncu2turhamle6 == 1) {
	        					oyuncu2turhamle6 = 0;
	        					looop=0;
	        				} 
	        				else if(oyuncu2saldir == 7 && oyuncu2turhamle7 == 1) {
	        					oyuncu2turhamle7 = 0;
	        					looop=0;
	        				} 
	        				else if(oyuncu2saldir == 8 && oyuncu2turhamle8 == 1) {
	        					oyuncu2turhamle8 = 0;
	        					looop=0;
	        				} 
	        				else if(oyuncu2saldir == 0 && oyuncu2turhamle0 == 0) {
	        					System.out.println("zaten bu seçeneğinizi kullandınız. lütfen başka seçiniz.");  
	        					oyuncu2saldir = input.nextInt();
	        					
	        				}
	        				else if(oyuncu2saldir == 1 && oyuncu2turhamle1 == 0) {
	        					System.out.println("zaten bu seçeneğinizi kullandınız. lütfen başka seçiniz.");        				
	        					oyuncu2saldir = input.nextInt();

	        				} 
	        				else if(oyuncu2saldir == 2 && oyuncu2turhamle2 == 0) {
	        					System.out.println("zaten bu seçeneğinizi kullandınız. lütfen başka seçiniz.");        				
	        					oyuncu2saldir = input.nextInt();

	        				} 
	        				else if(oyuncu2saldir == 3 && oyuncu2turhamle3 == 0) {
	        					System.out.println("zaten bu seçeneğinizi kullandınız. lütfen başka seçiniz.");        				
	        					oyuncu2saldir = input.nextInt();

	        				} 
	        				else if(oyuncu2saldir == 4 && oyuncu2turhamle4 == 0) {
	        					System.out.println("zaten bu seçeneğinizi kullandınız. lütfen başka seçiniz.");        				
	        					oyuncu2saldir = input.nextInt();

	        				} 
	        				else if(oyuncu2saldir == 5 && oyuncu2turhamle5 == 0) {
	        					System.out.println("zaten bu seçeneğinizi kullandınız. lütfen başka seçiniz.");        				
	        					oyuncu2saldir = input.nextInt();

	        				} 
	        				else if(oyuncu2saldir == 6 && oyuncu2turhamle6 == 0) {
	        					System.out.println("zaten bu seçeneğinizi kullandınız. lütfen başka seçiniz.");        				
	        					oyuncu2saldir = input.nextInt();

	        				} 
	        				else if(oyuncu2saldir == 7 && oyuncu2turhamle7 == 0) {
	        					System.out.println("zaten bu seçeneğinizi kullandınız. lütfen başka seçiniz.");        				
	        					oyuncu2saldir = input.nextInt();

	        				} 
	        				else if(oyuncu2saldir == 8 && oyuncu2turhamle8 == 0) {
	        					System.out.println("zaten bu seçeneğinizi kullandınız. lütfen başka seçiniz.");        				
	        					oyuncu2saldir = input.nextInt();
	        				}
	        				else if(oyuncu2saldir == 9)
	        						break;
	        				else if (oyuncu2saldir == 10)
	        						break;

	        				} 
	        		}
	        	looop=1;
	        		while(looop == 1) {
	        		if(oyuncu2saldir == 9) {
	        			
	        			
	        			System.out.println("çıkış yapmak için 10, özellik öğrenmek için kartın numarasını yazınız.");
	        			oyuncu2ozellikogren = input.nextInt();
	        			input.nextLine();
	        			if(oyuncu2ozellikogren == 10) {
	        				System.out.println("oyuncu 2. saldırıyor\n");
	        		        System.out.println("\noyuncu 2 in kartları = \n0. " + oyuncu2deste.get(0) + "\n1. " + oyuncu2deste.get(1) + "\n2. " + oyuncu2deste.get(2) + "\n3. " + oyuncu2deste.get(3) + "\n4. " + oyuncu2deste.get(4) + "\n5. " + oyuncu2deste.get(5) + "\n6. " + oyuncu2deste.get(6) + "\n7. " + oyuncu2deste.get(7) + "\n8. " + oyuncu2deste.get(8) + "\n9. kart özelliklerini görüntüleme\n10.çıkış" );
	        		        oyuncu2saldir = input.nextInt();
	        		        input.nextLine();
	        		        if(oyuncu2saldir!=10) {
	                			while(looop==1) {
	                				if(oyuncu2saldir == 0 && oyuncu2turhamle0 == 1) {
	                					oyuncu2turhamle0 = 0;
	                					looop=0;
	                				}
	                				else if(oyuncu2saldir == 1 && oyuncu2turhamle1 == 1) {
	                					oyuncu2turhamle1 = 0;
	                					looop=0;
	                				} 
	                				else if(oyuncu2saldir == 2 && oyuncu2turhamle2 == 1) {
	                					oyuncu2turhamle2 = 0;
	                					looop=0;
	                				} 
	                				else if(oyuncu2saldir == 3 && oyuncu2turhamle3 == 1) {
	                					oyuncu2turhamle3 = 0;
	                					looop=0;
	                				} 
	                				else if(oyuncu2saldir == 4 && oyuncu2turhamle4 == 1) {
	                					oyuncu2turhamle4 = 0;
	                					looop=0;
	                				} 
	                				else if(oyuncu2saldir == 5 && oyuncu2turhamle5 == 1) {
	                					oyuncu2turhamle5 = 0;
	                					looop=0;
	                				} 
	                				else if(oyuncu2saldir == 6 && oyuncu2turhamle6 == 1) {
	                					oyuncu2turhamle6 = 0;
	                					looop=0;
	                				} 
	                				else if(oyuncu2saldir == 7 && oyuncu2turhamle7 == 1) {
	                					oyuncu2turhamle7 = 0;
	                					looop=0;
	                				} 
	                				else if(oyuncu2saldir == 8 && oyuncu2turhamle8 == 1) {
	                					oyuncu2turhamle8 = 0;
	                					looop=0;
	                				} 
	                				else if(oyuncu2saldir == 0 && oyuncu2turhamle0 == 0) {
	                					System.out.println("zaten bu seçeneğinizi kullandınız. lütfen başka seçiniz.");  
	                					oyuncu2saldir = input.nextInt();
	                					
	                				}
	                				else if(oyuncu2saldir == 1 && oyuncu2turhamle1 == 0) {
	                					System.out.println("zaten bu seçeneğinizi kullandınız. lütfen başka seçiniz.");        				
	                					oyuncu2saldir = input.nextInt();

	                				} 
	                				else if(oyuncu2saldir == 2 && oyuncu2turhamle2 == 0) {
	                					System.out.println("zaten bu seçeneğinizi kullandınız. lütfen başka seçiniz.");        				
	                					oyuncu2saldir = input.nextInt();

	                				} 
	                				else if(oyuncu2saldir == 3 && oyuncu2turhamle3 == 0) {
	                					System.out.println("zaten bu seçeneğinizi kullandınız. lütfen başka seçiniz.");        				
	                					oyuncu2saldir = input.nextInt();

	                				} 
	                				else if(oyuncu2saldir == 4 && oyuncu2turhamle4 == 0) {
	                					System.out.println("zaten bu seçeneğinizi kullandınız. lütfen başka seçiniz.");        				
	                					oyuncu2saldir = input.nextInt();

	                				} 
	                				else if(oyuncu2saldir == 5 && oyuncu2turhamle5 == 0) {
	                					System.out.println("zaten bu seçeneğinizi kullandınız. lütfen başka seçiniz.");        				
	                					oyuncu2saldir = input.nextInt();

	                				} 
	                				else if(oyuncu2saldir == 6 && oyuncu2turhamle6 == 0) {
	                					System.out.println("zaten bu seçeneğinizi kullandınız. lütfen başka seçiniz.");        				
	                					oyuncu2saldir = input.nextInt();

	                				} 
	                				else if(oyuncu2saldir == 7 && oyuncu2turhamle7 == 0) {
	                					System.out.println("zaten bu seçeneğinizi kullandınız. lütfen başka seçiniz.");        				
	                					oyuncu2saldir = input.nextInt();

	                				} 
	                				else if(oyuncu2saldir == 8 && oyuncu2turhamle8 == 0) {
	                					System.out.println("zaten bu seçeneğinizi kullandınız. lütfen başka seçiniz.");        				
	                					oyuncu2saldir = input.nextInt();
	                				}
	                				else if(oyuncu2saldir == 9)
	                						break;
	                				else if (oyuncu2saldir == 10)
	                						break;

	                				} 
	                		}
	                	looop=1;
	        				
	        			}
	        			else
	        				if(oyuncu2ozellikogren==0)
	        					System.out.println("\nkart - " + oyuncu1deste.get(oyuncu2ozellikogren) + "\nsaldırı gücü = " + oyuncu1slot0saldırıgücü + "\ncan = " + oyuncu1slot0can + "\nözellik = " + oyuncu1destekart.get(oyuncu2ozellikogren).özellik + "\n");
	        				
							else if(oyuncu2ozellikogren==1)
	                			System.out.println("\nkart - " + oyuncu1deste.get(oyuncu2ozellikogren) + "\nsaldırı gücü = " + oyuncu1slot1saldırıgücü + "\ncan = " + oyuncu1slot1can + "\nözellik = " + oyuncu1destekart.get(oyuncu2ozellikogren).özellik + "\n");
	        				
							else if(oyuncu2ozellikogren==2)
	                			System.out.println("\nkart - " + oyuncu1deste.get(oyuncu2ozellikogren) + "\nsaldırı gücü = " + oyuncu1slot2saldırıgücü + "\ncan = " + oyuncu1slot2can + "\nözellik = " + oyuncu1destekart.get(oyuncu2ozellikogren).özellik + "\n");
	        				
							else if(oyuncu2ozellikogren==3)
	                			System.out.println("\nkart - " + oyuncu1deste.get(oyuncu2ozellikogren) + "\nsaldırı gücü = " + oyuncu1slot3saldırıgücü + "\ncan = " + oyuncu1slot3can + "\nözellik = " + oyuncu1destekart.get(oyuncu2ozellikogren).özellik + "\n");
	        				
							else if(oyuncu2ozellikogren==4)
	                			System.out.println("\nkart - " + oyuncu1deste.get(oyuncu2ozellikogren) + "\nsaldırı gücü = " + oyuncu1slot4saldırıgücü + "\ncan = " + oyuncu1slot4can + "\nözellik = " + oyuncu1destekart.get(oyuncu2ozellikogren).özellik + "\n");
	        				
							else if(oyuncu2ozellikogren==5)
	                			System.out.println("\nkart - " + oyuncu1deste.get(oyuncu2ozellikogren) + "\nsaldırı gücü = " + oyuncu1slot5saldırıgücü + "\ncan = " + oyuncu1slot5can + "\nözellik = " + oyuncu1destekart.get(oyuncu2ozellikogren).özellik + "\n");
	        				
							else if(oyuncu2ozellikogren==6)
	                			System.out.println("\nkart - " + oyuncu1deste.get(oyuncu2ozellikogren) + "\nsaldırı gücü = " + oyuncu1slot6saldırıgücü + "\ncan = " + oyuncu1slot6can + "\nözellik = " + oyuncu1destekart.get(oyuncu2ozellikogren).özellik + "\n");
	        				
							else if(oyuncu2ozellikogren==7)
	                			System.out.println("\nkart - " + oyuncu1deste.get(oyuncu2ozellikogren) + "\nsaldırı gücü = " + oyuncu1slot7saldırıgücü + "\ncan = " + oyuncu1slot7can + "\nözellik = " + oyuncu1destekart.get(oyuncu2ozellikogren).özellik + "\n");
	        				
							else if(oyuncu2ozellikogren==8)
	                			System.out.println("\nkart - " + oyuncu1deste.get(oyuncu2ozellikogren) + "\nsaldırı gücü = " + oyuncu1slot8saldırıgücü + "\ncan = " + oyuncu1slot8can + "\nözellik = " + oyuncu1destekart.get(oyuncu2ozellikogren).özellik + "\n");	        			
	        		}
	        		else
	        			looop = 0;
	        		}
	        		looop=1;
	        		
	        		if(oyuncu2saldir==0)
		        		oyuncu2vurmagücü = oyuncu2slot0saldırıgücü;
		        	if(oyuncu2saldir==1)
		        		oyuncu2vurmagücü = oyuncu2slot1saldırıgücü;
		        	if(oyuncu2saldir==2)
		        		oyuncu2vurmagücü = oyuncu2slot2saldırıgücü;
		        	if(oyuncu2saldir==3)
		        		oyuncu2vurmagücü = oyuncu2slot3saldırıgücü;
		        	if(oyuncu2saldir==4)
		        		oyuncu2vurmagücü = oyuncu2slot4saldırıgücü;
		        	if(oyuncu2saldir==5)
		        		oyuncu2vurmagücü = oyuncu2slot5saldırıgücü;
		        	if(oyuncu2saldir==6)
		        		oyuncu2vurmagücü = oyuncu2slot6saldırıgücü;
		        	if(oyuncu2saldir==7)
		        		oyuncu2vurmagücü = oyuncu2slot7saldırıgücü;
		        	if(oyuncu2saldir==8)
		        		oyuncu2vurmagücü = oyuncu2slot8saldırıgücü;
		        	
	        			
	        			
	        			if(oyuncu2saldir != 10) {
	        			if(oyuncu2deste.get(oyuncu2saldir).equals(" "))
	        				System.out.println("seçiminiz boş");
	        			else if (oyuncu2deste.get(oyuncu2saldir).equals("panayır") || oyuncu2deste.get(oyuncu2saldir).equals("zırh") || oyuncu2deste.get(oyuncu2saldir).equals("dolunay") || oyuncu2deste.get(oyuncu2saldir).equals("alevtopları") || oyuncu2deste.get(oyuncu2saldir).equals("kışla") || oyuncu2deste.get(oyuncu2saldir).equals("kıyamet") || oyuncu2deste.get(oyuncu2saldir).equals("değnek")){
	        				
	        				if(oyuncu2deste.get(oyuncu2saldir).equals("değnek")) {
	        					
	        					 for(k = 0; k < 9; k++) {
	        				        	
	        				        	if(oyuncu2deste.get(k).equals(" "));
	        				        	
	        				        	else
	        				        		deste2boş = 0;
	        				        		}
	        				        
	        				        for(k = 0; k < 9; k++) {
	        				        	
	        				        	if(oyuncu2deste.get(k).equals(" ") || oyuncu2deste.get(k).equals("değnek") || oyuncu2deste.get(k).equals("kışla") || oyuncu2deste.get(k).equals("panayır") || oyuncu2deste.get(k).equals("alevtopu") || oyuncu2deste.get(k).equals("zırh") || oyuncu2deste.get(k).equals("meteor") || oyuncu2deste.get(k).equals("alevtopları") || oyuncu2deste.get(k).equals("dolunay") || oyuncu2deste.get(k).equals("kıyamet"));
	        				        	
	        				        	else
	        				        		deste2ye = 0;
	        				        		}
	        				        
	        				        for(k = 0; k < 9; k++) {
	        				        	
	        				        	if(oyuncu1deste.get(k).equals(" "));
	        				        	
	        				        	else
	        				        		deste1boş = 0;
	        				        		}
	        				        
	        				        for(k = 0; k < 9; k++) {
	        				        	
	        				        	if(oyuncu1deste.get(k).equals(" ") || oyuncu1deste.get(k).equals("değnek") || oyuncu1deste.get(k).equals("kışla") || oyuncu1deste.get(k).equals("panayır") || oyuncu1deste.get(k).equals("alevtopu") || oyuncu1deste.get(k).equals("zırh") || oyuncu1deste.get(k).equals("meteor") || oyuncu1deste.get(k).equals("alevtopları") || oyuncu1deste.get(k).equals("dolunay") || oyuncu1deste.get(k).equals("kıyamet")); 
	        				        			
	        				        	else
	        				        		deste1ye = 0;
	        				        		}
	        					
	        						if(deste2ye == 1) {
	        							System.out.println("değnek kartı kullanılamaz.");
	        							loop=0;
	        							değnekgiriş=0;
	        							
	        						}
	        						while(loop==1) {
	        							if(durbii!=1)
	        						System.out.println("lütfen kendi destenizden 1 hasar vereceğiniz birimi seçiniz");
	        							else
	        								durbii=0;
	        						büyühedefi = input.nextInt();
	        						durbi=1;
	        						
	        						if(büyühedefi  == 0 ||büyühedefi == 1 ||büyühedefi == 2 ||büyühedefi == 3 ||büyühedefi == 4 ||büyühedefi == 5 ||büyühedefi == 6 ||büyühedefi == 7 ||büyühedefi == 8) {
	        							
	        						
	        							if(oyuncu2deste.get(büyühedefi).equals(" ") || oyuncu2deste.get(büyühedefi).equals("değnek") || oyuncu2deste.get(büyühedefi).equals("kışla") || oyuncu2deste.get(büyühedefi).equals("panayır") || oyuncu2deste.get(büyühedefi).equals("alevtopu") || oyuncu2deste.get(büyühedefi).equals("zırh") || oyuncu2deste.get(büyühedefi).equals("meteor") || oyuncu2deste.get(büyühedefi).equals("alevtopları") || oyuncu2deste.get(büyühedefi).equals("dolunay") || oyuncu2deste.get(büyühedefi).equals("kıyamet"))
	            							System.out.println("geçersiz değer");


	        							
	            							
	        							else {
	        								if(büyühedefi==0) {
	        									oyuncu2slot0can = oyuncu2slot0can - 1;
	        									if(oyuncu2slot0can == 0) {
	        										System.out.println(oyuncu2deste.get(0) + " kartı öldürüldü.");
	        										oyuncu2deste.set(0, " ");
	        										oyuncu2destekart.set(0, bosluk);
	        										oyuncu2slot0saldırıgücü = 0;
	        										oyuncu2slot0can = 0;
	        										break;
	        									}
	        									else {
	        										System.out.println(oyuncu2deste.get(0) +" kartının yeni canı " + oyuncu2slot0can);
	        										break;
	        									}
	        								}
	        								if(büyühedefi==1) {
	        									oyuncu2slot1can = oyuncu2slot1can - 1;
	        									if(oyuncu2slot1can == 0) {
	        										System.out.println(oyuncu2deste.get(1) + " kartı öldürüldü.");
	        										oyuncu2deste.set(1, " ");
	        										oyuncu2destekart.set(1, bosluk);
	        										oyuncu2slot1saldırıgücü = 0;
	        										oyuncu2slot1can = 0;
	        										break;
	        									}
	        									else {
	        										System.out.println(oyuncu2deste.get(1) +" kartının yeni canı " + oyuncu2slot1can);
	        										break;
	        									}
	        								}
	        								if(büyühedefi==2) {
	        									oyuncu2slot2can = oyuncu2slot2can - 1;
	        									if(oyuncu2slot2can == 0) {
	        										System.out.println(oyuncu2deste.get(2) + " kartı öldürüldü.");
	        										oyuncu2deste.set(2, " ");
	        										oyuncu2destekart.set(2, bosluk);
	        										oyuncu2slot2saldırıgücü = 0;
	        										oyuncu2slot2can = 0;
	        										break;
	        									}
	        									else {
	        										System.out.println(oyuncu2deste.get(2) +" kartının yeni canı " + oyuncu2slot2can);
	        										break;
	        									}
	        								}
	        								if(büyühedefi==3) {
	        									oyuncu2slot3can = oyuncu2slot3can - 1;
	        									if(oyuncu2slot3can == 0) {
	        										System.out.println(oyuncu2deste.get(3) + " kartı öldürüldü.");
	        										oyuncu2deste.set(3, " ");
	        										oyuncu2destekart.set(3, bosluk);
	        										oyuncu2slot3saldırıgücü = 0;
	        										oyuncu2slot3can = 0;
	        										break;
	        									}
	        									else {
	        										System.out.println(oyuncu2deste.get(3) +" kartının yeni canı " + oyuncu2slot3can);
	        										break;
	        									}
	        								}
	        								if(büyühedefi==4) {
	        									oyuncu2slot4can = oyuncu2slot4can - 1;
	        									if(oyuncu2slot4can == 0) {
	        										System.out.println(oyuncu2deste.get(4) + " kartı öldürüldü.");
	        										oyuncu2deste.set(4, " ");
	        										oyuncu2destekart.set(4, bosluk);
	        										oyuncu2slot4saldırıgücü = 0;
	        										oyuncu2slot4can = 0;
	        										break;
	        									}
	        									else {
	        										System.out.println(oyuncu2deste.get(4) +" kartının yeni canı " + oyuncu2slot4can);
	        										break;
	        									}
	        								}
	        								if(büyühedefi==5) {
	        									oyuncu2slot5can = oyuncu2slot5can - 1;
	        									if(oyuncu2slot5can == 0) {
	        										System.out.println(oyuncu2deste.get(5) + " kartı öldürüldü.");
	        										oyuncu2deste.set(5, " ");
	        										oyuncu2destekart.set(5, bosluk);
	        										oyuncu2slot5saldırıgücü = 0;
	        										oyuncu2slot5can = 0;
	        										break;
	        									}
	        									else {
	        										System.out.println(oyuncu2deste.get(5) +" kartının yeni canı " + oyuncu2slot5can);
	        										break;
	        									}
	        								}
	        								if(büyühedefi==6) {
	        									oyuncu2slot6can = oyuncu2slot6can - 1;
	        									if(oyuncu2slot6can == 0) {
	        										System.out.println(oyuncu2deste.get(6) + " kartı öldürüldü.");
	        										oyuncu2deste.set(6, " ");
	        										oyuncu2destekart.set(6, bosluk);
	        										oyuncu2slot6saldırıgücü = 0;
	        										oyuncu2slot6can = 0;
	        										break;
	        									}
	        									else {
	        										System.out.println(oyuncu2deste.get(6) +" kartının yeni canı " + oyuncu2slot6can);
	        										break;
	        									}
	        								}
	        								if(büyühedefi==7) {
	        									oyuncu2slot7can = oyuncu2slot7can - 1;
	        									if(oyuncu2slot7can == 0) {
	        										System.out.println(oyuncu2deste.get(7) + " kartı öldürüldü.");
	        										oyuncu2deste.set(7, " ");
	        										oyuncu2destekart.set(7, bosluk);
	        										oyuncu2slot7saldırıgücü = 0;
	        										oyuncu2slot7can = 0;
	        										break;
	        									}
	        									else {
	        										System.out.println(oyuncu2deste.get(7) +" kartının yeni canı " + oyuncu2slot7can);
	        										break;
	        									}
	        								}
	        								if(büyühedefi==8) {
	        									oyuncu2slot8can = oyuncu2slot8can - 1;
	        									if(oyuncu2slot8can == 0) {
	        										System.out.println(oyuncu2deste.get(8) + " kartı öldürüldü.");
	        										oyuncu2deste.set(8, " ");
	        										oyuncu2destekart.set(8, bosluk);
	        										oyuncu2slot8saldırıgücü = 0;
	        										oyuncu2slot8can = 0;
	        										break;
	        									}
	        									else {
	        										System.out.println(oyuncu2deste.get(8) +" kartının yeni canı " + oyuncu2slot8can);
	        										break;
	        									}
	        								}
	        								
	        							}
	        								
	        							
	        							}
	        							
	        						else {
	        							if(durbi!=1) 
	        								System.out.println("geçersiz değer");
	            							else
	        								durbi=0;
	        						}
	        						}
	        						loop=1;
	        				
	        						durbi=1;	
	        						durbii=1;
	        						if(değnekgiriş==1) {
	        						if(deste1ye==1){
	        							
	        							oyuncu2deste.set(oyuncu2saldir, " ");
	    								oyuncu2destekart.set(oyuncu2saldir, bosluk);
	    								
	        							System.out.println("\nkarşıda kart yok ve oyuncuya saldırılacak");
	        							oyuncu1cani = oyuncu1cani - 2;
	        							System.out.println("oyuncu 1 canı = " + oyuncu1cani);
	        						}
	        						else {
	        							while(true) {
	        								
	        								oyuncu2deste.set(oyuncu2saldir, " ");
	        								oyuncu2destekart.set(oyuncu2saldir, bosluk);
	        								
	        			        	    System.out.println("\noyuncu 1 nin kartları = \n0. " + oyuncu1deste.get(0) + "\n1. " + oyuncu1deste.get(1) + "\n2. " + oyuncu1deste.get(2) + "\n3. " + oyuncu1deste.get(3) + "\n4. " + oyuncu1deste.get(4) + "\n5. " + oyuncu1deste.get(5) + "\n6. " + oyuncu1deste.get(6) + "\n7. " + oyuncu1deste.get(7) + "\n8. " + oyuncu1deste.get(8));

	        							System.out.println("lütfen 2 hasar vereceğiniz kartı seçin ");
	        							büyühedefi = input.nextInt();
	        							
	        							if(büyühedefi  == 0 ||büyühedefi == 1 ||büyühedefi == 2 ||büyühedefi == 3 ||büyühedefi == 4 ||büyühedefi == 5 ||büyühedefi == 6 ||büyühedefi == 7 ||büyühedefi == 8) {
	        							
	        								if(oyuncu1deste.get(büyühedefi).equals(" ") || oyuncu1deste.get(büyühedefi).equals("değnek") || oyuncu1deste.get(büyühedefi).equals("kışla") || oyuncu1deste.get(büyühedefi).equals("panayır") || oyuncu1deste.get(büyühedefi).equals("alevtopu") || oyuncu1deste.get(büyühedefi).equals("zırh") || oyuncu1deste.get(büyühedefi).equals("meteor") || oyuncu1deste.get(büyühedefi).equals("alevtopları") || oyuncu1deste.get(büyühedefi).equals("dolunay") || oyuncu1deste.get(büyühedefi).equals("kıyamet"))
	                							System.out.println("geçersiz değer");
	        								
	        								else {
	            								if(büyühedefi==0) {
	            									oyuncu1slot0can = oyuncu1slot0can - 2;
	            									if(oyuncu1slot0can == 0) {
	            										System.out.println(oyuncu1deste.get(0) + " kartı öldürüldü.");
	            										oyuncu1deste.set(0, " ");
	            										oyuncu1destekart.set(0, bosluk);
	            										oyuncu1slot0saldırıgücü = 0;
	            										oyuncu1slot0can = 0;
	            										break;
	            									}
	            									else {
	            										System.out.println(oyuncu1deste.get(0) +" kartının yeni canı " + oyuncu1slot0can);
	            										break;
	            									}
	            								}
	            								if(büyühedefi==1) {
	            									oyuncu1slot1can = oyuncu1slot1can - 2;
	            									if(oyuncu1slot1can == 0) {
	            										System.out.println(oyuncu1deste.get(1) + " kartı öldürüldü.");
	            										oyuncu1deste.set(1, " ");
	            										oyuncu1destekart.set(1, bosluk);
	            										oyuncu1slot1saldırıgücü = 0;
	            										oyuncu1slot1can = 0;
	            										break;
	            									}
	            									else {
	            										System.out.println(oyuncu1deste.get(1) +" kartının yeni canı " + oyuncu1slot1can);
	            										break;
	            									}
	            								}
	            								if(büyühedefi==2) {
	            									oyuncu1slot2can = oyuncu1slot2can - 2;
	            									if(oyuncu1slot2can == 0) {
	            										System.out.println(oyuncu1deste.get(2) + " kartı öldürüldü.");
	            										oyuncu1deste.set(2, " ");
	            										oyuncu1destekart.set(2, bosluk);
	            										oyuncu1slot2saldırıgücü = 0;
	            										oyuncu1slot2can = 0;
	            										break;
	            									}
	            									else {
	            										System.out.println(oyuncu1deste.get(2) +" kartının yeni canı " + oyuncu1slot2can);
	            										break;
	            									}
	            								}
	            								if(büyühedefi==3) {
	            									oyuncu1slot3can = oyuncu1slot3can - 2;
	            									if(oyuncu1slot3can == 0) {
	            										System.out.println(oyuncu1deste.get(3) + " kartı öldürüldü.");
	            										oyuncu1deste.set(3, " ");
	            										oyuncu1destekart.set(3, bosluk);
	            										oyuncu1slot3saldırıgücü = 0;
	            										oyuncu1slot3can = 0;
	            										break;
	            									}
	            									else {
	            										System.out.println(oyuncu1deste.get(3) +" kartının yeni canı " + oyuncu1slot3can);
	            										break;
	            									}
	            								}
	            								if(büyühedefi==4) {
	            									oyuncu1slot4can = oyuncu1slot4can - 2;
	            									if(oyuncu1slot4can == 0) {
	            										System.out.println(oyuncu1deste.get(4) + " kartı öldürüldü.");
	            										oyuncu1deste.set(4, " ");
	            										oyuncu1destekart.set(4, bosluk);
	            										oyuncu1slot4saldırıgücü = 0;
	            										oyuncu1slot4can = 0;
	            										break;
	            									}
	            									else {
	            										System.out.println(oyuncu1deste.get(4) +" kartının yeni canı " + oyuncu1slot4can);
	            										break;
	            									}
	            								}
	            								if(büyühedefi==5) {
	            									oyuncu1slot5can = oyuncu1slot5can - 2;
	            									if(oyuncu1slot5can == 0) {
	            										System.out.println(oyuncu1deste.get(5) + " kartı öldürüldü.");
	            										oyuncu1deste.set(5, " ");
	            										oyuncu1destekart.set(5, bosluk);
	            										oyuncu1slot5saldırıgücü = 0;
	            										oyuncu1slot5can = 0;
	            										break;
	            									}
	            									else {
	            										System.out.println(oyuncu1deste.get(5) +" kartının yeni canı " + oyuncu1slot5can);
	            										break;
	            									}
	            								}
	            								if(büyühedefi==6) {
	            									oyuncu1slot6can = oyuncu1slot6can - 2;
	            									if(oyuncu1slot6can == 0) {
	            										System.out.println(oyuncu1deste.get(6) + " kartı öldürüldü.");
	            										oyuncu1deste.set(6, " ");
	            										oyuncu1destekart.set(6, bosluk);
	            										oyuncu1slot6saldırıgücü = 0;
	            										oyuncu1slot6can = 0;
	            										break;
	            									}
	            									else {
	            										System.out.println(oyuncu1deste.get(6) +" kartının yeni canı " + oyuncu1slot6can);
	            										break;
	            									}
	            								}
	            								if(büyühedefi==7) {
	            									oyuncu1slot7can = oyuncu1slot7can - 2;
	            									if(oyuncu1slot7can == 0) {
	            										System.out.println(oyuncu1deste.get(7) + " kartı öldürüldü.");
	            										oyuncu1deste.set(7, " ");
	            										oyuncu1destekart.set(7, bosluk);
	            										oyuncu1slot7saldırıgücü = 0;
	            										oyuncu1slot7can = 0;
	            										break;
	            									}
	            									else {
	            										System.out.println(oyuncu1deste.get(7) +" kartının yeni canı " + oyuncu1slot7can);
	            										break;
	            									}
	            								}
	            								if(büyühedefi==8) {
	            									oyuncu1slot8can = oyuncu1slot8can - 2;
	            									if(oyuncu1slot8can == 0) {
	            										System.out.println(oyuncu1deste.get(8) + " kartı öldürüldü.");
	            										oyuncu1deste.set(8, " ");
	            										oyuncu1destekart.set(8, bosluk);
	            										oyuncu1slot8saldırıgücü = 0;
	            										oyuncu1slot8can = 0;
	            										break;
	            									}
	            									else {
	            										System.out.println(oyuncu1deste.get(8) +" kartının yeni canı " + oyuncu1slot8can);
	            										break;
	            									}
	            								}
	            							}
	        							
	        							}
	        							}
	        						}
	        						}
	        						değnekgiriş=1;
	        				}
	        				
	        				if(oyuncu2deste.get(oyuncu2saldir).equals("kıyamet")) {
	        					System.out.println("oyuncu 1 nin bütün kartları öldürüldü.");
	        					oyuncu1deste.set(0, " ");
	        					oyuncu1destekart.set(0, bosluk);
	        					oyuncu1slot0saldırıgücü = 0;
	        					oyuncu1slot0can = 0;
	        					
	        					oyuncu1deste.set(1, " ");
	        					oyuncu1destekart.set(1, bosluk);
	        					oyuncu1slot1saldırıgücü = 0;
	        					oyuncu1slot1can = 0;
	        					
	        					oyuncu1deste.set(2, " ");
	        					oyuncu1destekart.set(2, bosluk);
	        					oyuncu1slot2saldırıgücü = 0;
	        					oyuncu1slot2can = 0;
	        					
	        					oyuncu1deste.set(3, " ");
	        					oyuncu1destekart.set(3, bosluk);
	        					oyuncu1slot3saldırıgücü = 0;
	        					oyuncu1slot3can = 0;
	        					
	        					oyuncu1deste.set(4, " ");
	        					oyuncu1destekart.set(4, bosluk);
	        					oyuncu1slot4saldırıgücü = 0;
	        					oyuncu1slot4can = 0;
	        					
	        					oyuncu1deste.set(5, " ");
	        					oyuncu1destekart.set(5, bosluk);
	        					oyuncu1slot5saldırıgücü = 0;
	        					oyuncu1slot5can = 0;
	        					
	        					oyuncu1deste.set(6, " ");
	        					oyuncu1destekart.set(6, bosluk);
	        					oyuncu1slot6saldırıgücü = 0;
	        					oyuncu1slot6can = 0;
	        					
	        					oyuncu1deste.set(7, " ");
	        					oyuncu1destekart.set(7, bosluk);
	        					oyuncu1slot7saldırıgücü = 0;
	        					oyuncu1slot7can = 0;
	        					
	        					oyuncu1deste.set(8, " ");
	        					oyuncu1destekart.set(8, bosluk);
	        					oyuncu1slot8saldırıgücü = 0;
	        					oyuncu1slot8can = 0;
	        					
	        					oyuncu2deste.set(oyuncu2saldir, " ");
	        					oyuncu2destekart.set(oyuncu2saldir, bosluk);
	        				}
	        				
	        				if(oyuncu2deste.get(oyuncu2saldir).equals("panayır")) {
	        					System.out.println("3 tane minyon destenize eklendi!");
	        					oyuncu2deste.set(oyuncu2saldir, "minyon");
	        					oyuncu2destekart.set(oyuncu2saldir, minyon);
	        					if(oyuncu2saldir==0) {
									oyuncu2slot0can = 1;
									oyuncu2slot0saldırıgücü = 1;
									oyuncu2turhamle0 = 1;
								}
								if(oyuncu2saldir==1) {
									oyuncu2slot1can = 1;
									oyuncu2slot1saldırıgücü = 1;
									oyuncu2turhamle1 = 1;
								}
								if(oyuncu2saldir==2) {
									oyuncu2slot2can = 1;
									oyuncu2slot2saldırıgücü = 1;
									oyuncu2turhamle2 = 1;
								}
								if(oyuncu2saldir==3) {
									oyuncu2slot3can = 1;
									oyuncu2slot3saldırıgücü = 1;
									oyuncu2turhamle3 = 1;
								}
								if(oyuncu2saldir==4) {
									oyuncu2slot4can = 1;
									oyuncu2slot4saldırıgücü = 1;
									oyuncu2turhamle4 = 1;
								}
								if(oyuncu2saldir==5) {
									oyuncu2slot5can = 1;
									oyuncu2slot5saldırıgücü = 1;
									oyuncu2turhamle5 = 1;
								}
								if(oyuncu2saldir==6) {
									oyuncu2slot6can = 1;
									oyuncu2slot6saldırıgücü = 1;
									oyuncu2turhamle6 = 1;
								}
								if(oyuncu2saldir==7) {
									oyuncu2slot7can = 1;
									oyuncu2slot7saldırıgücü = 1;
									oyuncu2turhamle7 = 1;
								}
								if(oyuncu2saldir==8) {
									oyuncu2slot8can = 1;
									oyuncu2slot8saldırıgücü = 1;
									oyuncu2turhamle8 = 1;
								}
	        					for(k=0;k<9;k++) {
	        						if(oyuncu2deste.get(k).equals(" ")) {
	        							oyuncu2deste.set(k, "minyon");
	        							oyuncu2destekart.set(k, minyon);
	        							if(k==0) {
	        								oyuncu2slot0can = 1;
	        								oyuncu2slot0saldırıgücü = 1;
	        								oyuncu2turhamle0 = 1;
	        							}
	        							if(k==1) {
	        								oyuncu2slot1can = 1;
	        								oyuncu2slot1saldırıgücü = 1;
	        								oyuncu2turhamle1 = 1;
	        							}
	        							if(k==2) {
	        								oyuncu2slot2can = 1;
	        								oyuncu2slot2saldırıgücü = 1;
	        								oyuncu2turhamle2 = 1;
	        							}
	        							if(k==3) {
	        								oyuncu2slot3can = 1;
	        								oyuncu2slot3saldırıgücü = 1;
	        								oyuncu2turhamle3 = 1;
	        							}
	        							if(k==4) {
	        								oyuncu2slot4can = 1;
	        								oyuncu2slot4saldırıgücü = 1;
	        								oyuncu2turhamle4 = 1;
	        							}
	        							if(k==5) {
	        								oyuncu2slot5can = 1;
	        								oyuncu2slot5saldırıgücü = 1;
	        								oyuncu2turhamle5 = 1;
	        							}
	        							if(k==6) {
	        								oyuncu2slot6can = 1;
	        								oyuncu2slot6saldırıgücü = 1;
	        								oyuncu2turhamle6 = 1;
	        							}
	        							if(k==7) {
	        								oyuncu2slot7can = 1;
	        								oyuncu2slot7saldırıgücü = 1;
	        								oyuncu2turhamle7 = 1;
	        							}
	        							if(k==8) {
	        								oyuncu2slot8can = 1;
	        								oyuncu2slot8saldırıgücü = 1;
	        								oyuncu2turhamle8 = 1;
	        							}
	        							break;
	        						}
	        						}
	        					for(k=0;k<9;k++) {
	        						if(oyuncu2deste.get(k).equals(" ")) {
	        							oyuncu2deste.set(k, "minyon");
	        							oyuncu2destekart.set(k, minyon);
	        							if(k==0) {
	        								oyuncu2slot0can = 1;
	        								oyuncu2slot0saldırıgücü = 1;
	        								oyuncu2turhamle0 = 1;
	        							}
	        							if(k==1) {
	        								oyuncu2slot1can = 1;
	        								oyuncu2slot1saldırıgücü = 1;
	        								oyuncu2turhamle1 = 1;
	        							}
	        							if(k==2) {
	        								oyuncu2slot2can = 1;
	        								oyuncu2slot2saldırıgücü = 1;
	        								oyuncu2turhamle2 = 1;
	        							}
	        							if(k==3) {
	        								oyuncu2slot3can = 1;
	        								oyuncu2slot3saldırıgücü = 1;
	        								oyuncu2turhamle3 = 1;
	        							}
	        							if(k==4) {
	        								oyuncu2slot4can = 1;
	        								oyuncu2slot4saldırıgücü = 1;
	        								oyuncu2turhamle4 = 1;
	        							}
	        							if(k==5) {
	        								oyuncu2slot5can = 1;
	        								oyuncu2slot5saldırıgücü = 1;
	        								oyuncu2turhamle5 = 1;
	        							}
	        							if(k==6) {
	        								oyuncu2slot6can = 1;
	        								oyuncu2slot6saldırıgücü = 1;
	        								oyuncu2turhamle6 = 1;
	        							}
	        							if(k==7) {
	        								oyuncu2slot7can = 1;
	        								oyuncu2slot7saldırıgücü = 1;
	        								oyuncu2turhamle7 = 1;
	        							}
	        							if(k==8) {
	        								oyuncu2slot8can = 1;
	        								oyuncu2slot8saldırıgücü = 1;
	        								oyuncu2turhamle8 = 1;
	        							}
	        							break;
	        						}
	        						}

	        				}
	        			
	        				if(oyuncu2deste.get(oyuncu2saldir).equals("zırh")){
	        					if(deste2ye==1)
	        						zırhgiriş=0;
	        					
	        					if(zırhgiriş==1) {
	        						
	        					if(oyuncu2saldir==0) {
	        						oyuncu2deste.set(0, " ");
	        						oyuncu2destekart.set(0, bosluk);
	        					}
	        					if(oyuncu2saldir==1) {
	        						oyuncu2deste.set(1, " ");
	        						oyuncu2destekart.set(1, bosluk);
	        					}
	        					if(oyuncu2saldir==2) {
	        						oyuncu2deste.set(2, " ");
	        						oyuncu2destekart.set(2, bosluk);
	        					}
	        					if(oyuncu2saldir==3) {
	        						oyuncu2deste.set(3, " ");
	        						oyuncu2destekart.set(3, bosluk);
	        					}
	        					if(oyuncu2saldir==4) {
	        						oyuncu2deste.set(4, " ");
	        						oyuncu2destekart.set(4, bosluk);
	        					}
	        					if(oyuncu2saldir==5) {
	        						oyuncu2deste.set(5, " ");
	        						oyuncu2destekart.set(5, bosluk);
	        					}
	        					if(oyuncu2saldir==6) {
	        						oyuncu2deste.set(6, " ");
	        						oyuncu2destekart.set(6, bosluk);
	        					}
	        					if(oyuncu2saldir==7) {
	        						oyuncu2deste.set(7, " ");
	        						oyuncu2destekart.set(7, bosluk);
	        					}
	        					if(oyuncu2saldir==8) {
	        						oyuncu2deste.set(8, " ");
	        						oyuncu2destekart.set(8, bosluk);
	        					}
	        					
	        					System.out.println("\noyuncu2 in kartları = \n0. " + oyuncu2deste.get(0) + "\n1. " + oyuncu2deste.get(1) + "\n2. " + oyuncu2deste.get(2) + "\n3. " + oyuncu2deste.get(3) + "\n4. " + oyuncu2deste.get(4) + "\n5. " + oyuncu2deste.get(5) + "\n6. " + oyuncu2deste.get(6) + "\n7. " + oyuncu2deste.get(7) + "\n8. " + oyuncu2deste.get(8) + "\n9. kart özelliklerini görüntüleme\n10.çıkış" );
	            		        
	        					while(büyüloopu==1) {
	            		        System.out.println("\nlütfen canını 10 arttırmak istediğiniz hedefi seçiniz.");
	    		        		
	            		        

	            		        while(büyülooopu==1) {
	            		        	büyühedefi = input.nextInt();
	                		        
	                		        
	            		        	if(büyühedefi  == 0 ||büyühedefi == 1 ||büyühedefi == 2 ||büyühedefi == 3 ||büyühedefi == 4 ||büyühedefi == 5 ||büyühedefi == 6 ||büyühedefi == 7 ||büyühedefi == 8) {
	            		        		break;
	            		        		}
	            		        	else {
	            		        		if(durbii!=1) {
	            		        		System.out.println("geçersiz değer");
	            		        		System.out.println("\nlütfen canını 10 arttırmak istediğiniz hedefi seçiniz.");
	            		        		}
	            		        		else
	            		        			durbii= 0;
	            		        	}
	            		        }
	            		        	durbii = 1;
	            		        	while(büyülooopu==1) {
	                		        	if(büyühedefi  == 0 ||büyühedefi == 1 ||büyühedefi == 2 ||büyühedefi == 3 ||büyühedefi == 4 ||büyühedefi == 5 ||büyühedefi == 6 ||büyühedefi == 7 ||büyühedefi == 8) {

	            		        	if(oyuncu2deste.get(büyühedefi).equals(" ") || oyuncu2deste.get(büyühedefi).equals("değnek") || oyuncu2deste.get(büyühedefi).equals("kışla") || oyuncu2deste.get(büyühedefi).equals("panayır") || oyuncu2deste.get(büyühedefi).equals("alevtopu") || oyuncu2deste.get(büyühedefi).equals("zırh") || oyuncu2deste.get(büyühedefi).equals("meteor") || oyuncu2deste.get(büyühedefi).equals("alevtopları") || oyuncu2deste.get(büyühedefi).equals("dolunay") || oyuncu2deste.get(büyühedefi).equals("kıyamet")){
	            		        		System.out.println("geçersiz değer");
	            		        		System.out.println("\nlütfen canını 10 arttırmak istediğiniz hedefi seçiniz.");
	                    		        büyühedefi = input.nextInt();
	            		        	}
	            		        	else
	            		        		break;
	            		        	}
	                		        	
	            		        	}
	            		        	
	            		        if(büyühedefi  == 0) {
	            		        	oyuncu2slot0can = oyuncu2slot0can + 10;
	            		        	System.out.println(oyuncu2deste.get(büyühedefi) +" kartının yeni canı = " + oyuncu2slot0can);
	            		        	}
	            		        else if(büyühedefi == 1) {
	                		        oyuncu2slot1can = oyuncu2slot1can + 10;
	                		        System.out.println(oyuncu2deste.get(büyühedefi) +" kartının yeni canı = " + oyuncu2slot1can);
	                		        }
	            		        else if(büyühedefi == 2) {
	                		        oyuncu2slot2can = oyuncu2slot2can + 10;
	                		        System.out.println(oyuncu2deste.get(büyühedefi) +" kartının yeni canı = " + oyuncu2slot2can);
	                		        }
	            		        else if(büyühedefi == 3) {
	                		        oyuncu2slot3can = oyuncu2slot3can + 10;
	                		        System.out.println(oyuncu2deste.get(büyühedefi) +" kartının yeni canı = " + oyuncu2slot3can);
	                		        }
	            		        else if(büyühedefi == 4) {
	                		        oyuncu2slot4can = oyuncu2slot4can + 10;
	                		        System.out.println(oyuncu2deste.get(büyühedefi) +" kartının yeni canı = " + oyuncu2slot4can);
	                		        }
	            		        else if(büyühedefi == 5) {
	                		        oyuncu2slot5can = oyuncu2slot5can + 10;
	                		        System.out.println(oyuncu2deste.get(büyühedefi) +" kartının yeni canı = " + oyuncu2slot5can);
	                		        }
	            		        else if(büyühedefi == 6) {
	                		        oyuncu2slot6can = oyuncu2slot6can + 10;
	                		        System.out.println(oyuncu2deste.get(büyühedefi) +" kartının yeni canı = " + oyuncu2slot6can);
	                		        }
	            		        else if(büyühedefi == 7) {
	                		        oyuncu2slot7can = oyuncu2slot7can + 10;
	                		        System.out.println(oyuncu2deste.get(büyühedefi) +" kartının yeni canı = " + oyuncu2slot7can);
	                		        }
	            		        else if(büyühedefi == 8) {
	                		        oyuncu2slot8can = oyuncu2slot8can + 10;
	                		        System.out.println(oyuncu2deste.get(büyühedefi) +" kartının yeni canı = " + oyuncu2slot8can);
	                		        }
	            		        büyühedefi = 0;
	            		        
	            		        break;

	        				}
	        				}
	        					else
	        						System.out.println("desteniz zırh kartını kullanmak için uygun değil");
	        					zırhgiriş=1;
	        				}
	        			
	        				if(oyuncu2deste.get(oyuncu2saldir).equals("dolunay")) {
	        					System.out.println("3 tane kurt destenize eklendi.");
	        					oyuncu2deste.set(oyuncu2saldir, "kurt");
	        					oyuncu2destekart.set(oyuncu2saldir, kurt);
	        					if(oyuncu2saldir==0) {
									oyuncu2slot0can = 3;
									oyuncu2slot0saldırıgücü = 3;
									oyuncu2turhamle0 = 1;
								}
								if(oyuncu2saldir==1) {
									oyuncu2slot1can = 3;
									oyuncu2slot1saldırıgücü = 3;
									oyuncu2turhamle1 = 1;
								}
								if(oyuncu2saldir==2) {
									oyuncu2slot2can = 3;
									oyuncu2slot2saldırıgücü = 3;
									oyuncu2turhamle2 = 1;
								}
								if(oyuncu2saldir==3) {
									oyuncu2slot3can = 3;
									oyuncu2slot3saldırıgücü = 3;
									oyuncu2turhamle3 = 1;
								}
								if(oyuncu2saldir==4) {
									oyuncu2slot4can = 3;
									oyuncu2slot4saldırıgücü = 3;
									oyuncu2turhamle4 = 1;
								}
								if(oyuncu2saldir==5) {
									oyuncu2slot5can = 3;
									oyuncu2slot5saldırıgücü = 3;
									oyuncu2turhamle5 = 1;
								}
								if(oyuncu2saldir==6) {
									oyuncu2slot6can = 3;
									oyuncu2slot6saldırıgücü = 3;
									oyuncu2turhamle6 = 1;
								}
								if(oyuncu2saldir==7) {
									oyuncu2slot7can = 3;
									oyuncu2slot7saldırıgücü = 3;
									oyuncu2turhamle7 = 1;
								}
								if(oyuncu2saldir==8) {
									oyuncu2slot8can = 3;
									oyuncu2slot8saldırıgücü = 3;
									oyuncu2turhamle8 = 1;
								}
	        					for(k=0;k<9;k++) {
	        						if(oyuncu2deste.get(k).equals(" ")) {
	        							oyuncu2deste.set(k, "kurt");
	                					oyuncu2destekart.set(k, kurt);
	        							if(k==0) {
	        								oyuncu2slot0can = 3;
	        								oyuncu2slot0saldırıgücü = 3;
	        								oyuncu2turhamle0 = 1;
	        							}
	        							if(k==1) {
	        								oyuncu2slot1can = 3;
	        								oyuncu2slot1saldırıgücü = 3;
	        								oyuncu2turhamle1 = 1;
	        							}
	        							if(k==2) {
	        								oyuncu2slot2can = 3;
	        								oyuncu2slot2saldırıgücü = 3;
	        								oyuncu2turhamle2 = 1;
	        							}
	        							if(k==3) {
	        								oyuncu2slot3can = 3;
	        								oyuncu2slot3saldırıgücü = 3;
	        								oyuncu2turhamle3 = 1;
	        							}
	        							if(k==4) {
	        								oyuncu2slot4can = 3;
	        								oyuncu2slot4saldırıgücü = 3;
	        								oyuncu2turhamle4 = 1;
	        							}
	        							if(k==5) {
	        								oyuncu2slot5can = 3;
	        								oyuncu2slot5saldırıgücü = 3;
	        								oyuncu2turhamle5 = 1;
	        							}
	        							if(k==6) {
	        								oyuncu2slot6can = 3;
	        								oyuncu2slot6saldırıgücü = 3;
	        								oyuncu2turhamle6 = 1;
	        							}
	        							if(k==7) {
	        								oyuncu2slot7can = 3;
	        								oyuncu2slot7saldırıgücü = 3;
	        								oyuncu2turhamle7 = 1;
	        							}
	        							if(k==8) {
	        								oyuncu2slot8can = 3;
	        								oyuncu2slot8saldırıgücü = 3;
	        								oyuncu2turhamle8 = 1;
	        							}
	        							break;
	        						}
	        					}
	        					for(k=0;k<9;k++) {
	        						if(oyuncu2deste.get(k).equals(" ")) {
	        							oyuncu2deste.set(k, "kurt");
	                					oyuncu2destekart.set(k, kurt);
	        							if(k==0) {
	        								oyuncu2slot0can = 3;
	        								oyuncu2slot0saldırıgücü = 3;
	        								oyuncu2turhamle0 = 1;
	        							}
	        							if(k==1) {
	        								oyuncu2slot1can = 3;
	        								oyuncu2slot1saldırıgücü = 3;
	        								oyuncu2turhamle1 = 1;
	        							}
	        							if(k==2) {
	        								oyuncu2slot2can = 3;
	        								oyuncu2slot2saldırıgücü = 3;
	        								oyuncu2turhamle2 = 1;
	        							}
	        							if(k==3) {
	        								oyuncu2slot3can = 3;
	        								oyuncu2slot3saldırıgücü = 3;
	        								oyuncu2turhamle3 = 1;
	        							}
	        							if(k==4) {
	        								oyuncu2slot4can = 3;
	        								oyuncu2slot4saldırıgücü = 3;
	        								oyuncu2turhamle4 = 1;
	        							}
	        							if(k==5) {
	        								oyuncu2slot5can = 3;
	        								oyuncu2slot5saldırıgücü = 3;
	        								oyuncu2turhamle5 = 1;
	        							}
	        							if(k==6) {
	        								oyuncu2slot6can = 3;
	        								oyuncu2slot6saldırıgücü = 3;
	        								oyuncu2turhamle6 = 1;
	        							}
	        							if(k==7) {
	        								oyuncu2slot7can = 3;
	        								oyuncu2slot7saldırıgücü = 3;
	        								oyuncu2turhamle7 = 1;
	        							}
	        							if(k==8) {
	        								oyuncu2slot8can = 3;
	        								oyuncu2slot8saldırıgücü = 3;
	        								oyuncu2turhamle8 = 1;
	        							}
	        							break;
	        						}
	        					}
	        				}
	        			
	        				if(oyuncu2deste.get(oyuncu2saldir).equals("alevtopları")) {
	        					System.out.println("3 tane alev topu destenize eklendi");
	        					oyuncu2deste.set(oyuncu2saldir, "alevtopu");
	        					oyuncu2destekart.set(oyuncu2saldir, alevtopu);
	        					if(oyuncu2saldir==0) {
	        						oyuncu2slot0saldırıgücü = 2;
									oyuncu2turhamle0 = 1;
	        					}
	        					if(oyuncu2saldir==1) {
	        						oyuncu2slot1saldırıgücü = 2;
									oyuncu2turhamle1 = 1;
	        					}
	        					if(oyuncu2saldir==2) {
	        						oyuncu2slot2saldırıgücü = 2;
									oyuncu2turhamle2 = 1;
	        					}
	        					if(oyuncu2saldir==3) {
	        						oyuncu2slot3saldırıgücü = 2;
									oyuncu2turhamle3 = 1;
	        					}
	        					if(oyuncu2saldir==4) {
	        						oyuncu2slot4saldırıgücü = 2;
									oyuncu2turhamle4 = 1;
	        					}
	        					if(oyuncu2saldir==5) {
	        						oyuncu2slot5saldırıgücü = 2;
									oyuncu2turhamle5 = 1;
	        					}
	        					if(oyuncu2saldir==6) {
	        						oyuncu2slot6saldırıgücü = 2;
									oyuncu2turhamle6 = 1;
	        					}
	        					if(oyuncu2saldir==7) {
	        						oyuncu2slot7saldırıgücü = 2;
									oyuncu2turhamle7 = 1;
	        					}
	        					if(oyuncu2saldir==8) {
	        						oyuncu2slot8saldırıgücü = 2;
									oyuncu2turhamle8 = 1;
	        					}
	        					for(k=0;k<9;k++) {
	        						
	        						if(oyuncu2deste.get(k).equals(" ")) {
	        							if(k==0) {
	        							oyuncu2deste.set(k, "alevtopu");
	        							oyuncu2destekart.set(k, alevtopu);
	        							oyuncu2slot0saldırıgücü = 2;
	        							oyuncu2turhamle0 = 1;
	        							break;
	        						}
	        							if(k==1) {
	        							oyuncu2deste.set(k, "alevtopu");
	        							oyuncu2destekart.set(k, alevtopu);
	        							oyuncu2slot1saldırıgücü = 2;
	        							oyuncu2turhamle1 = 1;
	        							break;
	        						}
	        							if(k==2) {
	        							oyuncu2deste.set(k, "alevtopu");
	        							oyuncu2destekart.set(k, alevtopu);
	        							oyuncu2slot2saldırıgücü = 2;
	        							oyuncu2turhamle2 = 1;
	        							break;
	        						}
	        							if(k==3) {
	        							oyuncu2deste.set(k, "alevtopu");
	        							oyuncu2destekart.set(k, alevtopu);
	        							oyuncu2slot3saldırıgücü = 2;
	        							oyuncu2turhamle3 = 1;
	        							break;
	        						}
	        							if(k==4) {
	        							oyuncu2deste.set(k, "alevtopu");
	        							oyuncu2destekart.set(k, alevtopu);
	        							oyuncu2slot4saldırıgücü = 2;
	        							oyuncu2turhamle4 = 1;
	        							break;
	        						}
	        							if(k==5) {
	        							oyuncu2deste.set(k, "alevtopu");
	        							oyuncu2destekart.set(k, alevtopu);
	        							oyuncu2slot5saldırıgücü = 2;
	        							oyuncu2turhamle5 = 1;
	        							break;
	        						}
	        							if(k==6) {
	        							oyuncu2deste.set(k, "alevtopu");
	        							oyuncu2destekart.set(k, alevtopu);
	        							oyuncu2slot6saldırıgücü = 2;
	        							oyuncu2turhamle6 = 1;
	        							break;
	        						}
	        							if(k==7) {
	        							oyuncu2deste.set(k, "alevtopu");
	        							oyuncu2destekart.set(k, alevtopu);
	        							oyuncu2slot7saldırıgücü = 2;
	        							oyuncu2turhamle7 = 1;
	        							break;
	        						}
	        							if(k==8) {
	        							oyuncu2deste.set(k, "alevtopu");
	        							oyuncu2destekart.set(k, alevtopu);
	        							oyuncu2slot8saldırıgücü = 2;
	        							oyuncu2turhamle8 = 1;
	        							break;
	        						}
	        					
	        						}
	        					}
	        					
	        					for(k=0;k<9;k++) {
	        						
	        						if(oyuncu2deste.get(k).equals(" ")) {
	        							if(k==0) {
	        							oyuncu2deste.set(k, "alevtopu");
	        							oyuncu2destekart.set(k, alevtopu);
	        							oyuncu2slot0saldırıgücü = 2;
	        							oyuncu2turhamle0 = 1;
	        							break;
	        						}
	        							if(k==1) {
	        							oyuncu2deste.set(k, "alevtopu");
	        							oyuncu2destekart.set(k, alevtopu);
	        							oyuncu2slot1saldırıgücü = 2;
	        							oyuncu2turhamle1 = 1;
	        							break;
	        						}
	        							if(k==2) {
	        							oyuncu2deste.set(k, "alevtopu");
	        							oyuncu2destekart.set(k, alevtopu);
	        							oyuncu2slot2saldırıgücü = 2;
	        							oyuncu2turhamle2 = 1;
	        							break;
	        						}
	        							if(k==3) {
	        							oyuncu2deste.set(k, "alevtopu");
	        							oyuncu2destekart.set(k, alevtopu);
	        							oyuncu2slot3saldırıgücü = 2;
	        							oyuncu2turhamle3 = 1;
	        							break;
	        						}
	        							if(k==4) {
	        							oyuncu2deste.set(k, "alevtopu");
	        							oyuncu2destekart.set(k, alevtopu);
	        							oyuncu2slot4saldırıgücü = 2;
	        							oyuncu2turhamle4 = 1;
	        							break;
	        						}
	        							if(k==5) {
	        							oyuncu2deste.set(k, "alevtopu");
	        							oyuncu2destekart.set(k, alevtopu);
	        							oyuncu2slot5saldırıgücü = 2;
	        							oyuncu2turhamle5 = 1;
	        							break;
	        						}
	        							if(k==6) {
	        							oyuncu2deste.set(k, "alevtopu");
	        							oyuncu2destekart.set(k, alevtopu);
	        							oyuncu2slot6saldırıgücü = 2;
	        							oyuncu2turhamle6 = 1;
	        							break;
	        						}
	        							if(k==7) {
	        							oyuncu2deste.set(k, "alevtopu");
	        							oyuncu2destekart.set(k, alevtopu);
	        							oyuncu2slot7saldırıgücü = 2;
	        							oyuncu2turhamle7 = 1;
	        							break;
	        						}
	        							if(k==8) {
	        							oyuncu2deste.set(k, "alevtopu");
	        							oyuncu2destekart.set(k, alevtopu);
	        							oyuncu2slot8saldırıgücü = 2;
	        							oyuncu2turhamle8 = 1;
	        							break;
	        						}
	        					
	        						}
	        					}
	        				}
	        				
	        				if(oyuncu2deste.get(oyuncu2saldir).equals("kışla")) {
	        					oyuncu2deste.set(oyuncu2saldir, " ");
	        					oyuncu2destekart.set(oyuncu2saldir, bosluk);
	        					while(büyüloopu==1) {
	        						if(durbi!=1) {
	            				System.out.println("\noyuncu2 in kartları = \n0. " + oyuncu2deste.get(0) + "\n1. " + oyuncu2deste.get(1) + "\n2. " + oyuncu2deste.get(2) + "\n3. " + oyuncu2deste.get(3) + "\n4. " + oyuncu2deste.get(4) + "\n5. " + oyuncu2deste.get(5) + "\n6. " + oyuncu2deste.get(6) + "\n7. " + oyuncu2deste.get(7) + "\n8. " + oyuncu2deste.get(8) + "\n9. kart özelliklerini görüntüleme\n10.çıkış" );
	        					System.out.println("\naskere dönüştürmek istediğiniz kartı seçiniz.");
	        						}
	        						durbi = 0;
	        					büyühedefi = input.nextInt();
	        					
	        					if(büyühedefi == 10) {
	        						oyuncu2deste.set(oyuncu2saldir, "kışla");
	        						oyuncu2destekart.set(oyuncu2saldir, kışla);
	        						durbi=0;
	        						break;	
	        					}
	        					else if(büyühedefi == 9) {
	        						while(büyülooopu==1) {
	                    				System.out.println("\noyuncu2 in kartları = \n0. " + oyuncu2deste.get(0) + "\n1. " + oyuncu2deste.get(1) + "\n2. " + oyuncu2deste.get(2) + "\n3. " + oyuncu2deste.get(3) + "\n4. " + oyuncu2deste.get(4) + "\n5. " + oyuncu2deste.get(5) + "\n6. " + oyuncu2deste.get(6) + "\n7. " + oyuncu2deste.get(7) + "\n8. " + oyuncu2deste.get(8) + "\n10.çıkış" );
	        						oyuncu2ozellikogren = input.nextInt();
	        						if(oyuncu2ozellikogren< 9 && oyuncu2ozellikogren > -1) {
	        							if(oyuncu2ozellikogren==0)
	        	        					System.out.println("\nkart - " + oyuncu2deste.get(oyuncu2ozellikogren) + "\nsaldırı gücü = " + oyuncu2slot0saldırıgücü + "\ncan = " + oyuncu2slot0can + "\nözellik = " + oyuncu2destekart.get(oyuncu2ozellikogren).özellik + "\n");
	        	        				
	        							else if(oyuncu2ozellikogren==1)
	        	                			System.out.println("\nkart - " + oyuncu2deste.get(oyuncu2ozellikogren) + "\nsaldırı gücü = " + oyuncu2slot1saldırıgücü + "\ncan = " + oyuncu2slot1can + "\nözellik = " + oyuncu2destekart.get(oyuncu2ozellikogren).özellik + "\n");
	        	        				
	        							else if(oyuncu2ozellikogren==2)
	        	                			System.out.println("\nkart - " + oyuncu2deste.get(oyuncu2ozellikogren) + "\nsaldırı gücü = " + oyuncu2slot2saldırıgücü + "\ncan = " + oyuncu2slot2can + "\nözellik = " + oyuncu2destekart.get(oyuncu2ozellikogren).özellik + "\n");
	        	        				
	        							else if(oyuncu2ozellikogren==3)
	        	                			System.out.println("\nkart - " + oyuncu2deste.get(oyuncu2ozellikogren) + "\nsaldırı gücü = " + oyuncu2slot3saldırıgücü + "\ncan = " + oyuncu2slot3can + "\nözellik = " + oyuncu2destekart.get(oyuncu2ozellikogren).özellik + "\n");
	        	        				
	        							else if(oyuncu2ozellikogren==4)
	        	                			System.out.println("\nkart - " + oyuncu2deste.get(oyuncu2ozellikogren) + "\nsaldırı gücü = " + oyuncu2slot4saldırıgücü + "\ncan = " + oyuncu2slot4can + "\nözellik = " + oyuncu2destekart.get(oyuncu2ozellikogren).özellik + "\n");
	        	        				
	        							else if(oyuncu2ozellikogren==5)
	        	                			System.out.println("\nkart - " + oyuncu2deste.get(oyuncu2ozellikogren) + "\nsaldırı gücü = " + oyuncu2slot5saldırıgücü + "\ncan = " + oyuncu2slot5can + "\nözellik = " + oyuncu2destekart.get(oyuncu2ozellikogren).özellik + "\n");
	        	        				
	        							else if(oyuncu2ozellikogren==6)
	        	                			System.out.println("\nkart - " + oyuncu2deste.get(oyuncu2ozellikogren) + "\nsaldırı gücü = " + oyuncu2slot6saldırıgücü + "\ncan = " + oyuncu2slot6can + "\nözellik = " + oyuncu2destekart.get(oyuncu2ozellikogren).özellik + "\n");
	        	        				
	        							else if(oyuncu2ozellikogren==7)
	        	                			System.out.println("\nkart - " + oyuncu2deste.get(oyuncu2ozellikogren) + "\nsaldırı gücü = " + oyuncu2slot7saldırıgücü + "\ncan = " + oyuncu2slot7can + "\nözellik = " + oyuncu2destekart.get(oyuncu2ozellikogren).özellik + "\n");
	        	        				
	        							else if(oyuncu2ozellikogren==8)
	        	                			System.out.println("\nkart - " + oyuncu2deste.get(oyuncu2ozellikogren) + "\nsaldırı gücü = " + oyuncu2slot8saldırıgücü + "\ncan = " + oyuncu2slot8can + "\nözellik = " + oyuncu2destekart.get(oyuncu2ozellikogren).özellik + "\n");
	        						}
	        						else if(oyuncu2ozellikogren==10) {
	        							durbi=1;
	        							break;
	        						}
	        						else
	        							System.out.println("geçersiz değer");
	        						}
	        					}
	        					else if(büyühedefi  == 0 || büyühedefi == 1 || büyühedefi == 2 || büyühedefi == 3 || büyühedefi == 4 || büyühedefi == 5 || büyühedefi == 6 || büyühedefi == 7 || büyühedefi == 8) {
	        						if(oyuncu2deste.get(büyühedefi).equals(" ") || oyuncu2deste.get(büyühedefi).equals("asker"))
	        							System.out.println("\ngeçersiz değer");
	        						else {
	        							System.out.println(oyuncu2deste.get(büyühedefi) + " kartı asker kartına dönüştürüldü.");
	        							oyuncu2deste.set(büyühedefi, "asker");
	        							oyuncu2destekart.set(büyühedefi, asker);
	        							if(büyühedefi  == 0) {
	        								oyuncu2slot0saldırıgücü=3;
	        								oyuncu2slot0can=5;
	        							}
	        							if(büyühedefi == 1) {
	        								oyuncu2slot1saldırıgücü=3;
	        								oyuncu2slot1can=5;
	        							}
	        							if(büyühedefi == 2) {
	        								oyuncu2slot2saldırıgücü=3;
	        								oyuncu2slot2can=5;
	        							}
	        							if(büyühedefi == 3) {
	        								oyuncu2slot3saldırıgücü=3;
	        								oyuncu2slot3can=5;
	        							}
	        							if(büyühedefi == 4) {
	        								oyuncu2slot4saldırıgücü=3;
	        								oyuncu2slot4can=5;
	        							}
	        							if(büyühedefi == 5) {
	        								oyuncu2slot5saldırıgücü=3;
	        								oyuncu2slot5can=5;
	        							}
	        							if(büyühedefi == 6) {
	        								oyuncu2slot6saldırıgücü=3;
	        								oyuncu2slot6can=5;
	        							}
	        							if(büyühedefi == 7) {
	        								oyuncu2slot7saldırıgücü=3;
	        								oyuncu2slot7can=5;
	        							}
	        							if(büyühedefi == 8) {
	        								oyuncu2slot8saldırıgücü=3;
	        								oyuncu2slot8can=5;
	        							}
	        							
	        							break;
	        						}
	        					}
	        				}
	        				}
	        				
	        				
	        				System.out.println("\noyuncu2 in kartları = \n0. " + oyuncu2deste.get(0) + "\n1. " + oyuncu2deste.get(1) + "\n2. " + oyuncu2deste.get(2) + "\n3. " + oyuncu2deste.get(3) + "\n4. " + oyuncu2deste.get(4) + "\n5. " + oyuncu2deste.get(5) + "\n6. " + oyuncu2deste.get(6) + "\n7. " + oyuncu2deste.get(7) + "\n8. " + oyuncu2deste.get(8) + "\n9. kart özelliklerini görüntüleme\n10.çıkış" );
	        			
	        			
	        			
	        			
	        			}
	        			
	        			else {
	        			System.out.println("seçtiğiniz kart " + oyuncu2deste.get(oyuncu2saldir) + "(saldırı gücü " + oyuncu2destekart.get(oyuncu2saldir).saldırıgücü +")");
	        			
	        			if(oyuncu2deste.get(oyuncu2saldir).equals("alevtopu")) {
    	        			oyuncu2deste.set(oyuncu2saldir, " ");
    	        			oyuncu2destekart.set(oyuncu2saldir, bosluk);
    	        		}
    	        		
    	        		if(oyuncu2deste.get(oyuncu2saldir).equals("meteor")) {
    	        			oyuncu2deste.set(oyuncu2saldir, " ");
    	        			oyuncu2destekart.set(oyuncu2saldir, bosluk);
    	        		}
    	        		
	        			if(deste1boş == 1 || deste1ye == 1) {
	        				System.out.println("rakibinizin destesi boş, oyuncuya saldırılacak.");
	        				oyuncu1cani = oyuncu1cani - oyuncu2vurmagücü;
	        				System.out.println("oyuncu 1 nin canı = " + oyuncu1cani);
	        				
	        				
	        			}
	        			else {
	        				saldirloop2=1;
	        				while(saldirloop2 == 1) {
	        			System.out.println("\nlütfen saldıracağınız kartı seçiniz.");
	        	        System.out.println("\noyuncu 1 nin kartları = \n0. " + oyuncu1deste.get(0) + "\n1. " + oyuncu1deste.get(1) + "\n2. " + oyuncu1deste.get(2) + "\n3. " + oyuncu1deste.get(3) + "\n4. " + oyuncu1deste.get(4) + "\n5. " + oyuncu1deste.get(5) + "\n6. " + oyuncu1deste.get(6) + "\n7. " + oyuncu1deste.get(7) + "\n8. " + oyuncu1deste.get(8) + "\n9. kart özelliklerini görüntüleme\n10.çıkış" );
	        	        oyuncu2saldiri = input.nextInt();
	        	        input.nextLine();
	        	        
	        	        if(oyuncu1deste.get(oyuncu2saldiri).equals(" ") || oyuncu1deste.get(oyuncu2saldiri).equals("değnek") || oyuncu1deste.get(oyuncu2saldiri).equals("kışla") || oyuncu1deste.get(oyuncu2saldiri).equals("panayır") || oyuncu1deste.get(oyuncu2saldiri).equals("alevtopu") || oyuncu1deste.get(oyuncu2saldiri).equals("zırh") || oyuncu1deste.get(oyuncu2saldiri).equals("meteor") || oyuncu1deste.get(oyuncu2saldiri).equals("alevtopları") || oyuncu1deste.get(oyuncu2saldiri).equals("dolunay") || oyuncu1deste.get(oyuncu2saldiri).equals("kıyamet"))
	        	        	System.out.println("seçiminiz geçersiz");
	        	        else {

	        	        	if(oyuncu2saldiri==0)
	        	        		oyuncu1dayanmagücü = oyuncu1slot0can;
	        	        	if(oyuncu2saldiri==1)
	        	        		oyuncu1dayanmagücü = oyuncu1slot1can;
	        	        	if(oyuncu2saldiri==2)
	        	        		oyuncu1dayanmagücü = oyuncu1slot2can;
	        	        	if(oyuncu2saldiri==3)
	        	        		oyuncu1dayanmagücü = oyuncu1slot3can;
	        	        	if(oyuncu2saldiri==4)
	        	        		oyuncu1dayanmagücü = oyuncu1slot4can;
	        	        	if(oyuncu2saldiri==5)
	        	        		oyuncu1dayanmagücü = oyuncu1slot5can;
	        	        	if(oyuncu2saldiri==6)
	        	        		oyuncu1dayanmagücü = oyuncu1slot6can;
	        	        	if(oyuncu2saldiri==7)
	        	        		oyuncu1dayanmagücü = oyuncu1slot7can;
	        	        	if(oyuncu2saldiri==8)
	        	        		oyuncu1dayanmagücü = oyuncu1slot8can;
	        	        	
	        	        	if(oyuncu2vurmagücü > 0) {
	        	        	if(oyuncu2vurmagücü >= oyuncu1dayanmagücü) {
	        	        		
	        	        		if(oyuncu1deste.get(oyuncu2saldiri).equals("asya")) {
	        	        			if(oyuncu2saldiri==0) {
	        	        				oyuncu1asya0 = 3;
	        	        			}
	        	        			if(oyuncu2saldiri==1) {
	        	        				oyuncu1asya1 = 3;
	        	        			}
	        	        			if(oyuncu2saldiri==2) {
	        	        				oyuncu1asya2 = 3;
	        	        			}
	        	        			if(oyuncu2saldiri==3) {
	        	        				oyuncu1asya3 = 3;
	        	        			}
	        	        			if(oyuncu2saldiri==4) {
	        	        				oyuncu1asya4 = 3;
	        	        			}
	        	        			if(oyuncu2saldiri==5) {
	        	        				oyuncu1asya5 = 3;
	        	        			}
	        	        			if(oyuncu2saldiri==6) {
	        	        				oyuncu1asya6 = 3;
	        	        			}
	        	        			if(oyuncu2saldiri==7) {
	        	        				oyuncu1asya7 = 3;
	        	        			}
	        	        			if(oyuncu2saldiri==8) {
	        	        				oyuncu1asya8 = 3;
	        	        			}
	        	        			
	        	        		}
	        	        		
	        	        		if(oyuncu1deste.get(oyuncu2saldiri).equals("kıyametalameti")) {
	        	        			if(oyuncu2saldiri==0) {
	        	        				System.out.println("kıyamet durduruldu.");
	        	        				oyuncu1kıyamet0 = 0;
	        	        			}
	        	        			if(oyuncu2saldiri==1) {
	        	        				System.out.println("kıyamet durduruldu.");
	        	        				oyuncu1kıyamet1 = 0;
	        	        			}
	        	        			if(oyuncu2saldiri==2) {
	        	        				System.out.println("kıyamet durduruldu.");
	        	        				oyuncu1kıyamet2 = 0;
	        	        			}
	        	        			if(oyuncu2saldiri==3) {
	        	        				System.out.println("kıyamet durduruldu.");
	        	        				oyuncu1kıyamet3 = 0;
	        	        			}
	        	        			if(oyuncu2saldiri==4) {
	        	        				System.out.println("kıyamet durduruldu.");
	        	        				oyuncu1kıyamet4 = 0;
	        	        			}
	        	        			if(oyuncu2saldiri==5) {
	        	        				System.out.println("kıyamet durduruldu.");
	        	        				oyuncu1kıyamet5 = 0;
	        	        			}
	        	        			if(oyuncu2saldiri==6) {
	        	        				System.out.println("kıyamet durduruldu.");
	        	        				oyuncu1kıyamet6 = 0;
	        	        			}
	        	        			if(oyuncu2saldiri==7) {
	        	        				System.out.println("kıyamet durduruldu.");
	        	        				oyuncu1kıyamet7 = 0;
	        	        			}
	        	        			if(oyuncu2saldiri==8) {
	        	        				System.out.println("kıyamet durduruldu.");
	        	        				oyuncu1kıyamet8 = 0;
	        	        			}
	        	        			
	        	        			}
	        	        		
	        	        		System.out.println("oyuncu 1 in kartı öldürüldü.");
	        	        		oyuncu1destekart.set(oyuncu2saldiri, bosluk);
	        	        		oyuncu1deste.set(oyuncu2saldiri, " ");
	        	        		oyuncu1dayanmagücü = 0;
	        	        		

	        	        		for(k = 0; k < 9; k++) {
	    				        	
	    				        	if(oyuncu2deste.get(k).equals(" "))
	    				        		deste2boş = 1;
	    				        	
	    				        	else {
	    				        		deste2boş = 0;
	    				        		break;
	    				        	}
	    				        		}
	    				        
	    				        for(k = 0; k < 9; k++) {
	    				        	
	    				        	if(oyuncu2deste.get(k).equals(" ") || oyuncu2deste.get(k).equals("değnek") || oyuncu2deste.get(k).equals("kışla") || oyuncu2deste.get(k).equals("panayır") || oyuncu2deste.get(k).equals("alevtopu") || oyuncu2deste.get(k).equals("zırh") || oyuncu2deste.get(k).equals("meteor") || oyuncu2deste.get(k).equals("alevtopları") || oyuncu2deste.get(k).equals("dolunay") || oyuncu2deste.get(k).equals("kıyamet"))
	    				        		saldirloop1=0;
	    				        	else {
	    				        		deste2ye = 0;
	    				        		saldirloop1=1;
	    				        		break;
	    				        	
	    				        	}
	    				        		}
	    				        
	    				        for(k = 0; k < 9; k++) {
	    				        	
	    				        	if(oyuncu1deste.get(k).equals(" "))
	    				        		deste1boş = 1;
	    				        	
	    				        	else {
	    				        		deste1boş = 0;
	    				        		break;
	    				        		}
	    				        		}
	    				        
	    				        for(k = 0; k < 9; k++) {
	    				        	
	    				        	if(oyuncu1deste.get(k).equals(" ") || oyuncu1deste.get(k).equals("değnek") || oyuncu1deste.get(k).equals("kışla") || oyuncu1deste.get(k).equals("panayır") || oyuncu1deste.get(k).equals("alevtopu") || oyuncu1deste.get(k).equals("zırh") || oyuncu1deste.get(k).equals("meteor") || oyuncu1deste.get(k).equals("alevtopları") || oyuncu1deste.get(k).equals("dolunay") || oyuncu1deste.get(k).equals("kıyamet"))
	    				        		deste1ye=1;
	    				        	else {
	    				        		deste1ye = 0;
	    				        		break;
	    				        	}
	    				        		}
	    				        
		        		        System.out.println("\noyuncu 2 in kartları = \n0. " + oyuncu2deste.get(0) + "\n1. " + oyuncu2deste.get(1) + "\n2. " + oyuncu2deste.get(2) + "\n3. " + oyuncu2deste.get(3) + "\n4. " + oyuncu2deste.get(4) + "\n5. " + oyuncu2deste.get(5) + "\n6. " + oyuncu2deste.get(6) + "\n7. " + oyuncu2deste.get(7) + "\n8. " + oyuncu2deste.get(8) + "\n9. kart özelliklerini görüntüleme\n10.çıkış" );

	        	        		
	        	        	
	        	        	}
	        	        	else if(oyuncu2vurmagücü < oyuncu1dayanmagücü) {
	        	        		System.out.println("kalan can = " + (oyuncu1dayanmagücü - oyuncu2vurmagücü));
		        		        System.out.println("\noyuncu 2 in kartları = \n0. " + oyuncu2deste.get(0) + "\n1. " + oyuncu2deste.get(1) + "\n2. " + oyuncu2deste.get(2) + "\n3. " + oyuncu2deste.get(3) + "\n4. " + oyuncu2deste.get(4) + "\n5. " + oyuncu2deste.get(5) + "\n6. " + oyuncu2deste.get(6) + "\n7. " + oyuncu2deste.get(7) + "\n8. " + oyuncu2deste.get(8) + "\n9. kart özelliklerini görüntüleme\n10.çıkış" );
	        	        		
	        	        		
	        	        		
	        	        		if(oyuncu2saldiri==0)
	            	        		oyuncu1slot0can = oyuncu1dayanmagücü - oyuncu2vurmagücü;
	        	        		if(oyuncu2saldiri==1)
	            	        		oyuncu1slot1can = oyuncu1dayanmagücü - oyuncu2vurmagücü;
	        	        		if(oyuncu2saldiri==2)
	            	        		oyuncu1slot2can = oyuncu1dayanmagücü - oyuncu2vurmagücü;
	        	        		if(oyuncu2saldiri==3)
	            	        		oyuncu1slot3can = oyuncu1dayanmagücü - oyuncu2vurmagücü;
	        	        		if(oyuncu2saldiri==4)
	            	        		oyuncu1slot4can = oyuncu1dayanmagücü - oyuncu2vurmagücü;
	        	        		if(oyuncu2saldiri==5)
	            	        		oyuncu1slot5can = oyuncu1dayanmagücü - oyuncu2vurmagücü;
	        	        		if(oyuncu2saldiri==6)
	            	        		oyuncu1slot6can = oyuncu1dayanmagücü - oyuncu2vurmagücü;
	        	        		if(oyuncu2saldiri==7)
	            	        		oyuncu1slot7can = oyuncu1dayanmagücü - oyuncu2vurmagücü;
	        	        		if(oyuncu2saldiri==8)
	            	        		oyuncu1slot8can = oyuncu1dayanmagücü - oyuncu2vurmagücü;
	            	        	
	        	        		
	        	        	}
	        	        	saldirloop2=0;
	        	        	}
	        	        	else {
	        	        	saldirloop2=0;
	        	        	}
	        	        		
	        	        }
	        			}
	        			}
	        			}
	        		}
	        		
	        		if(oyuncu2saldir == 10)
	        			break;
	        }
	        else 
	        	System.out.println("geçersiz değer");
	            
	            
	        }
	        oyuncu2saldirduzgun = 1;
	        }
	        else
	        	System.out.println("\noyuncu 2 in hiçbir kartı yok");
	        
	

        
        deste1boş = 1;
        deste2boş = 1;
        deste1ye = 1;
        deste2ye = 1;
        saldirloop1 = 1;
        
        oyuncu1turhamle0 = 1;
        oyuncu1turhamle1 = 1;
        oyuncu1turhamle2 = 1;
        oyuncu1turhamle3 = 1;
        oyuncu1turhamle4 = 1;
        oyuncu1turhamle5 = 1;
        oyuncu1turhamle6 = 1;
        oyuncu1turhamle7 = 1;
        oyuncu1turhamle8 = 1;

        oyuncu2turhamle0 = 1;
        oyuncu2turhamle1 = 1;
        oyuncu2turhamle2 = 1;
        oyuncu2turhamle3 = 1;
        oyuncu2turhamle4 = 1;
        oyuncu2turhamle5 = 1;
        oyuncu2turhamle6 = 1;
        oyuncu2turhamle7 = 1;
        oyuncu2turhamle8 = 1;
        
        for(k=0; k<9; k++) {
        	if(oyuncu1deste.get(k).equals("kulübe")) {
        		for(int e= 0; e<9; e++) {
        			if(oyuncu1deste.get(e).equals(" ")) {
        				if(e==0) {
        					oyuncu1deste.set(e, "minyon");
        					oyuncu1destekart.set(e, minyon);
        					oyuncu1slot0saldırıgücü = 1;
        					oyuncu1slot0can = 1;
        					break;
        				}
        				if(e==1) {
        					oyuncu1deste.set(e, "minyon");
        					oyuncu1destekart.set(e, minyon);
        					oyuncu1slot1saldırıgücü = 1;
        					oyuncu1slot1can = 1;
        					break;
        				}
        				if(e==2) {
        					oyuncu1deste.set(e, "minyon");
        					oyuncu1destekart.set(e, minyon);
        					oyuncu1slot2saldırıgücü = 1;
        					oyuncu1slot2can = 1;
        					break;
        				}
        				if(e==3) {
        					oyuncu1deste.set(e, "minyon");
        					oyuncu1destekart.set(e, minyon);
        					oyuncu1slot3saldırıgücü = 1;
        					oyuncu1slot3can = 1;
        					break;
        				}
        				if(e==4) {
        					oyuncu1deste.set(e, "minyon");
        					oyuncu1destekart.set(e, minyon);
        					oyuncu1slot4saldırıgücü = 1;
        					oyuncu1slot4can = 1;
        					break;
        				}
        				if(e==5) {
        					oyuncu1deste.set(e, "minyon");
        					oyuncu1destekart.set(e, minyon);
        					oyuncu1slot5saldırıgücü = 1;
        					oyuncu1slot5can = 1;
        					break;
        				}
        				if(e==6) {
        					oyuncu1deste.set(e, "minyon");
        					oyuncu1destekart.set(e, minyon);
        					oyuncu1slot6saldırıgücü = 1;
        					oyuncu1slot6can = 1;
        					break;
        				}
        				if(e==7) {
        					oyuncu1deste.set(e, "minyon");
        					oyuncu1destekart.set(e, minyon);
        					oyuncu1slot7saldırıgücü = 1;
        					oyuncu1slot7can = 1;
        					break;
        				}
        				if(e==8) {
        					oyuncu1deste.set(e, "minyon");
        					oyuncu1destekart.set(e, minyon);
        					oyuncu1slot8saldırıgücü = 1;
        					oyuncu1slot8can = 1;
        					break;
        				}
        			}
        		}
        		for(int e= 0; e<9; e++) {
        			if(oyuncu1deste.get(e).equals(" ")) {
        				if(e==0) {
        					oyuncu1deste.set(e, "minyon");
        					oyuncu1destekart.set(e, minyon);
        					oyuncu1slot0saldırıgücü = 1;
        					oyuncu1slot0can = 1;
        					break;
        				}
        				if(e==1) {
        					oyuncu1deste.set(e, "minyon");
        					oyuncu1destekart.set(e, minyon);
        					oyuncu1slot1saldırıgücü = 1;
        					oyuncu1slot1can = 1;
        					break;
        				}
        				if(e==2) {
        					oyuncu1deste.set(e, "minyon");
        					oyuncu1destekart.set(e, minyon);
        					oyuncu1slot2saldırıgücü = 1;
        					oyuncu1slot2can = 1;
        					break;
        				}
        				if(e==3) {
        					oyuncu1deste.set(e, "minyon");
        					oyuncu1destekart.set(e, minyon);
        					oyuncu1slot3saldırıgücü = 1;
        					oyuncu1slot3can = 1;
        					break;
        				}
        				if(e==4) {
        					oyuncu1deste.set(e, "minyon");
        					oyuncu1destekart.set(e, minyon);
        					oyuncu1slot4saldırıgücü = 1;
        					oyuncu1slot4can = 1;
        					break;
        				}
        				if(e==5) {
        					oyuncu1deste.set(e, "minyon");
        					oyuncu1destekart.set(e, minyon);
        					oyuncu1slot5saldırıgücü = 1;
        					oyuncu1slot5can = 1;
        					break;
        				}
        				if(e==6) {
        					oyuncu1deste.set(e, "minyon");
        					oyuncu1destekart.set(e, minyon);
        					oyuncu1slot6saldırıgücü = 1;
        					oyuncu1slot6can = 1;
        					break;
        				}
        				if(e==7) {
        					oyuncu1deste.set(e, "minyon");
        					oyuncu1destekart.set(e, minyon);
        					oyuncu1slot7saldırıgücü = 1;
        					oyuncu1slot7can = 1;
        					break;
        				}
        				if(e==8) {
        					oyuncu1deste.set(e, "minyon");
        					oyuncu1destekart.set(e, minyon);
        					oyuncu1slot8saldırıgücü = 1;
        					oyuncu1slot8can = 1;
        					break;
        				}
        			}
        		}
        		System.out.println("kulübe oyuncu 1 in destesine 2 tane minyon ekledi.");
        	}
        }
        
        for(k=0; k<9; k++) {
        	if(oyuncu2deste.get(k).equals("kulübe")) {
        		for(int e= 0; e<9; e++) {
        			if(oyuncu2deste.get(e).equals(" ")) {
        				if(e==0) {
        					oyuncu2deste.set(e, "minyon");
        					oyuncu2destekart.set(e, minyon);
        					oyuncu2slot0saldırıgücü = 1;
        					oyuncu2slot0can = 1;
        					break;
        				}
        				if(e==1) {
        					oyuncu2deste.set(e, "minyon");
        					oyuncu2destekart.set(e, minyon);
        					oyuncu2slot1saldırıgücü = 1;
        					oyuncu2slot1can = 1;
        					break;
        				}
        				if(e==2) {
        					oyuncu2deste.set(e, "minyon");
        					oyuncu2destekart.set(e, minyon);
        					oyuncu2slot2saldırıgücü = 1;
        					oyuncu2slot2can = 1;
        					break;
        				}
        				if(e==3) {
        					oyuncu2deste.set(e, "minyon");
        					oyuncu2destekart.set(e, minyon);
        					oyuncu2slot3saldırıgücü = 1;
        					oyuncu2slot3can = 1;
        					break;
        				}
        				if(e==4) {
        					oyuncu2deste.set(e, "minyon");
        					oyuncu2destekart.set(e, minyon);
        					oyuncu2slot4saldırıgücü = 1;
        					oyuncu2slot4can = 1;
        					break;
        				}
        				if(e==5) {
        					oyuncu2deste.set(e, "minyon");
        					oyuncu2destekart.set(e, minyon);
        					oyuncu2slot5saldırıgücü = 1;
        					oyuncu2slot5can = 1;
        					break;
        				}
        				if(e==6) {
        					oyuncu2deste.set(e, "minyon");
        					oyuncu2destekart.set(e, minyon);
        					oyuncu2slot6saldırıgücü = 1;
        					oyuncu2slot6can = 1;
        					break;
        				}
        				if(e==7) {
        					oyuncu2deste.set(e, "minyon");
        					oyuncu2destekart.set(e, minyon);
        					oyuncu2slot7saldırıgücü = 1;
        					oyuncu2slot7can = 1;
        					break;
        				}
        				if(e==8) {
        					oyuncu2deste.set(e, "minyon");
        					oyuncu2destekart.set(e, minyon);
        					oyuncu2slot8saldırıgücü = 1;
        					oyuncu2slot8can = 1;
        					break;
        				}
        			}
        		}
        		for(int e= 0; e<9; e++) {
        			if(oyuncu2deste.get(e).equals(" ")) {
        				if(e==0) {
        					oyuncu2deste.set(e, "minyon");
        					oyuncu2destekart.set(e, minyon);
        					oyuncu2slot0saldırıgücü = 1;
        					oyuncu2slot0can = 1;
        					break;
        				}
        				if(e==1) {
        					oyuncu2deste.set(e, "minyon");
        					oyuncu2destekart.set(e, minyon);
        					oyuncu2slot1saldırıgücü = 1;
        					oyuncu2slot1can = 1;
        					break;
        				}
        				if(e==2) {
        					oyuncu2deste.set(e, "minyon");
        					oyuncu2destekart.set(e, minyon);
        					oyuncu2slot2saldırıgücü = 1;
        					oyuncu2slot2can = 1;
        					break;
        				}
        				if(e==3) {
        					oyuncu2deste.set(e, "minyon");
        					oyuncu2destekart.set(e, minyon);
        					oyuncu2slot3saldırıgücü = 1;
        					oyuncu2slot3can = 1;
        					break;
        				}
        				if(e==4) {
        					oyuncu2deste.set(e, "minyon");
        					oyuncu2destekart.set(e, minyon);
        					oyuncu2slot4saldırıgücü = 1;
        					oyuncu2slot4can = 1;
        					break;
        				}
        				if(e==5) {
        					oyuncu2deste.set(e, "minyon");
        					oyuncu2destekart.set(e, minyon);
        					oyuncu2slot5saldırıgücü = 1;
        					oyuncu2slot5can = 1;
        					break;
        				}
        				if(e==6) {
        					oyuncu2deste.set(e, "minyon");
        					oyuncu2destekart.set(e, minyon);
        					oyuncu2slot6saldırıgücü = 1;
        					oyuncu2slot6can = 1;
        					break;
        				}
        				if(e==7) {
        					oyuncu2deste.set(e, "minyon");
        					oyuncu2destekart.set(e, minyon);
        					oyuncu2slot7saldırıgücü = 1;
        					oyuncu2slot7can = 1;
        					break;
        				}
        				if(e==8) {
        					oyuncu2deste.set(e, "minyon");
        					oyuncu2destekart.set(e, minyon);
        					oyuncu2slot8saldırıgücü = 1;
        					oyuncu2slot8can = 1;
        					break;
        				}
        			}
        		}
        		System.out.println("kulübe oyuncu 1 in destesine 2 tane minyon ekledi.");
        	}
        }
        
        for(k=0; k<9; k++) {
        	if(oyuncu1deste.get(k).equals("obur")) {
        			oyuncu1cani = oyuncu1cani + 2;
        			System.out.println("obur oyuncu 1 in canını 2 arttırdı ve canı "+oyuncu1cani+" oldu.");
        	}
        }
        for(k=0; k<9; k++) {
        	if(oyuncu2deste.get(k).equals("obur")) {
        		oyuncu2cani = oyuncu2cani + 2;
        		System.out.println("obur oyuncu 2 nin canını 2 arttırdı ve canı "+oyuncu2cani+" oldu.");
        	}
        }

        
        for(k=0; k<9; k++) {
        	if(oyuncu1deste.get(k).equals("kıyametalameti")){
        		if(oyuncu1kıyamet0 == 3 ||oyuncu1kıyamet1 == 3 ||oyuncu1kıyamet2 == 3 ||oyuncu1kıyamet3 == 3 ||oyuncu1kıyamet4 == 3 ||oyuncu1kıyamet5 == 3 ||oyuncu1kıyamet6 == 3 ||oyuncu1kıyamet7 == 3 ||oyuncu1kıyamet8 == 3) {
        			System.out.println("kıyamet alameti oldu.");
        			oyuncu2cani = 0;
        			break;
        		}
        		if(k==0) {
        			System.out.println((3-oyuncu1kıyamet0) +" tur içinde oyuncu 1 in 0. slotundaki kıyamet alameti öldürülmezse oyunu bitirecek");
        			oyuncu1kıyamet0++;
        		}
        		if(k==1) {
        			System.out.println((3-oyuncu1kıyamet1) +" tur içinde oyuncu 1 in 1. slotundaki kıyamet alameti öldürülmezse oyunu bitirecek");
        			oyuncu1kıyamet1++;
        		}
        		if(k==2) {
        			System.out.println((3-oyuncu1kıyamet2) +" tur içinde oyuncu 1 in 2. slotundaki kıyamet alameti öldürülmezse oyunu bitirecek");
        			oyuncu1kıyamet2++;
        		}
        		if(k==3) {
        			System.out.println((3-oyuncu1kıyamet3) +" tur içinde oyuncu 1 in 3. slotundaki kıyamet alameti öldürülmezse oyunu bitirecek");
        			oyuncu1kıyamet3++;
        		}
        		if(k==4) {
        			System.out.println((3-oyuncu1kıyamet4) +" tur içinde oyuncu 1 in 4. slotundaki kıyamet alameti öldürülmezse oyunu bitirecek");
        			oyuncu1kıyamet4++;
        		}
        		if(k==5) {
        			System.out.println((3-oyuncu1kıyamet5) +" tur içinde oyuncu 1 in 5. slotundaki kıyamet alameti öldürülmezse oyunu bitirecek");
        			oyuncu1kıyamet5++;
        		}
        		if(k==6) {
        			System.out.println((3-oyuncu1kıyamet6) +" tur içinde oyuncu 1 in 6. slotundaki kıyamet alameti öldürülmezse oyunu bitirecek");
        			oyuncu1kıyamet6++;
        		}
        		if(k==7) {
        			System.out.println((3-oyuncu1kıyamet7) +" tur içinde oyuncu 1 in 7. slotundaki kıyamet alameti öldürülmezse oyunu bitirecek");
        			oyuncu1kıyamet7++;
        		}
        		if(k==8) {
        			System.out.println((3-oyuncu1kıyamet8) +" tur içinde oyuncu 1 in 8. slotundaki kıyamet alameti öldürülmezse oyunu bitirecek");
        			oyuncu1kıyamet8++;
        		}
        		
        		}
        	}
        
        for(k=0; k<9; k++) {
        	if(oyuncu2deste.get(k).equals("kıyametalameti")){
        		if(oyuncu2kıyamet0 == 3 ||oyuncu2kıyamet1 == 3 ||oyuncu2kıyamet2 == 3 ||oyuncu2kıyamet3 == 3 ||oyuncu2kıyamet4 == 3 ||oyuncu2kıyamet5 == 3 ||oyuncu2kıyamet6 == 3 ||oyuncu2kıyamet7 == 3 ||oyuncu2kıyamet8 == 3) {
        			System.out.println("kıyamet alameti oldu.");
        			oyuncu1cani = 0;
        			break;
        		}
        		if(k==0) {
        			System.out.println((3-oyuncu2kıyamet0) +" tur içinde oyuncu 2 in 0. slotundaki kıyamet alameti öldürülmezse oyunu bitirecek");
        			oyuncu2kıyamet0++;
        		}
        		if(k==1) {
        			System.out.println((3-oyuncu2kıyamet1) +" tur içinde oyuncu 2 in 1. slotundaki kıyamet alameti öldürülmezse oyunu bitirecek");
        			oyuncu2kıyamet1++;
        		}
        		if(k==2) {
        			System.out.println((3-oyuncu2kıyamet2) +" tur içinde oyuncu 2 in 2. slotundaki kıyamet alameti öldürülmezse oyunu bitirecek");
        			oyuncu2kıyamet2++;
        		}
        		if(k==3) {
        			System.out.println((3-oyuncu2kıyamet3) +" tur içinde oyuncu 2 in 3. slotundaki kıyamet alameti öldürülmezse oyunu bitirecek");
        			oyuncu2kıyamet3++;
        		}
        		if(k==4) {
        			System.out.println((3-oyuncu2kıyamet4) +" tur içinde oyuncu 2 in 4. slotundaki kıyamet alameti öldürülmezse oyunu bitirecek");
        			oyuncu2kıyamet4++;
        		}
        		if(k==5) {
        			System.out.println((3-oyuncu2kıyamet5) +" tur içinde oyuncu 2 in 5. slotundaki kıyamet alameti öldürülmezse oyunu bitirecek");
        			oyuncu2kıyamet5++;
        		}
        		if(k==6) {
        			System.out.println((3-oyuncu2kıyamet6) +" tur içinde oyuncu 2 in 6. slotundaki kıyamet alameti öldürülmezse oyunu bitirecek");
        			oyuncu2kıyamet6++;
        		}
        		if(k==7) {
        			System.out.println((3-oyuncu2kıyamet7) +" tur içinde oyuncu 2 in 7. slotundaki kıyamet alameti öldürülmezse oyunu bitirecek");
        			oyuncu2kıyamet7++;
        		}
        		if(k==8) {
        			System.out.println((3-oyuncu2kıyamet8) +" tur içinde oyuncu 2 in 8. slotundaki kıyamet alameti öldürülmezse oyunu bitirecek");
        			oyuncu2kıyamet8++;
        		}
        		
        		}
        	}
        
        for(k=0; k<9; k++) {
        	if(oyuncu1deste.get(k).equals("asya")){
        		
        		
        		if(k==0) {
        			oyuncu1asya0++;
        			System.out.println("asyanın yeni canı = " + oyuncu1asya0);
        			oyuncu1slot0can = oyuncu1asya0;
        		}
        		if(k==1) {
        			oyuncu1asya1++;
        			System.out.println("asyanın yeni canı = " + oyuncu1asya1);
        			oyuncu1slot1can = oyuncu1asya1;
        		}
        		if(k==2) {
        			oyuncu1asya2++;
        			System.out.println("asyanın yeni canı = " + oyuncu1asya2);
        			oyuncu1slot2can = oyuncu1asya2;
        		}
        		if(k==3) {
        			oyuncu1asya3++;
        			System.out.println("asyanın yeni canı = " + oyuncu1asya3);
        			oyuncu1slot3can = oyuncu1asya3;
        		}
        		if(k==4) {
        			oyuncu1asya4++;
        			System.out.println("asyanın yeni canı = " + oyuncu1asya4);
        			oyuncu1slot4can = oyuncu1asya4;
        		}
        		if(k==5) {
        			oyuncu1asya5++;
        			System.out.println("asyanın yeni canı = " + oyuncu1asya5);
        			oyuncu1slot5can = oyuncu1asya5;
        		}
        		if(k==6) {
        			oyuncu1asya6++;
        			System.out.println("asyanın yeni canı = " + oyuncu1asya6);
        			oyuncu1slot6can = oyuncu1asya6;
        		}
        		if(k==7) {
        			oyuncu1asya7++;
        			System.out.println("asyanın yeni canı = " + oyuncu1asya7);
        			oyuncu1slot7can = oyuncu1asya7;
        		}
        		if(k==8) {
        			oyuncu1asya8++;
        			System.out.println("asyanın yeni canı = " + oyuncu1asya8);
        			oyuncu1slot8can = oyuncu1asya8;
        		}
        		
        		}
        	}
        
        for(k=0; k<9; k++) {
        	if(oyuncu2deste.get(k).equals("asya")){
        		
        		
        		if(k==0) {
        			oyuncu2asya0++;
        			System.out.println("asyanın yeni canı = " + oyuncu2asya0);
        			oyuncu2slot0can = oyuncu2asya0;
        		}
        		if(k==1) {
        			oyuncu2asya1++;
        			System.out.println("asyanın yeni canı = " + oyuncu2asya1);
        			oyuncu2slot1can = oyuncu2asya1;
        		}
        		if(k==2) {
        			oyuncu2asya2++;
        			System.out.println("asyanın yeni canı = " + oyuncu2asya2);
        			oyuncu2slot2can = oyuncu2asya2;
        		}
        		if(k==3) {
        			oyuncu2asya3++;
        			System.out.println("asyanın yeni canı = " + oyuncu2asya3);
        			oyuncu2slot3can = oyuncu2asya3;
        		}
        		if(k==4) {
        			oyuncu2asya4++;
        			System.out.println("asyanın yeni canı = " + oyuncu2asya4);
        			oyuncu2slot4can = oyuncu2asya4;
        		}
        		if(k==5) {
        			oyuncu2asya5++;
        			System.out.println("asyanın yeni canı = " + oyuncu2asya5);
        			oyuncu2slot5can = oyuncu2asya5;
        		}
        		if(k==6) {
        			oyuncu2asya6++;
        			System.out.println("asyanın yeni canı = " + oyuncu2asya6);
        			oyuncu2slot6can = oyuncu2asya6;
        		}
        		if(k==7) {
        			oyuncu2asya7++;
        			System.out.println("asyanın yeni canı = " + oyuncu2asya7);
        			oyuncu2slot7can = oyuncu2asya7;
        		}
        		if(k==8) {
        			oyuncu2asya8++;
        			System.out.println("asyanın yeni canı = " + oyuncu2asya8);
        			oyuncu2slot8can = oyuncu2asya8;
        		}
        		
        		}
        	}
        
        for(k = 0; k < 9; k++) {
        	if(oyuncu1deste.get(k).equals("golem")) {
        		if(k==0) {
        			oyuncu1slot0can = oyuncu1slot0can*2;
        			System.out.println("oyuncu 1 0. slot golem in yeni canı = " + oyuncu1slot0can);
        			if(oyuncu1slot0can > 50)
        				oyuncu2cani = 0;
        		}
        		if(k==1) {
        			oyuncu1slot1can = oyuncu1slot1can*2;
        			System.out.println("oyuncu 1 1. slot golem in yeni canı = " + oyuncu1slot1can);
        			if(oyuncu1slot1can > 50)
        				oyuncu2cani = 0;
        		}
        		if(k==2) {
        			oyuncu1slot2can = oyuncu1slot2can*2;
        			System.out.println("oyuncu 1 2. slot golem in yeni canı = " + oyuncu1slot2can);
        			if(oyuncu1slot2can > 50)
        				oyuncu2cani = 0;
        		}
        		if(k==3) {
        			oyuncu1slot3can = oyuncu1slot3can*2;
        			System.out.println("oyuncu 1 3. slot golem in yeni canı = " + oyuncu1slot3can);
        			if(oyuncu1slot3can > 50)
        				oyuncu2cani = 0;
        		}
        		if(k==4) {
        			oyuncu1slot4can = oyuncu1slot4can*2;
        			System.out.println("oyuncu 1 4. slot golem in yeni canı = " + oyuncu1slot4can);
        			if(oyuncu1slot4can > 50)
        				oyuncu2cani = 0;
        		}
        		if(k==5) {
        			oyuncu1slot5can = oyuncu1slot5can*2;
        			System.out.println("oyuncu 1 5. slot golem in yeni canı = " + oyuncu1slot5can);
        			if(oyuncu1slot5can > 50)
        				oyuncu2cani = 0;
        		}
        		if(k==6) {
        			oyuncu1slot6can = oyuncu1slot6can*2;
        			System.out.println("oyuncu 1 6. slot golem in yeni canı = " + oyuncu1slot6can);
        			if(oyuncu1slot6can > 50)
        				oyuncu2cani = 0;
        		}
        		if(k==7) {
        			oyuncu1slot7can = oyuncu1slot7can*2;
        			System.out.println("oyuncu 1 7. slot golem in yeni canı = " + oyuncu1slot7can);
        			if(oyuncu1slot7can > 50)
        				oyuncu2cani = 0;
        		}
        		if(k==8) {
        			oyuncu1slot8can = oyuncu1slot8can*2;
        			System.out.println("oyuncu 1 8. slot golem in yeni canı = " + oyuncu1slot8can);
        			if(oyuncu1slot8can > 50)
        				oyuncu2cani = 0;
        		}
        	}
        }
        
        for(k = 0; k < 9; k++) {
        	if(oyuncu2deste.get(k).equals("golem")) {
        		if(k==0) {
        			oyuncu2slot0can = oyuncu2slot0can*2;
        			System.out.println("oyuncu 2 0. slot golem in yeni canı = " + oyuncu2slot0can);
        			if(oyuncu2slot0can > 50)
        				oyuncu1cani = 0;
        		}
        		if(k==1) {
        			oyuncu2slot1can = oyuncu2slot1can*2;
        			System.out.println("oyuncu 2 1. slot golem in yeni canı = " + oyuncu2slot1can);
        			if(oyuncu2slot1can > 50)
        				oyuncu1cani = 0;
        		}
        		if(k==2) {
        			oyuncu2slot2can = oyuncu2slot2can*2;
        			System.out.println("oyuncu 2 2. slot golem in yeni canı = " + oyuncu2slot2can);
        			if(oyuncu2slot2can > 50)
        				oyuncu1cani = 0;
        		}
        		if(k==3) {
        			oyuncu2slot3can = oyuncu2slot3can*2;
        			System.out.println("oyuncu 2 3. slot golem in yeni canı = " + oyuncu2slot3can);
        			if(oyuncu2slot3can > 50)
        				oyuncu1cani = 0;
        		}
        		if(k==4) {
        			oyuncu2slot4can = oyuncu2slot4can*2;
        			System.out.println("oyuncu 2 4. slot golem in yeni canı = " + oyuncu2slot4can);
        			if(oyuncu2slot4can > 50)
        				oyuncu1cani = 0;
        		}
        		if(k==5) {
        			oyuncu2slot5can = oyuncu2slot5can*2;
        			System.out.println("oyuncu 2 5. slot golem in yeni canı = " + oyuncu2slot5can);
        			if(oyuncu2slot5can > 50)
        				oyuncu1cani = 0;
        		}
        		if(k==6) {
        			oyuncu2slot6can = oyuncu2slot6can*2;
        			System.out.println("oyuncu 2 6. slot golem in yeni canı = " + oyuncu2slot6can);
        			if(oyuncu2slot6can > 50)
        				oyuncu1cani = 0;
        		}
        		if(k==7) {
        			oyuncu2slot7can = oyuncu2slot7can*2;
        			System.out.println("oyuncu 2 7. slot golem in yeni canı = " + oyuncu2slot7can);
        			if(oyuncu2slot7can > 50)
        				oyuncu1cani = 0;
        		}
        		if(k==8) {
        			oyuncu2slot8can = oyuncu2slot8can*2;
        			System.out.println("oyuncu 2 8. slot golem in yeni canı = " + oyuncu2slot8can);
        			if(oyuncu2slot8can > 50)
        				oyuncu1cani = 0;
        		}
        	}
        }
        
        for(k = 0; k < 9; k++) {
        	if(oyuncu1deste.get(k).equals("bıçakçı")) {
        		if(k==0) {
        			oyuncu1slot0saldırıgücü = oyuncu1slot0saldırıgücü+1;
        			System.out.println("oyuncu 1 0. slot bıçakçı nın yeni saldırı gücü = " + oyuncu1slot0saldırıgücü);
        			
        		}
        		if(k==1) {
        			oyuncu1slot1saldırıgücü = oyuncu1slot1saldırıgücü+1;
        			System.out.println("oyuncu 1 1. slot bıçakçı nın yeni saldırı gücü = " + oyuncu1slot1saldırıgücü);
        			
        		}
        		if(k==2) {
        			oyuncu1slot2saldırıgücü = oyuncu1slot2saldırıgücü+1;
        			System.out.println("oyuncu 1 2. slot bıçakçı nın yeni saldırı gücü = " + oyuncu1slot2saldırıgücü);
        			
        		}
        		if(k==3) {
        			oyuncu1slot3saldırıgücü = oyuncu1slot3saldırıgücü+1;
        			System.out.println("oyuncu 1 3. slot bıçakçı nın yeni saldırı gücü = " + oyuncu1slot3saldırıgücü);
        			
        		}
        		if(k==4) {
        			oyuncu1slot4saldırıgücü = oyuncu1slot4saldırıgücü+1;
        			System.out.println("oyuncu 1 4. slot bıçakçı nın yeni saldırı gücü = " + oyuncu1slot4saldırıgücü);
        			
        		}
        		if(k==5) {
        			oyuncu1slot5saldırıgücü = oyuncu1slot5saldırıgücü+1;
        			System.out.println("oyuncu 1 5. slot bıçakçı nın yeni saldırı gücü = " + oyuncu1slot5saldırıgücü);
        			
        		}
        		if(k==6) {
        			oyuncu1slot6saldırıgücü = oyuncu1slot6saldırıgücü+1;
        			System.out.println("oyuncu 1 6. slot bıçakçı nın yeni saldırı gücü = " + oyuncu1slot6saldırıgücü);
        			
        		}
        		if(k==7) {
        			oyuncu1slot7saldırıgücü = oyuncu1slot7saldırıgücü+1;
        			System.out.println("oyuncu 1 7. slot bıçakçı nın yeni saldırı gücü = " + oyuncu1slot7saldırıgücü);
        			
        		}
        		if(k==8) {
        			oyuncu1slot8saldırıgücü = oyuncu1slot8saldırıgücü+1;
        			System.out.println("oyuncu 1 8. slot bıçakçı nın yeni saldırı gücü = " + oyuncu1slot8saldırıgücü);
        			
        		}
        	}
        }
        
        for(k = 0; k < 9; k++) {
        	if(oyuncu2deste.get(k).equals("bıçakçı")) {
        		if(k==0) {
        			oyuncu2slot0saldırıgücü = oyuncu2slot0saldırıgücü+1;
        			System.out.println("oyuncu 2 0. slot bıçakçı nın yeni saldırı gücü = " + oyuncu2slot0saldırıgücü);
        			
        		}
        		if(k==1) {
        			oyuncu2slot1saldırıgücü = oyuncu2slot1saldırıgücü+1;
        			System.out.println("oyuncu 2 1. slot bıçakçı nın yeni saldırı gücü = " + oyuncu2slot1saldırıgücü);
        			
        		}
        		if(k==2) {
        			oyuncu2slot2saldırıgücü = oyuncu2slot2saldırıgücü+1;
        			System.out.println("oyuncu 2 2. slot bıçakçı nın yeni saldırı gücü = " + oyuncu2slot2saldırıgücü);
        			
        		}
        		if(k==3) {
        			oyuncu2slot3saldırıgücü = oyuncu2slot3saldırıgücü+1;
        			System.out.println("oyuncu 2 3. slot bıçakçı nın yeni saldırı gücü = " + oyuncu2slot3saldırıgücü);
        			
        		}
        		if(k==4) {
        			oyuncu2slot4saldırıgücü = oyuncu2slot4saldırıgücü+1;
        			System.out.println("oyuncu 2 4. slot bıçakçı nın yeni saldırı gücü = " + oyuncu2slot4saldırıgücü);
        			
        		}
        		if(k==5) {
        			oyuncu2slot5saldırıgücü = oyuncu2slot5saldırıgücü+1;
        			System.out.println("oyuncu 2 5. slot bıçakçı nın yeni saldırı gücü = " + oyuncu2slot5saldırıgücü);
        			
        		}
        		if(k==6) {
        			oyuncu2slot6saldırıgücü = oyuncu2slot6saldırıgücü+1;
        			System.out.println("oyuncu 2 6. slot bıçakçı nın yeni saldırı gücü = " + oyuncu2slot6saldırıgücü);
        			
        		}
        		if(k==7) {
        			oyuncu2slot7saldırıgücü = oyuncu2slot7saldırıgücü+1;
        			System.out.println("oyuncu 2 7. slot bıçakçı nın yeni saldırı gücü = " + oyuncu2slot7saldırıgücü);
        			
        		}
        		if(k==8) {
        			oyuncu2slot8saldırıgücü = oyuncu2slot8saldırıgücü+1;
        			System.out.println("oyuncu 2 8. slot bıçakçı nın yeni saldırı gücü = " + oyuncu2slot8saldırıgücü);
        			
        		}
        	}
        }
        
        }
        if(oyuncu1cani <= 0 && oyuncu1cani < oyuncu2cani)
        	System.out.println("oyun bitti, oyuncu 2 kazandı.");
        if(oyuncu2cani <= 0 && oyuncu2cani < oyuncu1cani)
        	System.out.println("oyun bitti, oyuncu 1 kazandı.");
    }
}
