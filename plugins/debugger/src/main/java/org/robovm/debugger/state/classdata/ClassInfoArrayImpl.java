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
package org.robovm.debugger.state.classdata;

/**
 * @author Demyan Kimitsa
 * Reperesents array class info
 * This infor is created at runtime from signature
 * refer class.c#createArrayClass
 */
public class ClassInfoArrayImpl extends ClassInfo {
    // empty reference just for caces where isClass/isPrimitive/isArray is called
    public static ClassInfo EMPTY = new ClassInfoEmptyImpl(Type.ARRAY);

    private final String signature;
    private final ClassInfo elementType;
    private ClassInfo[] interfaces;
    private FieldInfo[] fields;
    private MethodInfo[] methods;

    // out of header position
    private int endOfHeaderPos;

    public ClassInfoArrayImpl(String signature, ClassInfo elementType) {
        super(Type.ARRAY);
        this.signature = signature;
        this.elementType = elementType;
    }

    public ClassInfo elementType() {
        return elementType;
    }

    @Override
    public String signature() {
        return signature;
    }

    @Override
    public String superclassSignature() {
        return null;
    }

    @Override
    public FieldInfo[] fields(ClassInfoLoader loader) {
        // there is no fields to report in array
        return null;
    }

    @Override
    public MethodInfo[] methods(ClassInfoLoader loader) {
        // there is no methods to report in array
        return null;
    }

    @Override
    public ClassInfo[] interfaces(ClassInfoLoader loader) {
        // check these constants from loader
        return loader.constArraysInterfaces();
    }

    @Override
    public boolean hasError() {
        return false;
    }

    @Override
    protected int convertModifiers() {
        // check class.c#createArrayClass
        // ACC_PUBLIC, ACC_PRIVATE, ACC_PROTECTED are in the 3 least significant bits
        return elementType.convertModifiers() & 7;
    }
}
