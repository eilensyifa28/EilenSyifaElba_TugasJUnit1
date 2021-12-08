package com.sqa.main.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.sqa.main.kecepatan.KecepatanRataRata;


public class InputUI {

	KecepatanRataRata kecepatan;
	float jarak;
	
	public InputUI() {
		
		if(kecepatan == null) {
			kecepatan = new KecepatanRataRata();
		}
	}
	
	public void showHitungKecepatan() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Masukan Nilai Untuk Menghitung Rata-Rata Kecepatan");
		
		float jarak = scan.nextFloat();
		float waktu = scan.nextFloat();
		
		System.out.println("Rata-Rata Kecepatan Adalah : " + kecepatan.HitungKecepatan(jarak,waktu));
	}
}
