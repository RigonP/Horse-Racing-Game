/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package kafshagaruese_shk2;

import static java.lang.Thread.sleep;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author RigonPira
 */
public class KafshaGaruese_SHK2 extends Thread{
    private JLabel fusha;
    private Hipodromi kali;
    
    public KafshaGaruese_SHK2(JLabel fusha, Hipodromi kali) {
        this.fusha = fusha;
        this.kali = kali;
    }
    
    @Override
    public void run(){
        
        int kali1 = 0;
        int kali2 = 0;
        int kali3 = 0;
        int kali4 = 0;
        
        Random rand = new Random();
        while(true){
            
            try{
                Thread.sleep(rand.nextInt(2000));
                kali1 = kali.getKaliPare().getLocation().x;
                kali2 = kali.getKaliDyte().getLocation().x;
                kali3 = kali.getKaliTrete().getLocation().x;
                kali4 = kali.getKaliKatert().getLocation().x;
                
                if(kali1 < kali.getFinish().getLocation().x - 110 && kali2 < kali.getFinish().getLocation().x - 110 && kali3 < kali.getFinish().getLocation().x - 110 && kali4 < kali.getFinish().getLocation().x - 110){
                    fusha.setLocation(fusha.getLocation().x + 10, fusha.getLocation().y);   
                    kali.repaint();   
                }else{
                    break;
                }
                
            }catch(InterruptedException e){
                System.out.println(e);
            }
            
           
            if(fusha.getLocation().x >= kali.getFinish().getLocation().x - 110){
                if(kali1 > kali2 && kali1>kali3 && kali1 > kali4){
                   JOptionPane.showMessageDialog(null, "Fitues eshte kali i pare");
                }else if(kali2 > kali1 && kali2 > kali3 && kali2 > kali4){
                    JOptionPane.showMessageDialog(null, "Fitues eshte kali i dyte");
                }else if(kali3 > kali1 && kali3 > kali2 && kali3 > kali4){
                    JOptionPane.showMessageDialog(null, "Fitues eshte kali i trete");
                }else if(kali4 > kali1 && kali4 > kali2 && kali4 > kali3){
                    JOptionPane.showMessageDialog(null, "Fitues eshte kali i katert");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Barazim");
                }
            }
            
        }
    }
    
}
