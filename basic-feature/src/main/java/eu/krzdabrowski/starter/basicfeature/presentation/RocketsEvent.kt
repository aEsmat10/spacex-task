package eu.krzdabrowski.starter.basicfeature.presentation

import eu.krzdabrowski.starter.basicfeature.presentation.model.RocketDisplayable

sealed class RocketsEvent {
    data class OpenWebBrowserWithDetails(val uri: String) : RocketsEvent()
    data class OpenRocketDetailsScreen(val rocketName: String) : RocketsEvent()
}
