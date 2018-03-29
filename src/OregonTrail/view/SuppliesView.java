package OregonTrail.view;

/**
 *
 * @author Jocelyn Tucker
 */
class SuppliesView extends View {

    public SuppliesView() {
        super("*** displaySuppliesView() called ***");
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
