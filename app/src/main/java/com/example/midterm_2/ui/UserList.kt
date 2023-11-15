package com.example.midterm_2.ui

import android.widget.Toast
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ListItem
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.midterm_2.data.model.User
import com.example.midterm_2.viewmodel.UserViewModel

@Composable
fun UserList(userViewModel: UserViewModel = viewModel()) {
    val usersState = userViewModel.users.collectAsState(initial = emptyList())
    val errorState = userViewModel.error.collectAsState(initial = null)

    if (errorState.value != null) {
        LaunchedEffect(errorState.value) {
            Toast.makeText(
                LocalContext.current,
                "Error: ${errorState.value}",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    LazyColumn {
        items(usersState.value) { user ->
            UserListItem(user)
        }
    }
}


@Composable
fun UserListItem(user: User) {

    ListItem(
        modifier = Modifier.padding(8.dp),
        text = { Text(text = "${user.name} ${user.username}") },
        secondaryText = { Text(text = "ID: ${user.id}") }
    )
}
