/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.io.IOException;

/**
 *
 * @author Mauricio
 */
public class Demo {
  private static Map<Integer, Integer> priceOnProducts = new HashMap<>();
  private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  private static Order order = new Order();
  private static PayStrategy strategy;
  
  static {
    priceOnProducts.put(1, 2200);
    priceOnProducts.put(2, 1850);
    priceOnProducts.put(3, 1100);
    priceOnProducts.put(4, 890);
  }
}
