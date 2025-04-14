public class Race {
    private String winnerName = "";
    private int winnerDistance = 0;

    public void checkWinner(Car car) {
        int distance = car.getSpeed() * 24;
        if (distance > winnerDistance) {
            winnerDistance = distance;
            winnerName = car.getName();
        }
    }

    public String getWinnerName() {
        return winnerName;
    }
}
