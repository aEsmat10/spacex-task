package eu.krzdabrowski.starter.basicfeature.presentation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import eu.krzdabrowski.starter.basicfeature.presentation.composable.RocketDetailsRoute
import eu.krzdabrowski.starter.basicfeature.presentation.composable.RocketsRoute
import eu.krzdabrowski.starter.core.navigation.NavigationDestination.Rockets
import eu.krzdabrowski.starter.core.navigation.NavigationDestination.RocketDetails
import eu.krzdabrowski.starter.core.navigation.NavigationFactory
import javax.inject.Inject

class RocketsNavigationFactory @Inject constructor() : NavigationFactory {

    override fun create(builder: NavGraphBuilder, navController: NavHostController) {
        builder.composable(Rockets.route) {
            RocketsRoute(navController = navController)
        }

        builder.composable(RocketDetails.route) { backStackEntry ->
            val rocketName = backStackEntry.arguments?.getString("rocketName")
            rocketName?.let { RocketDetailsRoute(rocketName = it) }
        }
    }
}
