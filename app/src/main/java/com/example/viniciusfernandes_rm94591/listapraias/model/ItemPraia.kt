package com.example.viniciusfernandes_rm94591.listapraias.model

data class ItemPraia (
    val nomePraia : String,
    val cidade : String,
    val estado : String,
    val onRemove : (ItemPraia) -> Unit
)