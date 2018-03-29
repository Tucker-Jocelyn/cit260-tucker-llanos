package OregonTrail.view;

/**
 *
 * @author kimt and jocelyn
 */
class ViewGameTips extends View {

    public ViewGameTips() {
        super("We suggest you have 6 oxen and a minimun of 15 lbs of food per day for your team, get plenty of rest, and have fun!");
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
