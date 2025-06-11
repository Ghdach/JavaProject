public class Chemise {
    int id;
    String color;
    String description;
    int quantity;

    void addChemise(int nbm){
        quantity += nbm;
    }

    void updateChemise(int nbm){
        quantity -= nbm;
    }

    void displayChemise(){
        System.out.println("Id product :"+ id + "Color product: " + color + " Description product: " + description + "Quantity product: " + quantity);
    }

    public static void main(String[] args){
        Chemise chemise = new Chemise();
        chemise.id = 1;
        chemise.color = "Blanche";
        chemise.description = "Chemise blanche";
        chemise.quantity = 10;

        System.out.println("Ajouter : " + chemise.quantity);
        chemise.addChemise(2);
        chemise.displayChemise();

        chemise.updateChemise(5);

        chemise.displayChemise();
    }
}
