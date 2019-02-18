/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116058.latihan26.waktu;

import java.text.DateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Tanggal {

    public String getTanggal() {
        DateFormat dateFormat = new SimpleDateFormat("EEE dd MMMM YYY HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

}