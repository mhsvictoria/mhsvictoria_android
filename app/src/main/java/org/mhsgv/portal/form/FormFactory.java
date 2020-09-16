package org.mhsgv.portal.form;

import android.os.Bundle;

import org.mhsgv.portal.MhsgvFragment;

public class FormFactory {

    public static MhsgvFragment create(int formId) throws IllegalStateException {

        MhsgvFragment form;
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
