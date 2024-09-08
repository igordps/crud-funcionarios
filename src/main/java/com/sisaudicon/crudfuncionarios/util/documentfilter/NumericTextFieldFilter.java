package com.sisaudicon.crudfuncionarios.util.documentfilter;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

/**
 *
 * @author igord
 */
public class NumericTextFieldFilter extends DocumentFilter {
    
    @Override
    public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
        if (isValidInput(string)) {
            super.insertString(fb, offset, string, attr);
        }
    }

    @Override
    public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
        if (isValidInput(text)) {
            super.replace(fb, offset, length, text, attrs);
        }
    }

    private boolean isValidInput(String text) {
        // Permite apenas números, vírgula e ponto
        return text.matches("[0-9.,]*");
    }    
    
}
