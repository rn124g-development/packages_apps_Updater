/*
 * Copyright (C) 2025 The AxionAOSP Project
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
package com.pixelproject.updater

import android.content.Context
import android.util.AttributeSet
import android.widget.TextView
import kotlin.random.Random

class RandomTextView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : TextView(context, attrs, defStyleAttr) {

    private val messages = listOf(
        "Nothing to see here... *insert owl noises*",
        "You're all caught up! 🎉",
        "No fresh updates at the moment.",
        "How often do you check for system updates?",
        "Everything's up to date ✅",
        "No news is good news, right? (I know you're tired of reflashing everything.) 😌",
        "Looks like nothing changed. Maybe not today?",
        "No matter how many times you press refresh, nothing will happen...",
        "Seems like you need this. ☕",
        "I know you're an important person, so go on and do something!"
    )

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        text = messages.random()
    }
}
