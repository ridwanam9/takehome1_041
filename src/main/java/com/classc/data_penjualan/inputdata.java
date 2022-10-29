/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.classc.data_penjualan;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

/**
 *
 * @author DELL
 */
@Controller
public class Inputdata {
    
    String nama_barang;
    String harga_kilo;
    String jumlah_beli;
    
    public void input(HttpServletRequest data, Model model)
    {
        
        nama_barang = data.getParameter("var_name");
        harga_kilo = data.getParameter("var_cost");
        jumlah_beli = data.getParameter("var_amount");
    }
    
}
