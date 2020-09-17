package org.mhsgv.portal.form;

public class FormFactory {

    public static FormFragment create(int formId) throws IllegalStateException {

        FormFragment form;
        switch(formId) {
            case 0:
                form = new Form1Fragment();
                break;
            case 1:
                form = new Form2Fragment();
                break;
            case 2:
                form = new Form3Fragment();
                break;
            default:
                throw new IllegalStateException("Haven't defined this one, yet.");
        }
        return form;
    }
}
