package HW_Sem_2.view;

import HW_Sem_2.Entityes.Juice;

public class GetJuiceResponse {
    
    private final boolean error;
    private final String errorMessage;
    private final int price;

    public GetJuiceResponse(boolean error, String errorMessage, Juice sok) {
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
