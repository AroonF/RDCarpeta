/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.renombrar;

import java.io.File;

/**
 *
 * @author aroon
 */
public class Renombrar {

    public static void main(String[] args) {
       String path = "C:\\Users\\aroon\\Desktop\\RD";
        File mainPath = new File(path);
        Directorios.renombrarCarpetas(mainPath);
    }
}
