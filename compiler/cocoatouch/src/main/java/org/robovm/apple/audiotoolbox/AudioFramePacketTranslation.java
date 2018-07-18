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
package org.robovm.apple.audiotoolbox;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coremidi.*;
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AudioFramePacketTranslation/*</name>*/ 
    extends /*<extends>*/Struct<AudioFramePacketTranslation>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AudioFramePacketTranslationPtr extends Ptr<AudioFramePacketTranslation, AudioFramePacketTranslationPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AudioFramePacketTranslation() {}
    public AudioFramePacketTranslation(long frame, long packet, int frameOffsetInPacket) {
        this.setFrame(frame);
        this.setPacket(packet);
        this.setFrameOffsetInPacket(frameOffsetInPacket);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native long getFrame();
    @StructMember(0) public native AudioFramePacketTranslation setFrame(long frame);
    @StructMember(1) public native long getPacket();
    @StructMember(1) public native AudioFramePacketTranslation setPacket(long packet);
    @StructMember(2) public native int getFrameOffsetInPacket();
    @StructMember(2) public native AudioFramePacketTranslation setFrameOffsetInPacket(int frameOffsetInPacket);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
