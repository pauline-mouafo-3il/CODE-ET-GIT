public class FactureManager {

    // Méthode principale pour calculer le total de la facture
    public double calculerFacture(String typeProduit, int quantite, double prixUnitaire) {
        double total = calculerTotalBrut(quantite, prixUnitaire);
        total = appliquerReductionCategorie(typeProduit, total);
        total = appliquerReductionSupplementaire(total);
        return total;
    }

    // Méthode pour calculer le total brut (quantité * prix unitaire)
    private double calculerTotalBrut(int quantite, double prixUnitaire) {
        return quantite * prixUnitaire;
    }

    // Méthode pour appliquer les réductions selon la catégorie de produit
    private double appliquerReductionCategorie(String typeProduit, double total) {
        double reduction = 0;

        switch (typeProduit) {
            case "Alimentaire":
                reduction = 0.05; // Réduction de 5%
                break;
            case "Electronique":
                reduction = 0.1; // Réduction de 10%
                break;
            case "Luxe":
                reduction = 0.15; // Réduction de 15%
                break;
        }

        return total - (total * reduction);
    }

    // Méthode pour appliquer une réduction supplémentaire si le total dépasse 1000
    private double appliquerReductionSupplementaire(double total) {
        if (total > 1000) {
            total -= total * 0.05; // Réduction supplémentaire de 5%
        }
        return total;
    }
}

