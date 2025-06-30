/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

/**
 *
 * @author adityanugraha
 */
public class Session {
    public static int idPegawai;
    public static String nama;
    public static String jabatan;

    public static void setSession(int id, String namaParam, String jabatanParam) {
        idPegawai = id;
        nama = namaParam;
        jabatan = jabatanParam;
    }
}




