package HW_Sem_2.view;

import HW_Sem_2.Entityes.EnegryDrink;

public class GetEnDrResponse {
    private final boolean error;
    private final String errorMessage;
    private final int price;

    public GetEnDrResponse(boolean error, String errorMessage, EnegryDrink Energy) {
        this.error = error;
        this.errorMessage = errorMessage;
        this.price = Energy.getPrice();
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