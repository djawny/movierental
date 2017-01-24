package pl.sda;

/**
 * Created by RENT on 2017-01-24.
 */
public class CreditCard {
    private int number;
    private int money;
    private String currency;

    public CreditCard() {
    }

    public CreditCard(int number, int money, String currency) {
        this.number = number;
        this.money = money;
        this.currency = currency;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
