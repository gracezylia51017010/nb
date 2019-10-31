/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
package bentuk;
class persegi extends bentuk {
    protected int p,l;
public void setSuperP(int p) {
    super.p = p; }
public void setSuperL(int l){
    super.l = 1; }
public void setP(int p){
    this.p = p; }
public void setL(int l){
    this.l =1; }

public void getLuas() {
    System.out.println("Luas Super :"+(super.l*super,p));
    System.out.println("Luas:"+ (this.l*this.p)); }
}
