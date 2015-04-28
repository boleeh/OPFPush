/*
 * Copyright 2012-2015 One Platform Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.onepf.opfpush.pushsample.model.event;

import android.support.annotation.NonNull;

/**
 * @author Roman Savin
 * @since 10.12.14
 */
public final class MessageEvent {

    @NonNull final String senderUuid;

    @NonNull
    private final String message;

    public MessageEvent(@NonNull final String senderUuid, @NonNull final String message) {
        this.senderUuid = senderUuid;
        this.message = message;
    }

    @NonNull
    public String getSenderUuid() {
        return senderUuid;
    }

    @NonNull
    public String getMessage() {
        return message;
    }
}
