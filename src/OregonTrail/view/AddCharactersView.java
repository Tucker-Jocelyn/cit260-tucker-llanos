package OregonTrail.view;

/**
 *
 * @author Kim Tanton
 */
public class AddCharactersView extends View {

    public AddCharactersView() {
        super("*** displayAddCharactersView() called ***");
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
