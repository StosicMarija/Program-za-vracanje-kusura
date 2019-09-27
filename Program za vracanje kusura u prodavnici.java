package petidomaci;

import java.util.Scanner;

public class Prvizadatak {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	       int brojac1,brojac2,brojac5,brojac10,brojac20;
	       brojac1=brojac2=brojac5=brojac10=brojac20=0;
	       int brojac=1;
	       double cena,kolicina,prezbir=0,zbir=0,kusur,novac;        
	       while(brojac>=1) {
	           if(brojac==1) {
	               System.out.printf("Unesite cenu %d. proizvoda: ",brojac);
	           }
	           else if(brojac>1) {
	               System.out.printf("Unesite cenu %d. proizvoda ili (-1) ako nema vise proizvoda ",brojac);
	           }
	           cena= sc.nextDouble();
	           if(cena==-1) {
	               break;
	           }
	           else {
	               System.out.printf("Unesite kolicinu %d. proizvoda: ",brojac);
	               kolicina= sc.nextDouble();
	               prezbir=cena*kolicina;
	               zbir+=prezbir;
	               brojac++;
	           }        }
	       if(zbir>0) {
	           System.out.printf("Ukupna cena proizvoda je: %.0f",zbir);
	       }        System.out.println("\nKoliko vam je novca dao kupac?");
	       novac= sc.nextDouble();
	       while(true) {
	           if(novac>zbir) {
	               kusur=Math.round((novac-zbir));
	               System.out.printf("Kusur je: %.0f",kusur);
	               break;
	           }
	           else {
	               System.out.println("\nKoliko vam je novca dao kupac?");
	               novac=sc.nextDouble();
	               continue;
	           }
	       }
	       while(kusur>0) {
	           if(kusur>=20) {
	               kusur-=20;
	               brojac20++;
	           }
	           else if(kusur>=10) {
	               kusur-=10;
	               brojac10++;
	           }
	           else if(kusur>=5) {
	               kusur-=5;
	               brojac5++;
	           }
	           else if(kusur>=2) {
	               kusur-=2;
	               brojac2++;
	           }
	           else if(kusur>=1) {
	               kusur-=1;
	               brojac1++;
	           }        }
	       System.out.println("\nDa biste vratili najmanji broj kovanica potrebno je:");
	       System.out.println("Od 20 dinara: "+brojac20+" moneta");
	       System.out.println("Od 10 dinara: "+brojac10+" moneta");
	       System.out.println("Od 5 dinara: "+brojac5+" moneta");
	       System.out.println("Od 2 dinara: "+brojac2+" moneta");
	       System.out.println("Od 1 dinara: "+brojac1+" moneta");

	}
}