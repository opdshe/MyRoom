package com.example.myroom

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentActivity
import com.google.android.gms.common.api.Status
import com.google.android.libraries.places.api.Places
import com.google.android.libraries.places.api.model.Place
import com.google.android.libraries.places.widget.Autocomplete
import com.google.android.libraries.places.widget.listener.PlaceSelectionListener
import java.util.Arrays.asList
import com.google.android.libraries.places.widget.AutocompleteSupportFragment
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode
import java.util.*
import java.util.Arrays.asList
import java.util.Arrays.asList
import java.util.Arrays.asList
import com.google.android.libraries.places.widget.AutocompleteActivity
import java.util.Arrays.asList
import java.util.Arrays.asList











class DetailActivity: AppCompatActivity() {
    val AUTOCOMPLETE_REQUEST_CODE = 1


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        Places.initialize(getApplicationContext(), getString(R.string.google_app_key))
        // Initialize the AutocompleteSupportFragment.
        val fields = Arrays.asList(Place.Field.ID, Place.Field.NAME)

// Start the autocomplete intent.
        val intent = Autocomplete.IntentBuilder(
            AutocompleteActivityMode.FULLSCREEN, fields
        )
            .build(this)
        startActivityForResult(intent, AUTOCOMPLETE_REQUEST_CODE)






    }
}