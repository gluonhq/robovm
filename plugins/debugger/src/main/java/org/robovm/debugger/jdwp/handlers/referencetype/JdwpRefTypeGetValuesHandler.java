/*
 * Copyright 2016 Justin Shapcott.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.debugger.jdwp.handlers.referencetype;

import org.robovm.debugger.jdwp.handlers.objectreference.IJdwpInstanceDelegate;
import org.robovm.debugger.jdwp.handlers.objectreference.JdwpObjRefGetValuesHandler;

/**
 * @author Demyan Kimitsa
 * Returns the value of one or more static fields of the reference type.
 * Each field must be member of the reference type or one of its superclasses,
 * superinterfaces, or implemented interfaces. Access control is not enforced; for example,
 * the values of private fields can be obtained.
 */
public class JdwpRefTypeGetValuesHandler extends JdwpObjRefGetValuesHandler {

    public JdwpRefTypeGetValuesHandler(IJdwpInstanceDelegate delegate) {
        super(delegate);
    }

    @Override
    protected boolean isStatic() {
        return true;
    }

    @Override
    public byte getCommandSet() {
        return 2;
    }

    @Override
    public byte getCommand() {
        return 6;
    }

    @Override
    public String toString() {
        return "ReferenceType(2).GetValues(6)";
    }
}
