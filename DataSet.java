/*  
 * SIMULATION
 * Gradiente descendente
 * JOSÉ ÁNGEL CARDONA GARCÍA
 * 07/06/2022

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handsOn7;

/**
 *
 * @author ANGEL
 */
public class DataSet {
    
    double [] x = {23,26,30,34,43,48,52,57,58};
    double [] y = {651,762,856,1063,1190,1298,1421,1440,1518};
    
    double b0 = 0;
    double b1 = 0;
    double a = 0.003;
    double error = 0;
    
    public double[] getMatrizx(){
        return x;
    }
    public double[] getMatrizy(){
        return y;
    }
    public double getB0(){
        return b0;
    }
    public double getB1(){
        return b1;
    }
    public double getA(){
        return a;
    }
    public double getError(){
        return error;
    }
}
