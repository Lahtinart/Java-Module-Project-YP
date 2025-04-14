public class Race {
    private String winnerName = "";
    private int winnerDistance = 0;
    final int LEMANS = 24;

    public void checkWinner(Car car) {
        int distance = car.getSpeed() * LEMANS;
        if (distance > winnerDistance) {
            winnerDistance = distance;
            winnerName = car.getName();
        }
    }

    public String getWinnerName() {
        return winnerName;
    }
}
