/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handsOn7;

import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;

/**
 *
 * @author ANGEL
 */
public class GRAgent extends Agent{
    
    
    @Override
    protected void setup(){
        
        System.out.println("Agent " + getLocalName() + "Started");
        addBehaviour(new MyOneShotBehaviour());
        
    }
    private class MyOneShotBehaviour extends OneShotBehaviour{
        
        @Override
        public void action(){
            
            Gradiente GR = new Gradiente();
            
            System.out.println("");
            GR.displayGradienteEquation();
            System.out.println("");
            GR.Beta0();
            GR.Beta1();
            System.out.println("");
            GR.Error();
            System.out.println("");
            GR.predict();
            
        }
        
        @Override
        public int onEnd(){
            myAgent.doDelete();
            return super.onEnd();
        }
    }
}
