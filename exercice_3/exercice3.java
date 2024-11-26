
public class StockManager {

    /**
     * Gère une opération sur le stock (ajout ou retrait).
     * @param typeOperation Le type d'opération ("ajout" ou "retrait").
     * @param produit Le nom du produit concerné.
     * @param quantite La quantité à ajouter ou retirer.
     * @param stock Le stock actuel du produit.
     */
    public void gererStock(String typeOperation, String produit, int quantite, int stock) {
        switch (typeOperation) {
            case "ajout":
                stock = ajouterAuStock(produit, quantite, stock);
                break;
            case "retrait":
                stock = retirerDuStock(produit, quantite, stock);
                break;
            default:
                afficherErreurOperation();
                break;
        }
    }

    /**
     * Ajoute une quantité au stock.
     * @param produit Le nom du produit.
     * @param quantite La quantité à ajouter.
     * @param stock Le stock actuel.
     * @return Le nouveau stock après l'ajout.
     */
    private int ajouterAuStock(String produit, int quantite, int stock) {
        stock += quantite;
        System.out.println("Produit : " + produit + ", Stock après ajout : " + stock);
        return stock;
    }

    /**
     * Retire une quantité du stock si possible.
     * @param produit Le nom du produit.
     * @param quantite La quantité à retirer.
     * @param stock Le stock actuel.
     * @return Le nouveau stock après le retrait, ou l'ancien stock si insuffisant.
     */
    private int retirerDuStock(String produit, int quantite, int stock) {
        if (stock >= quantite) {
            stock -= quantite;
            System.out.println("Produit : " + produit + ", Stock après retrait : " + stock);
        } else {
            System.out.println("Stock insuffisant pour le produit : " + produit);
        }
        return stock;
    }

    /**
     * Affiche un message d'erreur pour une opération inconnue.
     */
    private void afficherErreurOperation() {
        System.out.println("Opération inconnue.");
    }
}
