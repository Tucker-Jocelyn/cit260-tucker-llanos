package OregonTrail.view;

/**
 *
 * @author Jocelyn Tucker
 */
class SellSuppliesView extends View {

    public SellSuppliesView() {
        super("*** displaySellSuppliesView() called ***");
    }

    @Override
    public String[] getInput() {
        String[] result = new String[1];

        result[0] = "*";
        return result;
    }

    @Override
    public boolean doAction(String[] inputs) {
        return true;
    }

}
