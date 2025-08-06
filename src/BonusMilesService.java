public class BonusMilesService {
    public int calculate(int price) {
        int miles = price / 20; // 1 миля за каждые 20 рублей
        return miles;
    }
}