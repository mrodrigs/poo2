/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Mauricio
 */
public interface PayStrategy {
  boolean pay(int paymentAmount);
  void collectPaymentDetails();
}
