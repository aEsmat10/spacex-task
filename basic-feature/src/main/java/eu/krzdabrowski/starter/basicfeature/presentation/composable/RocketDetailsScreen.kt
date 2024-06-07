package eu.krzdabrowski.starter.basicfeature.presentation.composable

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.pulltorefresh.PullToRefreshContainer
import androidx.compose.material3.pulltorefresh.PullToRefreshState
import androidx.compose.material3.pulltorefresh.rememberPullToRefreshState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import eu.krzdabrowski.starter.basicfeature.R
import eu.krzdabrowski.starter.basicfeature.presentation.RocketsEvent
import eu.krzdabrowski.starter.basicfeature.presentation.RocketsEvent.OpenWebBrowserWithDetails
import eu.krzdabrowski.starter.basicfeature.presentation.RocketsIntent
import eu.krzdabrowski.starter.basicfeature.presentation.RocketsIntent.RefreshRockets
import eu.krzdabrowski.starter.basicfeature.presentation.RocketsIntent.RocketClicked
import eu.krzdabrowski.starter.basicfeature.presentation.RocketsUiState
import eu.krzdabrowski.starter.basicfeature.presentation.RocketsViewModel
import eu.krzdabrowski.starter.basicfeature.presentation.model.RocketDisplayable
import eu.krzdabrowski.starter.core.navigation.NavigationDestination
import eu.krzdabrowski.starter.core.utils.collectWithLifecycle
import kotlinx.coroutines.flow.Flow

@Composable
fun RocketDetailsRoute(
    rocketName: String
) {
    RocketDetailsScreen(
        rocketName = rocketName
    )
}

@Composable
fun RocketDetailsScreen(
    rocketName: String
) {
    Column {
        Text(text = rocketName)
    }
}