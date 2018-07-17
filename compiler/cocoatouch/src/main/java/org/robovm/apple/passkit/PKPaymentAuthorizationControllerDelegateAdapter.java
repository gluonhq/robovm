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
package org.robovm.apple.passkit;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.addressbook.*;
import org.robovm.apple.contacts.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PKPaymentAuthorizationControllerDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements PKPaymentAuthorizationControllerDelegate/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("paymentAuthorizationControllerDidFinish:")
    public void didFinish(PKPaymentAuthorizationController controller) {}
    /**
     * @since Available in iOS 11.0 and later.
     */
    @NotImplemented("paymentAuthorizationController:didAuthorizePayment:handler:")
    public void didAuthorizePayment(PKPaymentAuthorizationController controller, PKPayment payment, @Block VoidBlock1<PKPaymentAuthorizationResult> completion) {}
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0.
     */
    @Deprecated
    @NotImplemented("paymentAuthorizationController:didAuthorizePayment:completion:")
    public void didAuthorizePaymentEx(PKPaymentAuthorizationController controller, PKPayment payment, @Block VoidBlock1<PKPaymentAuthorizationStatus> completion) {}
    @NotImplemented("paymentAuthorizationControllerWillAuthorizePayment:")
    public void willAuthorizePayment(PKPaymentAuthorizationController controller) {}
    /**
     * @since Available in iOS 11.0 and later.
     */
    @NotImplemented("paymentAuthorizationController:didSelectShippingMethod:handler:")
    public void didSelectShippingMethod(PKPaymentAuthorizationController controller, PKShippingMethod shippingMethod, @Block VoidBlock1<PKPaymentRequestShippingMethodUpdate> completion) {}
    /**
     * @since Available in iOS 11.0 and later.
     */
    @NotImplemented("paymentAuthorizationController:didSelectShippingContact:handler:")
    public void didSelectShippingContact(PKPaymentAuthorizationController controller, PKContact contact, @Block VoidBlock1<PKPaymentRequestShippingContactUpdate> completion) {}
    /**
     * @since Available in iOS 11.0 and later.
     */
    @NotImplemented("paymentAuthorizationController:didSelectPaymentMethod:handler:")
    public void didSelectPaymentMethod(PKPaymentAuthorizationController controller, PKPaymentMethod paymentMethod, @Block VoidBlock1<PKPaymentRequestPaymentMethodUpdate> completion) {}
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0.
     */
    @Deprecated
    @NotImplemented("paymentAuthorizationController:didSelectShippingMethod:completion:")
    public void didSelectShippingMethod(PKPaymentAuthorizationController controller, PKShippingMethod shippingMethod, @Block VoidBlock2<PKPaymentAuthorizationStatus, NSArray<PKPaymentSummaryItem>> completion) {}
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0.
     */
    @Deprecated
    @NotImplemented("paymentAuthorizationController:didSelectShippingContact:completion:")
    public void didSelectShippingContact(PKPaymentAuthorizationController controller, PKContact contact, @Block VoidBlock3<PKPaymentAuthorizationStatus, NSArray<PKShippingMethod>, NSArray<PKPaymentSummaryItem>> completion) {}
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 11.0.
     */
    @Deprecated
    @NotImplemented("paymentAuthorizationController:didSelectPaymentMethod:completion:")
    public void didSelectPaymentMethodEx(PKPaymentAuthorizationController controller, PKPaymentMethod paymentMethod, @Block VoidBlock1<NSArray<PKPaymentSummaryItem>> completion) {}
    /*</methods>*/
}
