package com.devsuperior.dsvendas.mapper

interface Mapper<T, U> {
    fun map(t: T): U
}