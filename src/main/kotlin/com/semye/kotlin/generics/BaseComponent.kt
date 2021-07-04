package com.semye.kotlin.generics

abstract class BaseComponent<T : BaseModel> {

    abstract fun setDataModel(data: T)
}