package OregonTrail.view;

/**
 *
 * @author Jocelyn Tucker
 */
public class GeneralStoreView extends View {

    public GeneralStoreView() {
        super("\nWelcome to the General Store. These are the items we carry and their prices:"
                + "\nFood: $0.20/lb"
                + "\nSpare Wagon Wheels: $10 each"
                + "\nAmmunition: $2/box\n\n"
                + "\nV - View Current Supplies"
                + "\nB - Buy"
                + "\nS - Sell"
                + "\nE - Exit the General Store (Back to the Main Menu)\n"
                + "\nPlease Choose an Option:");
    }

    @Override
    public boolean doAction(String[] inputs) {
        char choice = Character.toUpperCase(inputs[0].charAt(0));
        switch (choice) {
            case 'V':
                this.console.println("V - View Your Current Supplies\n");
                viewSupplies();
                break;
            case 'B':
                this.console.println("B - Buy Supplies\n");
                buySupplies();
                break;
            case 'S':
                this.console.println("S - Sell Your Extra Supplies\n");
                sellSupplies();
                break;
            case 'E':
                this.console.println("E - Exiting the General Store (Back to Main Menu)\n");
                return true;
            default:
                this.console.println("Only \"V, B, S, and E\" are Valid Options\n");
                break;
        }

        return false;
    }

    private void viewSupplies() {
        SuppliesView suppliesView = new SuppliesView();
        suppliesView.display();
    }

    private void buySupplies() {
        BuySuppliesView buySuppliesView = new BuySuppliesView();
        buySuppliesView.display();
    }

    private void sellSupplies() {
        SellSuppliesView sellSuppliesView = new SellSuppliesView();
        sellSuppliesView.display();
    }
}
