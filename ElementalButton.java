package volcano;

public class ElementalButton {

    //declare variables
    boolean elemButtonState;

    //default constructor
    public ElementalButton() {
        elemButtonState = false;
    }

    //create ElemButton with a specific value
    public ElementalButton(boolean b) {
        elemButtonState = b;
    }

    public boolean getButtonState() {
        //return current ElemButton state
        return elemButtonState;
    }

    public void changeElemButtonState() {
        //flip ElemButtonState bool to on or off (true or false)
        elemButtonState = !elemButtonState;
    }

}
