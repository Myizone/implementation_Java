/* -----------------------------------------------------------------------------------------------------------
class tabung.java ini merupakan implementasi kasus untuk ketentuan 3 dan juga merupakan implementasi 
dari flowchart tabung, kerucut dan bola 
SIMPAM PROGRAM DGN NAMA YG SAMA PERSIS DGN NAMA CLASS INI " tabung.java "
instruksi cara menjalankan program :
1. compile aplikasi menggunakan command line (dos)
2. masuk ke dalam direktori file misalkan file disimpan di direktori "F:/STTA/PBO/program/pertemuan3/soal3-4", maka 
   ketikkan perintah berikut ini :
   a. f:
   b. cd STTA/PBO/program/pertemuan3/soal3
   c. dir '(utk mengecek apakah file tsb ada atau tdk)
3. berikan perintah javac tabung.java

------------------------------------------------------------------------------------------------------------*/
import java.util.Scanner;
public class tabung {
// deklarasi variabel tinggi dan deklarasi obyek link dari class lingkaran 	
	int tinggi;
	lingkaran link;
	
// Constructor tabung dgn r dan t sbg parameter	
	public tabung(Double r, int t){
		link = new lingkaran(r);
		this.tinggi= t;
	}
		
	private void set_tinggi (int t){
		this.tinggi=t;
	}
	private int get_tinggi(){
		return tinggi;
	}
	private double volume(){
		return (link.luas()*tinggi);
	}
	
	public static void main (String args[]){
// deklarasi variabel r dan t 
		double r;
		int t;
		
// deklarasi obyek utk menyimpan nilai jari dan tinggi 
		Scanner jari = new Scanner(System.in);
		Scanner tinggi = new Scanner(System.in);
		
// input data dari keyboard utk jari-jari
	System.out.print(" Silahkan input jari-jari lingkaran : ");
	r= jari.nextDouble();
	lingkaran link =  new lingkaran(r);
	System.out.println();
	
// input data dari keyboard utk tinggi	
	System.out.print("Silahkan inputkan tinggi Tabung : ");
	t=tinggi.nextInt();
	tabung tab =new tabung(r,t);
	System.out.println();
	
//menghitung volume tabung	
	System.out.println("Volume Tabung dengan Jari-jari = "+link.ambil_jari()+" dan tinggi tabung = "+tab.get_tinggi()+" adalah = "+tab.volume());
	
	
	
	
	
	}
}