/* -----------------------------------------------------------------------------------------------------------
class lingkaran.java ini merupakan implementasi kasus untuk ketentuan 3 dan juga merupakan implementasi 
dari flowchart tabung, kerucut dan bola 
SIMPAM PROGRAM DGN NAMA YG SAMA PERSIS DGN NAMA CLASS INI " lingkaran.java "
instruksi cara menjalankan program :
1. compile aplikasi menggunakan command line (dos)
2. masuk ke dalam direktori file misalkan file disimpan di direktori "F:/STTA/PBO/program/pertemuan3/soal3-4", maka 
   ketikkan perintah berikut ini :
   a. f:
   b. cd STTA/PBO/program/pertemuan3/soal3
   c. dir '(utk mengecek apakah file tsb ada atau tdk)
3. berikan perintah javac lingkaran.java

------------------------------------------------------------------------------------------------------------*/
//[Class lingkaran ini adalah template]
public class lingkaran{ //[Public class dengan nama lingkaran]
//deklarasi variabel 
	double jari;
	
/* contstuctor dari class lingkaran dgn jari sbg parameter
	pada construct parameter yg digunakan merupakan data yg akan dibawa serta dalam class tsb 
*/
	public lingkaran(double jari){
		this.jari=jari;//[Perintah jari adalah "Jari"]
	}
	
/* ----------------------------------------------------------------------------------------------------------
method utk menginputkan jari dari keyboard
----------------------------------------------------------------------------------------------------------*/
public void input_jari(double r){
	
// keyword "this " mengartikan bahwa nilai atau value dari variabel jari sama dengan nilai atau value dari parameter r 
	this.jari = r; //[untuk perintah jari tersebut adalah "r"]
}
public double ambil_jari(){
	return jari;
}
public double luas (){
	double luas=Math.PI * jari * jari;
	return luas;
}
public double keliling(){
	double keliling=2 * Math.PI *jari;
	return keliling;
}

}