


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Michael Maria Deny
 */
public class rnd_gen 
{  
    public static int rand__()   
    {  
    int min = 5000000;  
    int max = 500000000;  
        int b = (int)(Math.random()*(max-min+1)+min); 
        return b;
    }  
}  
