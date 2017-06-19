public class FightTV {
    public static void main(String[] args) {
        Comandament comandament = new Comandament();
        MembreFamilia Joan = new MembreFamilia(comandament,"Joan");
        MembreFamilia Anna = new MembreFamilia(comandament,"Anna");
        MembreFamilia Pere = new MembreFamilia(comandament,"Pere");

        Joan.start();
        Anna.start();
        Pere.start();

    }
}
