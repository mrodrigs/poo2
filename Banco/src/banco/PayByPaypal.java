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
public class PayByPaypal implements PayStrategy {
  private static final Map<String, String> DATA_BASE = new HashMap<>();
  private final BufferedReader READER
          = new BufferedReader(new InputStreamReader(System.in));
  private String email;
  private String password;
  private boolean signedIn;
    
  //pesquisar: statick block java
  static{
    DATA_BASE.put("amanda1985", "amanda@ya.com");
    DATA_BASE.put("qwerty", "john@amazon.eu");
  }
  
  @Override
  public void collectPaymentDetails(){
    try{
      while(!signedIn) {
        System.out.println("Enter the user's email:" );
        email = READER.readLine();
        if(verify()){
          System.out.println("Authenticated.");
        } else{
          System.out.println("Wrong email or password.");
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  
  private boolean verify() {
    setSignedIn(email.equals(DATA_BASE.get(password)));
    return signedIn;
  }
  
  @Override
  public boolean pay(int paymentAmount) {
    if(signedIn) {
      System.out.println("Paying " + paymentAmount + " usyng Paypal.");
      return true;
    } else {
      return false;
    }
  }
  
  private void setSignedIn(boolean signedIn) {
    this.signedIn = signedIn;
  }
}
