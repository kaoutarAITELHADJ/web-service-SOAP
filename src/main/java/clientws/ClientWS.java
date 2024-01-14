package clientws;

import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

import java.util.List;


public class ClientWS {
    public static void main(String[] args) {
        BanqueService proxy = new BanqueWS().getBanqueServicePort();
        System.out.println(proxy.conversionEuroToDh(300));

        Compte cp = proxy.getCompte(3);
        System.out.println("Le code= "+cp.getCode());
        System.out.println("Le solde= "+cp.getSolde());
        System.out.println("La date de création: "+cp.getDateCration());

        List<Compte> compteList = proxy.listComptes();
        for (Compte c : compteList){
            System.out.println("********************")  ;
            System.out.println("Le code= "+c.getCode());
            System.out.println("Le solde= "+c.getSolde());
            System.out.println("La date de création: "+c.getDateCration());
        }

    }
}
