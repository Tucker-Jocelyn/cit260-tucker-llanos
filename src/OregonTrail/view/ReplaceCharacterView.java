
package OregonTrail.view;

/**
 *
 * @author Kim Tanton
 */
public class ReplaceCharacterView extends View {

    public ReplaceCharacterView() {
        super("*** displayReplaceCharacterView() called ***");
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
