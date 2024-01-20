package constructor;

public class Constructor {

    private int number;

    public Constructor(int number) {
        this.number = number;
        System.out.println("Constructor com parâmetro de number criado");
    }

    public Constructor(int number, String name) {
        this.number = number;
        System.out.println("construtor com parâmetro de number e string criado: " + name + ", " + number);
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

}
