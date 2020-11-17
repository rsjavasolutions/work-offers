import service.JustJoinItService;

public class Run {
    public static void main(String[] args) {

        JustJoinItService justJoinItService = new JustJoinItService();

        System.out.print("Liczba ofert na just join it: ");
        System.out.println(justJoinItService.getAllOffers().size());

        System.out.println("Firma + miasto");
        justJoinItService.getAllOffers()
                .forEach(x -> System.out.println(x.getCompanyName() + " " + x.getCity()));
    }
}
