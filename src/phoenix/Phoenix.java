/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package phoenix;

import com.phoenix.screens.SplashScreen;

/**
 *
 * @author Lucifer
 */
public class Phoenix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SplashScreen sp = new SplashScreen();
            sp.setVisible(true);
    }
    
}

/**
 *  try {
            splashScreen sp = new splashScreen();
            sp.setVisible(true);
            for (int i = 0; i <= 100; i++) {

                Thread.sleep(70);
                sp.progressBar.setValue(i);

            }
        } catch (InterruptedException ex) {
            Logger.getLogger(splashScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
 */