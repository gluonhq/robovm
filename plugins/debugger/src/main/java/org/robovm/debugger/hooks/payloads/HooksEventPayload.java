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
package org.robovm.debugger.hooks.payloads;

/**
 * @author Demyan Kimitsa
 * base class for hook response/event payload
 */
public class HooksEventPayload {
    private final int eventId;

    public HooksEventPayload(int eventId) {
        this.eventId = eventId;
    }

    public int eventId() {
        return eventId;
    }
}
