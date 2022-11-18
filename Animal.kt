package com.example.animals
import com.example.animals.Herbivores
import com.example.animals.Predators

fun main() {

    var predator1 = Predators("Тигр")
    var predator2 = Predators("Волк")
    var herbivores1 = Herbivores("Слон")
    var herbivores2 = Herbivores("Лось")


    var listOfPredators: List<Predators> = listOf(predator1, predator2)
    var listOfHerbivors: List<Herbivores> = listOf(herbivores1, herbivores2)
    println(predator1.diet1)
    println(herbivores1.diet2)

    listOfPredators.forEach {
        when (it) {
            is Predators -> println("Это хищник ${it.name} у него ${it.fangs1} и он ${it.diet1}")
        }
            }
    listOfHerbivors.forEach {
        when (it) {
            is Herbivores -> println("Это травоядное животное ${it.name} у него ${it.fangs2} и он ${it.diet2}")
        }
    }
}
