/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handsOn7;

/**
 *
 * @author ANGEL
 */
class HelperArithmetic {
    
    DataSet DS = new DataSet();
    
    double [] aux = DS.getMatrizx();
    double [] auy = DS.getMatrizy();
    double CalculateB0;
    double CalculateB1;
    
    public double CalculateB0(double b0, double b1){
        for(int i = 0; i < 9; i++){
            CalculateB0 =+ (auy[i] - (b0 + b1 * aux[i]));
        }
        CalculateB0 = -2 * CalculateB0 / 9;
        return CalculateB0;
    }
    public double CalculateB1(double b0, double b1){
        for(int i = 0; i < 9; i++){
            CalculateB1 =+ (auy[i] - (b0 + b1 * aux[i]));
        }
        return CalculateB1;
    }
}
