/*
 * Copyright (C) 2013-2015 RoboVM AB
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.modelio;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("ModelIO") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MDLMaterialPropertyConnection/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements MDLNamed/*</implements>*/ {

    /*<ptr>*/public static class MDLMaterialPropertyConnectionPtr extends Ptr<MDLMaterialPropertyConnection, MDLMaterialPropertyConnectionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MDLMaterialPropertyConnection.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MDLMaterialPropertyConnection() {}
    protected MDLMaterialPropertyConnection(Handle h, long handle) { super(h, handle); }
    protected MDLMaterialPropertyConnection(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithOutput:input:")
    public MDLMaterialPropertyConnection(MDLMaterialProperty output, MDLMaterialProperty input) { super((SkipInit) null); initObject(init(output, input)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "output")
    public native MDLMaterialProperty getOutput();
    @Property(selector = "input")
    public native MDLMaterialProperty getInput();
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "setName:")
    public native void setName(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithOutput:input:")
    protected native @Pointer long init(MDLMaterialProperty output, MDLMaterialProperty input);
    /*</methods>*/
}
