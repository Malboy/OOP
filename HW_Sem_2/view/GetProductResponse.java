package HW_Sem_2.view;

import HW_Sem_2.Entityes.Coffee;
import HW_Sem_2.Entityes.EnegryDrink;
import HW_Sem_2.Entityes.Juice;

public class GetProductResponse {
    private final boolean error;
    private final String errorMessage;
    private final int price;

    public GetProductResponse(boolean error, String errorMessage, Coffee coffee) {
        this.error = error;
        this.errorMessage = errorMessage;
        this.price = coffee.getPrice();
    }


    public GetProductResponse(boolean error, String errorMessage, EnegryDrink EnDr) {
        this.error = error;
        this.errorMessage = errorMessage;
        this.price = EnDr.getPrice();
    }

    public GetProductResponse(boolean error, String errorMessage, Juice sok) {
        this.error = error;
        this.errorMessage = errorMessage;
        this.price = sok.getPrice();
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
