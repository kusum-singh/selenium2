package Introduction;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

import javax.sound.midi.Soundbank;

public class JAva_Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String kks	= "Kusum Singh";
//		int k = 110;
//		char kkmkm = 'k';
//		double kn = 1.02;
//		float ks = 1.5f;
//		System.out.println(kks + " scored " + k + " marks in her ibm assesment");	
//		
//		//2 types to define Java
//		int[] kk = new int[5];
//		kk[0] = 1;
//		kk[1] = 3;
//		kk[2] = 7;
//		kk[3] = 9;
//		kk[4] = 90;
//		
//		
//		int[] arr = {12,34,56,67,78,9,810};
//		
//		System.out.println(kk[2]);
		
//		for (int i=0; i<kk.length ; i++) {
//			System.out.println(kk[i]);	
//		}
//		System.out.println(Arrays.toString(kk));
//		for(int i=0; i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
//		System.out.println(Arrays.toString(arr));
//		
//		String[] sh = {"kusum" , "Singh", "Krishna" };
//		for(String s :sh) {
//			System.out.println(Arrays.toString(sh));
//		}
		
//		String kks = "Kusum  krishna  Singh";
//		String[] k = kks.split("  ");
//		System.out.println(k[1].trim());
//		System.out.println(k[0]);
//		System.out.println(k[2].trim());
		
		JAva_Practise j = new JAva_Practise();
		System.out.println(j.name());


	}

	public String name() {
		return "my name is kusum singh";
	}
}
