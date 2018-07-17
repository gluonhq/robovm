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
package org.robovm.apple.uikit;

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
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.cloudkit.*;
import org.robovm.apple.fileprovider.*;
import org.robovm.apple.intents.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIAccessibilityActionAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements UIAccessibilityAction/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 8.0 and later.
     */
    @NotImplemented("accessibilityCustomActions")
    public NSArray<UIAccessibilityCustomAction> getAccessibilityCustomActions() { return null; }
    /**
     * @since Available in iOS 8.0 and later.
     */
    @NotImplemented("setAccessibilityCustomActions:")
    public void setAccessibilityCustomActions(NSArray<UIAccessibilityCustomAction> v) {}
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("accessibilityActivate")
    public boolean activate() { return false; }
    /**
     * @since Available in iOS 4.0 and later.
     */
    @NotImplemented("accessibilityIncrement")
    public void increment() {}
    /**
     * @since Available in iOS 4.0 and later.
     */
    @NotImplemented("accessibilityDecrement")
    public void decrement() {}
    /**
     * @since Available in iOS 4.2 and later.
     */
    @NotImplemented("accessibilityScroll:")
    public boolean scroll(UIAccessibilityScrollDirection direction) { return false; }
    /**
     * @since Available in iOS 5.0 and later.
     */
    @NotImplemented("accessibilityPerformEscape")
    public boolean performEscape() { return false; }
    /**
     * @since Available in iOS 6.0 and later.
     */
    @NotImplemented("accessibilityPerformMagicTap")
    public boolean performMagicTap() { return false; }
    /*</methods>*/
}
