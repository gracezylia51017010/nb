/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum5;

/**
 *
 * @author User
 */
import java.io.*;
        public class Praktikum5 { 
        private double radius;
         public Praktikum5(double radius){
             this.radius=radius;
         }
    /**
     * @param args the command line arguments
     */
    public void luas() {
        double luas= 3.14*radius*radius;
        System.out.println("Luas Lingkaran:  "+luas);
        // TODO code application logic here
    }
    
    public void keliling(){
        double keliling= 2.0*3.14*radius;
        System.out.println("Keliling Lingkaran: "+keliling);
    }
            public static void main(String[] args) throws Exception{
            DataInputStream dis= new DataInputStream(System.in);
                System.out.print("Input radius:  ");
                String input= dis.readLine();
                double i= Double.parseDouble(input);
                Praktikum5 A= new Praktikum5(i);
                A.luas();
                A.keliling();
        }
    }
       
           
            

