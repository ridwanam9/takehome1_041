/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.classc.data_penjualan;


import org.springframework.stereotype.Controller;


/**
 *
 * @author DELL
 */
@Controller
public class Prosesdata {
    
    int cost;
    public int early_cost(String a, String b){
        int harga_awal = 0;
        
        int inta = Integer.parseInt(a);
        int intb = Integer.parseInt(b);
        
        harga_awal = inta * intb;
        cost = harga_awal;
        return harga_awal;
    }
    
    public String diskon(){
        String dis;
        
        if (cost <= 10000){
            dis = "0%";
        }
        else if( cost > 10000 && cost <= 50000){
            dis = "5%";
        }
        else {
            dis = "10%";
        }
        return dis;
    }
    
    public int harga_diskon(){
        int dis_pri;
        
        if (cost <= 10000){
            dis_pri = cost * 0 / 100;
        }
        else if( cost > 10000 && cost <= 50000){
            dis_pri = cost * 5 / 100;
        }
        else {
            dis_pri = cost * 10 / 100;
        }
        
        return dis_pri;
    }
    
    int total_pri;
    public int harga_total(){
        total_pri = 0;
        
        total_pri = cost - harga_diskon();
        
        return total_pri;
    }
    
//    public int kembalian(){
//    
//        int kembali = 0;
//        
//        int uang_anda = 0;
//        
//        
//        
//        return kembali;
//        
//    }
    
    
}
