/*
 * Created on Nov 18, 2004
 *
 * @author Fabio Zadrozny
 */
package org.python.pydev.editor.codecompletion.revisited;

import java.io.Serializable;

/**
 * @author Fabio Zadrozny
 */
public interface IToken extends Serializable{

    public String getRepresentation();
    public String getDocStr();
    public int getCompletionType();

}
