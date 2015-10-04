package edu.fup.ims.services;

import edu.fup.ims.bo.CreditCardBO;
import edu.fup.ims.model.CreditCard;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;

/**
 *
 * @author Luis Eraso
 */
@Stateless
@WebService
public class CreditCardService {
        
    @Inject CreditCardBO creditCardBO;
    
    public Long createCreditCard(String number, String expirytDate, Integer controllNumber, String type, double balance){
        CreditCard creditCard = new CreditCard(number, expirytDate, controllNumber, type, balance);        
        creditCardBO.add(creditCard);        
        return creditCard.getId();
        
    }
    
    public double getCreditCardBalance(String number){         
        // TODO Implementar funci�n en CreditCardBOImpl
        return 2000000.0;
    }
    
}
