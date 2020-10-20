/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo06.pkg10119916.latihan6.kambingstatic;

/**
 *
 * @author 
 * NAMA  : DIAN ARPIAN
 * KELAS : IF10K
 * NIM  `: 10119916
 * Deskripsi Program : Program ini berisi proses pembuatan class dan pemanggilan class
 * 
 */
class Mamalia {
    public static int jumlahKambing;
}

public class KambingStatic {

    // NAMA_KAMBING sebagai konstanta
    public static final String NAMA_KAMBING = "MIDUN";
    
    public static void main(String[] args) {
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " memiliki banyak sebanyak" + Mamalia.jumlahKambing);
    }
}