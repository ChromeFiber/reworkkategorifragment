package com.example.reworkkategorifragment

data class KategoriDataClass(
    val kategorinavn: Array<String> = arrayOf("Flagg", "Bil", "Fugl"),
    val kategoribilde: Array<Int> = arrayOf(
        R.drawable.img,
        R.drawable.img,
        R.drawable.img,
    )
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as KategoriDataClass

        if (!kategorinavn.contentEquals(other.kategorinavn)) return false

        return true
    }

    override fun hashCode(): Int {
        return kategorinavn.contentHashCode()
    }
}