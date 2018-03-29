package OregonTrail.view;

/**
 *
 * @author Kim Tanton
 */
public class SearchCharactersView extends View {

    public SearchCharactersView() {
        super("*** displaySearchCharactersView() called ***");
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
