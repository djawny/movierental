package pl.sda;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private List<CreditCard> creditCards = new ArrayList<>();
    private Owner owner;
    private int id;

    public Account() {
    }

    public Account(List<CreditCard> creditCards, Owner owner, int id) {
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

    @Override
    public String toString() {
        return "Account{" +
                "creditCards=" + creditCards +
                ", owner=" + owner +
                ", id=" + id +
                '}';
    }
}
