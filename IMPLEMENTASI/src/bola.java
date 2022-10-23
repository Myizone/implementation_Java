/* -----------------------------------------------------------------------------------------------------------
class bola.java ini merupakan implementasi kasus untuk ketentuan 3 dan juga merupakan implementasi 
dari flowchart tabung, kerucut dan bola 
SIMPAM PROGRAM DGN NAMA YG SAMA PERSIS DGN NAMA CLASS INI " bola.java "
instruksi cara menjalankan program :
1. compile aplikasi menggunakan command line (dos)
2. masuk ke dalam direktori file misalkan file disimpan di direktori "F:/STTA/PBO/program/pertemuan3/soal3-4", maka 
   ketikkan perintah berikut ini :
   a. f:
   b. cd STTA/PBO/program/pertemuan3/soal3
   c. dir '(utk mengecek apakah file tsb ada atau tdk)
3. berikan perintah javac bola.java

------------------------------------------------------------------------------------------------------------*/
import java.util.Scanner;	//[[Adalah merupakan coding untuk memasukan paket scanner]]
public class bola {//[Untuk kelasnya adalah kelas bola]
// deklarasi variabel tinggi dan deklarasi obyek link dari class lingkaran 	
	lingkaran link; //[lingkaran dan bertipie link]
	
// Constructor bola dgn r dan t sbg parameter	
	public bola(Double r){
		link = new lingkaran(r);
	}
	private double volume(){
		return ((4*link.luas())/3);
	}
	
	public static void main (String args[]){

		//[lalu untuk membuat instansiasi / objectnya ]
// deklarasi variabel r dan t 
		double r;
		
// deklarasi obyek utk menyimpan nilai jari dan tinggi 
		Scanner jari = new Scanner(System.in);
				
// lalu intuk penginputan data dari untuk jari-jari ialah
	System.out.print(" Silahkan input jari-jari lingkaran : ");
	r= jari.nextDouble();
	lingkaran link =  new lingkaran(r);
			  //^ [Buat data link lalu keywordnya "New", new adalah untuk membuat objek baru]
			  //  [Link yaitu tipenya lingkaran, dimana dia adalah instansiasi baru dari class lingkaran]
	System.out.println();
	bola bol = new bola(r);
	
// hasil dari menghitung volume bola	
	System.out.println("Volume bola dengan Jari-jari = "+link.ambil_jari()+" adalah = "+bol.volume());
	
	
	
	
	
	}
}