/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmahasiswa;
import javax.swing.JOptionPane;

/**
 *
 * @author SHOPIA
 */
public class HitungNilaiMahasiswa {
    void input(){
        int nilai;
        String nama,MK,grade;
        
     nama = JOptionPane.showInputDialog("Masukan Nama Anda : ");
     nilai = Integer.parseInt(JOptionPane.showInputDialog("Masukan Nilai Anda : "));
     MK = JOptionPane.showInputDialog("Masukan Nama Mata Kuliah Anda : ");
     
     
        
        if(nilai >= 85 && nilai <= 100){
            grade = "A";
            JOptionPane.showMessageDialog(null, "Nama : "+ nama + "\nnilai anda : " + nilai + 
            "\nAnda lulus pada mata kuliah : " + MK +"\ngrade : "+ grade,"keterangan",JOptionPane.INFORMATION_MESSAGE);
        }else if(nilai >= 80 && nilai <= 85){
            grade = "A-";
            JOptionPane.showMessageDialog(null, "Nama : "+ nama + "\nnilai anda : " + nilai + 
            "\nAnda lulus pada mata kuliah : " + MK +"\ngrade : "+ grade,"keterangan",JOptionPane.INFORMATION_MESSAGE);
        }else if(nilai >= 75 && nilai <= 85) {
            grade = "B+";
            JOptionPane.showMessageDialog(null, "Nama : "+ nama + "\nnilai anda : " + nilai + 
            "\nAnda lulus pada mata kuliah : " + MK +"\ngrade : "+ grade,"keterangan",JOptionPane.INFORMATION_MESSAGE);
        }else if(nilai >= 70 && nilai <= 75 ){
            grade = "B";
            JOptionPane.showMessageDialog(null, "Nama : "+ nama + "\nnilai anda : " + nilai +
            "\nAnda lulus pada mata kuliah : " + MK +"\ngrade : "+ grade,"keterangan",JOptionPane.INFORMATION_MESSAGE);
        }else if(nilai >= 65 && nilai <= 70){
            grade = "B-";
            JOptionPane.showMessageDialog(null, "Nama : "+ nama + "\nnilai anda : " + nilai +
            "\nAnda lulus pada mata kuliah : " + MK + "\ngrade : "+ grade,"keterangan",JOptionPane.INFORMATION_MESSAGE);
        }else if(nilai >= 60 && nilai <= 65){
            grade = "C+";
            JOptionPane.showMessageDialog(null, "Nama : "+ nama + "\nnilai anda : " + nilai +
            "\nAnda lulus pada mata kuliah : " + MK + "\ngrade : "+ grade,"keterangan",JOptionPane.INFORMATION_MESSAGE);
        }else if(nilai >=55 && nilai <= 60){
            grade = "C";
            JOptionPane.showMessageDialog(null, "Nama : "+ nama + "\nnilai anda : " + nilai +
            "\nAnda lulus pada mata kuliah : " + MK + "\ngrade : "+ grade,"keterangan",JOptionPane.INFORMATION_MESSAGE);
        }else if(nilai >= 50 && nilai <=55) {
            grade = "C-";
            JOptionPane.showMessageDialog(null, "Nama : "+ nama + "\nnilai anda : " + nilai +
            "\nAnda tidak lulus pada mata kuliah : " + MK + "\ngrade : "+ grade,"keterangan",JOptionPane.INFORMATION_MESSAGE);
        }else if(nilai >= 45 && nilai <= 50) {
            grade = "D";
            JOptionPane.showMessageDialog(null, "Nama : "+ nama + "\nnilai anda : " + nilai +
            "\nAnda tidak lulus pada mata kuliah : " + MK + "\ngrade : "+ grade,"keterangan",JOptionPane.INFORMATION_MESSAGE);
        }else if(nilai >= 40 && nilai <= 1){
            grade = "E";
            JOptionPane.showMessageDialog(null, "Nama : "+ nama + "\nnilai anda : " + nilai +
            "\nAnda tidak lulus pada mata kuliah : " + MK + "\ngrade : "+ grade,"keterangan",JOptionPane.INFORMATION_MESSAGE);
        }else {
            JOptionPane.showMessageDialog(null,"INPUTKAN DATA YANG BENAR!!","KETERANGAN",JOptionPane.INFORMATION_MESSAGE);
        }
        
  }
}
