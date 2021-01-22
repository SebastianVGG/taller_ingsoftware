/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carrito;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Sebastian
 */
public class NewClass {
                LocalDate date = LocalDate.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
              System.out.println(date.format(formatter));
}
