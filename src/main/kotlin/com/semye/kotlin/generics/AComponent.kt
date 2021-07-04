package com.semye.kotlin.generics

import com.semye.kotlin.generics.AModel
import com.semye.kotlin.generics.BaseComponent

class AComponent : BaseComponent<AModel>() {
    override fun setDataModel(data: AModel) {
        TODO("Not yet implemented")
    }
}