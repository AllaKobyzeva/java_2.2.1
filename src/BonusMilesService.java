public class BonusMilesService {
    public int calculateMiles(int price) {
        int mile = 20;
        int miles = (int) (price / mile);

        return miles;
    }
}