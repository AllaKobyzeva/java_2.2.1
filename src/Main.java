public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int miles1 = service.calculateMiles(10_000);
        System.out.println(miles1);

        int miles2 = service.calculateMiles(20);
        System.out.println(miles2);

        int miles3 = service.calculateMiles(500);
        System.out.println(miles3);

        int miles4 = service.calculateMiles(28_574);
        System.out.println(miles4);

        int miles5 = service.calculateMiles(5);
        System.out.println(miles5);
    }

}