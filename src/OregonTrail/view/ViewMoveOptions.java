package OregonTrail.view;

/**
 *
 * @author kim and jocelyn
 */
class ViewMoveOptions extends View {

    public ViewMoveOptions() {
        super("Use the Menu to make choices regarding conintuation along the Trail.");
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
