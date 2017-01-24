package pl.sda;

import java.util.List;

/**
 * Created by RENT on 2017-01-24.
 */
public class BankData {
    private List<CreditCard> creditCards;
    private Owner owner;
    private int id;

    public BankData(List<CreditCard> creditCards, Owner owner, int id) {
        this.creditCards = creditCards;
        this.owner = owner;
        this.id = id;
    }

    public List<CreditCard> getCreditCards() {
        return creditCards;
    }

    public void setCreditCards(List<CreditCard> creditCards) {
        this.creditCards = creditCards;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
