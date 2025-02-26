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
import android.widget.ImageView
import kotlin.random.Random

class RandomImageView @JvmOverloads constructor(
    context: Context, 
    attrs: AttributeSet? = null, 
    defStyleAttr: Int = 0
) : ImageView(context, attrs, defStyleAttr) {

    private val images = listOf(
        R.drawable.no_updates_1,
        R.drawable.no_updates_2,
        R.drawable.no_updates_3
    )

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        randomizeImage()
    }
    
    fun randomizeImage() {
        setImageResource(images.random())
    }
}

