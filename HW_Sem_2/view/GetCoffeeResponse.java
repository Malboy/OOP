package HW_Sem_2.view;

import HW_Sem_2.Entityes.Coffee;

public class GetCoffeeResponse {
    
    private final boolean error;
    private final String errorMessage;
    private final int price;

    public GetCoffeeResponse(boolean error, String errorMessage, Coffee coffee) {
        this.error = error;
        this.errorMessage = errorMessage;
        this.price = coffee.getPrice();
    }

    @Override
    public String toString() {
        return "GetDoughByNameResponse{" +
                "error=" + error +
                ", errorMessage='" + errorMessage + '\'' +
                ", price=" + price +
                '}';
    }

}
