package net.octosystems.foodversity.model.recipe

import java.net.URI

data class PreparationStep(
    val stepNumber: StepNumber,
    val description: Description,
    val image: URI?,
) : Comparable<PreparationStep> {

    override fun compareTo(other: PreparationStep): Int = if (this.stepNumber > other.stepNumber) {
        1
    } else if (this.stepNumber < other.stepNumber) {
        -1
    } else {
        0
    }
}