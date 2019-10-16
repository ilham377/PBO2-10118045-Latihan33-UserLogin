/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10118045latihan33userlogin;

import java.util.Scanner;

/**
 *
 * @author 
 * Nama     :   Muhammad Ilham Apriyadi
 * Kelas    :   IF 2
 * NIM      :   10118045
 * Deskripsi Program : use login
 */

public class PBO10118045Latihan33UserLogin {

    /**
     * @param args the command line arguments
     */
    private static String usName, passWord;
    
    public static void main(String[] args) {
        // TODO code application logic here
                
        User user = new User();
        
        System.out.print("Masukkan Username = ");
        Scanner scanner = new Scanner(System.in);
        usName = scanner.next();
        System.out.print("Masukkan Password = ");
        Scanner scanner1 = new Scanner(System.in);
        passWord = scanner1.next();
        user.pengecekkanLogin(usName, passWord);
    }
    
}
