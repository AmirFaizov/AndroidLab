package com.example.homeworkapp.recycler.data.repository

import com.example.homeworkapp.recycler.data.City

class CitiesRepository {
    fun getCities() = listOf(
        City(1, "Astrakhan"),
        City(2, "Mirny"),
        City(3, "Nazran"),
        City(4, "Kazan"),
        City(5, "Nizhnevartovsk"),
        City(6, "Petrozavodsk"),
        City(7, "Biysk"),
        City(8, "Anadyr"),
        City(9, "Moscow"),
        City(10, "Gudermes"),
        City(11, "Yakutsk"),
        City(12, "Yaroslavl"),
        City(13, "Chita"),
        City(14, "Ufa"),
        City(15, "Tynda"),
    )
}